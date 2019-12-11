using System;

public class FibonacciSeries
{
    public static void Main(string [] args)
    {
        int numberOne = 0, numberTwo = 1, numberThree, number;

        Console.Write("Enter the Number of Elements: ");

        number = int.Parse(Console.ReadLine());

        Console.Write(numberOne + " " + numberTwo + " ");

        for(int i = 2; i < number; i++)
        {
            numberThree = numberOne + numberTwo;

            Console.Write(numberThree + " ");

            numberOne = numberTwo;

            numberTwo = numberThree;
        }

        Console.ReadLine();
    }
}