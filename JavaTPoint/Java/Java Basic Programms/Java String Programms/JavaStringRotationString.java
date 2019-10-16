public class JavaStringRotationString
{
    public static void main(String [] args)
    {
        String stringOne = "abcde", stringTwo = "deabc";

        if(stringOne.length() != stringTwo.length())
        {
            System.out.println("Second String is not a Rotation of First String");
        }
        else
        {
            stringOne = stringOne.concat(stringOne);

            if(stringOne.indexOf(stringTwo) != -1)
            {
                System.out.println("Second String is a rotation of First String");
            }
            else
            {
                System.out.println("Second String is not a rotation of Second String");
            }
        }
    }
}