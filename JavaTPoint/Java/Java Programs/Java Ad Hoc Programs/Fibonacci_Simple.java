public class Fibonacci_Simple 
{
    public static void main(String [] args)
    {
        int firstNumber = 0, secondNumber = 1, thirdNumber, i, count = 10;
        
        System.out.print(firstNumber + " " +secondNumber);

        for(i = 2; i < count; ++i)
        {
            thirdNumber = firstNumber + secondNumber;
            
            System.out.print(" "+ thirdNumber);

            firstNumber = secondNumber;

            secondNumber = thirdNumber;
        }
    }
}