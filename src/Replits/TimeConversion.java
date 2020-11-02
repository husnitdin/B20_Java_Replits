package Replit;

import java.util.Arrays;
import java.util.Scanner;

/*
Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock.
Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Function Description
It should print a new string representing the input time in 24 hour format.
timeConversion has the following parameter(s):
s: a string representing time in  12 hour format

Input: 07:05:45PM
Output: 19:05:45
 */
public class TimeConversion {
    public static void main(String[] args) {
        String timeStr = "07:15:55AM";
        timeConversion(timeStr);
    }

    public static void timeConversion(String s) {
        String[] timeArr = s.split(":");
        boolean pm = timeArr[timeArr.length-1].contains("PM");

        if(pm && timeArr[0].equals("01") || timeArr[0].equals("1")){
            timeArr[0] = "13";
        } else if(pm && timeArr[0].equals("02") || timeArr[0].equals("2")) {
            timeArr[0] = "14";
        } else if(pm && timeArr[0].equals("03") || timeArr[0].equals("3")) {
            timeArr[0] = "15";
        } else if(pm && timeArr[0].equals("04") || timeArr[0].equals("4")) {
            timeArr[0] = "16";
        } else if(pm && timeArr[0].equals("05") || timeArr[0].equals("5")) {
            timeArr[0] = "17";
        } else if(pm && timeArr[0].equals("06") || timeArr[0].equals("6")) {
            timeArr[0] = "18";
        } else if(pm && timeArr[0].equals("07") || timeArr[0].equals("7")) {
            timeArr[0] = "19";
        } else if(pm && timeArr[0].equals("08") || timeArr[0].equals("8")) {
            timeArr[0] = "20";
        } else if(pm && timeArr[0].equals("09") || timeArr[0].equals("9")) {
            timeArr[0] = "21";
        } else if(timeArr[0].equals("10") && pm) {
            timeArr[0] = "22";
        } else if(timeArr[0].equals("11") && pm) {
            timeArr[0] = "23";
        } else if(timeArr[0].equals("12") && pm) {
            timeArr[0] = "00";
        }

        String result = "";
        for (String each: timeArr){
            result+=each+":";
        }
        if(result.endsWith("AM:")){
            result  = result.replace("AM:", "");
        } else if (result.endsWith("PM:")){
            result = result.replace("PM:", "");
        }
        System.out.println (result);
    }

}
