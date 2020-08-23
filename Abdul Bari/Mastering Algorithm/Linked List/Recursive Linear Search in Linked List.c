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

struct Node *recursiveLinearSearch(struct Node *pointNode, int key)
{
    if(pointNode == NULL)
    {
        return NULL;
    }

    if(key == pointNode->data)
    {
        return pointNode;
    }

    return recursiveLinearSearch(pointNode->next, key);
}

int main()
{
    struct Node *tempNode;

    int array [] = {3, 5, 7, 8, 9, 1, 6, 11, 26, 16};

    createNodes(array, 10);

    displayNodes(firstNode);

    tempNode = recursiveLinearSearch(firstNode, 16);

    if(tempNode != NULL)
    {
        printf("\nValue Found and Searched Value: %d\n", tempNode->data);
    }
    else
    {
        printf("\nValue was not Found\n");
    }

    return 0;
}
