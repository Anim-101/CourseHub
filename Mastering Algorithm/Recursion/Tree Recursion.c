#include<stdio.h>

void func(int number)
{
    if(number > 0)
    {
        printf("%d ", number);

        func(number - 1);

        func(number - 1);
    }
}

int main()
{
    int number = 5;

    printf("Tree Recursion for %d:\n", number);

    func(number);

    return 0;
}
