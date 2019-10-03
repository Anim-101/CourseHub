#include<stdio.h>

struct Array
{
    int array[10];
    int size;
    int length;
};

void Display(struct Array array)
{
    for(int i = 0; i < array.length; i++)
    {
        printf("%d ", array.array[i]);
    }

    printf("\n");
}

int binarySearch(struct Array array, int key)
{
    int low, mid, high;

    low = 0;

    high = array.length;

    while(low <= high)
    {
        mid = (low + high) / 2;

        if(key == array.array[mid])
        {
            return mid;
        }
        else if(key < array.array[mid])
        {
            high = mid - 1;
        }
        else
        {
            low = mid + 1;
        }
    }

    return -1;
}

int recursiveBinarySearch(int array[], int low, int high, int key)
{
    int mid = 0;

    if(low <= high)
    {
        mid = (low + high) / 2;

        if(key == array[mid])
        {
            return mid;
        }
        else if(key < array[mid])
        {
            return recursiveBinarySearch(array, low, mid - 1, key);
        }
        else
        {
            return recursiveBinarySearch(array, mid + 1, high, key);
        }
    }

    return -1;
}

int main()
{
    struct Array array = {{2, 3, 5, 9, 10, 12, 16, 18, 20}, 10, 9};

    printf("\nValues Stored in List: ");

    Display(array);

    int position = binarySearch(array, 16);

    if(position == -1)
    {
        printf("\nKey was not Found in List using For Loop\n");
    }
    else
    {
        printf("\nKey was Found at %d Position in List using For Loop\n", position);
    }

    position = recursiveBinarySearch(array.array, 0, array.length, 16);

    if(position == -1)
    {
        printf("\nKey was not Found in List using Recursive Binary Search\n");
    }
    else
    {
        printf("\nKey was Found in List at %d Position using Recursive Binary Search\n", position);
    }

    return 0;
}
