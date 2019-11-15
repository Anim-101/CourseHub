#include<iostream>

using namespace std;

class Term
{
public:
    int coeff;
    int exp;
};

class Poly
{
private:
    int num;

    Term *term;

public:
    Poly(int num)
    {
        this->num = num;

        term = new Term[num];
    }

    ~Poly()
    {
        delete [] term;
    }

    Poly operator+(Poly &poly);

    friend istream & operator>>(istream &is, Poly &poly);

    friend ostream & operator<<(ostream &os, Poly &poly);
};

Poly Poly::operator+(Poly &poly)
{
    int i = 0, j = 0, k = 0;

    Poly *polySum = new Poly(num + poly.num);

    while(i < num && j < poly.num)
    {
        if(term[i].exp > poly.term[j].exp)
        {
            polySum->term[k++] = term[i++];
        }
        else if(term[i].exp < poly.term[j].exp)
        {
            polySum->term[k++] = poly.term[j++];
        }
        else
        {
            polySum->term[k].exp = term[i].exp;

            polySum->term[k++].coeff = term[i++].coeff + poly.term[j++].coeff;
        }
    }

    for(; i < num; i++)
    {
        polySum->term[k++] = term[i];
    }

    for(; j < num ; j++)
    {
        polySum->term[k++] = poly.term[j];
    }

    polySum->num = k;

    return *polySum;
}

istream & operator>>(istream &is, Poly &poly)
{
    cout << "\nEnter Terms->" << endl;

    for(int i = 0; i < poly.num; i++)
    {
        cout << "Coefficient: ";

        cin >> poly.term[i].coeff;

        cout << "Exponent: ";

        cin >> poly.term[i].exp;

        cout << endl;
    }
}

ostream & operator<<(ostream &os, Poly &poly)
{
    for(int i = 0; i < poly.num; i++)
    {
        if(i < poly.num - 1)
        {
            cout << poly.term[i].coeff << "x" << poly.term[i].exp << "+";
        }
        else
        {
            cout << poly.term[i].coeff << "x" << poly.term[i].exp;
        }
    }

    cout << endl;
}

int main()
{
    int length;

    cout << "\nEnter Number of Terms: ";

    cin >> length;

    Poly polyOne(length);

    cin >> polyOne;

    cout << "\nEnter Number of Terms: ";

    cin >> length;

    Poly polyTwo(length);

    cin >> polyTwo;

    Poly polySum = polyOne + polyTwo;

    cout << "First Polynomial Equation: " << polyOne << endl;

    cout << "Second Polynomial Equation: " << polyTwo << endl;

    cout << "Sum of Two Polynomial Equation: " << polySum << endl;

    return 0;
}
