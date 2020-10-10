package com.exercises;

import java.util.Scanner;

public class E17_SortStudents
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many students: ");
        int numStudents = input.nextInt();
        String[] names = new String[numStudents];
        int[] grades = new int[numStudents];

        System.out.println("Enter the student's names: ");
        for (int i = 0; i < numStudents; i++)
            names[i] = input.next();

        for (int i = 0; i < numStudents; i++)
        {
            System.out.printf("Enter the grade of %s: ", names[i]);
            grades[i] = input.nextInt();
        }

        sortStudentsByGrade(names, grades);

        System.out.println("\nStudents sorted by grade:");
            System.out.println("    Student    |  Grade ");
            System.out.println("------------------------");
        for (int i = numStudents - 1; i >= 0; i--)
            System.out.printf("%15s|%8d\n", names[i], grades[i]);


    }

    public static void sortStudentsByGrade(String[] names, int[] grades)
    {
        for (int i = 0; i < grades.length; i++)
        {
            int j = minIndex(grades, i);

            // swap grades
            int tempGrade = grades[i];
            grades[i] = grades[j];
            grades[j] = tempGrade;

            // swap names
            String tempStr = names[i];
            names[i] = names[j];
            names[j] = tempStr;
        }
    }

    public static int minIndex(int[] list, int start)
    {
        int min = start;

        for (int i = start + 1; i < list.length; i++)
        {
            if (list[i] < list[min])
                min = i;
        }

        return min;
    }
}
