#include<stdio.h>
#include<stdlib.h>

struct Array
{
    int *array;
    int size;
    int length;
};

void Display(struct Array array)
{
    printf("\nElements available in List: ");

    for(int i = 0; i < array.length; i++)
    {
        printf("%d ");
    }
}

void Swap(int *x, int *y)
{
    int temp = *x;

    *x = *y;

    *y = temp;
}

void Append(struct Array *array, int number)
{
    if(array->length < array->size)
    {
        array->array[array->length++] = number;
    }
}

void Insert(struct Array *array, int index, int number)
{
    for(int i = array->length; i > index; i--)
    {
        array->array[i] = array->array[i - 1];
    }

    array->array[index] = number;

    array->length++;
}

int Delete(struct Array *array, int index)
{
    int x = 0;

    if(index >= 0 && index < array->length)
    {
        x = array->array[index];

        for(int i = index; i < array->length - 1; i++)
        {
            array->array[i] = array->array[i + 1];
        }

        array->length--;

        return x;
    }

    return 0;
}

int linearSearchTransposition(struct Array *array, int key)
{
    for(int i = 0; i < array->length; i++)
    {
        if(key == array->array[i])
        {
            Swap(&array->array[i], &array->array[i - 1]);

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
            Swap(&array->array[i], &array->array[0]);

            return i;
        }
    }

    return -1;
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

int Get(struct Array array, int index)
{
    if(index >= 0 && index <= array.length)
    {
        return array.array[index];
    }

    return -1;
}

void Set(struct Array *array, int index, int setNumber)
{
    if(index >= 0 && index < array->length)
    {
        array->array[index] = setNumber;
    }
}

int Min(struct Array array)
{
    int min = array.array[0];

    for(int i = 0; i < array.length; i++)
    {
        if(array.array[i] < min)
        {
            min = array.array[i];
        }
    }

    return min;
}

int Max(struct Array array)
{
    int max = array.array[0];

    for(int i = 0; i < array.length; i++)
    {
        if(array.array[i] > max)
        {
            max = array.array[i];
        }
    }

    return max;
}

int Sum(struct Array *array)
{
    int sum = 0;

    for(int i = 0; i < array->length; i++)
    {
        sum = sum + array->array[i];
    }

    return sum;
}

float Avg(struct Array *array)
{
    return (float) Sum(&array) / array->length;
}

void reverseWithAnotherArray(struct Array *array)
{
    int *brray;

    brray = (int *) malloc(array->length * sizeof(int));

    for(int i = array->length - 1, j = 0; i >= 0; i--, j++)
    {
        brray[j] = array->array[i];
    }

    for(int i = 0; i < array->length; i++)
    {
        array->array[i] = brray[i];
    }
}

void reverseUsingSwap(struct Array *array)
{
    for(int i = 0, j = array->length - 1; i < j; i++, j--)
    {
        Swap(&array->array[i], &array->array[j]);
    }
}

void leftShiftArray(struct Array *array, int shift)
{

    while(shift != 0)
    {
        for(int i = 0; i < array->length - 1; i++)
        {
            array->array[i] = array->array[i + 1];
        }

        array->array[array->length - 1] = 0;

        shift--;
    }
}

void leftRotateArray(struct Array *array, int rotate)
{
    int value;

    while(rotate != 0)
    {
        value = array->array[0];

        for(int i = 0; i < array->length - 1; i++)
        {
            array->array[i] = array->array[i + 1];
        }

        array->array[array->length - 1] = value;

        rotate--;
    }
}

void rightRotateArray(struct Array *array, int rotate)
{
    int value;

    while(rotate != 0)
    {
        value = array->array[array->length - 1];

        for(int i = array->length - 1; i >= 0; i--)
        {
            array->array[i] = array->array[i - 1];
        }

        array->array[0] = value;

        rotate--;
    }
}

void rightShiftArray(struct Array *array, int shift)
{
    while(shift != 0)
    {
        for(int i = array->length - 1; i >= 0; i--)
        {
            array->array[i] = array->array[i - 1];
        }

        array->array[0] = 0;

        shift--;
    }
}

struct Array* Merge(struct Array *arrayOne, struct Array *arrayTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    while(i < arrayOne->length && j < arrayTwo->length)
    {
        if(arrayOne->array[i] < arrayTwo->array[j])
        {
            array->array[k++] = arrayOne->array[i++];
        }
        else
        {
            array->array[k++] = arrayTwo->array[j++];
        }
    }

    for(; i < arrayOne->length; i++)
    {
        array->array[k++] = arrayOne->array[i];
    }

    for(; j < arrayTwo->length; j++)
    {
        array->array[k++] = arrayTwo->array[j];
    }

    array->length = arrayOne->length + arrayTwo->length;

    array->size = 10;

    return array;
}

struct Array* unSortedUnion(struct Array *arrayUnSortedOne, struct Array *arrayUnSortedTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    for(i = 0; i < arrayUnSortedOne->length; i++)
    {
        array->array[i] = arrayUnSortedOne->array[i];
    }

    int l = i;

    while(j < arrayUnSortedTwo->length)
    {
        k = 0;

        while(k < i)
        {
            if(array->array[k] == arrayUnSortedTwo->array[j])
            {
                break;
            }

            k++;
        }

        if(k == i)
        {
            array->array[l++] = arrayUnSortedTwo->array[j];
        }

        j++;
    }

    array->length = l;

    array->size = 10;

    return array;
}

struct Array *sortedUnion(struct Array *arraySortedOne, struct Array *arraySortedTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof (struct Array));

    while(i < arraySortedOne->length && j < arraySortedTwo->length)
    {
        if(arraySortedOne->array[i] < arraySortedTwo->array[j])
        {
            array->array[k++] = arraySortedOne->array[i++];
        }
        else if(arraySortedTwo->array[j] < arraySortedOne->array[i])
        {
            array->array[k++] = arraySortedTwo->array[j++];
        }
        else
        {
            array->array[k++] = arraySortedOne->array[i++];

            j++;
        }
    }

    for(; i < arraySortedOne->length; i++)
    {
        array->array[k++] = arraySortedOne->array[i];
    }

    for(; j < arraySortedTwo->length; j++)
    {
        array->array[k++] = arraySortedTwo->array[j];
    }

    array->length = k;

    array->size = 10;

    return array;
}

