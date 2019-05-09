#include<stdio.h>

int main(){
    char *stringData = "Welcome, Welcome All!!";
    int counter = 0;

    while(*stringData != '\0'){
        counter++;
        stringData++;
    }

    printf("Total Character in String Data -> %d", counter);

    return 0;
}
