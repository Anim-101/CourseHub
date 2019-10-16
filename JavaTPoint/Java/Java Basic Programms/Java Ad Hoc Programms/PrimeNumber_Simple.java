public class PrimeNumber_Simple
{
    public static void main(String [] args)
    {
        int i, middle = 0, flag = 0;

        int checkNumber = 3;

        middle = checkNumber / 2;

        if(checkNumber == 0 || checkNumber == 1)
        {
            System.out.println(checkNumber + " is not a Prime Number");
        }
        else
        {
            for(i = 2; i <= middle; i++)
            {
                if(checkNumber % i == 0)
                {
                    System.out.println(checkNumber + " is not a Prime Number");
                    flag = 1;
                    break;
                }
            }
        }

        if (flag == 0)
        {
            System.out.println(checkNumber + " is Prime Number");
        }
    }
}