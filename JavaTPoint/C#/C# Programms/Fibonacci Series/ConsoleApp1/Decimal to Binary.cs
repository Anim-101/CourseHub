using System;

public class DecimalBinary
{
    public static void Main(string [] args)
    {
        int number, count;

        int[] array = new int[10];

        Console.Write("Enter Number to Convert: ");

        number = int.Parse(Console.ReadLine());

        for(count = 0; number > 0; count++ )
        {
            array[count] = number % 2;

            number = number / 2;
        }

        Console.Write("\nBinary of given Number: ");

        for(count = count - 1; count >= 0; count--)
        {
            Console.Write(array[count]);
        }

        Console.ReadLine();
    }
}