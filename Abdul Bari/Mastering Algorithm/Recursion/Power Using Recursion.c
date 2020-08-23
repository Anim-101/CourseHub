#include<stdio.h>

// Power Using Recursion
int powRecursion(int mul, int num)
{
    if(num == 0)
    {
        return 1;
    }
    else
    {
        return powRecursion(mul, num - 1) * mul;
    }
}

// Power Using Modified Recursion
int powRecursionModified(int mul, int num)
{
    if(num == 0)
    {
        return 1;
    }

    if(num % 2 == 0)
    {
        return powRecursionModified(mul * mul, num / 2);
    }
    else
    {
        return mul * powRecursionModified(mul * mul, num / 2);
    }
}

// Power Using Loop
int powLoop(mul, num)
{
    int pow = 1;

    for(int i = 1; i <= num; i++)
    {
        pow = pow * mul;
    }

    return pow;
}
int main()
{
    int mul = 2, num = 9;

    printf("Power of %d - %d times Using Recursion: %d\n", mul, num, powRecursion(mul, num));

    printf("Power of %d - %d times Using Modified Recursion: %d\n", mul, num, powRecursionModified(mul, num));

    printf("Power of %d - %d times Using Loop: %d\n", mul, num, powLoop(mul, num));

    return 0;
}
