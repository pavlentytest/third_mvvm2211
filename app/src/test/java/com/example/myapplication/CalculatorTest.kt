package com.example.myapplication

import org.junit.Assert.*

import org.junit.After
import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test

class CalculatorTest {

    var calculator: Calculator? = null

    @Before
    fun setUpjdjdjdjd() {
        calculator = Calculator()
    }

    @After
    fun tearDown() {
        calculator = null
    }

    @Test
    fun calc() {
        // Assert => Exception (AssertionError)
        // Assume => Сообщение о том что тест проигнорирован, если он не пройдет
        Assert.assertEquals(100,calculator?.calc(40,4) ?: 0)
    }

    @Test
    fun calc2() {
        Assert.assertEquals(100,calculator?.calc(40,60) ?: 0)
    }

    @Test
    fun calc3() {
        Assume.assumeNotNull(1,2,3,4,5,6,null)
    }

    @Test(expected = NullPointerException::class)
    fun calc4() {
       //Assert.assertTrue("",calculator?.getLength("null") ?: true)
        Assert.assertEquals(10,9)
    }
}