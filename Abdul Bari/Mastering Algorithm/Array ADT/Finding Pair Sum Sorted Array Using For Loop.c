#include<stdio.h>

struct Array
{
    int array[10];
    int size;
    int length;
};

void Display(struct Array array)
{
    printf("\nElements are in List: ");

    for(int i = 0; i < array.length; i++)
    {
        printf("%d ", array.array[i]);
    }

    printf("\n");
}

void pairSumSortedArrayForLoop(struct Array array, int sum)
{
    printf("\nPair Sum Found in List:\n");

    for(int i = 0, j = array.length - 1; i < j; )
    {
        if(array.array[i] + array.array[j] == sum)
        {
            printf("\n%d + %d = %d\n", array.array[i], array.array[j], sum);

            i++;

            j++;
        }
        else if(array.array[i] + array.array[j] < sum)
        {
            i++;
        }
        else
        {
            j--;
        }
    }
}

int main()
{
    struct Array array = {{1, 3, 4, 5, 6, 8, 9, 10, 12, 14}, 10, 10};

    Display(array);

    pairSumSortedArrayForLoop(array, 10);

    return 0;
}
