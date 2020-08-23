#include<stdio.h>

int main()
{
    // Only Array with Size Declaration
    int arrA[5];

    // Only Array with Size Declaration and Initialization Simultaneously
    int arrB[5] = {2, 4, 6, 8, 10};

    // Only Array with Size Declaration and Half Initialization Simultaneously, 0s are Initialized By Default
    int arrC[5] = {2, 4};

    // Only Array with Size Declaration and 0s are Initialized By Default Simultaneously
    int arrD[5] = {0};

    // Only Array without Size Declaration and Initialization Simultaneously
    int arrE[] = {2, 4, 6, 8, 10, 12, 15};


    // Printing Array Which was Declared above
    for(int i = 0; i < 5; i++)
    {
        printf("%d ", arrB[i]);
    }

    printf("\n");

    // Printing Array Index Addresses
    for(int i = 0; i < 5; i++)
    {
        printf("%u ", &arrB[i]);
    }

    printf("\n");

    // Printing Array Value Using Index Number
    printf("%d\n", arrB[2]);

    // Printing Array value Using Index Number in Different Approach
    printf("%d\n", 3[arrB]);

    // Printing Array Value Using Pointer
    printf("%d", *(arrE + 2));

    return 0;
}
