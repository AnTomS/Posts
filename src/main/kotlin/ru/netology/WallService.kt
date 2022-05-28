package ru.netology

object WallService {
    var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()
    private var nextId: Int = 0


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

    fun createComment(comment: Comment){
            for (post in posts) {
                if (post.idPost==comment.id){
                    comments += comment
                }
            }

        throw PostNotFoundException ("Ошибка, нельзя добавить комментарий к несуществующему посту")

    }

}
