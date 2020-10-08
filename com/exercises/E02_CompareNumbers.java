package com.exercises;


public class E02_CompareNumbers
{
    public static void main(String[] args)
    {
        final int TOTAL_NUMBERS = 100;
        int[] numbers = new int[TOTAL_NUMBERS];

        for (int i = 0; i < TOTAL_NUMBERS; i++)
            numbers[i] = (int) (Math.random() * 101);

        for (int i = 0; i < TOTAL_NUMBERS; i++)
        {
            if (numbers[i] < numbers[TOTAL_NUMBERS - 1])
                System.out.printf("%3d smaller\n", numbers[i]);
            else if (numbers[i] == numbers[TOTAL_NUMBERS - 1])
                System.out.printf("%3d equal\n", numbers[i]);
            else
                System.out.printf("%3d greater\n", numbers[i]);
        }
    }
}
