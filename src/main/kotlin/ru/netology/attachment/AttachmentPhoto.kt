package ru.netology.attachment

class AttachmentPhoto(variable : Photo) : Attachment {
    override val type: String = "Photo"
    private val photo = variable
    override fun toString(): String {
        return "AttachmentPhoto(type='$type', photo=$photo)"
    }
}