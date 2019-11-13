#include<iostream>
#include<windows.h>
#include<list>
#include<thread>

using namespace std;

int screenHeight = 25;
int screenWidth = 80;

struct SnakeSegment
{
	int x;
	int y;
};

int main()
{
	wchar_t* screen = new wchar_t[screenHeight * screenWidth];

	for (int i = 0; i < (screenHeight * screenWidth); i++)
	{
		screen[i] = L' ';
	}

	HANDLE handleConsole = CreateConsoleScreenBuffer(GENERIC_READ | GENERIC_WRITE, 0, NULL, CONSOLE_TEXTMODE_BUFFER, NULL);

	SetConsoleActiveScreenBuffer(handleConsole);

	DWORD dwordByte = 0;

	while (1)
	{
		list<SnakeSegment> snake = { {60, 15}, {61, 15}, {62, 15}, {63, 15}, {64, 15}, {65, 15}, {66, 15}, {67, 15}, {68, 15}, {69, 15} };

		int foodX = 10;
		int foodY = 15;
		int playerScore = 0;
		int snakeDirection = 3;
		bool gameOver = false;
		bool playerKeyLeft = false, playerKeyRight = false, playerKeyLeftOld = false, playerKeyRightOld = false;

		while (!gameOver)
		{
			auto thread = chrono::system_clock::now();

			while((chrono::system_clock::now() - thread) < ((snakeDirection % 2 == 1) ? 120ms : 200ms))
			{
				playerKeyRight = (0x8000 & GetAsyncKeyState((unsigned char)('\x27'))) != 0;

				playerKeyLeft = (0x8000 & GetAsyncKeyState((unsigned char)('\x25'))) != 0;

				if (playerKeyRight && !playerKeyRightOld)
				{
					snakeDirection++;

					if (snakeDirection == 4)
					{
						snakeDirection = 0;
					}
				}

				if (playerKeyLeft && !playerKeyLeftOld)
				{
					snakeDirection--;

					if (snakeDirection == -1)
					{
						snakeDirection = 3;
					}
				}

				playerKeyRightOld = playerKeyRight;

				playerKeyLeftOld = playerKeyLeft;
			}

			switch(snakeDirection)
			{
				case 0:
					snake.push_front({ snake.front().x, snake.front().y - 1 });
					break;

				case 1:
					snake.push_front({ snake.front().x + 1, snake.front().y });
					break;

				case 2:
					snake.push_front({ snake.front().x, snake.front().y + 1 });
					break;

				case 3:
					snake.push_front({ snake.front().x - 1, snake.front().y });
					break;
			}

			if (snake.front().x == foodX && snake.front().y == foodY)
			{
				playerScore++;

				while (screen[(foodY * screenWidth) + foodX] != L' ')
				{
					foodX = rand() % screenWidth;

					foodY = (rand() % (screenHeight - 3)) + 3;
				}

				for (int i = 0; i < 5; i++)
				{
					snake.push_back({ snake.back().x, snake.back().y });
				}
			}

			if (snake.front().x < 0 || snake.front().x >= screenWidth)
			{
				gameOver = true;
			}

			if (snake.front().y < 3 || snake.front().y >= screenHeight)
			{
				gameOver = true;
			}

			for (list<SnakeSegment>::iterator i = snake.begin(); i != snake.end(); i++)
			{
				if (i != snake.begin() && i->x == snake.front().x && i->y == snake.front().y)
				{
					gameOver = true;
				}
			}

			snake.pop_back();

			for (int i = 0; i < (screenHeight * screenWidth); i++)
			{
				screen[i] = L' ';
			}

			for (int i = 0; i < screenWidth; i++)
			{
				screen[i] = L'=';

				screen[(2 * screenWidth) + i] = L'=';
			}

			for (auto snake : snake)
			{
				screen[(snake.y * screenWidth) + snake.x] = gameOver ? L'+' : L'O';
			}

			wsprintf(&screen[screenWidth + 5], L"       Anim-101 - SNAKE GAMES!!                  SCORE: %d ", playerScore);

			screen[(snake.front().y * screenWidth) + snake.front().x] = gameOver ? L'X' : L'@';

			screen[(foodY * screenWidth) + foodX] = L'%';

			if (gameOver)
			{
				wsprintf(&screen[15 * screenWidth + 40], L"    Press 'SPACE' To Play Again   ");
			}

			WriteConsoleOutputCharacter(handleConsole, screen, (screenWidth * screenHeight), { 0, 0 }, &dwordByte);
		}

		while ((0x8000 & GetAsyncKeyState((unsigned char)('\x20'))) == 0)
		{
			gameOver = false;
		}
	}

	return 0;
}