#include<stdio.h>

void Insert(int *array, int *size, int item)
{
    int i = 0, j = 0;

    if(item < array[0])
    {
        i = 0;
    }
    else
    {
        for(i = 0; i < *size; i++)
        {
            if(array[i] > item && array[i - 1] < item)
            {
                break;
            }
        }
    }

    for(j = *size; j > i; j--)
    {
        array[j] = array[j - 1];
    }

    array[i] = item;

    (*size)++;
}

int main()
{
    int size;

    printf("\nEnter Size of Array: ");

    scanf("%d", &size);

    printf("\nEnter %d Sorted Elements for Sorted Array\n", size);

    int array[size];

    for(int i = 0; i < size; i++)
    {
        scanf("%d", &array[i]);
    }

    int item;

    printf("\nEnter Element to be Inserted: ");

    scanf("%d", &item);

    Insert(&array, &size, item);

    printf("\nAfter Inserting, New Sorted Array: ");

    for(int i = 0; i < size; i++)
    {
        printf("%d ", array[i]);
    }

    printf("\n");

    return 0;
}
