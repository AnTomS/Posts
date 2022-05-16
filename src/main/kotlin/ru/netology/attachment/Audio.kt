package ru.netology.attachment

data class Audio(
    val id: Long,
    val ownerId: Long,
    val artist: String,
    val title: String,
    val dateAdd: String,
    val type: String,
)