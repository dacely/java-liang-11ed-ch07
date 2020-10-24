package com.exercises;

public class E31_MergeTwoLists
{
    public static void main(String[] args)
    {
        final int SIZE_LIST_1 = 20;
        final int SIZE_LIST_2 = 5;

        int[] list1 = new int[SIZE_LIST_1];
        for (int i = 0; i < SIZE_LIST_1; i++)
            list1[i] = 1 + (int) (Math.random() * 1000);
        
        int[] list2 = new int[SIZE_LIST_2];
        for (int i = 0; i < SIZE_LIST_2; i++)
            list2[i] = 1 + (int) (Math.random() * 1000);
        
        ArrayUtilities.bubbleSort(list1);
        ArrayUtilities.bubbleSort(list2);
        
        System.out.println("List1: ");
        printList(list1);
        System.out.println("\n");

        System.out.println("List2: ");
        printList(list2);
        System.out.println("\n");

        int[] mergedList = ArrayUtilities.mergeSortedLists(list1, list2);
        System.out.println("Merged list: ");
        printList(mergedList);
        System.out.println("\n");
    }

    public static void printList(int[] list)
    {
        for (int j : list) System.out.printf(" %d", j);
    }
}
