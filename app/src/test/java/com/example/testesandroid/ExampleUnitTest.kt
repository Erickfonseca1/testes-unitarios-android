package com.example.testesandroid

import org.junit.Test
import org.junit.Assert.assertEquals

class HelloWorldTest {

    @Test
    fun testGetGreeting() {
        // Configuração
        val helloWorld = HelloWorld()

        // Execução
        val greeting = helloWorld.getGreeting()

        // Verificação
        assertEquals("Hello, World!", greeting)
    }
}

class HelloWorld {
    fun getGreeting(): String {
        return "World!"
    }
}
