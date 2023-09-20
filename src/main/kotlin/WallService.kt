object WallService {
    private var posts = emptyArray<Post>()
    private var id = 1

    fun add(post: Post): Post {
        posts += post.copy(id = id)
        id++
        return posts.last()
    }

    fun update(updatedPost: Post): Boolean {
        for ((index, post) in posts.withIndex()) {
            if (post.id == updatedPost.id) {
                posts[index] = post.copy(
                    ownerId = updatedPost.ownerId,
                    fromId = updatedPost.fromId,
                    createdBy = updatedPost.createdBy,
                    date = updatedPost.date,
                    text = updatedPost.text,
                    replyOwnerId = updatedPost.replyOwnerId,
                    replyPostId = updatedPost.replyPostId,
                    friendsOnly = updatedPost.friendsOnly,
                    comments = updatedPost.comments,
                    likes = updatedPost.likes,
                    postType = updatedPost.postType,
                    canPin = updatedPost.canPin,
                    canDelete = updatedPost.canDelete,
                    canEdit = updatedPost.canEdit,
                    isPinned = updatedPost.isPinned,
                    markedAsAds = updatedPost.markedAsAds,
                    attachment = updatedPost.attachment
                )
                return true
            }
        }
        return false
    }

    fun clear() {
        posts = emptyArray()
        id = 1
    }

    override fun toString(): String {
        return posts.joinToString()
    }
}