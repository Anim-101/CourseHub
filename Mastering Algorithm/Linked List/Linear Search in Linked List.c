#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*firstNode;

void createNodes(int array[], int numberOfNodes)
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

void displayNodes(struct Node *pointNode)
{
    printf("\nDisplaying Nodes:\n\n");

    while(pointNode != NULL)
    {
        printf("%d ", pointNode->data);

        pointNode = pointNode->next;
    }

    printf("\n");
}

struct Node * linearSearch(struct Node *pointNode, int key)
{
    while(pointNode != NULL)
    {
        if(key == pointNode->data)
        {
            return pointNode;
        }

        pointNode = pointNode->next;
    }

    return NULL;
};

int main()
{
    struct Node *tempNode;

    int array [] = {3, 5, 7, 10, 25, 26, 24, 29, 11, 2};

    createNodes(array, 10);

    displayNodes(firstNode);

    tempNode = linearSearch(firstNode, 26);

    if(tempNode != NULL)
    {
        printf("\nValue Found and Searched Value: %d\n", tempNode->data);
    }
    else
    {
        printf("\nValue not Found\n");
    }

    return 0;
}
