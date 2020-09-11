#include<stdio.h>
#include<stdlib.h>

struct Stack
{
    int size;
    int top;
    int *array;
};

void createStack(struct Stack *stack)
{
    printf("Enter Size: ");

    scanf("%d", &stack->size);

    stack->top = -1;

    stack->array = (int *) malloc(stack->size * sizeof(int));
}

int Display(struct Stack stack)
{
    for(int i = stack.top; i >= 0; i--)
    {
        printf("%d ", stack.array[i]);
    }

    printf("\n");
}

void Push(struct Stack *stack, int data)
{
    if(stack->top == stack->size - 1)
    {
        printf("Stack Overflow\n");
    }
    else
    {
        stack->top++;
        stack->array[stack->top] = data;
    }
}

int pop(struct Stack *stack)
{
    int data = -1;

    if(stack->top == -1)
    {
        printf("Stack Underflow\n");
    }
    else
    {
        data = stack->array[stack->top--];
    }

    return data;
}

int Peek(struct Stack stack, int index)
{
    int data = -1;

    if(stack.top - index + 1 < 0)
    {
        printf("Invaild Index \n");
    }

    data = stack.array[stack.top - index + 1];

    return data;
}

int isEmpty(struct Stack stack)
{
    if(stack.top == 1)
    {
        return 1;
    }

    return 0;
}

int isFull(struct Stack stack)
{
    return stack.top == stack.size - 1;
}

int stackTop(struct Stack stack)
{
    if(!isEmpty(stack))
    {
        return stack.array[stack.top];
    }

    return -1;
}

int main()
{
    struct Stack stack;

    printf("\n");

    createStack(&stack);

    Push(&stack, 10);

    Push(&stack, 20);

    Push(&stack, 30);

    Push(&stack, 40);

    printf("\n");

    printf("Peek - %d \n", Peek(stack, 2));

    printf("\n");

    Display(stack);

    return 0;
}
