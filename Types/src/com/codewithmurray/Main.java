package com.codewithmurray;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// Variables And Assignments
//        int userAge = 30;
//        int userOneAge = userAge;
//        System.out.println(userOneAge);

        // Primitive Types - for storing simple values
        // Type: byte       Size: 1 byte  Range: [-128, 127]
        // Type: short      Size: 2 bytes  Range: [-32K, 32K]
        // Type: int        Size: 4 bytes  Range: [-2B, 2B]
        // Type: long       Size: 8 bytes  Range:
        // Type: float      Size: 4 bytes  Range:
        // Type: double     Size: 8 bytes  Range:
        // Type: char       Size: 2 bytes  Range: A,B,C, ...
        // boolean          Size: 1 byte   Range: true/false

        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'M'; // Single character is single quotes
        boolean canDrive = false;

        // Reference Types - for storing complex objects

        byte driverAge = 22;
        // The new Date() is referencing the instances of the Date class
        Date now = new Date();
        System.out.println(now);
    }
}
