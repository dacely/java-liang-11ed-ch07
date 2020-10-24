package com.exercises;

public class E30_ConsecutiveFour
{
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;
        final int MAX_INT = 5;

        int[] myList = new int[ARRAY_SIZE];

        for (int i = 0; i < ARRAY_SIZE; i++)
            myList[i] = 1 + (int)(Math.random() * MAX_INT);

        System.out.println("List of numbers:");
        ArrayUtilities.printArray(myList);
        System.out.println("\n");

        int counter = 1;
        int indexConsecutiveFour = -1;

        for (int i = 1; i < ARRAY_SIZE; i++)
        {
            if (myList[i] == myList[i - 1])
                ++counter;
            else
                counter = 1;

            if (counter == 4)
            {
                indexConsecutiveFour = i - 3;
                break;
            }
        }

        if (indexConsecutiveFour >= 0)
        {
            System.out.printf("Four consecutive equal numbers \n" +
                    "were found beginning at position %d\n", indexConsecutiveFour);
        }
        else
            System.out.println("The list has no consecutive four numbers");
    }
}
