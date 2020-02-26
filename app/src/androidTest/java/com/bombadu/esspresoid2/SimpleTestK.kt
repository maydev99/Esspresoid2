package com.bombadu.esspresoid2

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.SmallTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SimpleTestK {
    private val MY_TEXT = "Michael"
    @get:Rule
    var mainActivityActivityTestRule =
        ActivityTestRule(
            MainActivity::class.java
        )

    @SmallTest
    fun addTextAndClickButton() {
        Espresso.onView(ViewMatchers.withId(R.id.my_editText))
            .perform(ViewActions.clearText(), ViewActions.typeText(MY_TEXT))
        Espresso.onView(ViewMatchers.withId(R.id.my_button)).perform(ViewActions.click())
        Espresso.onView(ViewMatchers.withId(R.id.my_text_view))
            .check(ViewAssertions.matches(ViewMatchers.withText(MY_TEXT)))
    }
}