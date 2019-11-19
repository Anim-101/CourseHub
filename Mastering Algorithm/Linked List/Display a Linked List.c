#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}*first = NULL;

void Create(int array[], int number)
{
    struct Node *temp, *last;

    first = (struct Node *) malloc(sizeof(struct Node));

    first->data = array[0];

    first->next = NULL;

    last = first;

    for(int i = 1; i < number; i++)
    {
        temp = (struct Node*) malloc(sizeof(struct Node));

        temp->data = array[i];

        temp->next = NULL;

        last->next = temp;

        last = temp;
    }
}

void Display(struct Node *pointer)
{
    while(pointer != NULL)
    {
        printf("%d ", pointer->data);

        pointer = pointer->next;
    }
}

void recursiveDisplayHead(struct Node *pointer)
{
    if(pointer != NULL)
    {
        recursiveDisplayHead(pointer->next);

        printf("%d ", pointer->data);
    }
}

void recursiveDisplayTail(struct Node *pointer)
{
    if(pointer != NULL)
    {
        printf("%d ", pointer->data);

        recursiveDisplayTail(pointer->next);
    }
}

int main()
{
   int array[] = {2, 3, 8, 9, 13, 14, 23, 24};

    Create(array, 8);

    printf("\nDisplaying in Normal Display\n");

    Display(first);

    printf("\n\nDisplaying in Recursive Display -> Head Recursion\n");

    recursiveDisplayHead(first);

    printf("\n\nDisplaying in Recursive Display -> Tail Recursion\n");

    recursiveDisplayTail(first);

    printf("\n");

    return 0;
}
