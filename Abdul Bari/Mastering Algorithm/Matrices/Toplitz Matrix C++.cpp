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

        array = new int[2 * 2 - 1];
    }

    Array(int length)
    {
        this->length = length;

        array = new int[(2 * length) - 1];
    }

    void Set(int i, int j, int element);

    int Get(int i, int j);

    int getDimension();

    void Display();
};

void Array::Set(int i, int j, int element)
{
    if(i <= j)
    {
        array[j - i] = element;
    }
    else if(i > j)
    {
        array[length + i - j - 1] = element;
    }
}

int Array::Get(int i, int j)
{
    if(i <= j)
    {
        return array[j - i];
    }
    else if(i > j)
    {
        return array[length + i - j - 1];
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
            if(i <= j)
            {
                cout << array[j - i] << " ";
            }
            else if(i > j)
            {
                cout << array[length + i - j - 1] << " ";
            }
        }

        cout << endl;
    }
}


int main()
{
    int length, element;

    cout << endl << "Enter Dimension of Toplitz Matrix: ";

    cin >> length;

    Array array(length);

    cout << endl << "Enter Elements of Toplitz Matrix" << endl;

    for(int i = 1; i <= length; i++)
    {
        for(int j = 1; j <= length; j++)
        {
            cin >> element;

            if(i == 1)
            {
                array.Set(i, j, element);
            }
            else if((j == 1) && (i != 1))
            {
                array.Set(i, j, element);
            }
        }
    }

    cout << endl << "Dimension of Toplitz Matrix: " << array.getDimension() << endl;

    cout << endl << "Get Array[2, 2] Element: " << array.Get(2, 2) << endl;

    array.Display();

    return 0;
}