struct Array * unSortedIntersection(struct Array *arrayUnSortedOne, struct Array *arrayUnSortedTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    while(i < arrayUnSortedOne->length)
    {
        j = 0;

        while(j < arrayUnSortedTwo->length)
        {
            if(arrayUnSortedOne->array[i] == arrayUnSortedTwo->array[j])
            {
                array->array[k++] = arrayUnSortedTwo->array[j];
            }

            j++;
        }

        i++;
    }

    array->length = k;

    array->size = 10;

    return array;
}

struct Array * sortedIntersection(struct Array *arraySortedOne, struct Array * arraySortedTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    while(i < arraySortedOne->length && j < arraySortedTwo->length)
    {
        if(arraySortedOne->array[i] < arraySortedTwo->array[j])
        {
            i++;
        }
        else if(arraySortedTwo->array[j] < arraySortedOne->array[i])
        {
            j++;
        }
        else if(arraySortedOne->array[i] == arraySortedTwo->array[j])
        {
            array->array[k++] = arraySortedOne->array[i++];

            j++;
        }
    }

    array->length = k;

    array->size = 10;

    return array;
}

struct Array * unSortedDifference(struct Array *arrayUnSortedOne, struct Array *arrayUnSortedTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    while(i < arrayUnSortedOne->length)
    {
        j = 0;

        while(j < arrayUnSortedTwo->length)
        {
            if(arrayUnSortedOne->array[i] == arrayUnSortedTwo->array[j])
            {
                break;
            }

            j++;
        }

        if(j == arrayUnSortedTwo->length)
        {
            array->array[k++] = arrayUnSortedOne->array[i];
        }

        i++;
    }

    array->length = k;

    array->size = 10;

    return array;
}

struct Array * sortedDifference(struct Array *arraySortedOne, struct Array *arraySortedTwo)
{
    int i = 0, j = 0, k = 0;

    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    while(i < arraySortedOne->length && j < arraySortedTwo->length)
    {
        if(arraySortedOne->array[i] < arraySortedTwo->array[j])
        {
            array->array[k++] = arraySortedOne->array[i++];
        }
        else if(arraySortedTwo->array[j] < arraySortedOne->array[i])
        {
            j++;
        }
        else
        {
            i++;

            j++;
        }
    }

    for(; i < arraySortedOne->length; i++)
    {
        array->array[k++] = arraySortedOne->array[i];
    }

    array->length = k;

    array->size = 10;

    return array;
}

int main()
{
    struct Array *array = (struct Array *) malloc(sizeof(struct Array));

    int choice;

    int x, index;

    printf("\nEnter Size of Array: ");

    scanf("%d", &array->size);

    array->length = 0;

    do
    {
        printf("\n\nWelcome, This is Designed Such Way thus Changing main Function will Provide\nOther Functionality to be Used (for now demo choices are added, also main\nfunction needs to be customized)\n\n");

        printf("\n\nMenu\n\n");

        printf("1. Insert\n");

        printf("2. Delete\n");

        printf("3. Search\n");

        printf("4. Sum\n");

        printf("5. Display\n");

        printf("6. Exit\n");

        printf("Enter your Choice: ");

        scanf("%d", &choice);

        switch(choice)
        {
            case 1:

                printf("\nEnter an Element and Index ");

                scanf("%d %d", &x, &index);

                break;

            case 2:

                printf("\nEnter Index: ");

                scanf("%d", &index);

                x = Delete(&array, index);

                printf("Deleted Element is %d\n", x);

                break;

            case 3:

                printf("\nEnter Element to Search ");

                scanf("%d", &x);

                index = linearSearchTransposition(&array, x);

                printf("\nElement index %d", index);

                break;

            case 4:

                printf("\nSum is %d", Sum(&array));

                break;

            case 5:

                Display(*array);
        }
    }
    while(choice < 6);

    return 0;
}
