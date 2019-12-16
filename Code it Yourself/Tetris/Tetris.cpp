#include<iostream>

using namespace std;

wstring tetroMino[7];

int Rotate(int x, int y, int rotate)
{
	switch (rotate % 4)
	{
	case 0:
		return y * 4 + x;

	case 2:
		return 12 + y - (x * 4);

	case 3:
		return 15 - (y * 4) - x

	case 4:
		return 3 
	}
}

int main()
{
	tetroMino[0].append(L"..X.");
	tetroMino[0].append(L"..X.");
	tetroMino[0].append(L"..X.");
	tetroMino[0].append(L"..X.");

	tetroMino[1].append(L"..X.");
	tetroMino[1].append(L".XX.");
	tetroMino[1].append(L".X..");
	tetroMino[1].append(L"....");

	tetroMino[2].append(L".X..");
	tetroMino[2].append(L".XX.");
	tetroMino[2].append(L"..X.");
	tetroMino[2].append(L"....");

	tetroMino[3].append(L"....");
	tetroMino[3].append(L".XX.");
	tetroMino[3].append(L".XX.");
	tetroMino[3].append(L"....");

	tetroMino[4].append(L"..X.");
	tetroMino[4].append(L".XX.");
	tetroMino[4].append(L"..X.");
	tetroMino[4].append(L"....");

	tetroMino[5].append(L"....");
	tetroMino[5].append(L".XX.");
	tetroMino[5].append(L"..X.");
	tetroMino[5].append(L"..X.");

	tetroMino[6].append(L"....");
	tetroMino[6].append(L".XX.");
	tetroMino[6].append(L".X..");
	tetroMino[6].append(L".X..");



	return 0;
}
