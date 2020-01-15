#include<stdio.h>
#include<stdlib.h>
#include<sys/types.h>
#include<sys/socket.h>
#include<netinet/in.h>
#include<unistd.h>

int main()
{
	int networkSocket;

	networkSocket = socket(AF_INET, SOCK_STREAM, 0);
	
	struct sockaddr_in serverAddress;

	serverAddress.sin_family = AF_INET;
	serverAddress.sin_port = htons(9002);
	serverAddress.sin_addr.s_addr = INADDR_ANY;

	int connectionStatus = connect(networkSocket, (struct sockaddr *) &serverAddress, sizeof(serverAddress));
	
	if(connectionStatus == -1)
	{
		printf("\nThere was an Error making Connection to Remote Socket\n");
	}
	
	char serverResponse[256];

	recv(networkSocket, &serverResponse, sizeof(serverResponse), 0);
	
	
	printf("\nServer Sent: %s\n", serverResponse);
	
	printf("\n");

	close(networkSocket);

	return 0;
}
