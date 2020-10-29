package com.exercises;

import java.util.Scanner;

public class E33_MonthName
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month number (1 - 12): ");
        int monthNumber = input.nextInt();

        String[] monthNames = {"January", "February" , "March", "April", "May", "June",
                                "July", "August", "September", "October", "November", "December"};

        System.out.printf("Month name: %s", monthNames[monthNumber - 1]);
    }
}
