#include<stdio.h>

int main(){
    char *source = "Hey You Boy!";
    char *target = (char *)malloc(sizeof(char) *10);
    char *targetAddress;
    targetAddress = target;

    while(*source != '\0'){
        *target = *source;
        source++;
        target++;
    }

    *target = '\0';
    target = targetAddress;
    printf("In Target -> ");

    while(*target != '\0'){
        printf("%c",  *target);
        target++;
    }

    return 0;
}
