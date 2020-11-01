from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status
from profiles_api import serializers


class HelloAPIView(APIView):
    """Test APIView"""

    serializer_class = serializers.HelloSerializer

    def get(self, request, format = None):
        """Returning a list of APIView"""
        an_apiview = [
            'Uses HTTP method as function (get, post, pathch, put, delete)',
            'Is similar to a traditional Django View',
            'Gives you the most control over your application logic',
            'Mapped manually to URLs',
         ]

        return Response({'message': 'Hello!', 'an_apiview': an_apiview})

    def post(self, request):
        """ Creating a hello message with our name """
        serializer = self.serializer_class(data = request.data)

        if serializer.is_valid():
            name = serializer.validated_data.get('name')
            message = f'Hello, {name}'
            return Response({'message': message})
        else:
            return Response(
                serializer.errors,
                status = status.HTTP_400_BAD_REQUEST
            )

    def put(self, request, pk = None):
        """Handling updates of an object"""
        return Response({'method': 'This is PUT'})

    def patch(self, request, pk = None):
        """Handling a partial updates of an object"""
        return Response({'method': 'This is PATCH'})

    def delete(self, request, pk = None):
        """Deleting an object"""
        return Response({'method': 'This is DELETE'})
