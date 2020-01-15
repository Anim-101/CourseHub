#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<sys/socket.h>
#include<sys/types.h>
#include<netinet/in.h>
#include<unistd.h>

int main()
{
	FILE *htmlFile;

	htmlFile = fopen("index.html", "r");
	
	char responseData[2048];

	fgets(responseData, 2048, htmlFile);

	char httpHeader [4096] =  "HTTP/1.1 200 OK\r\n\n";
	
	strcat(httpHeader, responseData);
	
	int serverSocket;

	serverSocket = socket(AF_INET, SOCK_STREAM, 0);

	struct sockaddr_in serverAddress;

	serverAddress.sin_family = AF_INET;
	serverAddress.sin_port = htons(1616);
	serverAddress.sin_addr.s_addr = INADDR_ANY;

	bind(serverSocket, (struct sockaddr *) &serverAddress, sizeof(serverAddress));

	listen(serverSocket, 5);

	int clientSocket;

	while(1)
	{
		clientSocket = accept(serverSocket, NULL, NULL);

		send(clientSocket, httpHeader, sizeof(httpHeader), 0);

		close(clientSocket);
	}

	return 0;
}
