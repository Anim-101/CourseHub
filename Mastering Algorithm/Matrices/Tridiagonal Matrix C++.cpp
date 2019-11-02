#include<iostream>

using namespace std;

class Array
{
private:
    int *array;
    int length;

public:
    Array()
    {
        length = 2;

        array = new int[(3 * 2) - 2];
    }

    Array(int length)
    {
        this->length = length;

        array = new int[(3 * length) - 2];
    }

    void Set(int i, int j, int element);

    int Get(int i, int j);

    int getDimension();

    void Display();
};


void Array::Set(int i, int j, int element)
{
    if(i - j == 0)
    {
        array[length - 1 + i - 1] = element;
    }
    else if(i - j == 1)
    {
        array[i - 1] = element;
    }
    else if(i - j == -1)
    {
        array[(2 * length) - 1 + i - 1] = element;
    }
}

int Array::Get(int i, int j)
{
    if(i - j == 0)
    {
        return array[length - 1 + i - 1];
    }
    else if(i - j == 1)
    {
        return array[i - 1];
    }
    else if(i - j == -1)
    {
        return array[(2 * length) - 1 + i - 1];
    }
    else
    {
        return 0;
    }
}

int Array::getDimension()
{
    return length;
}

void Array::Display()
{
    for(int i = 1; i <= length; i++)
    {
        for(int j = 1; j <= length; j++)
        {
            if(i - j == 0)
            {
                cout << array[length - 1 + i - 1] << " ";
            }
            else if(i - j == 1)
            {
                cout << array[i - 1] << " ";
            }
            else if(i - j == -1)
            {
                cout << array[(2 * length) - 1 + i - 1] << " ";
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
    int length, element;

    cout << endl << "Enter Dimension of Tirdiagonal Matrix: ";

    cin >> length;

    cout << endl;

    Array array(length);

    cout << "Enter All Elements:" << endl;

    for(int i = 1; i <= length; i++)
    {
        for(int j = 1; j <= length; j++)
        {
            cin >> element;

            if(((i - j) == 0) || ((i - j) == 1) || ((i - j) == -1))
            {
                array.Set(i, j, element);
            }
        }
    }

    cout << endl << "Dimension of Array: " << array.getDimension() << endl;

    cout << endl << "Get Array[2, 2] Element: " << array.Get(2, 2) << endl << endl;

    array.Display();

    return 0;
}
