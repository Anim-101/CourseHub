from rest_framework.views import APIView
from rest_framework.response import Response


class HelloAPIView(APIView):
    """Test APIView"""

    def get(self, request, format = None):
        """Returning a list of APIView"""
        an_apiview = [
            'Uses HTTP method as function (get, post, pathch, put, delete)',
            'Is similar to a traditional Django View',
            'Gives you the most control over your application logic',
            'Mapped manually to URLs',
         ]

        return Response({'message': 'Hello!', 'an_apiview': an_apiview})
