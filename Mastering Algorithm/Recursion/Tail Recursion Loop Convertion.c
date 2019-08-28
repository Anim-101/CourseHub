#include<stdio.h>

void func(int number)
{
    /*
    if(number > 0)
    {
        printf("%d\n", number);

        func(number - 1);
    }
    */

    while(number > 0)
    {
        printf("%d\n", number);

        number--;
    }
}

int main()
{
    int number = 5;

    func(number);

    return 0;
}
