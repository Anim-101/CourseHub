import java.util.Scanner;

public class PalindromeNumber_TwoNumber
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Entry Number - ");

        int entryNumber = scan.nextInt();

        System.out.print("Enter Ending Number - ");

        int endingNumber = scan.nextInt();

        int reverse, sum, temp, number;

        for(int i = entryNumber; i <= endingNumber; i++)
        {
            sum = 0;

            number = i;

            temp = number;

            while(number > 0)
            {
                reverse = number % 10;

                sum = (sum * 10) + reverse;

                number = number / 10;
            }

            if(temp == sum)
            {
                System.out.println(temp);
            }
        }
    }
}