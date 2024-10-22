package timeAndDate;

import java.time.LocalDate;
import java.time.LocalTime;

//LocalTime is used to return System current time
//LocalDate is used to return System current Date
public class LocalTimeAndDate {
    public static void main(String[] args) {
        //local time
        LocalTime cuurentTime = LocalTime.now();
        System.out.println("Current Time: " +  cuurentTime); //Current time

        //System.out.println(cuurentTime.getHour()); //current hour
        //System.out.println(cuurentTime.getMinute()); //current Minute
        //System.out.println(cuurentTime.getSecond()); //current second

        LocalTime currentTime = LocalTime.of(12, 20,59);//custom time
        System.out.println(currentTime);

        //local date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);//current date
        System.out.println(currentDate.getYear());//current year
        System.out.println(currentDate.getMonth());//current month
        System.out.println(currentDate.getDayOfWeek());//current day of week
        System.out.println(currentDate.getDayOfYear());//current day of year
        System.out.println(currentDate.getDayOfMonth());//current day of month

        LocalDate localDate = LocalDate.of(2047, 12,07);//custom date
        System.out.println(localDate);





    }
}
