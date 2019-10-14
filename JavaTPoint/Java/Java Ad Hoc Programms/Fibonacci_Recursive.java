public class Fibonacci_Recursive
{
    static int firstNumber = 0, secondNumber = 1, thirdNumber = 0;

    static void printFibonacciRecursive(int count)
    {
        if(count > 0)
        {
            thirdNumber = firstNumber + secondNumber;

            firstNumber = secondNumber;

            secondNumber = thirdNumber;

            System.out.print(" " + thirdNumber);

            printFibonacciRecursive(count - 1);
        }
    }

    public static void main(String [] args)
    {
        int count = 10;

        System.out.print(firstNumber + " " + secondNumber);

        printFibonacciRecursive(count - 2);
    }
}