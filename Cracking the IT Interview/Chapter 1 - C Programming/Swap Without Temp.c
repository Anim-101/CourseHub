#include<stdio.h>

int main(){
    int a, b;
    printf("Enter Values for a & b to Swap ->\n");
    scanf("%d %d", &a, &b);
    printf("Before Swapping, Vallues are: a -> %d & b -> %d\n", a, b);
    a = a + b;
    b = a - b;
    a = a - b;
    printf("After Swapping,  Vallues are: a -> %d & b -> %d\n", a ,b);
    return 0;
}
