from rest_framework import permissions

class UpdateOwnProfile(permissions.BasePermission):
    """ Allowing users to edit their own profile """

    def has_object_permission(self, request, view, obj):
        """ Checking user is trying to edit their own profile or not """
        if request.method in permissions.SAFE_METHODS:
            return True

        return obj.id == request.user.id


class UpdateOwnStatus(permissions.BasePermission):
    """ Allowing user to update their own status """

    def has_object_permission(self, request, view, obj):
        """ Checking the user is updating their own status or not """

        if request.method in permissions.SAFE_METHODS:
            return True

        return obj.user_profile.id == request.user.id
