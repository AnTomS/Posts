package ru.netology

import org.jetbrains.annotations.Nullable
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun testIdNotZero() {
        // arrange
        val service = WallService
        //act
        val result = service.add(Post(1,1,2,2,1205202,"Занятие перенесли",1,1,false,
            14,"text", 14, null,null,null,null,null,1,null,true,true,
            true,true,true,true,))
        //assert
        assertTrue(result.idPost > 0)
    }

    @Test
    fun updateFalse() {
        // arrange
        val service = WallService
        val test1 = service.add(Post(1,1,2,2,1205202,
            "Занятие перенесли",1,1, false, 14,
            "text", 14, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,))
        val test2 = service.add(Post(2,2,3,3,1205202,
            "Занятие перенесли",1,1, false, 26,
            "text", 11, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,))
        val test3 = service.add(Post(3,3,3,3,1205202,
            "Занятие перенесли",1,1, false, 12,
            "text", 10, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,))
        val update = Post(6,1,4,4,1205202,
            "Занятие перенесли",1,1, false, 14,
            "text", 14, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,)
        //act
        service.add(test1)
        service.add(test2)
        service.add(test3)
        val result = service.update(update)
        //assert
        assertFalse(result)
    }

    @Test
    fun updateTrue() {
        // arrange
        val service = WallService
        val test1 = service.add(Post(1,1,2,2,1205202,
            "Занятие перенесли",1,1, false, 14,
            "text", 14, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,))
        val test2 = service.add(Post(2,2,3,3,1205202,
            "Занятие перенесли",1,1, false, 26,
            "text", 11, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,))
        val test3 = service.add(Post(3,3,3,3,1205202,
            "Занятие перенесли",1,1, false, 12,
            "text", 10, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,))
        val update = Post(3,1,4,4,1205202,
            "Занятие перенесли",1,1, false, 14,
            "text", 14, null,null,null,null,null,
            1,null,true,true, true,true,
            true,true,)
        //act
        service.add(test1)
        service.add(test2)
        service.add(test3)
        val result = service.update(update)
        //assert
        assertTrue(result)
    }
}
