package assignment7_exercises.date;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

import static org.junit.jupiter.api.Assertions.assertTrue;

class DateTest {

    @Property(tries = 500)
    void dateRemainsValidAfterAddingDays(@ForAll("validDatesGenerator") Date initialDate,
                                         @ForAll @IntRange(min = 0, max = 5000) int daysToAdd) {
        Date newDate = initialDate.addDays(initialDate, daysToAdd);

        assertTrue(newDate.repOk(), "Date is not valid");
    }

    @Provide
    private Arbitrary<Date> validDatesGenerator() {
        return Arbitraries.create(this::generateValidDate);
    }

    private Date generateValidDate() {
        int year = Arbitraries.integers().between(1900, 2100).sample();
        int month = Arbitraries.integers().between(1, 12).sample();
        int day;
        if (month == 2) {
            day = Arbitraries.integers().between(1, 28).sample();
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            day = Arbitraries.integers().between(1, 30).sample();
        }
        else if (Date.leap(year)) {
            day = Arbitraries.integers().between(1, 29).sample();
        }
        else {
            day = Arbitraries.integers().between(1, 31).sample();
        }
        return new Date(day, month, year);
    }
}
