from django.db import models
from django.contrib.auth.models import AbstractBaseUser
from django.contrib.auth.models import PermissionsMixin
from django.contrib.auth.models import BaseUserManager


class UserProfileManager(BaseUserManager):
    """ Manager for user profile """
    def create_user(self, email, name, password=None):
        """ Creating a new user profile """
        if not email:
            raise ValueError('Users must have an email address')

        email = self.normalize_email(email)
        user = self.model(email = email, name = name)

        user.set_password(password)
        user.save(using=self.db)

        return user


    def create_superuser(self, email, name, password):
        """ Creating a new superuser """
        user = self.create_user(email, name, password)

        user.is_superuser = True
        user.is_staff = True
        user.save(using = self.db)

        return user


class UserProfile(AbstractBaseUser, PermissionsMixin):
    """ Database model for users """
    email = models.EmailField(max_length = 255, unique = True)
    name = models.CharField(max_length = 255)
    is_active = models.BooleanField(default = True)
    is_staff = models.BooleanField(default = True)

    objects = UserProfileManager()

    USERNAME_FIELD = 'email'
    REQUIRED_FIELDS = ['name']

    def get_full_name(self):
        """ Retrieving full name of user """
        return self.name

    def get_short_name(self):
        """ Retrieving short name of user """
        return self.name

    def __str__(self):
        """ Returning string representation of user """
        return self.email
