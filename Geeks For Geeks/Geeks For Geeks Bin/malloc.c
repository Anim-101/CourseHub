#include<stdio.h>
#include<stdlib.h>

int main()
{
    int* ptr;

    int num = 10;

    ptr = (int*) malloc(num * sizeof(int));

    if(ptr == NULL)
    {
        printf("Memory Was Not Allocated\n");
    }
    else
    {
        printf("Memory Successfully Allocated\n");

        for(int i = 0; i < num; i++)
        {
            ptr[i] = i + 1;
        }

        printf("Values in Dynamic Memory: ");

        for(int i = 0; i < num; i++)
        {
            printf("%d ", ptr[i]);
        }
    }

    return 0;
}
