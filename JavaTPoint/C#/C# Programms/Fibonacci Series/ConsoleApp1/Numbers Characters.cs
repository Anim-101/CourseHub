using System;

public class NumbersCharacters
{
    public static void Main(string [] args)
    {
        int number, sum = 0, mod;

        Console.Write("Enter Number: ");

        number = int.Parse(Console.ReadLine());

        while(number > 0)
        {
            mod = number % 10;

            sum = sum * 10 + mod;

            number = number / 10;
        }

        number = sum;

        while(number > 0)
        {
            mod = number % 10;

            switch(mod)
            {
                case 1:
                    Console.Write("one ");
                    break;

                case 2:
                    Console.Write("two ");
                    break;

                case 3:
                    Console.Write("three ");
                    break;

                case 4:
                    Console.Write("four ");
                    break;

                case 5:
                    Console.Write("five ");
                    break;

                case 6:
                    Console.Write("six ");
                    break;

                case 7:
                    Console.Write("seven ");
                    break;

                case 8:
                    Console.Write("eight ");
                    break;

                case 9:
                    Console.Write("nine ");
                    break;

                case 0:
                    Console.Write("zero ");
                    break;

                default:
                    Console.Write("tttt");
                    break;
            }

            number = number / 10;
        }

        Console.ReadLine();
    }
}