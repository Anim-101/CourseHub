#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*firstNode = NULL, *lastNode = NULL;

void Display(struct Node *pointNode)
{
    while(pointNode != NULL)
    {
        printf("%d ", pointNode->data);

        pointNode = pointNode->next;
    }
}

void createNodes(int array [], int numberOfNodes)
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

void removeDuplicate(struct Node *pointNode)
{
    struct Node *lastNode;

    lastNode = pointNode->next;

    while(lastNode != NULL)
    {
        if(pointNode->data != lastNode->data)
        {
            pointNode = lastNode;

            lastNode = lastNode->next;
        }
        else
        {
            pointNode->next = lastNode->next;

            free(lastNode);

            lastNode = pointNode->next;
        }
    }
}

int main()
{
    int array [] = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 5, 5};

    createNodes(array, 13);

    printf("\nDisplaying Before Removing Duplicates Nodes: ");

    Display(firstNode);

    printf("\n");

    removeDuplicate(firstNode);

    printf("\nDisplaying After Removing Duplicates Nodes: ");

    Display(firstNode);

    printf("\n");

    return 0;
}
