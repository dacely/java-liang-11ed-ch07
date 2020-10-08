package com.exercises;

public class E03_CountOccurrences
{
    public static void main(String[] args)
    {
        final int TOTAL_NUMBERS = 1000;
        final int MAX_VALUE = 10;
        int[] numbers = new int[TOTAL_NUMBERS];
        int[] occurrences = new int[MAX_VALUE + 1];

        for (int i = 0; i < TOTAL_NUMBERS; i++)
        {
            numbers[i] = 1 + (int) (Math.random() * MAX_VALUE);
            System.out.printf("%3d", numbers[i]);
            if ((i + 1) % 20 == 0)
                System.out.println();
        }

        for (int i = 0; i < TOTAL_NUMBERS; i++)
            ++occurrences[numbers[i]];

        for (int i = 1; i <= MAX_VALUE; i++)
        {
            if (occurrences[i] > 1)
                System.out.printf("%d occurs %d times\n", i, occurrences[i]);
            else if (occurrences[i] == 1)
                System.out.printf("%d occurs %d time\n", i, occurrences[i]);
        }
    }
}
