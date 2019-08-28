#include<stdio.h>

void funcA(int number)
{
    if(number > 0)
    {
        printf("In FuncA -> %d\n", number);

        funcB(number - 1);
    }
}

void funcB(int number)
{
    if(number > 1)
    {
        printf("In FuncB -> %d\n", number);

        funcA(number / 2);
    }
}

int main()
{
    int number = 100;

    funcA(100);

    return 0;
}
