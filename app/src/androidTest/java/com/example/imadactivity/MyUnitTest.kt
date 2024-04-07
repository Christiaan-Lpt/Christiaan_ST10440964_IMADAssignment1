package com.example.imadactivity

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.containsString
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MyUnitTe {

    @Before
    fun setUp() {
        // Launch the activity under test
        ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testValidNumber() {
        // Enter a valid number
        onView(withId(R.id.editTextNumber)).perform(replaceText("5"), closeSoftKeyboard())
        // Click the button to generate history
        onView(withId(R.id.buttonGenerateHistory)).perform(click())
        // Check if the message is displayed correctly
        onView(withId(R.id.textView2)).check(matches(withText(containsString("Napoleon Bonaparte"))))
    }

    @Test
    fun testInvalidNumber() {
        // Enter an invalid number
        onView(withId(R.id.editTextNumber)).perform(replaceText("-5"), closeSoftKeyboard())
        // Click the button to generate history
        onView(withId(R.id.buttonGenerateHistory)).perform(click())
        // Check if the invalid number message is displayed
        onView(withId(R.id.textView2)).check(matches(withText(containsString("Invalid number"))))
    }

    @Test
    fun testClearButton() {
        // Enter a number
        onView(withId(R.id.editTextNumber)).perform(replaceText("20"), closeSoftKeyboard())
        // Click the button to generate history
        onView(withId(R.id.buttonGenerateHistory)).perform(click())
        // Check if the message is displayed
        onView(withId(R.id.textView2)).check(matches(withText(containsString("Tupac Shakur"))))
        // Click the clear button
        onView(withId(R.id.buttonClear)).perform(click())
        // Check if the text view is cleared
        onView(withId(R.id.textView2)).check(matches(withText("")))
    }
}
