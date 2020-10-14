package com.exercises;

public class E19_IsSorted
{
    public static void main(String[] args)
    {
        final int SIZE = 10;
        int[] numbers = new int[SIZE];
        int counter = 0;

        do
        {
            for (int i = 0; i < SIZE; i++)
                numbers[i] = (int) (Math.random() * SIZE * 10);
            ++counter;
        } while (!ArrayUtilities.isSorted(numbers));

        System.out.println("Ordered array:");
        ArrayUtilities.printArray(numbers);
        System.out.printf("\nNumber of attempts: %d", counter);
    }
}
