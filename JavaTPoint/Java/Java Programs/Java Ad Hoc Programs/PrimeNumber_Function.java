public class PrimeNumber_Function
{

    static void checkPrime(int number)
    {
        int i, middle = 0, flag = 0;

        middle = number / 2;

        if(number == 0 || number == 1)
        {
            System.out.println(number + " is not Prime Number");
            flag = 1;
        }
        else
        {
            for(i = 2; i <= middle; i++)
            {
                if(number % i == 0)
                {
                    System.out.println(number + " is not Prime Number");
                    flag = 1;
                    break;
                }
            }
        }

        if(flag == 0)
        {
            System.out.println(number + " is Prime Number");
        }
    }
    public static void main(String [] args)
    {
        checkPrime(1);
        checkPrime(11);
        checkPrime(5);
        checkPrime(6);
        checkPrime(7);
        checkPrime(4);
    }
}