#include<stdio.h>

struct Array
{
    int array[21];
    int size;
    int length;
};

void Display(struct Array array)
{
    printf("\nElements in List: ");

    for(int i = 0; i < array.length; i++)
    {
        printf("%d ", array.array[i]);
    }

    printf("\n");
}

void findingCountingDuplicateHash(struct Array array)
{
    struct Array hashArray;

    int max = array.array[array.length - 1];

    hashArray.size = max + 1;

    hashArray.length = max + 1;

    for(int i = 0; i <= max; i++)
    {
        hashArray.array[i] = 0;
    }

    for(int i = 0; i < array.length; i++)
    {
        hashArray.array[array.array[i]]++;
    }

    for(int i = 1; i <= hashArray.length; i++)
    {
        if(hashArray.array[i] > 1)
        {
            printf("\n%d has Appeared %d times in List\n", i, hashArray.array[i]);
        }
    }
}

int main()
{
    struct Array array = {{3, 6, 8, 8, 10, 12, 15, 15, 15, 20}, 10, 10};

    Display(array);

    findingCountingDuplicateHash(array);

    return 0;
}
