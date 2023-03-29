from django.shortcuts import render, redirect
from django.contrib.auth import authenticate, login, logout
from django.utils import timezone
from .models import LoginLogoutTime


def user_login(request):
    
    if request.method == 'POST':
        username = request.POST.get('username')
        password = request.POST.get('password')
        user = authenticate(request, username=username, password=password)
        login(request, user)
        LoginLogoutTime.objects.create(user=user, login_time=timezone.now())
        return redirect('dashboard')
       
   
    return render(request, 'login.html')
    

def dashboard(request):
    return render(request, 'dashboard.html')
    
def user_logout(request):
    LoginLogoutTime.objects.filter(user=request.user, logout_time=None).update(logout_time=timezone.now())
    logout(request)
    return redirect('usage')

from django.db.models import Sum
from decimal import Decimal

def usage_summary(request):
    login_logout_times = LoginLogoutTime.objects.filter(user=request.user)
    total_duration = login_logout_times.aggregate(duration=Sum('logout_time - login_time'))['duration']
    total_cost = Decimal(total_duration.total_seconds() / 3600) * Decimal(10) # Assuming cost is 10 per hour
    context = {
        'total_duration': total_duration,
        'total_cost': total_cost,
    }
    return render(request, 'usage_summary.html', context)
    
    # usage = UserLoginLogout.objects.all()
    # return render(request, 'index.html', {'usage': usage})
    
    # user = request.user
    # login_logout_times = LoginLogoutTime.objects.filter(user=user)
    # total_duration = login_logout_times.aggregate(duration=Sum('logout_time - login_time'))['duration']
    # total_cost = Decimal(total_duration.total_seconds() / 3600) * Decimal(10) # Assuming cost is 10 per hour
    # context = {
    #     'total_duration': total_duration,
    #     'total_cost': total_cost,
    # }
    # return render(request, 'usage_summary.html', context)