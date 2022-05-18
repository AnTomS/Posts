package ru.netology.attachment

class AttachmentVideo : Attachment {
    override val type: String = "video"
    val video: Video = Video()
}