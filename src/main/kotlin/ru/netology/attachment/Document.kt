package ru.netology.attachment

data class Document(
    val id: Long= 1,
    val ownerId: Long=2,
    val title: String="курсовая",
    val size: Int = 2
    )