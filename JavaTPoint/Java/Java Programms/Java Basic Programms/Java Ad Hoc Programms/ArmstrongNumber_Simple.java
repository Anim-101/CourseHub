public class ArmstrongNumber_Simple
{
    public static void main(String [] args)
    {
        int sumArmstrong = 0, cube, temp;

        int number = 153;

        temp = number;

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