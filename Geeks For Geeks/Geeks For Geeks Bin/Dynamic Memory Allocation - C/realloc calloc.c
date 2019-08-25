#include<stdio.h>
#include<stdlib.h>

int main()
{
    int *ptr;

    int num = 5;

    ptr = (int*) calloc(num, sizeof(int));

    if(ptr == NULL)
    {
        printf("Memory Allocation Using Calloc Wasn't Successful\n");

        exit(0);
    }
    else
    {
        printf("Memory Successfully Allocated Using Calloc.\n");

        for(int i = 0; i < num; i++)
        {
            ptr[i] = i + 1;
        }

        printf("Initial Allocation with Calloc Contains %d Values: ", num);

        for(int i = 0; i < num; i++)
        {
            printf("%d ", ptr[i]);
        }

        int newNum = 10;

        printf("\nRe-Allocating Memory from %d to %d\n", num, newNum);

        ptr = realloc(ptr, newNum * sizeof(int));

        printf("Memory Successfully Re-Allocated using Realloc\n");

        for(int i = 0; i < newNum; i++)
        {
            ptr[i] = i + 1;
        }

        printf("After Re-Allocation, Calloc initialized ptr Contains %d Values: ", newNum);

        for(int i = 0; i < newNum; i++)
        {
            printf("%d ", ptr[i]);
        }

        printf("\nFreeing Using Free......\n");

        free(ptr);

        printf("Memory De-Allocated ! Memory Freed !!\n");
    }
}
