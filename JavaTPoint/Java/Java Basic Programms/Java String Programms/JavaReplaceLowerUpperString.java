public class JavaReplaceLowerUpperString
{
    public static void main(String [] args)
    {
        String stringOne = "Replace All The Lower and Upper Cases!!";

        StringBuffer newString = new StringBuffer(stringOne);

        for(int i = 0; i < stringOne.length(); i++)
        {
            if(Character.isLowerCase(stringOne.charAt(i)))
            {
                newString.setCharAt(i, Character.toUpperCase(stringOne.charAt(i)));
            }
            else if(Character.isUpperCase(stringOne.charAt(i)))
            {
                newString.setCharAt(i, Character.toLowerCase(stringOne.charAt(i)));
            }
        }

        System.out.println("String ater case conversion: " + newString);
    }
}