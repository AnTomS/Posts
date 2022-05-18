package ru.netology.attachment

class AttachmentPhoto : Attachment {
    override val type: String = "photo"
    val photo: Photo = Photo()
}