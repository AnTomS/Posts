package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun testIdNotZero() {
        // arrange
        val service = WallService
        //act
        val result = service.add(Post(1, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        //assert
        assertTrue(result.idPost > 0)
    }

    @Test
    fun updateFalse() {
        // arrange
        val service = WallService
        val test1 = service.add(Post(1, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val test2 = service.add(Post(2, 4, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val test3 = service.add(Post(3, 5, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val update = Post(7, 2, 13052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1)
        //act
        service.add(test1)
        service.add(test2)
        service.add(test3)
        val result = WallService.update(update)
        //assert
        assertFalse(result)
    }

    @Test
    fun updateTrue() {
        // arrange
        val service = WallService
        val test1 = service.add(Post(1, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val test2 = service.add(Post(2, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val test3 = service.add(Post(3, 2, 12052022, 7,
            "Виктория", "Занятие перенесли",
            5, 9, friends_only = false, 50, 1))
        val update = Post(3, 2, 13052022, 7,
            "Виктория", "Занятие перенесли",
            5, 1, friends_only = false, 50, 1)
        //act
        service.add(test1)
        service.add(test2)
        service.add(test3)
        val result = service.update(update)
        //assert
        assertTrue(result)
    }
}
