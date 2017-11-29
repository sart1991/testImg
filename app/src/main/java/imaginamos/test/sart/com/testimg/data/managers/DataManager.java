package imaginamos.test.sart.com.testimg.data.managers;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class DataManager {

    private RedditManager mRedditManager;

    private static DataManager instance;

    private DataManager() {
        mRedditManager = RedditManager.get();
    }

    public static DataManager get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized DataManager getSync() {
        if (instance == null) instance = new DataManager();
        return instance;
    }

    public RedditManager getRedditManager() {
        return mRedditManager;
    }
}
