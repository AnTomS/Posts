package ru.netology

data class Comment(
    val postId: Int,
    val from_id: Int,
    val date: Int,
    val text: String,
)