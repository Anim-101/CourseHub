#include<stdio.h>

int x = 0;

int func(int number)
{
    if(number > 0)
    {
        x++;

        return func(number - 1) + x;
    }

    return 0;
}

int main()
{
    int number  = 5;

    printf("Recursive Addition using Global Variable 0 to %d: %d", number, func(number));

    return 0;
}
