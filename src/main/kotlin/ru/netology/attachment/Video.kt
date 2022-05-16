package ru.netology.attachment

data class Video(
    val id: Long,
    val ownerId: Long,
    val artist: String,
    val title: String,
    val description: String,
    val dateAdd: Int
    )

