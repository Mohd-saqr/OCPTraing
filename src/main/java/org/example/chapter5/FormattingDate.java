package org.example.chapter5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDate {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        LocalTime localTime =LocalTime.now();
        LocalDate date =LocalDate.now();
        LocalDateTime localDateTime =LocalDateTime.of(date,localTime);

      //  System.out.println(dateTimeFormatter.format(localTime));
       // System.out.println(dateTimeFormatter.format(date));
        System.out.println(dateTimeFormatter.format(localDateTime));
    }
}
