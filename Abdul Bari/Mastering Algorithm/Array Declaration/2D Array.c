#include<stdio.h>
#include<stdlib.h>

int main()
{
    int arr[3][4] = {{1, 2, 3, 4}, {2, 4, 6, 8}, {1, 3, 5, 7}};

    int *brr[3];

    int **crr;

    printf("Printing 2D Array From Stack\n");

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            printf("%d ", arr[i][j]);
        }

        printf("\n");
    }

    printf("\n");

    brr[0] = (int *) malloc(4 * sizeof(int));

    brr[1] = (int *) malloc(4 * sizeof(int));

    brr[2] = (int *) malloc(4 * sizeof(int));

    printf("Printing 2D Array From Heap Using Single Pointer\n");

    int brrCounter = 0;

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            brr[i][j] = ++brrCounter;

            printf("%d ", brr[i][j]);
        }

        printf("\n");
    }

    printf("\n");

    crr = (int **) malloc(3 * sizeof(int *));

    crr[0] = (int *) malloc(4 * sizeof(int));

    crr[1] = (int *) malloc(4 * sizeof(int));

    crr[2] = (int *) malloc(4 * sizeof(int));

    printf("Printing 2D Array From Heap Using Double Pointer\n");

    int crrCounter = 0;

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 4; j++)
        {
            crr[i][j] = ++crrCounter;

            printf("%d ", crr[i][j]);
        }

        printf("\n");
    }

    return 0;
}
