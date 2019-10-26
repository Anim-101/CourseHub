using System;

public class Palindrome
{
    public static void Main(String [] args)
    {
        int number, mod, sum = 0, temp;

        Console.Write("Enter the Number: ");

        number = int.Parse(Console.ReadLine());

        temp = number;

        while(number > 0)
        {
            mod = number % 10;

            sum = (sum * 10) + mod;

            number = number / 10;
        }

        if(temp == sum)
        {
            Console.Write("Number is Plaindrome");
        }
        else
        {
            Console.Write("Number is not Palindrome");
        }

        Console.ReadLine();
    }
}
