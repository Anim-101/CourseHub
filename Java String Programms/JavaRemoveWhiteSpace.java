public class JavaRemoveWhiteSpace
{
    public static void main(String [] args)
    {
        String stringOne = "Remove All The White Spaces";

        stringOne = stringOne.replaceAll("\\s", "");

        System.out.println("String after removing all the white spaces: " + stringOne);
    }
}
