package com.faizanahmed.i200546;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

public class EspressoTest_1 {

    @Rule
    public ActivityTestRule<MainActivity> m1ActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void clickButton() {

        //Clicking Forgot Button
        Espresso.onView(ViewMatchers.withId(R.id.ForgotBtn)).perform(ViewActions.click());
        Espresso.onView(ViewMatchers.withId(R.id.GoBackText)).perform(ViewActions.click());

    }
}
