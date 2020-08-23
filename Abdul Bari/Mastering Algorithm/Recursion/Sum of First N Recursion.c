#include<stdio.h>


// Recursive Way of Fining First Nth Series of Numbers' Summation
int funcRecursion(int number)
{
    if(number == 0)
    {
        return 0;
    }
    else
    {
        return funcRecursion(number - 1) + number;
    }
}

// Equation Way of Finding First Nth Series of Numbers' Summation
int funcEquation(int number)
{
    return (number * (number + 1)) / 2;
}

// Loop Way of Finding First Nth Series of Numbers' Summation
int funcLoop(int number)
{
    int sum = 0;

    for(int i = 1; i <= number; i++)
    {
        sum = sum + i;
    }

    return sum;
}

int main()
{

    int number = 5;

    printf("For %d Sum is: %d Using Recursion\n", number, funcRecursion(number));

    printf("For %d Sum is: %d Using Equation\n", number, funcEquation(number));

    printf("For %d Sum is: %d Using Loop\n", number, funcLoop(number));

    return 0;
}
