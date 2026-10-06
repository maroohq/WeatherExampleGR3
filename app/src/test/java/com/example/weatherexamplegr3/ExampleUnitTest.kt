package com.example.weatherexamplegr3

import org.junit.After
import org.junit.Test
import org.junit.Assert.*
import java.io.File

class ExampleUnitTest {
    private val fileName = "test_sample.txt"
    private val file = File(fileName)

    @Test
    fun test_createFile() {

        val isCreated = file.createNewFile()

        assertTrue("The file should be created", isCreated || file.exists())
        assertTrue("The file must exist", file.exists())
    }

    @After
    fun tearDown() {

        if (file.exists()) {
            file.delete()
        }
    }
}