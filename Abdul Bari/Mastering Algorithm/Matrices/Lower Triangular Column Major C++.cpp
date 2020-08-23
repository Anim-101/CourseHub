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

        array = new int[(2 * (2 + 1)) / 2];
    }

    Array(int length)
    {
        this->length = length;

        array = new int[(length * (length + 1)) / 2];
    }

    ~Array()
    {
        delete [] array;
    }

    void Set(int i, int j, int element);

    int Get(int i, int j);

    int getDimension();

    void Display();
};

void Array::Set(int i, int j, int element)
{
    if(i >= j)
    {
        array[(length * (j - 1)) + (((j - 1) * (j - 2)) / 2) + (i - j)] = element;
    }
}

int Array::Get(int i, int j)
{
    if(i >= j)
    {
        return array[(length * (j - 1)) + (((j - 1) * (j - 2)) / 2) + (i - j)];
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
            if(i >= j)
            {
                cout << array[(length * (j - 1)) + (((j - 1) * (j - 2)) / 2) + (i - j)] << " ";
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

    cout << endl << "Enter Dimension for Lower Triangular Matrix: ";

    cin >> length;

    cout << endl;

    Array array(length);

    cout << "Enter All Elements:" << endl;

    for(int i = 1; i <= length; i++)
    {
        for(int j = 1; j <= length; j++)
        {
            cin >> element;

            if(i >= j)
            {
                array.Set(i, j, element);
            }
        }
    }

    cout << endl << "Dimension of Array: " << array.getDimension() << endl;

    cout << endl << "Get Array[3, 3] Element: " << array.Get(3, 3) << endl << endl;

    array.Display();

    return 0;
}
