from rest_framework import permissions

class UpdateOwnProfile(permissions.BasePermission):
    """ Allowing users to edit their own profile """

    def has_object_permission(self, request, view, obj):
        """ Checking user is trying to edit their own profile or not """
        if request.method in permissions.SAFE_METHODS:
            return True

        return obj.id == request.user.id
