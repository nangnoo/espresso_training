package com.sourcey.materiallogindemo

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test

class SampleTestSuite {
    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun ZEPDEM_966_SuccessTest() {
        onView(withText("LOGIN")).check(matches(isDisplayed()))
        Thread.sleep(2000)
    }

    @Test
    fun ZEPDEM_999_FailTest() {
        onView(withText("LOGIN..")).check(matches(isDisplayed()))
        Thread.sleep(2000)
    }

}
