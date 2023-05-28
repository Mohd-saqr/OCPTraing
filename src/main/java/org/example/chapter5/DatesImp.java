package org.example.chapter5;

import java.time.*;
import java.util.Date;
import java.util.Locale;

public class DatesImp {


    public static void main(String[] args) {
        DatesImp datesImp = new DatesImp();
        datesImp.createDate();
        datesImp.local();
    }
    /**
     * the date in usa in written in this expression
     * month /day/year
     */


    /**@Date_And_Time  and time All dateTime classes the constructor is private
     * LocalDate it's contain just date
     * LocalTime it's contain just Time
     * LocalDateTime it's contain Just DateAndTime
     * ZonedDateTime it's contain zone and date and time
     *  GMT stand for Greenwich mean time
     *  UTC Unifiom cordinitor Time
     *  of method that take year and mounth and day
     *  parse take a string it must be in this way "yy-mm-dd" or DateTimeParsException
     */



    void createDate(){
        System.out.println( LocalDate.parse("2016-03-05"));
        System.out.println(LocalTime.parse("12:30:22"));

    }

    void ManipulatingDates(){
        LocalDate date =LocalDate.now();
        LocalTime time=LocalTime.now();
    }

    void period(){

        /**
         * PY1M2D3
         */
        //  Period period = Period.ofDays();
       // Period.ofWeeks()
    }

    void Durations(){

    }


    /**
     * Local
     */

    void local(){
        Locale locale =new Locale("QAS","USA");
        System.out.println(locale);
    }

    void Resource(){
        
    }
}
