package assignment7_exercises.date;


public class Date {
	
	
    //@ spec_public
	private int day;
	
    //@ spec_public

	private int month;

    //@ spec_public
	private int year;
	

	
	/*@ public invariant 1<=month && month<=12 && day >= 1 && day<=31 &&
	((month==4 || month==6 || month==9 || month==11) ==> day<=30) &&
	((month==2 && leap(year)) ==> day <= 29) &&
	((month==2 && leap(year)) ==> day<= 28) && 1900 <= year;
	@*/
	
	
	public /*@ pure @*/	 int getDay() {
		return day;
	}


	public /*@ pure @*/ int getMonth() {
		return month;
	}


	public /*@ pure @*/ int getYear() {
		return year;
	}

	

	/*@ requires 1<=m && m<=12 && d >= 1 && d<=31 &&
	((m==4 || m==6 || m==9 || m==11) ==> d<=30) &&
	((m==2 && leap(y)) ==> d <= 29) &&
	((m==2 && !leap(y)) ==> d<= 28) && 1900 <= y;
	@*/
	public Date(int d, int m,  int y) throws IllegalArgumentException{
		day = d;
		month = m;
		year = y;
		assert repOk();
	}
	
	

	public /*@ pure @*/ boolean repOk() {
		if (month < 1 || month > 12)
			return false;
		if (day < 1 || day > 31)
			return false;
		if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
			return false;
		if (month == 2 && leap(year) && day > 29)
			return false;
		if (month == 2 && !leap(year) && day > 28)
			return false;
		return year >= 1900;
	}
	
	
	
	/**
	 * Tests if this date is after the specified date.
	 * @param when - a date.
	 * @return true if and only if the date represented by this Date object 
	 * is strictly later than the date represented by when; false otherwise.
	 */
	
	/*@ requires when!=null;
	ensures ((this.getYear() > when.getYear()) && \result ==true)
	|| (getYear() == when.getYear() && getMonth() > when.getMonth() && \result ==true)
	|| (getYear() == when.getYear() && getMonth() == when.getMonth() && getDay() > when.getDay() && \result ==true)
	|| ((this.getYear() < when.getYear()) && \result ==false)
	|| (getYear() == when.getYear() && getMonth() < when.getMonth() && \result ==false)
	|| (getYear() == when.getYear() && getMonth() == when.getMonth() && getDay() <= when.getDay() && \result ==false);
	@*/
	public boolean after(Date when) {
		if(this.getYear() > when.getYear())
			return false;
	    if(getYear() == when.getYear() && getMonth() > when.getMonth()) 
	    	return true;
	    if(getYear() == when.getYear() && getMonth() == when.getMonth() && getDay() > when.getDay())
	    	return true;
		return false;
	}
		

	/***Helper methods***/
	
	public /*@ pure @*/ static boolean leap(int a) {
		boolean b = false;
		if ((a % 4 == 0) && (a % 100 != 0))
				b = true; 
		if(a % 400 == 0)
				b = true;
		return b;
	}
	
	
	
	
	/**
	 * Adds a specified number of days to the current date.
	
	 * The method will adjust the day, month, and year accordingly when 
	 * the added days overflow the current month or year.
	 * 
	 * Only positive integers are allowed, meaning the date will always move forward.
	 * 
	 * @param days the number of days to add to the current date. 
	 *             Must be a positive integer.
	 * @return a new Date object representing the date after adding the specified number of days.
	 * @throws IllegalArgumentException if the parameter days is negative. 
	 */
	public Date addDays(Date when, int days) {
		if (days < 0) {
			throw new IllegalArgumentException("The number of days must be a positive integer.");
		}
		int d = when.getDay();
		int m = when.getMonth();
		int y = when.getYear();
		int daysInMonth = 0;
		while (days > 0) {
			daysInMonth = daysInMonth(m, y);
			if (d + days <= daysInMonth) {
				d += days;
				days = 0;
			} else {
				days -= daysInMonth - d + 1;
				d = 1;
				if (m == 12) {
					m = 1;
					y++;
				} else {
					m++;
				}
			}
		}
		return new Date(d, m, y);
	}

	private int daysInMonth(int m, int y) {
		if (m == 4 || m == 6 || m == 9 || m == 11) {
			return 30;
		} else if (m == 2) {
			return leap(y) ? 29 : 28;
		} else {
			return 31;
		}
	}

	@Override
	public String toString() {
		return day + "/" + month + "/" + year;
	}
}
