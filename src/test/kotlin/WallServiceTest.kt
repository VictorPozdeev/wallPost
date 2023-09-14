import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    private val newPost1 = Post(id = 1, text = "The very first post")
    private val newPost2 = Post(id = 2, text = "Second post")
    private val newPost2Update = Post(id = 2, text = "Updated second post")
    private val newPost3 = Post(id = 3, text = "Third post")
    private val newPostWrongId = Post(id = -100, text = "Wrong Id")

    @Before
    fun clearBeforeTest() {
        WallService.clear()
    }

    @Test
    fun addPostToWall() {

        val wall = WallService

        val result = wall.add(newPost1).id

        assertEquals(1, result)
    }

    @Test
    fun updateExisting() {
        val wall = WallService

        wall.add(newPost1)
        wall.add(newPost2)
        wall.add(newPost3)

        val update = newPost2Update

        val result = wall.update(update)

        assertTrue(result)
    }

    @Test
    fun updateExisting_Negative() {
        val wall = WallService

        wall.add(newPost1)
        wall.add(newPost2)
        wall.add(newPost3)

        val update = newPostWrongId

        val result = wall.update(update)

        assertFalse(result)
    }
}