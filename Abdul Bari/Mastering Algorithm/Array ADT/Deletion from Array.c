#include<stdio.h>

struct Array
{
    int Arr[10];
    int size;
    int length;
};

void Display(struct Array array)
{
    for(int i = 0; i < array.length; i++)
    {
        printf("%d ", array.Arr[i]);
    }

    printf("\n");
}

int Delete(struct Array *array, int index)
{
    int x = 0;

    if(index >= 0 && index < array->length)
    {
        x = array->Arr[index];

        for(int i = index; i < array->length - 1; i++)
        {
            array->Arr[i] = array->Arr[i + 1];
        }

        array->length--;

        return x;
    }

    return 0;
}

int main()
{
    struct Array array = {{2, 3, 4, 5, 6, 7}, 10, 6};

    printf("Before Deletion, Array Values: ");

    Display(array);

    printf("Deleted Value from Array: %d", Delete(&array, 0));

    printf("\nAfter Deletion, Array Values: ");

    Display(array);

    return 0;
}
