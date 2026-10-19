package assignment2_exercises;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class ZuneBugTest {

  @ParameterizedTest()
  @ValueSource(ints = {1, 365, 7671, 9132, 10593, 12234, 68942})
  public void testP(int days) {
    //arrange
    int res;
    //act
    res = ZuneBug.currentYear(days);
    //assert
    assertEquals(res,ZuneBug.oracle(days), "");

  }

}


