package com.exercises;

public class E32_QuickSort
{
    public static void main(String[] args)
    {
        int[] myList = new int[20];
        for (int i = 0; i < myList.length; i++)
            myList[i] = (int) (Math.random() * 100);

        System.out.println("Original list: ");
        printList(myList);
        System.out.println("\n");

        int pivotIndex = ArrayUtilities.partition(myList, 0, myList.length - 1);

        System.out.println("Partition list: ");
        printList(myList);
        System.out.println("\n");

        System.out.printf("Pivot index: %d\n\n", pivotIndex);

        ArrayUtilities.quickSort(myList);
        System.out.println("Sorted list: ");
        printList(myList);
        System.out.println("\n");
    }

    public static void printList(int[] list)
    {
        for (int j : list) System.out.printf(" %d", j);
    }
}
