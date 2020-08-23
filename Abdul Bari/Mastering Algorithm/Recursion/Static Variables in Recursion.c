#include<stdio.h>

int func(int number)
{
    static int x = 0;

    if(number > 0)
    {
        x++;

        return func(number - 1) + x;
    }

    return 0;
}

int main()
{
    int number = 5;

    printf("Number Addition Using Recursive Variable 0 to %d: %d", number, func(number));

    return 0;

}
