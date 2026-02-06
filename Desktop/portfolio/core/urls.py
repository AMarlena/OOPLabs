from django.urls import path
from .views import home, about, project_detail
urlpatterns = [
    path("", home, name = "home"),
    path("about/", about, name = "about"),
    path("project/<int:pk>/", project_detail, name = "project_detail"),
]