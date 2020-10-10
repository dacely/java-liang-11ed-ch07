package com.exercises;

public class E16_ExecutionTime
{
    public static void main(String[] args)
    {
        int[] numbers = new int[100_000_000];
        for (int i = 0; i < 100_000_000; i++)
            numbers[i] = i + 1;

        System.out.println("         key      idxLin      idxBin         Lin         Bin");
        System.out.println("------------------------------------------------------------");
        SearchPerformance(numbers, 1);
        SearchPerformance(numbers, 25_000_000);
        SearchPerformance(numbers, 50_000_000);
        SearchPerformance(numbers, 75_000_000);
        SearchPerformance(numbers, 100_000_000);

    }

    public static void SearchPerformance(int[] list, int key)
    {
        long startTime = System.nanoTime();
        int idxLin = ArrayUtilities.linearSearch(list, key);
        long endTime = System.nanoTime();
        long exeTimeLin = endTime - startTime;

        startTime = System.nanoTime();
        int idxBin = ArrayUtilities.binarySearch(list, key);
        endTime = System.nanoTime();
        long exeTimeBin = endTime - startTime;

        System.out.printf("%,12d %,12d %,12d %,11d %,11d\n", key, idxLin, idxBin, exeTimeLin, exeTimeBin);
    }
}
