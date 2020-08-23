#include<stdio.h>
#include<stdlib.h>

struct Element
{
    int i;
    int j;
    int x;
};

struct Sparse
{
    int m;
    int n;
    int num;

    struct Element *element;
};

void Create(struct Sparse *sparse)
{
    printf("\nEnter Dimensions: ");

    scanf("%d %d", &sparse->m, &sparse->n);

    printf("\nNumber of Non-Zero: ");

    scanf("%d", &sparse->num);

    sparse->element = (struct Element *) malloc(sparse->num * sizeof(struct Element));

    printf("\nEnter Non-Zero Elements' Row Number, Column Number, Element it self:\n\n");

    for(int i = 0; i < sparse->num; i++)
    {
        scanf("%d %d %d", &sparse->element[i].i, &sparse->element[i].j, &sparse->element[i].x);
    }

    printf("\n");
}


void Display(struct Sparse sparse)
{
    int k = 0;

    for(int i = 0; i < sparse.m; i++)
    {
        for(int j = 0; j < sparse.n; j++)
        {
            if(i == sparse.element[k].i && j == sparse.element[k].j)
            {
                printf("%d ", sparse.element[k++].x);
            }
            else
            {
                printf("0 ");
            }
        }

        printf("\n");
    }
}


struct Sparse * Addition(struct Sparse *sparseOne, struct Sparse *sparseTwo)
{
    struct Sparse * sum;

    int i = 0, j = 0, k = 0;

    if(sparseOne->n != sparseTwo->n && sparseOne->m != sparseTwo->m)
    {
        return NULL;
    }

    sum = (struct Sparse *) malloc(sizeof(struct Sparse));

    sum->element = (struct Element *) malloc((sparseOne->num + sparseTwo->num) * sizeof(struct Element));

    while(i < sparseOne->num && j < sparseTwo->num)
    {
        if(sparseOne->element[i].i < sparseTwo->element[j].i)
        {
            sum->element[k++] = sparseOne->element[i++];
        }
        else if(sparseOne->element[i].i > sparseTwo->element[j].i)
        {
            sum->element[k++] = sparseTwo->element[j++];
        }
        else
        {
            if(sparseOne->element[i].j < sparseTwo->element[j].j)
            {
                sum->element[k++] = sparseOne->element[i++];
            }
            else if(sparseOne->element[i].j > sparseTwo->element[j].j)
            {
                sum->element[k++] = sparseTwo->element[j++];
            }
            else
            {
                sum->element[k] = sparseOne->element[i];

                sum->element[k++].x = sparseOne->element[i++].x + sparseTwo->element[j++].x;

            }
        }
    }

    for(; i < sparseOne->num; i++)
    {
        sum->element[k++] = sparseOne->element[i];
    }

    for(; j < sparseTwo->num; j++)
    {
        sum->element[k++] = sparseTwo->element[j];
    }

    sum->m = sparseOne->m;

    sum->n = sparseOne->n;

    sum->num = k;

    return sum;
}

int main()
{
    struct Sparse sparseOne, sparseTwo, *sparseThree;

    printf("\nCreating First Sparse Matrix\n");

    Create(&sparseOne);

    printf("\nCreating Second Sparse Matrix\n");

    Create(&sparseTwo);

    sparseThree = Addition(&sparseOne, &sparseTwo);

    printf("\nFirst Sparse Matrix\n");

    Display(sparseOne);

    printf("\nSecond Sparse Matrix\n");

    Display(sparseTwo);

    printf("\nSum Sparse Matrix\n");

    Display(*sparseThree);

    return 0;
}
