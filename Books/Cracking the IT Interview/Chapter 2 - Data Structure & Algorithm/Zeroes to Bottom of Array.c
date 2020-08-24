#include<stdio.h>

int main()
{
    int size;
    
    printf("Provide Size of Array ->");
    
    scanf("%d", &size);
    
    printf("\nProvide Values of Array Including many Zeros between Integers Values ->\n");
    
    int arr[size];
    
    for(int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    printf("\n\nYour Array -> \n");
    
    for(int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
    printf("Now after taking Zeros to Bottom of Array, Final Array -->\n");
    
    int *result, j = 0;
    
    result = (int *) malloc(size * sizeof(int));
    
    for(int i = 0; i < size; i++)
    {
        if(arr[i] != 0){
            result[j++] = arr[i];
        }
    }
    
    for(int i = 0; i < j; i++)
    {
        arr[i] = result[i];
    }
    
    for(int i = j; i < size; i++)
    {
        arr[i] = 0;
    }
    
    for(int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
    
    free(result);
    
    return 0;
}
