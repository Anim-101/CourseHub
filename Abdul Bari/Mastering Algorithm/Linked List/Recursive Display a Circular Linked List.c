#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*Head;

void createNodes(int array [], int numberOfNodes)
{
    struct Node *tempNode, *lastNode;

    Head = (struct Node *) malloc(sizeof(struct Node));

    Head->data = array[0];

    Head->next = Head;

    lastNode = Head;

    for(int i = 1; i < numberOfNodes; i++)
    {
        tempNode = (struct Node *) malloc(sizeof(struct Node));

        tempNode->data = array[i];

        tempNode->next = lastNode->next;

        lastNode->next = tempNode;

        lastNode = tempNode;
    }
}

void recursiveDisplay(struct Node *pointNode)
{
    static int flag = 0;

    if(pointNode != Head || flag == 0)
    {
        flag = 1;

        printf("%d ", pointNode->data);

        recursiveDisplay(pointNode->next);
    }

    flag = 0;
}

int main()
{
    int array [] = {1, 2, 3, 4, 5, 6};

    createNodes(array, 6);

    printf("\nRecursive Display A Circular Linked List: ");

    recursiveDisplay(Head);

    printf("\n");

    return 0;
}
