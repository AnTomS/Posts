package ru.netology


data class Post(
    val idPost: Int,
    val ownerId: Long,
    val date: Long,
    val authorId: Long,
    val authorName: String,
    val text: String,
    val reply_owner_id : Long,
    val reply_post_id: Long,
    val friends_only : Boolean,
    val comments : Int,
    val likes: Int = 0
)

fun main () {
    println("ООП: Объекты и классы")
}