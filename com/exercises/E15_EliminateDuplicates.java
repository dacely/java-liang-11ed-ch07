package com.exercises;

import java.util.Scanner;
import java.util.Arrays;

public class E15_EliminateDuplicates
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];

        System.out.print("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++)
            array[i] = input.nextInt();

        System.out.print("The distinct numbers are: ");
        String str = Arrays.toString(eliminateDuplicates(array));
        System.out.println(str);
    }

    public static int[] eliminateDuplicates(int[] a)
    {
        int[] b = new int[a.length];
        b[0] = a[0];
        int counter = 1;

        for (int i = 1; i < a.length; i++)
        {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++)
            {
                if (a[i] == b[j])
                {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate)
                b[counter++] = a[i];
        }

        int[] c = new int[counter];
        System.arraycopy(b, 0, c, 0, counter);

        return c;
    }
}
