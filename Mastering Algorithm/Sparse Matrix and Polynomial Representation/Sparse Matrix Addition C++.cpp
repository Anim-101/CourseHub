#include<iostream>

using namespace std;

class Element
{
public:
    int i;
    int j;
    int x;
};

class Sparse
{
private:
    int m;
    int n;
    int num;

    Element *element;

public:
    Sparse(int m, int n, int num)
    {
        this->m = m;

        this->n = n;

        this->num = num;

        element = new Element[this->num];
    }

    ~Sparse()
    {
        delete [] element;
    }

    Sparse operator+(Sparse &sparse);

    friend istream & operator>>(istream &is, Sparse &sparse);

    friend ostream & operator<<(ostream &os, Sparse &sparse);
};

Sparse Sparse::operator+(Sparse &sparse)
{
    int i, j, k;

    if((m != sparse.m) || n != sparse.n)
    {
        return Sparse(0, 0, 0);
    }

    Sparse *sum = new Sparse(m, n, num + sparse.num);

    i = j = k = 0;

    while(i < num && j < sparse.num)
    {
        if(element[i].i < sparse.element[j].i)
        {
            sum->element[k++] = element[i++];
        }
        else if(element[i].i > sparse.element[j].i)
        {
            sum->element[k++] = sparse.element[j++];
        }
        else
        {
            if(element[i].j < sparse.element[j].j)
            {
                sum->element[k++] = element[i++];
            }
            else if(element[i].j < sparse.element[j].j)
            {
                sum->element[k++] = sparse.element[j++];
            }
            else
            {
                sum->element[k] = element[i];

                sum->element[k++].x = element[i++].x + sparse.element[j++].x;
            }
        }
    }

    for(; i < num; i++)
    {
        sum->element[k++] = element[i];
    }

    for(; j < sparse.num; j++)
    {
        sum->element[k++] = sparse.element[j];
    }

    sum->num = k;

    return *sum;
}

istream & operator>>(istream &is, Sparse &sparse)
{
    cout << "Enter Non-Zero Elements:";

    for(int i = 0; i < sparse.num; i++)
    {
        cin >> sparse.element[i].i >> sparse.element[i].j >> sparse.element[i].x;
    }

    return is;
}

ostream & operator<<(ostream &os, Sparse &sparse)
{
    int k = 0;

    for(int i = 0; i < sparse.m; i++)
    {
        for(int j = 0; j < sparse.n; j++)
        {
            if(sparse.element[k].i == i && sparse.element[k].j == i)
            {
                cout << sparse.element[k++].x << " ";
            }
            else
            {
                cout << "0 ";
            }
        }

        cout << endl;
    }

    return os;
}

int main()
{
    Sparse sparseOne(5, 5, 5);

    Sparse sparseTwo(5, 5, 5);

    cin >> sparseOne;

    cin >> sparseTwo;

    Sparse sum = sparseOne + sparseTwo;

    cout << "First Sparse Matrix" << endl << sparseOne;

    cout << "Second Sparse Matrix" << endl << sparseTwo;

    cout << "Sum of Sparse Matrix" << endl << sum;

    return 0;
}
