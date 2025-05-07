package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        String fullname = NameFormatter.format("Mr.", "Abdule","Malick", "Touray", "PhD");
        String nameWithoutPre = NameFormatter.format("Abdule","Malick", "Touray", "PhD");
        String name = NameFormatter.format("Abdule","Malick", "Touray");

        System.out.println("Hello and welcome! " + fullname);
        System.out.println("Hello and welcome! " + nameWithoutPre);
        System.out.println("Hello and welcome! " + name);

    }
}