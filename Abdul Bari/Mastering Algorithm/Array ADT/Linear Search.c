#include<stdio.h>

struct Array
{
    int array[10];
    int size;
    int length;
};


int linearSearch(struct Array *array, int key)
{
    for(int i = 0; i < array->length; i++)
    {
        if(key == array->array[i])
        {
            return i;
        }
    }

    return -1;
}


void swap(int *x, int *y)
{
    int temp = *x;

    *x = *y;

    *y = temp;
}

int linearSearchTransposition(struct Array *array, int key)
{
    for(int i = 0; i < array->length; i++)
    {
        if(key == array->array[i])
        {
            swap(&array->array[i], &array->array[i - 1]);

            return i;
        }
    }

    return -1;
}

int linearSearchMoveToFront(struct Array *array, int key)
{
    for(int i = 0; i < array->length; i++)
    {
        if(key == array->array[i])
        {
            swap(&array->array[i], &array->array[0]);

            return i;
        }
    }

    return -1;
}

int main()
{
    struct Array arrayNormal = {{2, 23, 14, 5, 6, 9, 8, 12}, 10, 8};

    int position = linearSearch(&arrayNormal, 14);

    if(position == -1)
    {
        printf("\nIn Normal Linear Search, Key was not Found from List\n");
    }
    else
    {
        printf("\nIn Normal Linear Search, Key was Found at %d Position from List\n", position);
    }

    struct Array arrayTranspose = {{2, 13, 15, 5, 6, 9, 8, 12}, 10, 8};

    position = linearSearchTransposition(&arrayTranspose, 5);

    if(position == -1)
    {
        printf("\nIn Transposition Linear Search, Key was not Found from List\n");
    }
    else
    {
        printf("\nIn Transposition Linear Search, Key was Found at %d Position from List\n", position);
    }

    struct Array arrayMoveToFront = {{2, 23, 14, 5, 6, 9, 8, 12}, 10, 8};

    position = linearSearchMoveToFront(&arrayMoveToFront, 9);

    if(position == -1)
    {
        printf("\nIn Move To Front Linear Search, Key was not Found from List\n");
    }
    else
    {
        printf("\nIn Move to Front Linear Search, Key was Found at %d Position from List\n", position);
    }

    return 0;
}
