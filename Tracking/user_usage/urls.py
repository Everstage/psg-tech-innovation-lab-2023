from django.urls import path
from .views import user_login,dashboard,user_logout,usage_summary

urlpatterns = [
    path('login/',user_login, name='login'),
    path('dashboard/',dashboard, name='dashboard'),
    path('logout/',user_logout, name='logout'),
    path('usage/',usage_summary, name='usage'),
]