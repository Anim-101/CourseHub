#include<stdio.h>

int sum(int array[], int number)
{
    int sumVal = 0;

    for(int i = 0; i < number; i++)
    {
        sumVal = sumVal + array[i];
    }

    return sumVal;
}

int main()
{
    int number;

    scanf("%d", &number);

    int array[number];

    for(int i = 0; i < number; i++)
    {
        scanf("%d", &array[i]);
    }

    //int result = sum(array[number], number);

    printf("Sum of Given Array Value: %d", sum(array, number));
}
