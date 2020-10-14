package com.exercises;

public class E21_NormalizedIntegers
{
    public static void main(String[] args)
    {
        int[] integers = new int[10];
        for (int i = 0; i < 10; i++)
            integers[i] = (int) (Math.random() * 100);

        System.out.println("List of integers: ");
        ArrayUtilities.printArray(integers);

        System.out.println("\n\nAfter normalized: ");
        double[] normInts = ArrayUtilities.normalizedIntegers(integers);
        ArrayUtilities.printArray(normInts);
    }
}
