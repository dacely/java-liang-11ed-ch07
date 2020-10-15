package com.exercises;

public class E28_Permutations
{
    public static void main(String[] args)
    {
        int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] permutations = getPermutations(test);
        for(int[] p : permutations)
        {
            printPermutation(p);
            System.out.println();
        }
    }

    public static int factorial(int n)
    {
        int factorial = 1;
        for (int i = 1; i <= n; i++)
            factorial *= i;
        return factorial;
    }

    public static int[][] getPermutations(int[] list)
    {
        int a = factorial(list.length);
        int b = list.length;
        int[] count = {0};

        int[][] allPermutations = new int[a][b];
        recursivePermutations(list, allPermutations, 0, count);
        return allPermutations;
    }

    public static void recursivePermutations(int[] list, int[][] permutations, int r, int[] count)
    {
        if (r == list.length)
            return;
        if (r == 0)
        {
            int[] p = new int[list.length];
            System.arraycopy(list, 0, p, 0, list.length);
            permutations[count[0]++] = p;
        }

        for (int i = 0; i < r; i++)
        {
            int[] p = new int[list.length];

            System.arraycopy(list, 0, p, 0, i);
            p[i] = list[r];

            for (int j = i + 1; j <= r; j++)
                p[j] = list[j - 1];

            for (int j = r + 1; j < list.length; j++)
                p[j] = list[j];

            permutations[count[0]++] = p;
            recursivePermutations(p, permutations, r + 1, count);
        }

        recursivePermutations(list, permutations, r + 1, count);
    }

    public static void printPermutation(int[] list)
    {
        System.out.print("[");
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i]);
            if (i == list.length - 1)
                System.out.print("]");
            else
                System.out.print(", ");
        }
    }
}
