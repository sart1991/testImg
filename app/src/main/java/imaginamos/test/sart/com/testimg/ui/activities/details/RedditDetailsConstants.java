package imaginamos.test.sart.com.testimg.ui.activities.details;

/**
 * Created by SergioAlejandro on 29/11/2017.
 */

public enum RedditDetailsConstants {

    INTENT_EXTRA_REDDIT_ID("redditId");

    private String key;

    RedditDetailsConstants(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

}
