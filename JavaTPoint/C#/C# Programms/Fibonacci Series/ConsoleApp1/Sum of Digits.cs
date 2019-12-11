using System;

public class SumOfDigits
{
    public static void Main(string [] args)
    {
        int number, sum = 0, mod;

        Console.Write("Enter a Number: ");

        number = int.Parse(Console.ReadLine());

        while(number > 0)
        {
            mod = number % 10;

            sum = sum + mod;

            number = number / 10;
        }

        Console.Write("Sum is: " + sum);

        Console.ReadLine();
    }
}