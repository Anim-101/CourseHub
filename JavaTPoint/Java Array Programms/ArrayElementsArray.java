public class ArrayElementsArray
{
    public static void main(String [] args)
    {
        int firstArray [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int secondArray [] = new int [firstArray.length];

        for(int i = 0; i < firstArray.length; i++)
        {
            secondArray[i] = firstArray[i];
        }        

        System.out.println("Elements of First Array:");

        for(int i : firstArray)
        {
            System.out.println(i);
        }

        System.out.println("Elements of Second Array:");

        for(int i : secondArray)
        {
            System.out.println(i);
        }
    }
}