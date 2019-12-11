using System;

public class SwapUsingMultiplicationDivision
{
    public static void Main(string [] args)
    {
        int a = 5, b = 10;

        Console.Write("Before Swap, a = " + a + ", b = " + b + "\n");

        a = a * b;

        b = a / b;

        a = a / b;

        Console.Write("After Swap a = " + a + ", b = " + b);

        Console.ReadLine();
    }
}
