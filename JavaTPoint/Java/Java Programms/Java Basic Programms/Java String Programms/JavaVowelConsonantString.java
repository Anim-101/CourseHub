public class JavaVowelConsonantString
{
    public static void main(String [] args)
    {
        int vowelCount = 0, consonentCount = 0;

        String string = "This is a really simple sentence. I am liking to work with it.";

        string = string.toLowerCase();

        for(int i = 0; i < string.length(); i++)
        {
            if(string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u')
            {
                vowelCount++;
            }
            else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z')
            {
                consonentCount++;
            }      
        }

        System.out.println("Number of Vowels: " + vowelCount);

        System.out.println("Number of Consonants: "  + consonentCount);
    }
}