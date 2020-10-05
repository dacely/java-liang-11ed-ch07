package com.listings;

public class L04_CountLetters
{
    public static void main(String[] args)
    {
        char[] letters = createArray();
        System.out.println("The lowercase letters are: ");
        displayArray(letters);

        System.out.println("\n\nThe occurrences of each letter are: ");
        displayCounts(countLetters(letters));
    }

    public static char[] createArray()
    {
        char[] letters = new char[100];
        int x;

        for (int i = 0; i < 100; i++)
        {
            x = 'a' + (int) (Math.random() * 26);
            letters[i] = (char) x;
        }

        return letters;
    }

    public static void displayArray(char[] c)
    {
        for (int i = 0; i < c.length; i++)
        {
            System.out.printf("%2c", c[i]);

            if ((i + 1) % 20 == 0)
                System.out.println();
        }
    }

    public static int[] countLetters(char[] c)
    {
        int[] counts = new int[26];
        for (char value : c) ++counts[value - 'a'];
        return counts;
    }

    public static void displayCounts(int[] counts)
    {
        for (int i = 0; i < counts.length; i++)
        {
            System.out.printf("%6c -> %d", 'a' + i, counts[i]);

            if ((i + 1) % 5 == 0)
                System.out.println();
        }
    }
}
