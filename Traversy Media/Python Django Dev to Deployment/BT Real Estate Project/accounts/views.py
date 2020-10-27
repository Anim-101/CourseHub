from django.shortcuts import render, redirect
from django.contrib import messages
from django.contrib.auth.models import User


def login(request):
    if request.method == 'POST':
        # Login USER
        pass
    else:
        return render(request, 'accounts/login.html')

    return render(request, 'accounts/register.html')
    return render(request, 'accounts/login.html')


def register(request):
    if request.method == 'POST':
        first_name = request.POST['first_name']
        last_name = request.POST['last_name']
        username = request.POST['username']
        email = request.POST['email']
        password = request.POST['password']
        password2 = request.POST['password2']

        # Checking if password matches
        if password == password2:
            # Checking Username
            if User.objects.filter(username=username).exists():
                messages.error(request, 'That username is already taken!')
                return redirect('register')
            else:
                if User.objects.filter(email=email).exists():
                    messages.error(request, 'That email is being used')
                    return redirect('register')
                else:
                    return
        else:
            messages.error(request, 'Password does not match')
            return redirect('register')
    else:
        return render(request, 'accounts/register.html')

    return render(request, 'accounts/register.html')


def logout(request):
    return redirect('index')


def dashboard(request):
    return render(request, 'accounts/dashboard.html')
