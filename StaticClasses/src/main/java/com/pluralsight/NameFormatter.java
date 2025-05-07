package com.pluralsight;

public class NameFormatter {


    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        return String.format(prefix + " " + firstName + " " + middleName + " " + lastName + ", " + suffix);
    }
    public static String format(String firstName, String middleName, String lastName, String suffix){
        return String.format(firstName + " " + middleName + " " + lastName + ", " + suffix);
    }

    public static String format(String firstName, String middleName, String lastName){
        return String.format(firstName + " " + middleName + " " + lastName);
    }
}
