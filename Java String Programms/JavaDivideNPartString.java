public class JavaDivideNPartString
{
    public static void main(String [] args)
    {
        String string = "Yo Anim Janeka, Teemme Genki Desu ka, Huh ?!!";

        int lenght = string.length();

        int n = 5;

        int temp = 0, chars = lenght/n;

        String [] equalString = new String [n];

        if(lenght % n != 0)
        {
            System.out.println("Sorry this String can't be divided into " + n + " equal parts");
        }
        else
        {
            for(int i = 0; i < lenght; i = i + chars)
            {
                String part = string.substring(i, i + chars);

                equalString[temp] = part;

                temp++;
            }

            System.out.println(n + " Equal parts of given string are:");
            {
                for(int i = 0; i < equalString.length; i++)
                {
                    System.out.println(equalString[i]);
                }
            }
        }
    }
}