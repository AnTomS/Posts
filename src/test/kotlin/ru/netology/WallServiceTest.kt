package ru.netology

import junit.framework.TestCase
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun addAndUpdate() {
        // arrange
        val service = WallService()
        service.add(Post(1, 2, 12052022, 7, "Виктория", "Занятие перенесли", 5, 9, friends_only = false, 50, 1))
        service.add(Post(1, 2, 13052022, 7, "Виктория", "Занятие перенесли", 5, 9, friends_only = false, 41, 1))
        val update = Post(1, 2, 14052022, 7, "Виктория", "Занятие состоится", 5, 9, friends_only = false, 71, 31)
        //act
        val result = service.update(update)
        //assert
        assertTrue(result)
    }
}
