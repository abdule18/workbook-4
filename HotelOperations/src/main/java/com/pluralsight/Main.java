package com.pluralsight;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter number of bed: ");
        int numBed = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Is the room occupied?: ");
        String occupied = scanner.nextLine();


        Room  room = new Room(numBed, price, occupied, )

    }
}