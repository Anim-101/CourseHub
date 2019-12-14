#include<stdio.h>

int delete(int *array, int *size, int item)
{

    int i = 0;

    while(array[i] != item && i < *size)
    {
        i++;
    }

    if(i == *size)
    {
        return -1;
    }
    else
    {
        for(; i < *size - 1; i++)
        {
            array[i] = array[i + 1];
        }

        (*size)--;
    }

    return 0;
}

int main()
{
    int size;

    printf("\nEnter Size of Sorted Array: ");

    scanf("%d", &size);

    int array[size];

    printf("\nEnter %d Sorted Element\n", size);

    for(int i = 0; i < size; i++)
    {
        scanf("%d", &array[i]);
    }

    printf("Item Which You Want to Delete: ");

    int item;

    scanf("%d", &item);

    int result = delete(&array, &size, item);

    if(result == -1)
    {
        printf("\nCouldn't Delete\n");
    }
    else if(result == 0)
    {
        printf("\nValue Deleted\n");
    }

    printf("\nNew Sorted Array: ");

    for(int i = 0; i < size; i++)
    {
        printf("%d ", array[i]);
    }

    printf("\n");

    return 0;
}
