#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*firstNode;

void Create(int array[], int numberOfNodes)
{
    struct Node *tempNode, *lastNode;

    firstNode = (struct Node *) malloc(sizeof(struct Node));

    firstNode->data = array[0];

    firstNode->next = NULL;

    lastNode = firstNode;

    for(int i = 1; i < numberOfNodes; i++)
    {
        tempNode = (struct Node *) malloc(sizeof(struct Node));

        tempNode->data = array[i];

        tempNode->next = NULL;

        lastNode->next = tempNode;

        lastNode = tempNode;
    }
}

void headRecursiveDisplay(struct Node *pointerNode)
{
    if(pointerNode != NULL)
    {
        headRecursiveDisplay(pointerNode->next);

        printf("%d ", pointerNode->data);
    }
}

void tailRecursiveDisplay(struct Node *pointerNode)
{
    if(pointerNode != NULL)
    {
        printf("%d ", pointerNode->data);

        tailRecursiveDisplay(pointerNode->next);
    }
}

int main()
{
    int array[] = {1, 2, 3, 4, 5, 6, 7, 8};

    Create(array, 8);

    printf("\nDisplaying in Head Recursion:\n");

    headRecursiveDisplay(firstNode);

    printf("\n\nDisplaying Tail Recursion:\n");

    tailRecursiveDisplay(firstNode);

    printf("\n");

    return 0;
}
