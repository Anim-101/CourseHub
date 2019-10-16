import java.util.Scanner;

public class PrimeNumber_TwoNumber
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter First Number - ");
        
        int entryNumber = scan.nextInt();

        System.out.print("Enter Second Number - ");

        int endNumber = scan.nextInt();

        System.out.println("List of Prime Numbers Between " + entryNumber + " and " + endNumber);

        for(int i = entryNumber; i <= endNumber; i++)
        {
            if(primeNumber(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean primeNumber(int number)
    {
        int middle = number / 2;

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