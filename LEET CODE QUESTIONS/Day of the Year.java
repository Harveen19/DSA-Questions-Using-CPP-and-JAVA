/* 1154. Day of the Year
Easy
347
401
Companies
Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

 

Example 1:

Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:

Input: date = "2019-02-10"
Output: 41
*/

class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));

        // calculate number of days in each month
        int[] daysInMonth = new int[] {31,28 + isLeapYear(year), 31,30,31,30,31,31,30,31,30,31};

        // sum up the days in all the months before the given month
        int dayOfYear=0;
        for(int i=0;i<month-1;i++){
            dayOfYear += daysInMonth[i];
        }

        // Add the day of the month
        dayOfYear += day;

        return dayOfYear;
    }

    private int isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? 1 : 0;
    }
}
