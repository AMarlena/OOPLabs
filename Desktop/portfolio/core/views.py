from django.shortcuts import render, get_object_or_404
from .models import Project
def home(request):
    project = Project.objects.all()
    return render(request, "core/home.html", {
        "projects": project
    })
def about(request):
    return render(request, "core/about.html")
def project_detail(request, pk):
    project = get_object_or_404(Project, pk=pk)
    return render(request, "core/project_detail.html", {
        "project": Project
    })