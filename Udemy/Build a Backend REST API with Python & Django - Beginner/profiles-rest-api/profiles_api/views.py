from rest_framework.views import APIView
from rest_framework.response import Response
from rest_framework import status
from profiles_api import serializers
from rest_framework import viewsets
from profiles_api import models
from rest_framework.authentication import TokenAuthentication
from profiles_api import permissions
from rest_framework import filters

# APIView
class HelloAPIView(APIView):
    """ Test APIView """

    serializer_class = serializers.HelloSerializer

    def get(self, request, format = None):
        """ Returning a list of APIView """
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
        """ Handling updates of an object """
        return Response({'method': 'This is PUT'})

    def patch(self, request, pk = None):
        """ Handling a partial updates of an object """
        return Response({'method': 'This is PATCH'})

    def delete(self, request, pk = None):
        """ Deleting an object """
        return Response({'method': 'This is DELETE'})


# Viewsets
class HelloViewSet(viewsets.ViewSet):
    """ Testing api viewsets """

    serializer_class = serializers.HelloSerializer

    def list(self, request):
        """ Returning a hello message """

        a_viewset = [
            'Uses actions (list, create, retrieve, update, partial_update)',
            'Automatically maps to URLs using Routers',
            'Provides more functionality with less code',
        ]

        return Response({'message': 'Hello!', 'a_viewset': a_viewset})

    def create(self, request):
        """ Creating a new hello message """
        serializer = self.serializer_class(data = request.data)

        if serializer.is_valid():
            name = serializer.validated_data.get('name')
            message = f'Hello {name}!'
            return Response({'message': message})
        else:
            return Response(
                serializer.errors,
                status = status.HTTP_400_BAD_REQUEST
            )

    def retrieve(self, request, pk = None):
        """ Handling get an object by it's ID """
        return Response({'http_method': 'GET'})

    def update(self, request, pk = None):
        """ Handling update of an object """
        return Response({'http_method': 'PUT'})

    def partial_update(self, request, pk = None):
        """ Handling update part of an object """
        return Response({'http_method': 'PATCH'})

    def destroy(self, request, pk = None):
        """ Handling remove of an object """
        return Response({'http_method': 'DELETE'})


# Modelviewset
class UserProfileViewSet(viewsets.ModelViewSet):
    """ Handling create and upate of a profile """
    serializer_class = serializers.UserProfileSerializer
    queryset = models.UserProfile.objects.all()
    authentication_classes = (TokenAuthentication,)
    permission_classes = (permissions.UpdateOwnProfile,)
    filter_backends = (filters.SearchFilter,)
    search_fields = ('name', 'email',)
