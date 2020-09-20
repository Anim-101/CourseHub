public class JavaTwoEqualMatrix
{
    public static void main(String [] args)
    {
        int rowOne, rowTwo, colOne, colTwo;

        boolean flag = true;

        int arrOne[][] = {
                            {1, 2, 3},
                            {8, 4, 6},
                            {4, 5, 7}
                         };

        int arrTwo[][] = {
                            {1, 2, 3},
                            {8, 4, 6},
                            {4, 5, 7}
                          };

        rowOne = arrOne.length;

        rowTwo = arrTwo.length;

        colOne = arrOne[0].length;

        colTwo = arrTwo[0].length;

        if(rowOne != rowTwo || colOne != colTwo)
        {
            System.out.println("Matrices are not Equal");
        }
        else
        {
            for(int i = 0; i < rowOne; i++)
            {
                for(int j = 0; j < rowTwo; j++)
                {
                    if(arrOne[i][j] != arrTwo[i][j])
                    {
                        flag = false;
                    }
                }
            }
        }

        if(flag)
        {
            System.out.println("Matrices are Equal");
        }
        else
        {
            System.out.println("Matrices are not Equal");
        }
    }
}