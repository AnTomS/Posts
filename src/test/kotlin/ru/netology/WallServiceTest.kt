package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        // arrange
        val service = WallService
        service.add(Post(1, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val update = Post(1, 2, 14052022, 7,
            "Виктория", "Занятие состоится", 5,
            9, friends_only = false, 71, 31)
        //act
        val result = WallService.add(update)
        //assert
        assertEquals(2, result.idPost)
    }
    @Test
    fun updateF() {
        // arrange
        val service = WallService
        service.add(Post(1, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val update = Post(1, 2, 14052022, 7,
            "Виктория", "Занятие состоится", 5,
            9, friends_only = false, 71, 31)
        //act
        val result = WallService.update(update)
        //assert
        assertFalse(result)
    }
    @Test
    fun updateT() {
        // arrange
        val service = WallService
        service.add(Post(1, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val update = Post(1, 2, 14052022, 7,
            "Виктория", "Занятие состоится", 5,
            9, friends_only = false, 71, 31)
        //act
        val result = WallService.update(update)
        //assert
        assertTrue(result)
    }
}
