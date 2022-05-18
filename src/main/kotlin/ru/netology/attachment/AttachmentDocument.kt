package ru.netology.attachment

class AttachmentDocument : Attachment {
    override val type: String = "document"
    val document: Document = Document()
}
