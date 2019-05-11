#include<stdio.h>
int main(){
    int asize, bsize, csize;
    printf("Enter Size of First Array -> ");
    scanf("%d", &asize);
    printf("\nEnter Size of Second Array -> ");
    scanf("%d", &bsize);
    csize = asize + bsize;
    int arrA[asize], arrB[bsize], arrC[csize];
    printf("\n\nEnter First Non Sorted Array Values -->\n");
    for(int i = 0; i < asize; i++){
        scanf("%d", &arrA[i]);
    }
    printf("\n\nEnter Second Non Sorted Array Values -->\n");
    for(int i = 0; i < bsize; i++){
        scanf("%d", &arrB[i]);
    }
    printf("\nFirst Non Sorted Array Values -->\n");
    for(int i = 0; i < asize; i++){
        printf("%d\n", arrA[i]);
    }
    printf("nSecond Non Sorted Array Values -->\n");
    for(int i = 0; i < bsize; i++){
        printf("%d\n", arrB[i]);
    }
    printf("\n\nAfter Merging, Sorted Array -->>\n\n");
    int aCounter = 0, bCounter = 0, cCounter = 0;
    while((aCounter < asize) && (bCounter < bsize)){
        if(arrA[aCounter] <= arrB[bCounter]){
            arrC[cCounter] = arrA[aCounter];
            cCounter++;
            aCounter++;
        }
        else{
            arrC[cCounter] = arrB[bCounter];
            cCounter++;
            bCounter++;
        }
    }
    if(aCounter >= asize){
        for(int i = cCounter; i < csize; i++){
            arrC[i] = arrB[i];
        }
    }
    else if(bCounter >= bsize){
        for(int i = cCounter; i < csize; i++){
            arrC[i] = arrA[i];
        }
    }
    for(int i =0; i < csize; i++){
        printf("%d\n", arrC[i]);
    }
    return 0;
}