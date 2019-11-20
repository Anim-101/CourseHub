#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*firstNode = NULL;

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
    printf("\nDisplaying Linked List Values:\n\n");

    while(pointNode != NULL)
    {
        printf("%d ", pointNode->data);

        pointNode = pointNode->next;
    }

    printf("\n");
}

int main()
{
    int array [] = {10, 23, 24, 11, 1, 2, 6, 7, 3};

    createNodes(array, 9);

    displayNodes(firstNode);

    return 0;
}
