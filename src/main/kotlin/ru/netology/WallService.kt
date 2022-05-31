package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var nextId: Int = 0

    fun createComment(comment: Comment, nextId: Int): Comment {
        for (post in posts) {
            if (nextId == comment.postId) {
                comments += comment
                return comments.last()
            }
        }
        throw PostNotFoundException("Ошибка, нельзя добавить комментарий к несуществующему посту")

    }

    fun add(post: Post): Post {
        posts += if (posts.isEmpty()) {
            post.copy(idPost = 0)
        } else {
            post.copy(idPost = nextId)
        }
        nextId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((idPost, newPost) in posts.withIndex()) {
            if (newPost.idPost == post.idPost) {
                posts[idPost] = newPost.copy(ownerId = newPost.ownerId, date = newPost.date)
                return true
            }
        }
        return false

    }


}
