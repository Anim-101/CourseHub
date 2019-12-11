#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *ptrOne, *ptrTwo;

    int num = 10;

    ptrOne = (int*) malloc(num * sizeof(int));

    ptrTwo = (int*) calloc(num, sizeof(int));

    if(ptrOne == NULL || ptrTwo == NULL)
    {
        printf("Memory Allocation Was not Successful\n");
    }
    else
    {
        printf("Memory Successfully Allocated Using malloc.\n");

        for(int i = 0; i < num; i++)
        {
            ptrOne[i] = i + 1;
        }

        printf("Values in ptrOne using malloc: ");

        for(int i = 0; i < num; i++)
        {
            printf("%d ", ptrOne[i]);
        }

        printf("\nMemory De-Allocating Using Free ........\n");

        free(ptrOne);

        printf("Memory Freed !! - malloc\n");

        printf("Memory Successfully Allocated Using calloc.\n");

        for(int i = 0; i < num; i++)
        {
            ptrTwo[i] = i + 1;
        }

        printf("Values in ptrTwo using calloc: ");

        for(int i = 0; i < num; i++)
        {
            printf("%d ", ptrTwo[i]);
        }

        printf("\nMemory De-Allocating using Free ........\n");

        free(ptrTwo);

        printf("Memory Freed !! - calloc\n");
    }

    return 0;
}
