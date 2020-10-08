package com.exercises;

public class E04_EratosthenesSieve
{
    public static void main(String[] args)
    {
        final int TOTAL_NUMBERS = 10000;
        boolean[] sieve = new boolean[TOTAL_NUMBERS + 1];
        sieve[1] = false;

        for (int i = 2; i <= TOTAL_NUMBERS ; i++)
            sieve[i] = true;

        int top = 1 + (int) Math.ceil(Math.sqrt(TOTAL_NUMBERS));
        for (int i = 2; i <= top; i++)
        {
            if (!sieve[i])
                continue;

            for (int j = 2 * i; j <= TOTAL_NUMBERS; j += i)
                sieve[j] = false;
        }

        for (int i = 1; i <= TOTAL_NUMBERS; i++)
        {
            int digits = String.valueOf(TOTAL_NUMBERS).length() + 1;
            String fPrime = "%" + digits + "d";
            String fComp = "%" + digits + "c";

            if (sieve[i])
                System.out.printf(fPrime, i);
            else
                System.out.printf(fComp, '*');

            if (i % 20 == 0)
                System.out.println();
        }
    }
}
