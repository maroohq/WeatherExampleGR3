package com.example.weatherexamplegr3

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class Test {
    // @Test
    // fun addition_isCorrect() {
    //     assertEquals(4, 2 + 2)
    // }

    @Test
    fun checkUrl_isCorrect(){
        val main = MainActivity()

        val result:Any = main.buildUrlForWeather()
        assertTrue(result is URL)
    }
}
