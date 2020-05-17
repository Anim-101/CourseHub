#include<stdio.h>
#include<stdlib.h>
#include<time.h>

#define CARDS 52
#define SUITS 4


void initialize(int []);
void lshuffle(int []);
void draw(int [], int);
void display(int [], int []);

int main(void)
{
    int card[CARDS], drawn[CARDS] = {0}, nDraw;

    srand(time(NULL));

    initialize(card);

    lshuffle(card);

    printf("Number of Cards to Draw: ");

    scanf("%d", &nDraw);

    draw(drawn, nDraw);

    display(card, drawn);

    return 0;
}

void initialize(int card[])
{
    int i;

    for(i = 0; i < CARDS; i++)
    {
        card[i] = i;
    }
}
