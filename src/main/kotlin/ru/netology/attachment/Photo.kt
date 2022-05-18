package ru.netology.attachment

data class Photo(
    val id: Long = 1,
    val albumId: Long = 2,
    val ownerId: Long = 2,
    val text: String = "Встреча",
)