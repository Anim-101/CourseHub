using System;

public class ReverseNumber
{
    public static void Main(string [] args)
    {
        int number, reverse = 0, mod;

        Console.Write("Enter a Number: ");

        number = int.Parse(Console.ReadLine());

        while(number != 0)
        {
            mod = number % 10;

            reverse = reverse * 10 + mod;

            number = number / 10;
        }

        Console.Write("Reversed Number: " + reverse);

        Console.ReadLine();
    }
}
