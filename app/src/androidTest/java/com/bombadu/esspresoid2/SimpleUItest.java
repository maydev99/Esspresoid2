package com.bombadu.esspresoid2;


import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class SimpleUItest {

    //private String MY_TEXT = "Michael";
    private String[] myNames = {"Michael", "Steve", "Bob", "Mary", "Cate"};

    @Rule
    public ActivityTestRule<MainActivity> mainActivityActivityTestRule
            = new ActivityTestRule<>(MainActivity.class);


    @Test
    public void addTextAndClickButton() {
        for (int i = 0; i < myNames.length; i++) {
            onView(withId(R.id.my_editText)).perform(clearText(), typeText(myNames[i]));
            onView((withId(R.id.my_button))).perform(click());
            onView(withId(R.id.my_text_view)).check(ViewAssertions.matches(withText(myNames[i])));
        }



    }





}
