package imaginamos.test.sart.com.testimg.utils;

import org.junit.Test;

import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.data.networking.models.RedditChildDataRes;

import static org.junit.Assert.*;

/**
 * Created by SergioAlejandro on 30/11/2017.
 */

public class ConverterUtilTest {

    @Test
    public void testConvertRedditChildDataResIntoReddit_positive() {
        String id = "1234";
        RedditChildDataRes redditChildDataRes = new RedditChildDataRes();
        redditChildDataRes.setId(id);
        Reddit reddit = ConverterUtil.convert(redditChildDataRes);
        assertEquals("Convert RedditChildDataRes into Reddit failed",
                     reddit.getId(), redditChildDataRes.getId());
    }

    @Test(expected = NullPointerException.class)
    public void testConvertRedditChildDataResIntoReddit_negative() {
        RedditChildDataRes redditChildDataRes = null;
        ConverterUtil.convert(redditChildDataRes);
    }
}
