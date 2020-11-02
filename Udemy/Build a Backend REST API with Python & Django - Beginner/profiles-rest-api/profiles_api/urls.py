from django.urls import path, include
from rest_framework.routers import DefaultRouter
from profiles_api import views

router = DefaultRouter()
router.register('hello-veiwset', views.HelloViewSet, base_name = 'hello_viewset')

urlpatterns = [
    path('hello-viewapi/', views.HelloAPIView.as_view()),
    path('', include(router.urls))
]
