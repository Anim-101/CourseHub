import java.util.Scanner;

public class PrimeNumber_Input
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter a Number - ");

        int number = scan.nextInt();

        if(!primeNumber(number))
        {
            System.out.println(number + " is not Prime Number");
        }
        else
        {
            System.out.println(number + " is Prime Number");
        }
    }

    public static boolean primeNumber(int number)
    {
        int middle = number / 2, flag = 0;

        if(number == 0 || number == 1)
        {
            return false;
        }
        else
        {
            for(int i = 2; i <= middle; i++)
            {
                if(number % i == 0)
                {
                    return false;
                }
            }
        }

        return true;
    }
}