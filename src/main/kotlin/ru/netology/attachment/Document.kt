package ru.netology.attachment

data class Document(
    val id: Long,
    val ownerId: Long,
    val title: String,
    val dateAdd: String,
    val size: Int
    )