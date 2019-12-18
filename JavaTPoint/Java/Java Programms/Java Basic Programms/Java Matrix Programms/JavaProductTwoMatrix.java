public class JavaProductTwoMatrix
{
    public static void main(String [] args)
    {
        int rowOne, rowTwo, colOne, colTwo;

        int arrOne[][] = {
                        {1, 3, 2},
                        {3, 1, 1},
                        {1, 2, 2}
                      };

        int arrTwo[][] = {
                            {2, 1, 1},
                            {1, 0, 1},
                            {1, 3, 1}
                         };

        rowOne = arrOne.length;

        colOne = arrOne[0].length;

        rowTwo = arrTwo.length;

        colTwo = arrTwo[0].length;

        int arrProd[][] = new int[rowOne][colTwo];

        if(colTwo != rowTwo)
        {
            System.out.println("Matrices Cannot be Multiplied");
        }
        else
        {
            for(int i = 0; i < rowOne; i++)
            {
                for(int j = 0; j < colTwo; j++)
                {
                    for(int k = 0; k < rowTwo; k++)
                    {
                        arrProd[i][j] = arrProd[i][j] + arrOne[i][k] * arrTwo[k][j];
                    }
                }
            }
        }

        System.out.println("Product of Two Matrices:");

        for(int i = 0; i < rowOne; i++)
        {
            for(int j = 0; j < rowTwo; j++)
            {
                System.out.print(arrProd[i][j] + " ");
            }

            System.out.println();
        }
    }
}