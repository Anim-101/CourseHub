#include<iostream>

using namespace std;

class Diagonal
{
private:
    int *array;
    int dimension;

public:
    Diagonal()
    {
        dimension = 2;

        array = new int[2];
    }

    Diagonal(int dimension)
    {
        this->dimension = dimension;

        array = new int[dimension];
    }

    ~Diagonal()
    {
        delete [] array;
    }

    void Set(int i, int j, int element);

    int Get(int i, int j);

    void Display();

    int getDimension();
};

void Diagonal::Set(int i, int j, int element)
{
    if(i == j)
    {
        array[i - 1] = element;
    }
}

int Diagonal::Get(int i, int j)
{
    if(i == j)
    {
        return array[i - 1];
    }
    else
    {
        return 0;
    }
}

void Diagonal::Display()
{
    cout << endl;

    for(int i = 1; i <= dimension; i++)
    {
        for(int j = 1; j <= dimension; j++)
        {
            if(i == j)
            {
                cout << array[i - 1] << " ";
            }
            else
            {
                cout << "0 ";
            }
        }

        cout << endl;
    }
}

int main()
{
    int dimension;

    cout << "Enter Dimension: ";

    cin >> dimension;

    cout << endl;

    Diagonal diagonal(dimension);

    int element;

    cout << "Enter All Elements for Diagonal Matrix's Diagonal Index" << endl;

    for(int i = 1; i <= dimension; i++)
    {
        for(int j = 1; j <= dimension; j++)
        {
            cin >> element;

            diagonal.Set(i, j, element);
        }
    }

    diagonal.Display();

    return 0;
}
