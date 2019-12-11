#include<stdio.h>
#include<stdlib.h>

int main()
{
    int* ptr;

    int num = 10;

    ptr = (int*) malloc(num * sizeof(int));

    if(ptr == NULL)
    {
        printf("Memory Creation with calloc was not Successful!!\n");

        exit(0);
    }
    else
    {
        printf("Memory Allocation with calloc was Successful!!\n");

        for(int i = 0; i < num; i++)
        {
            ptr[i] = i + 1;
        }

        printf("Values Stored Via calloc: ");

        for(int i = 0; i < num; i++)
        {
            printf("%d ", ptr[i]);
        }
    }

    return 0;
}
