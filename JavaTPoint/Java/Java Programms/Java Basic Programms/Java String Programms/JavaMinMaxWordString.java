public class JavaMinMaxWordString
{
    public static void main(String [] args)
    {
        String string = "Hardships often prepare ordinary people of an extra ordinary destiny, this is All about Destiny, Hardships are for us!!";

        String word = "", small = "", large = "";
        
        String [] words = new String[100];

        string = string + " ";

        int length = 0;

        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) != ' ')
            {
                word = word + string.charAt(i);
            }
            else
            {
                words[length] = word;

                length++;

                word = "";
            }
        }

        small = large = words[0];

        for(int k = 0; k < length; k++)
        {
            if(small.length() > words[k].length())
            {
                small = words[k];
            }

            if(large.length() < words[k].length())
            {
                large = words[k];
            }
        }

        System.out.println("Smallest Word: " + small);

        System.out.println("Largest Word: " + large);
    }
}