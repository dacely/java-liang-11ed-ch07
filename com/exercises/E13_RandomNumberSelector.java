package com.exercises;

public class E13_RandomNumberSelector
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            int x = getRandom(1, 2, 3, 4, 5, 6, 7);
            System.out.println(x);
        }
    }

    public static int getRandom(int... numbers)
    {
        int randIndex = (int) (Math.random() * numbers.length);
        return numbers[randIndex];
    }
}
