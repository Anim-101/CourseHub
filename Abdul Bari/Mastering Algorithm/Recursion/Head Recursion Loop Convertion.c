#include<stdio.h>

/*
void func(int number)
{
    if(number > 0)
    {
        func(number - 1);

        printf("%d\n", number);
    }
}
*/

void func(int number)
{
    int i = 1;

    while(i <= number)
    {
        printf("%d\n", i);

        i++;
    }
}

int main()
{
    int number = 5;

    func(number);

    return 0;
}
