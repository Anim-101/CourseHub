public class FactorialNumber_Recursion
{
    static int factorial(int number)
    {
        if(number == 0)
        {
            return 1;
        }
        else
        {
            return (number * factorial(number - 1));
        }
    }

    public static void main(String [] args)
    {
        int factorialValue = 1;

        int number = 9;

        factorialValue = factorial(number);

        System.out.println(("Factorial of " + number +" is : " + factorialValue));
    }
}