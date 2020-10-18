package com.exercises;

public class E23_LockerPuzzle
{
    public static void main(String[] args)
    {
        final int NUMBER_OF_LOCKERS = 100;
        boolean[] lockers = new boolean[NUMBER_OF_LOCKERS];
        for (int i = 1; i <= NUMBER_OF_LOCKERS; i++)
        {
            studentPassThrough(lockers, i);
            ArrayUtilities.printArray(lockers);
            System.out.println("\n\n");
        }

        int totalOpen = 0;

        for (int i = 0; i < NUMBER_OF_LOCKERS; i++)
        {
            if (lockers[i])
                ++totalOpen;
        }

        System.out.printf("Simulation: %d lockers open\n", totalOpen);
        System.out.printf("Math: %d lockers open\n", (int) Math.floor(Math.sqrt(NUMBER_OF_LOCKERS)));
    }

    public static void studentPassThrough(boolean[] lockers, int s)
    {
        for (int i = s - 1; i < lockers.length; i += s)
            lockers[i] = !lockers[i];
    }
}
