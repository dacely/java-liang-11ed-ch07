package com.exercises;

import java.util.Scanner;

public class E34_SortString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = input.nextLine();
        System.out.printf("Sorted string: %s", sort(str));
    }

    public static String sort(String s)
    {
        char[] c = s.toCharArray();
        quickSort(c);
        return new String(c);
    }

    private static int partition(char[] list, int low, int high)
    {
        int pivot = list[low];
        int countBigger = 0;
        char temp;
        int i;

        for (int j = high; j > low; j--)
        {
            if (list[j] > pivot)
            {
                i = high - countBigger;
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;
                countBigger++;
            }
        }

        i = high - countBigger;
        temp = list[i];
        list[i] = list[low];
        list[low] = temp;

        return i;
    }

    private static void quickSort(char[] list)
    {
        quickSortRecursive(list, 0, list.length - 1);
    }

    private static void quickSortRecursive(char[] list, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(list, low, high);
            quickSortRecursive(list, low, pi - 1);
            quickSortRecursive(list, pi + 1, high);
        }
    }
}
