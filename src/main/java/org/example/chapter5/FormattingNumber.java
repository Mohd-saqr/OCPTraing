package org.example.chapter5;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class FormattingNumber {
    /**
     * NumberFormat
     */


    void createNumberFormat() throws ParseException {
        NumberFormat numberFormat=NumberFormat.getNumberInstance();
        NumberFormat numberFormat1 =NumberFormat.getPercentInstance();
        NumberFormat numberFormat2 =NumberFormat.getInstance();
        NumberFormat numberFormat3 =NumberFormat.getInstance(Locale.US);
        /**
         * THE pars method throw ParsException if the String start with char
         */
        System.out.println(numberFormat1.parse("xxx450"));
    }
}
