#include<stdio.h>
#include<stdlib.h>

int MIN_INT = -32768;

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

void displayElementsRecursive(struct Node *pointNode)
{
    if(pointNode != NULL)
    {
        printf("%d ", pointNode->data);

        displayElementsRecursive(pointNode->next);
    }
}

int maxNodesElementsRecursiveModifiedCodeSnippets(struct Node *pointNode)
{
    int x = 0;

    if(pointNode == NULL)
    {
        return MIN_INT;
    }

    x = maxNodesElementsRecursiveModifiedCodeSnippets(pointNode->next);

    return x > pointNode->data ? x : pointNode->data;
}


int main()
{
    int array [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    createNodes(array, 10);

    printf("\nDisplaying Nodes' Elements:\n\n");

    displayElementsRecursive(firstNode);

    printf("\n\nMaximum Nodes Elements of Given Linked List Recursive Modified Code Snippets: %d", maxNodesElementsRecursiveModifiedCodeSnippets(firstNode));

    return 0;
}
