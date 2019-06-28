public class JavaOddEvenFrequencyMatrix
{
    public static void main(String [] args)
    {
        int rows, cols, countOdd = 0, countEven = 0;

        int arr[][] = {
                        {4, 1, 3},
                        {3, 5, 7},
                        {8, 2, 6}
                      };

        rows = arr.length;

        cols = arr[0].length;

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                if(arr[i][j] % 2 == 0)
                {
                    countEven++;
                }
                else
                {
                    countOdd++;
                }
            }
        }

        System.out.println("Frequency of odd Numbers: " + countOdd);
        
        System.out.println("Frequency of Even Numbers: " + countEven);
    }
}