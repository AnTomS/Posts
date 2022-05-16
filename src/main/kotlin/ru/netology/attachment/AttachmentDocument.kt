package ru.netology.attachment

class AttachmentDocument(variable : Document) : Attachment {
    override val type: String = "Document"
    private val document = variable
    override fun toString(): String {
        return "AttachmentDocument(type='$type', document=$document)"
    }
}