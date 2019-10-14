import java.util.Scanner;

public class ArmstrongNumber_Input
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter A Number to Check Armstrong Number - ");

        int number = scan.nextInt();

        int temp = number;

        int sumArmstrong = 0,  cube; 

        while(number > 0)
        {
            cube = number % 10;

            number = number / 10;

            sumArmstrong = sumArmstrong + (cube * cube * cube);
        }

        if(temp == sumArmstrong)
        {
            System.out.println(temp + " is an Armstrong Number");
        }
        else
        {
            System.out.println(temp + " is not an Armstrong Number");
        }
    }
}