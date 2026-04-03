from django.urls import path
from . import views
from .feeds import LatestPostsFeed

app_name = "blog"

urlpatterns = [
    # Blog home
    path('', views.post_list, name='post_list'),

    # Tag filter
    path('tag/<slug:tag_slug>/', views.post_list, name='post_list_by_tag'),

    # Post detail
    path(
        '<int:year>/<int:month>/<int:day>/<slug:post>/',
        views.post_detail,
        name='post_detail'
    ),

    # Share
    path(
        '<int:post_id>/share/',
        views.post_share,
        name='post_share'
    ),

    # Comment
    path(
        '<int:post_id>/comment/',
        views.post_comment,
        name='post_comment'
    ),
    path('feed/', LatestPostsFeed(), name='post_feed'),
    path('search/', views.post_search, name='post_search'),
]