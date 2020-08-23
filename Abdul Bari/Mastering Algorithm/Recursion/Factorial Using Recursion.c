#include<stdio.h>

// Finding Factorial Till Nth Number Using Recursion
int funcRecursion(int number)
{
    if(number == 0)
    {
        return 1;
    }
    else
    {
        return funcRecursion(number - 1) * number;
    }
}

// Finding Factorial Till Nth Number Using Loop
int funcLoop(int number)
{
    int fact = 1;

    for(int i = 1; i  <= number; i++)
    {
        fact = fact * i;
    }

    return fact;
}

int main()
{
    int number = 6;

    printf("Factorial of %d Using Recursion: %d\n", number, funcRecursion(number));

    printf("Factorial of %d Using Loop: %d\n", number, funcLoop(number));

    return 0;
}
