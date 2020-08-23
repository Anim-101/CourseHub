#include<stdio.h>
#include<stdlib.h>

struct Term
{
    int coeff;
    int exp;
};

struct Poly
{
    int num;

    struct Term *term;
};

void Create(struct Poly *poly)
{
    printf("\nNumber of Terms:");

    scanf("%d", &poly->num);

    poly->term = (struct Term *) malloc(poly->num * sizeof(struct Term));

    printf("\nEnter Terms->\n");

    for(int i = 0; i < poly->num; i++)
    {
        printf("Coefficient: ");

        scanf("%d", &poly->term[i].coeff);

        printf("Exponent: ");

        scanf("%d", &poly->term[i].exp);

        printf("\n");
    }
}

void Display(struct Poly poly)
{
    for(int i = 0; i < poly.num; i++)
    {
        if(i < poly.num - 1)
        {
            printf("%dx%d+", poly.term[i].coeff, poly.term[i].exp);
        }
        else
        {
            printf("%dx%d", poly.term[i].coeff, poly.term[i].exp);
        }
    }

    printf("\n");
}

struct Poly *Addition(struct Poly *polyOne, struct Poly *polyTwo)
{
    int i = 0, j = 0, k = 0;

    struct Poly *polySum;

    polySum = (struct Poly *) malloc(sizeof(struct Poly));

    polySum->term = (struct Term *) malloc((polyOne->num + polyTwo->num) * sizeof(struct Term));

    while(i < polyOne->num && j < polyTwo->num)
    {
        if(polyOne->term[i].exp > polyTwo->term[j].exp)
        {
            polySum->term[k++] = polyOne->term[i++];
        }
        else if(polyOne->term[i].exp < polyTwo->term[j].exp)
        {
            polySum->term[k++] = polyTwo->term[j++];
        }
        else
        {
            polySum->term[k].exp = polyOne->term[i].exp;

            polySum->term[k++].coeff = polyOne->term[i++].coeff + polyTwo->term[j++].coeff;
        }
    }

    for(; i < polyOne->num; i++)
    {
        polySum->term[k++] = polyOne->term[i];
    }

    for(; j < polyTwo->num; j++)
    {
        polySum->term[k++] = polyTwo->term[j];
    }

    polySum->num = k;

    return polySum;
}

int main()
{
    struct Poly polyOne, polyTwo, *polyThree;

    Create(&polyOne);

    Create(&polyTwo);

    polyThree = Addition(&polyOne, &polyTwo);

    printf("\n");

    Display(polyOne);

    printf("\n");

    Display(polyTwo);

    printf("\n");

    Display(*polyThree);

    return 0;
}
