package imaginamos.test.sart.com.testimg.data.managers;

import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;
import android.util.Log;

import java.util.List;

import imaginamos.test.sart.com.testimg.data.db.AppDatabase;
import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.data.networking.models.RedditChildDataRes;
import imaginamos.test.sart.com.testimg.data.networking.models.RedditChildRes;
import imaginamos.test.sart.com.testimg.data.networking.models.RedditRes;
import imaginamos.test.sart.com.testimg.data.networking.requests.RequestService;
import imaginamos.test.sart.com.testimg.data.preferences.AppPreferences;
import imaginamos.test.sart.com.testimg.data.preferences.PreferencesKeys;
import imaginamos.test.sart.com.testimg.utils.ConverterUtil;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class RedditManager {

    private static final String TAG = RedditManager.class.getSimpleName();

    private RequestService mRequestService;
    private AppDatabase mAppDatabase;

    private static RedditManager instance;

    private RedditManager() {
        mRequestService = RequestService.get();
        mAppDatabase = AppDatabase.get();
    }

    static RedditManager get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized RedditManager getSync() {
        if (instance == null) instance = new RedditManager();
        return instance;
    }

    public void downloadAndSaveReddits() {
        if (AppPreferences.get().getPreference(PreferencesKeys.FIRST_LOAD)) {
            mRequestService.getReddit(new Callback<RedditRes>() {
                @Override
                public void onResponse(Call<RedditRes> call, Response<RedditRes> response) {
                    if (response.body() != null) {
                        Log.i(TAG, "onResponse: " + response.body().getKind());
                        asyncSaveReddits(response.body());
                    } else
                        Log.i(TAG, "onResponse: response correct body null");
                }

                @Override
                public void onFailure(Call<RedditRes> call, Throwable t) {
                    Log.i(TAG, "onFailure");
                }
            });
        }
    }

    private void asyncSaveReddits(RedditRes redditRes) {
        new AsyncSaveReddits().execute(redditRes);
    }

    public LiveData<List<Reddit>> getLiveReddits() {
        return mAppDatabase.queryRedditsDB().getReddits();
    }

    public LiveData<Reddit> getLiveReddit(String id) {
        return mAppDatabase.queryRedditsDB().getRedditById(id);
    }

    private class AsyncSaveReddits extends AsyncTask<RedditRes, Void, List<Reddit>> {

        @Override
        protected List<Reddit> doInBackground(RedditRes... paramsRedditRes) {
            RedditRes redditRes = paramsRedditRes[0];
            //List<Reddit> redditsList = new ArrayList<>();
            for (RedditChildRes redditChildRes : redditRes.getData().getChildren()) {
                RedditChildDataRes redditChildDataRes = redditChildRes.getData();
                Reddit reddit = ConverterUtil.convert(redditChildDataRes);
                mAppDatabase.queryRedditsDB().addReddit(reddit);
            }
            return null;
        }

        @Override
        protected void onPostExecute(List<Reddit> reddits) {
            super.onPostExecute(reddits);
            AppPreferences.get().addPreference(PreferencesKeys.FIRST_LOAD, false);
        }


    }
}
