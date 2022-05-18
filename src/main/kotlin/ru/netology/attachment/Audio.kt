package ru.netology.attachment

data class Audio (
    val id: Int = 1,
    val ownerId: Int = 2,
    val artist: String = "Stromae",
    val title: String = "alors on danse"
)