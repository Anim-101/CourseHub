#include<stdio.h>

void swap(int first, int second)
{
    int temp;

    temp = first;

    first = second;

    second = temp;

    printf("After Swapping: %d and %d", first, second);
}

int main()
{
    int first, second;

    printf("First Number: ");

    scanf("%d", &first);

    printf("\nSecond Number: ");

    scanf("%d", &second);

    printf("\nBefore Swapping: %d and %d\n", first, second);
    swap(first, second);

    return 0;
}

