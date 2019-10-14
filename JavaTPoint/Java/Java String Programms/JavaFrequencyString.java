public class JavaFrequencyString
{
    public static void main(String [] args)
    {
        String str = "Paki Paka Pepe Khay, Goru Mere Juta Dan";

        int frequency [] = new int[str.length()];

        char string [] = str.toCharArray();

        for(int i = 0; i < str.length(); i++)
        {
            frequency[i] = 1;

            for(int j = i + 1; j < str.length(); j++)
            {
                if(string[i] == string[j])
                {
                    frequency[i]++;

                    string[j] = '0';
                }
            }
        }

        System.out.println("Characters and Their Corresponding Frequencies:");

        for(int i = 0; i < frequency.length; i++)
        {
            if(string[i] != ' ' && string[i] != '0')
            {
                System.out.println(string[i] + "--" + frequency[i]);
            }
        }
    }
}