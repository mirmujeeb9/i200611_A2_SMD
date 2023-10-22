package com.faizanahmed.i200546;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class EspressoTest_2 {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void verifyLogin() {

        Espresso.onView(ViewMatchers.withId(R.id.LoginBtn)).check(ViewAssertions.matches(ViewMatchers.withText("Login")));
        Espresso.onView(ViewMatchers.withId(R.id.LoginBtn)).perform(ViewActions.click());
    }
}
