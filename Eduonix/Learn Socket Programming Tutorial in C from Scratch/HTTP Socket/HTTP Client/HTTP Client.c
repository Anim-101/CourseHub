#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<unistd.h>
#include<arpa/inet.h>

int main(int argc, char *argv[])
{
	char *address;

	address = argv[1];

	int clientSocket;

	clientSocket = socket(AF_INET, SOCK_STREAM, 0);

	struct sockaddr_in remoteAddress;

	remoteAddress.sin_family = AF_INET;
	remoteAddress.sin_port = htons(80);

	inet_aton(address, &remoteAddress.sin_addr);

	connect(clientSocket, (struct sockaddr *) &remoteAddress, sizeof(remoteAddress));

	char request[] = "GET / HTTP/1.1\r\n\r\n";

	char response[4096];

	send(clientSocket, request, sizeof(request), 0);

	recv(clientSocket, &response, sizeof(response), 0);

	printf("\nServer Response: %s\n", response);

	close(clientSocket);

	return 0;

}
