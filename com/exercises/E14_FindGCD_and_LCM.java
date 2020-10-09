package com.exercises;

import java.util.Scanner;

public class E14_FindGCD_and_LCM
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Cuantos numeros desea ingresar: ");
        int size = input.nextInt();

        long[] numbers = new long[size];

        for (int i = 0; i < size; i++)
        {
            System.out.printf("Ingrese numero %d: ", i + 1);
            numbers[i] = input.nextLong();
        }

        System.out.println("\n");
        System.out.printf("mcd: %,d\n", findGCD(numbers));
        System.out.printf("mcm: %,d\n", findLCM(numbers));
    }

    public static long gcd(long a, long b)
    {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static long lcm(long a, long b)
    {
        return (a * b) / gcd(a, b);
    }

    public static long findGCD(long... arr)
    {
        long result = 0;

        for (long x: arr)
            result = gcd(result, x);

        return result;
    }

    public static long findLCM(long... arr)
    {
        long result = 1;

        for (long x : arr)
            result = lcm(result, x);

        return result;
    }
}
