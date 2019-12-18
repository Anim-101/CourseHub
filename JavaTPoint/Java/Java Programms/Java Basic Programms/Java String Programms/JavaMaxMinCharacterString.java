public class JavaMaxMinCharacterString
{
    public static void main(String [] args)
    {
        String string = "Grass always seems to look greener on the other side";

        int frequency [] = new int [string.length()];

        char minCharacter = string.charAt(0), maxCharacter = string.charAt(0);

        int i, j, min, max;

        char stringArray [] = string.toCharArray();

        for(i = 0; i < stringArray.length; i++)
        {
            frequency[i] = 1;

            for(j = i + 1; j < stringArray.length; j++)
            {
                if(stringArray[i] == stringArray[j] && stringArray[i] != ' ' && stringArray[i] != '0')
                {
                    frequency[i]++;

                    stringArray[j] = '0';
                }
            }
        }

        min = max = frequency[0];

        for(i = 0; i < frequency.length; i++)
        {
            if(min > frequency[i] && frequency[i] != '0')
            {
                min = frequency[i];

                minCharacter = stringArray[i];
            }

            if(max < frequency[i] && frequency[i] != '0')
            {
                max = frequency[i];

                maxCharacter = stringArray[i];
            }
        }

        System.out.println("Minimum Occuring Character: " + minCharacter);

        System.out.println("Maximum Occuring Character: " + maxCharacter);
    }   
}