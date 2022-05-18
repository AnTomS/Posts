package ru.netology.attachment

class AttachmentAudio : Attachment{
    override val type: String = "audio"
    val audio: Audio = Audio()
}