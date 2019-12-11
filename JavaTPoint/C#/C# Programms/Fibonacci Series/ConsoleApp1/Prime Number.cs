using System;

public class PrimeNumber
{
    public static void Main(String [] args)
    {
        int number, div = 0, flag = 0;

        Console.Write("Enter Number to Check Prime: ");

        number = int.Parse(Console.ReadLine());

        div = number / 2;

        for(int i = 2; i <= div; i++)
        {
            if(number % i == 0)
            {
                Console.Write("Number is not Prime");

                flag = 1;

                break;
            }
        }

        if(flag == 0)
        {
            Console.Write("Number is Prime");
        }

        Console.ReadLine();
    }
}
