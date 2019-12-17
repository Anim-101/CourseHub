#include<iostream>
#include<thread>
#include<stdio.h>
#include<Windows.h>

using namespace std;

wstring tetroMino[7];

int playingFieldWidth = 12;
int playingFieldHeight = 18;

unsigned char* playingField = nullptr;

int screenHeight = 30;
int screenWidth = 80;

int Rotate(int x, int y, int rotate)
{
	switch (rotate % 4)
	{
	case 0:
		return y * 4 + x;

	case 2:
		return 12 + y - (x * 4);

	case 3:
		return 15 - (y * 4) - x;

	case 4:
		return 3 - y + (x * 4);
	}

	return 0;
}

bool tetroMinoFit(int tetroMinoNumber, int rotationNumber, int positionX, int positionY)
{
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			int tetroMinoRotationIndex = Rotate(i, j, rotationNumber);

			int playingFieldIndex = (positionY + j) * playingFieldWidth + (positionX + i);

			if (positionX + i >= 0 && positionY + i < playingFieldWidth)
			{
				if (positionX + j >= 0 && positionY + j < playingFieldHeight)
				{
					if (tetroMino[tetroMinoNumber][tetroMinoRotationIndex] != L'.' && playingField[playingFieldIndex] != 0)
					{
						return false;
					}
				}
			}
		}
	}

	return true;
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

	playingField = new unsigned char[playingFieldWidth * playingFieldHeight];

	for (int i = 0; i < playingFieldWidth; i++)
	{
		for (int j = 0; j < playingFieldHeight; j++)
		{
			playingField[j * playingFieldWidth + i] = ((i == 0) || (i == playingFieldWidth - 1) || (j == playingFieldHeight - 1)) ? 9 : 0;
		}
	}

	wchar_t* screen = new wchar_t[screenWidth * screenHeight];

	for (int i = 0; i < screenWidth * screenHeight; i++)
	{
		screen[i] = L' ';
	}

	HANDLE handleConsole = CreateConsoleScreenBuffer(GENERIC_READ | GENERIC_WRITE, 0, NULL, CONSOLE_TEXTMODE_BUFFER, NULL);

	SetConsoleActiveScreenBuffer(handleConsole);

	DWORD dWordBytesWritten = 0;

	bool playerGameOver = false;

	int currentPieceNumber = 0;
	int currentRotationNumber = 0;
	int currentXNumber = playingFieldWidth / 2;
	int currentYNumber = 0;

	bool key[4];

	while (!playerGameOver)
	{
		this_thread::sleep_for(50ms);

		for (int i = 0; i < 4; i++)
		{
			key[i] = (0x8000 && GetAsyncKeyState((unsigned char)("\x27\x25\x28Z"[i]))) != 0;
		}
		
		currentXNumber = currentXNumber + (key[0] && tetroMinoFit(currentPieceNumber, currentRotationNumber, currentXNumber + 1, currentYNumber)) ? 1 : 0;

		currentXNumber = currentXNumber - (key[1] && tetroMinoFit(currentPieceNumber, currentRotationNumber, currentXNumber - 1, currentYNumber)) ? 1 : 0;

		currentYNumber = currentYNumber + (key[2] && tetroMinoFit(currentPieceNumber, currentRotationNumber, currentXNumber, currentYNumber + 1)) ? 1 : 0;

		if (key[3])
		{
			//currentRotationNumber += ;
		}

		for (int i = 0; i < playingFieldWidth; i++)
		{
			for (int j = 0; j < playingFieldHeight; j++)
			{
				screen[(j + 2) * screenWidth + (i + 2)] = L" ABCDEFG=#"[playingField[j * playingFieldWidth + i]];
			}
		}

		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (tetroMino[currentPieceNumber][Rotate(i, j, currentRotationNumber)] != L'.')
				{
					screen[(currentYNumber + j + 2) * screenWidth + (currentXNumber + i + 2)] = currentPieceNumber + 65;
				}
			}
		}

		WriteConsoleOutputCharacter(handleConsole, screen, screenWidth * screenHeight, { 0, 0 }, &dWordBytesWritten);
	}

	return 0;
}
