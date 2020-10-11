package com.exercises;

public class E18_BubbleSort
{
    public static void main(String[] args)
    {
        int[] numbers = new int[20];
        for (int i = 0; i < 20; i++)
            numbers[i] = (int) (Math.random() * 100);

        System.out.println("Before bubble sort:");
        ArrayUtilities.printArray(numbers);

        ArrayUtilities.bubbleSort(numbers);

        System.out.println("\nAfter bubble sort:");
        ArrayUtilities.printArray(numbers);
    }
}
