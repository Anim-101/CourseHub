#include<stdio.h>

int func(int number)
{
    if(number > 100)
    {
        return number - 10;
    }
    else
    {
        return func(func(number + 11));
    }
}

int main()
{
    int number = 95;

    number = func(number);

    printf("Now Value is: %d", number);

    return 0;
}
