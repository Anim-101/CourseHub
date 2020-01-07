#include<stdio.h>
#include<stdlib.h>

struct Node
{
    int data;
    struct Node *next;
}
*firstNode = NULL;


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

int isLoop(struct Node *pointNodeFirst)
{
    struct Node *pointNode, *tempNode;

    pointNode = tempNode = pointNodeFirst;

    while(pointNode && tempNode && pointNode != tempNode)
    {
        pointNode = pointNode->next;

        tempNode = tempNode->next;

        tempNode = tempNode != NULL ? tempNode->next : NULL;
    }

    if(pointNode == tempNode)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void Display(struct Node *pointNode)
{
    int loop = isLoop(pointNode);

    if(loop)
    {
        while(pointNode != NULL)
        {
            printf("%d ", pointNode->data);

            pointNode = pointNode->next;
        }
    }
    else
    {
        printf("Can't Show Linked List As It Is Not Going To End Because Of Loop");
    }
}

int main()
{
    struct Node *tempNodeFirst, *tempNodeSecond;

    int array [] = {1, 2, 3, 4, 5, 6};

    createNodes(array, 6);

    printf("\nDisplaying Before Creating Loop and Check Whether There Is Any Loop Or Not\n");

    if(!isLoop(firstNode))
    {
        printf("\nLoop Detected\n");
    }
    else
    {
        printf("\nDisplaying Linked List: ");

        Display(firstNode);

        printf("\n");
    }

    tempNodeFirst = firstNode->next->next;

    tempNodeSecond = firstNode->next->next->next->next;

    tempNodeSecond->next = tempNodeFirst;

    printf("\nDisplaying After Creating Loop and Check Whether There Is Any Loop Or Not\n");

    if(isLoop(firstNode))
    {
        printf("\nLoop Detected\n");
    }
    else
    {
        printf("\nDisplaying Linked List: ");

        Display(firstNode);

        printf("\n");
    }

    return 0;
}
