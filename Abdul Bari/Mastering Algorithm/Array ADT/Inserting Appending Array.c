#include<stdio.h>

struct array
{
    int Arr[10];
    int size;
    int length;
};

void Display(struct array arr)
{
    printf("\nElements are:\n");

    for(int i = 0; i < arr.length; i++)
    {
        printf("%d ", arr.Arr[i]);
    }

    printf("\n");
}

void Append(struct array *arr, int number)
{
    if(arr->length < arr->size)
    {
        arr->Arr[arr->length++] = number;
    }
}

void Insert(struct array *arr, int index, int number)
{
    for(int i = arr->length; i > index; i--)
    {
        arr->Arr[i] = arr->Arr[i - 1];
    }

    arr->Arr[index] = number;

    arr->length++;
}

int main()
{
    struct array arr = {{2, 4, 3, 7, 8, 2}, 10, 5};

    Append(&arr, 10);

    Insert(&arr, 0, 12);

    Display(arr);

    return 0;
}
