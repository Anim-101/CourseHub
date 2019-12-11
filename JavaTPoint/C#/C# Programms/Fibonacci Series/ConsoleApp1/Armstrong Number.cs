using System;

public class ArmstrongNumber
{
    public static void Main(string [] args)
    {
        int number, mod, sum = 0, temp;

        Console.Write("Enter the Number: ");

        number = int.Parse(Console.ReadLine());

        temp = number;

        while(number > 0)
        {
            mod = number % 10;

            sum = sum + (mod * mod * mod);

            number = number / 10;
        }

        if(temp == sum)
        {
            Console.Write("Armstrong Number");
        }
        else
        {
            Console.Write("Not Armstrong Number");
        }

        Console.ReadLine();
    }
}