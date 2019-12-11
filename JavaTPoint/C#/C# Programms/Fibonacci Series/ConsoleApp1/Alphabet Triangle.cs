using System;

public class AlphabetTriangle
{
    public static void Main(string [] args)
    {
        char character = 'A';

        int i, j, k, m;

        for(i = 1; i <= 5; i++)
        {
            for(j = 5; j >= i; j--)
            {
                Console.Write(" ");
            }

            for(k = 1; k <= i; k++)
            {
                Console.Write(character++);
            }

            character--;

            for(m = 1; m < i; m++)
            {
                Console.Write(--character);
            }

            Console.WriteLine();

            character = 'A';
        }

        Console.ReadLine();
    }
}