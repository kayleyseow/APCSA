//from 2019 APCS exam, Q1
/*
The APCalendar class contains methods used to calculate information about a calendar. You will write two methods of the class. 
a.
Write the static method numberOfLeapYears, which returns the number of leap years between year1 and year2, inclusive.
In order to calculate this value, a helper method is provided for you.
	• isLeapYear(year) returns true if year is a leap year and false otherwise. 
b. 
Write the static method dayOfWeek, which returns the integer value representing the day of the week for the given date (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. For example, 2019 began on a Tuesday, and January 5 is the fifth day of 2019. As a result, January 5, 2019, fell on a Saturday, and the method call dayOfWeek(1, 5, 2019) returns 6.
As another example, January 10 is the tenth day of 2019. As a result, January 10, 2019, fell on a Thursday, and the method call dayOfWeek(1, 10, 2019) returns 4.
In order to calculate this value, two helper methods are provided for you.
	• firstDayOfYear(year) returns the integer value representing the day of the week for the first day of year, where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday. For example, since 2019 began on a Tuesday, firstDayOfYear(2019) returns 2.
	• dayOfYear(month, day, year) returns n, where month, day, and year specify the nth day of the year. For the first day of the year, January 1 (month = 1, day = 1), the value 1 is returned. This method accounts for whether year is a leap year. For example, dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year, while dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
*/
public class APCalendar{
	/** Returns true if year is a leap year and false otherwise. */
	private static boolean isLeapYear(int year){
		if (year%4==0) return true;
		return false;
	}
	/** Returns the number of leap years between year1 and year2, inclusive.
 	* Precondition: 0 <= year1 <= year2
 	*/
	public static int numberOfLeapYears(int year1, int year2){
		int count = 0;
		if (year1>=0&&year2>=2){
			for (int i=year1;i<=year2;i++ ) {
				if (isLeapYear(i)) count++;
			}
		}
		return count;
	}
	/** Returns the value representing the day of the week for the first day of year,
 	* where 0 denotes Sunday, 1 denotes Monday, ..., and 6 denotes Saturday.
 	*/
 	private static int firstDayOfYear(int year)
	{ /* implementation not shown */ }
	/** Returns n, where month, day, and year specify the nth day of the year.
	* Returns 1 for January 1 (month = 1, day = 1) of any year.
	* Precondition: The date represented by month, day, year is a valid date.
	*/
	private static int dayOfYear(int month, int day, int year)
	{ /* implementation not shown */ }
	/** Returns the value representing the day of the week for the given date
	* (month, day, year), where 0 denotes Sunday, 1 denotes Monday, ...,
	* and 6 denotes Saturday.
	* Precondition: The date represented by month, day, year is a valid date.
	*/
	public static int dayOfWeek(int month, int day, int year){
		int firstday = firstDayOfYear(year);
		int dayofyear = dayOfYear(month,day,year);
		int returnday = (dayofyear-firstday-1)%7;
		return returnday;
	}
}
