fun main() {
    val service = WallService

    service.add(
        Post(
            text = "One post",
            friendsOnly = false,
            likes = Likes(),
            postType = "post",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = true
        )
    )

    service.add(
        Post(
            text = "Two post",
            friendsOnly = true,
            likes = Likes(),
            postType = "copy",
            canPin = true,
            canDelete = false,
            canEdit = false,
            isPinned = true,
            markedAsAds = true
        )
    )

    println(service.toString())
}

