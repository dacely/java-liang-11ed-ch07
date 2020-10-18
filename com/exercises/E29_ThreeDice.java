package com.exercises;

public class E29_ThreeDice
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 6; i++)
            for (int j = 1; j < 6; j++)
                for (int k = 1; k < 6; k++)
                    if (i + j + k == 9)
                        System.out.printf("[ %d, %d, %d]\n", i, j, k);
    }
}
