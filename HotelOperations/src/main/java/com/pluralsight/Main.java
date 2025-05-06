package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        testRoom();

    }

    public static void testRoom(){

        Room r1 = new Room(1, 150);
        System.out.println(r1.isAvailable());
        r1.checkIn();
        System.out.println(r1.isAvailable());
    }
}