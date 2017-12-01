package imaginamos.test.sart.com.testimg;


import android.content.Intent;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.intent.Intents;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.espresso.intent.rule.*;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import imaginamos.test.sart.com.testimg.ui.activities.details.DetailsActivity;
import imaginamos.test.sart.com.testimg.ui.activities.details.RedditDetailsConstants;
import imaginamos.test.sart.com.testimg.ui.activities.main.MainActivity;

/**
 * Created by SergioAlejandro on 30/11/2017.
 */

@LargeTest
@RunWith(AndroidJUnit4.class)
public class IntentTest {

    private String mRedditId;
    private String mTitle;

    @Rule
    public ActivityTestRule<DetailsActivity> mIntentRule = new ActivityTestRule<>(DetailsActivity.class);

    @Before
    public void initStrings() {
        mRedditId = "2cneq";
        mTitle = "The Place for U.S. Politics";
    }

    @Test
    public void testRedditIdSentToDetailsActivity() {
        Intents.init();
        Intent intent = new Intent();
        intent.putExtra(RedditDetailsConstants.INTENT_EXTRA_REDDIT_ID.getKey(), mRedditId);
        mIntentRule.launchActivity(intent);
        Espresso.onView(ViewMatchers.withId(R.id.textView_detailsActivity_title))
                .check(ViewAssertions.matches(ViewMatchers.withText(mTitle)));
        Intents.release();
    }
}
