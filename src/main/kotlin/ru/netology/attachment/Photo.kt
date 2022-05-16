package ru.netology.attachment

data class Photo(
    val id: Long,
    val albumId: Long,
    val ownerId: Long,
    val dateAdd: String,
    val text: String
    )