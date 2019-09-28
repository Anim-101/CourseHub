#include<stdio.h>
#include<stdlib.h>

struct ArrayOne
{
    int *Arr;
    int size;
    int length;
};

struct ArrayTwo
{
    int Arr[20];
    int size;
    int length;
};


void DisplayOne(struct ArrayOne arr)
{
    printf("\nElements are:\n");

    for(int i = 0; i < arr.length; i++)
    {
        printf("%d ", arr.Arr[i]);
    }

    printf("\n");
}

void DisplayTwo(struct ArrayTwo arr)
{
    printf("\nElements are (Static Array):\n");

    for(int i = 0; i < arr.length; i++)
    {
        printf("%d ", arr.Arr[i]);
    }

    printf("\n");
}



int main()
{
    struct ArrayOne arrOne;

    printf("Enter Size of an Array (Pointer Array): ");

    scanf("%d", &arrOne.size);

    arrOne.Arr = (int *) malloc(arrOne.size * sizeof(int));

    arrOne.length = 0;

    int n;

    printf("\nEnter Number of Numbers (Pointer Array): ");

    scanf("%d", &n);

    printf("\nEnter %d Numbers (Pointer Array):\n", n);

    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arrOne.Arr[i]);
    }

    arrOne.length = n;

    DisplayOne(arrOne);

    struct ArrayTwo arrTwo = {{2, 3, 4, 5, 8}, 20, 5};

    DisplayTwo(arrTwo);


    return 0;
}
