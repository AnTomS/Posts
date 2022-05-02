package ru.netology

class WallService {
    private var posts = emptyArray<Post>()
    private var nextId: Long = 0


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

    fun likeById(id: Long) {
        for ((index, post) in posts.withIndex()) {
            if (post.idPost == id) {
                posts[index] = post.copy(likes = post.likes + 1)
            }
        }
    }

}
