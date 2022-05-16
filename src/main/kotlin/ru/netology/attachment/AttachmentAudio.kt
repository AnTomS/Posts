package ru.netology.attachment

class AttachmentAudio (variable: Audio) : Attachment {
    override val type = "Audio"
    private val audio = variable
    override fun toString(): String {
        return "AttachmentAudio(type='$type', audio=$audio)"
    }
}