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
        tempNode = (struct Node*) malloc(sizeof(struct Node));

        tempNode->data = array[i];

        tempNode->next = NULL;

        lastNode->next = tempNode;

        lastNode = tempNode;
    }
}

void displayNodesRecursive(struct Node *pointNode)
{
    if(pointNode != NULL)
    {
        printf("%d ", pointNode->data);

        displayNodesRecursive(pointNode->next);
    }
}

int countLinkedListElementRecursive(struct Node *pointNode)
{
    if(pointNode == NULL)
    {
        return 0;
    }
    else
    {
        return countLinkedListElementRecursive(pointNode->next) + 1;
    }
}

int countLinkedListElementRecursiveAddingFirst(struct Node *pointNode)
{
    if(pointNode == NULL)
    {
        return 0;
    }
    else
    {
        return 1 + countLinkedListElementRecursiveAddingFirst(pointNode->next);
    }
}

int countLinkedListElementRecursiveElseReturnZero(struct Node *pointNode)
{
    if(pointNode != NULL)
    {
        return countLinkedListElementRecursiveElseReturnZero(pointNode->next) + 1;
    }
    else
    {
        return 0;
    }
}

int countLinkedListElementRecursiveTakeAnotherVariableX(struct Node *pointNode)
{
   int x = 0;

   if(pointNode == NULL)
   {
       return x;
   }
   else
   {
       x = countLinkedListElementRecursiveTakeAnotherVariableX(pointNode->next);

       return x + 1;
   }
}

int main()
{
    int array [] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

    createNodes(array, 10);

    printf("\nDisplaying Nodes Recursively:\n\n");

    displayNodesRecursive(firstNode);

    printf("\n");

    printf("\nCounting in Recursive Method: %d\n", countLinkedListElementRecursive(firstNode));

    printf("\nCounting in Recursive Method, Adding 1 First: %d\n", countLinkedListElementRecursiveAddingFirst(firstNode));

    printf("\nCounting in Recursive Method, Else Return 0: %d\n", countLinkedListElementRecursiveElseReturnZero(firstNode));

    printf("\nCounting in Recursive Method, Take Another Variable X: %d\n", countLinkedListElementRecursiveTakeAnotherVariableX(firstNode));

    return 0;
}
