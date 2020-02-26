package com.bombadu.esspresoid2;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;

@RunWith(AndroidJUnit4.class)
public class AdapterTest1 {
    
    @Rule
    public ActivityTestRule<Listoid> mainActivityActivityTestRule
            = new ActivityTestRule<>(Listoid.class);

    @Test
    public void ItemsAtListViewPositions(){

        onData(anything()).inAdapterView(withId(R.id.my_list_view)).atPosition(2).
                check(matches(withText("Cate")));



    }
}
