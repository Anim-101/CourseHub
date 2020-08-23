#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*firstNode = NULL;

void Display(struct Node *pointNode)
{
    while(pointNode != NULL)
    {
        printf("%d ", pointNode->data);

        pointNode = pointNode->next;
    }
}

void createNodes(int array[], int numberOfNodes)
{
    struct Node *tempNode, *lastNode;

    firstNode = (struct Node*) malloc(sizeof(struct Node));

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

void sortedInsert(struct Node *pointNode, int setValue)
{
    struct Node *tempNode, *lastNode = NULL;

    tempNode = (struct Node *) malloc(sizeof(struct Node));

    tempNode->data = setValue;

    tempNode->next = NULL;

    if(firstNode == NULL)
    {
        firstNode = tempNode;
    }
    else
    {
        while(pointNode && pointNode->data < setValue)
        {
            lastNode = pointNode;

            pointNode = pointNode->next;
        }

        if(pointNode == firstNode)
        {
            tempNode->next = firstNode;

            firstNode = tempNode;
        }
        else
        {
            tempNode->next = lastNode->next;

            lastNode->next = tempNode;
        }
    }
}

int main()
{
    int array [] = {1, 2, 3, 4, 5, 6, 8};

    createNodes(array, 7);

    printf("\nDisplaying Before Insert in Sorted Linked List: ");

    Display(firstNode);

    printf("\n");

    sortedInsert(firstNode, 7);

    printf("\nDisplaying After Insert in Sorted Linked List: ");

    Display(firstNode);

    printf("\n");

    return 0;
}
