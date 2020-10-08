package com.exercises;

import java.util.Scanner;

public class E01_Grades
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] scores = new int[numStudents];
        int best = 0;
        System.out.printf("Enter %d scores: ", numStudents);

        for (int i = 0; i < numStudents; i++)
        {
            scores[i] = input.nextInt();

            if (scores[i] > best)
                best = scores[i];
        }

        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++)
        {
            if (scores[i] >= best - 5)
                grades[i] = 'A';
            else if (scores[i] >= best - 10)
                grades[i] = 'B';
            else if (scores[i] >= best - 15)
                grades[i] = 'C';
            else if (scores[i] >= best - 20)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }

        for (int i = 0; i < numStudents; i++)
        {
            System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], grades[i]);
        }
    }
}
