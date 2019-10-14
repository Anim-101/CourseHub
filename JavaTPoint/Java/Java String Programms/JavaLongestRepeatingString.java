public class JavaLongestRepeatingString
{
    public static String longestCommonRepeatingString(String string, String temp)
    {
        int number = Math.min(string.length(), temp.length());

        for(int i = 0; i < number; i++)
        {
            if(string.charAt(i) != temp.charAt(i))
            {
                return string.substring(0, i);
            }
        }

        return string.substring(0, number);
    }

    public static void main(String [] args)
    {
        String string = "Ahoy Engineer! Thanks for Working and Having Grit Too much!!";

        String longestRepatedString = "";

        int number = string.length();

        for(int i = 0; i < number; i++)
        {
            for(int j = i + 1; j < number; j++)
            {
                String x = longestCommonRepeatingString(string.substring(i, number), string.substring(j, number));

                if(x.length() > longestRepatedString.length())
                {
                    longestRepatedString = x;
                }
            }
        }

        System.out.println("Longest Repeating Sequency: " + longestRepatedString);
    }
}