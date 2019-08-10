#include<stdio.h>

static int number;

void arrayAddition(int arrA[number][number], int arrB[number][number], int number)
{
    int arrC[number][number];

    for(int i = 0; i < number; i++)
    {
        for(int j = 0; j < number; j++)
        {
            arrC[i][j] = arrA[i][j] + arrB[i][j];
        }
    }

    printf("Final 2D Array After Two 2D Array Addition:\n");

    for(int i = 0; i < number; i++)
    {
        for(int j = 0; j < number; j++)
        {
            printf("%d ", arrC[i][j]);
        }

        printf("\n");
    }
}

int main()
{

    printf("Enter Number of Elements for 2D Array: ");

    scanf("%d", &number);

    int arrA[number][number], arrB[number][number];

    printf("Input First 2D Array Elements:\n");

    for(int i = 0; i < number; i++)
    {
        for(int j = 0; j < number; j++)
        {
            scanf("%d", &arrA[i]);
        }
    }

    printf("\nInput Second Array Elements:\n");

    for(int i = 0; i < number; i++)
    {
        for(int j = 0; j < number; j++)
        {
            scanf("%d", &arrB[i]);
        }
    }

    arrayAddition(arrA, arrB, number);

    return 0;
}
