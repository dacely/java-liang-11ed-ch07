package com.exercises;

public class E12_ReverseArray
{
    public static void main(String[] args)
    {
        final int SIZE = 101;
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++)
            array[i] = i + 1;

        System.out.println("Original Array:");
        printArray(array);

        reverse(array);

        System.out.println("\nReversed Array:");
        printArray(array);
    }

    public static void reverse(int[] a)
    {
        int temp;

        for (int i = 0; i < (a.length / 2) - 1; i++)
        {
            temp = a[i];
            a[i] = a[a.length -1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%5d", a[i]);

            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }
}
