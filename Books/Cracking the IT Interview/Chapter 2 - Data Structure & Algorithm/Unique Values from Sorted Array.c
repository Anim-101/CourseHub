#include<stdio.h>

int main()
{
    int size;
    
    printf("Enter the Size of your Sorted Array -> ");
    scanf("%d", &size);
    
    int arr[size];

    printf("\n\nEnter Values for your Sorted Array ->\n");
    
    for(int i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }
    
    printf("\n\nYour Sorted Array with Identical Values -->\n");
    
    for(int i = 0; i < size; i++)
    {
        printf("%d\n", arr[i]);
    }
    
    printf("\nAfter finding Identical Values, Unique Values are -->\n");
    
    int *result, j = 0;
    
    result = (int *)malloc(size * sizeof(int));
    
    result[j++] = arr[0];
    
    for(int i = 0; i < size; i++)
    {
        if(arr[i] != arr[i+1]){
            result[j++] = arr[i+1];
        }
    }
    
    for(int i = 0; i < j - 1; i++)
    {
        printf("%d ", result[i]);
    }
    
    printf("\n\n");
    
    free(result);
    
    return 0;
}
