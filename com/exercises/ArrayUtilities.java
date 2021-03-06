package com.exercises;

public class ArrayUtilities
{
    public static void reverse(int[] a)
    {
        int temp;

        for (int i = 0; i < (a.length / 2) - 1; i++)
        {
            temp = a[i];
            a[i] = a[a.length -1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void printArray(int[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%5d", a[i]);

            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }

    public static void printArray(double[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%10.2f", a[i]);

            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }

    public static void printArray(boolean[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            System.out.printf("%2d", a[i] ? 1 : 0);

            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }

    public static long gcd(long a, long b)
    {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static long lcm(long a, long b)
    {
        return (a * b) / gcd(a, b);
    }

    public static long findGCD(long... arr)
    {
        long result = 0;

        for (long x: arr)
            result = gcd(result, x);

        return result;
    }

    public static long findLCM(long... arr)
    {
        long result = 1;

        for (long x : arr)
            result = lcm(result, x);

        return result;
    }

    public static int linearSearch(int[] list, int key)
    {
        for (int i = 0; i < list.length; i++)
        {
            if (key == list[i])
                return i;
        }

        return -1;
    }

    public static int binarySearch(int[] list, int key)
    {
        int low = 0;
        int high = list.length - 1;

        while (high >= low)
        {
            int mid = (low + high) / 2;

            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }

        return -1 - low;
    }

    public static int[] eliminateDuplicates(int[] a)
    {
        int[] b = new int[a.length];
        b[0] = a[0];
        int counter = 1;

        for (int i = 1; i < a.length; i++)
        {
            boolean isDuplicate = false;

            for (int j = 0; j < counter; j++)
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

    public static void shuffling(int[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            int randIndex = (int) (Math.random() * list.length);
            int temp = list[i];
            list[i] = list[randIndex];
            list[randIndex] = temp;
        }
    }

    public static void selectionSort(double[] list)
    {
        for (int i = 0; i < list.length; i++)
        {
            int j = minIndex(list, i);
            double temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }

    public static int minIndex(double[] list, int start)
    {
        int min = start;

        for (int i = start + 1; i < list.length; i++)
        {
            if (list[i] < list[min])
                min = i;
        }

        return min;
    }

    public static void bubbleSort(int[] list)
    {
        for (int i = 1; i < list.length; i++)
        {
            for (int j = 0; j < list.length - i; j++)
            {
                if (list[j] > list[j + 1])
                {
                    int temp  = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    public static boolean isSorted(int[] list)
    {
        for (int i = 0; i < list.length - 1; i++)
        {
            for (int j = i + 1; j < list.length; j++)
            {
                if (list[i] > list[j])
                    return false;
            }
        }
        return true;
    }

    public static double[] normalizedIntegers(int[] integers)
    {
        int largest = getLargest(integers);
        double[] normalized = new double[integers.length];
        for (int i = 0; i < integers.length; i++)
            normalized[i] = (double) integers[i] / largest;
        return normalized;
    }

    public static int getLargest(int[] list)
    {
        int largest = list[0];

        for (int i = 1; i < list.length; i++)
        {
            if (list[i] > largest)
                largest = list[i];
        }

        return largest;
    }

    public static int[] mergeSortedLists(int[] list1, int[] list2)
    {
        int[] mergedList = new int[list1.length + list2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < list1.length && j < list2.length)
        {
            if (list1[i] < list2[j])
                mergedList[k++] = list1[i++];
            else
                mergedList[k++] = list2[j++];
        }

        while (i < list1.length)
            mergedList[k++] = list1[i++];

        while (j < list2.length)
            mergedList[k++] = list2[j++];

        return mergedList;
    }

    public static int partition(int[] list, int low, int high)
    {
        int pivot = list[low];
        int countBigger = 0;
        int temp, i;

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

    public static void quickSort(int[] list)
    {
        quickSortRecursive(list, 0, list.length - 1);
    }

    public static void quickSortRecursive(int[] list, int low, int high)
    {
        if (low < high)
        {
            int pi = partition(list, low, high);
            quickSortRecursive(list, low, pi - 1);
            quickSortRecursive(list, pi + 1, high);
        }
    }
}
