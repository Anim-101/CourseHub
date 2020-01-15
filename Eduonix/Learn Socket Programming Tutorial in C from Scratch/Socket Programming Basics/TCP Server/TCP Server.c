#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<unistd.h>

int main()
{
	char serverMessage [256] = "Hello World from Server";

	int serverSocket;

	serverSocket = socket(AF_INET, SOCK_STREAM, 0);

	struct sockaddr_in serverAddress;

	serverAddress.sin_family = AF_INET;
	serverAddress.sin_port = htons(9002);
	serverAddress.sin_addr.s_addr = INADDR_ANY;

	bind(serverSocket, (struct sockaddr*) &serverAddress, sizeof(serverAddress));
	
	listen(serverSocket, 1);

	int clientSocket;

	clientSocket = accept(serverSocket, NULL, NULL);

	send(clientSocket, serverMessage, sizeof(serverMessage), 0);

	close(serverSocket);

	return 0;
}
