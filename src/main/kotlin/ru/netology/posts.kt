package ru.netology

import org.jetbrains.annotations.Nullable


data class Post(
    val idPost: Int,
    val ownerId: Long,
    val fromId: Long,
    val created_by: Long,
    val date: Long,
    val text: String,
    val reply_owner_id: Long,
    val reply_post_id: Long,
    val friends_only: Boolean,
    val comments: Int,
    val copyright: String,
    val likes: Int = 0,
    val reposts: Post?,
    val views: Post?,
    val post_type: Post?,
    val post_source: Post?,
    // var attachments: Array<Attachment> = emptyArray<Attachment>()
    val geo: Post?,
    val signer_id: Long,
    var copyHistory: Post?,
    val canPin: Boolean,
    var canDelete: Boolean,
    var canEdit: Boolean,
    val isPinned: Boolean,
    var markedAsAds: Boolean,
    var isFavorite: Boolean,
)

fun main() {
    println("ООП: Объекты и классы")
}