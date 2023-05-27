package org.example;

import java.util.Locale;

public class Localization {


    public static void main(String[] args) {
        Locale locale =new Locale.Builder()
                .setLanguage("").setRegion("").build();
        System.out.println(locale);
    }
}
