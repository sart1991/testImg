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
                Reddit reddit = convert(redditChildDataRes);
                mAppDatabase.queryRedditsDB().addReddit(reddit);
            }
            return null;
        }

        @Override
        protected void onPostExecute(List<Reddit> reddits) {
            super.onPostExecute(reddits);
            AppPreferences.get().addPreference(PreferencesKeys.FIRST_LOAD, false);
        }

        private Reddit convert(RedditChildDataRes redditChildDataRes) {
            if (redditChildDataRes == null) {
                throw new NullPointerException(
                        "Can't convert a null RedditChildDataRes into a Reddit");
            }
            Reddit reddit = new Reddit();
            reddit.setId(redditChildDataRes.getId());
            reddit.setAccountsActiveIsFuzzed(redditChildDataRes.getAccountsActiveIsFuzzed());
            reddit.setAdvertiserCategory(redditChildDataRes.getAdvertiserCategory());
            reddit.setAllowDiscovery(redditChildDataRes.getAllowDiscovery());
            reddit.setAllowImages(redditChildDataRes.getAllowImages());
            reddit.setAudienceTarget(redditChildDataRes.getAudienceTarget());
            reddit.setBannerImg(redditChildDataRes.getBannerImg());
            reddit.setCollapseDeletedComments(redditChildDataRes.getCollapseDeletedComments());
            reddit.setCommentScoreHideMins(redditChildDataRes.getCommentScoreHideMins());
            reddit.setCreated(redditChildDataRes.getCreated());
            reddit.setCreatedUtc(redditChildDataRes.getCreatedUtc());
            reddit.setDescription(redditChildDataRes.getDescription());
            reddit.setDescriptionHtml(redditChildDataRes.getDescriptionHtml());
            reddit.setDisplayName(redditChildDataRes.getDisplayName());
            reddit.setDisplayNamePrefixed(redditChildDataRes.getDisplayNamePrefixed());
            reddit.setHeaderImg(redditChildDataRes.getHeaderImg());
            reddit.setHeaderTitle(redditChildDataRes.getHeaderTitle());
            reddit.setHideAds(redditChildDataRes.getHideAds());
            reddit.setIconImg(redditChildDataRes.getIconImg());
            reddit.setKeyColor(redditChildDataRes.getKeyColor());
            reddit.setLang(redditChildDataRes.getLang());
            reddit.setLinkFlairEnabled(redditChildDataRes.getLinkFlairEnabled());
            reddit.setName(redditChildDataRes.getName());
            reddit.setOver18(redditChildDataRes.getOver18());
            reddit.setPublicDescription(redditChildDataRes.getPublicDescription());
            reddit.setPublicDescriptionHtml(redditChildDataRes.getPublicDescriptionHtml());
            reddit.setPublicTraffic(redditChildDataRes.getPublicTraffic());
            reddit.setQuarantine(redditChildDataRes.getQuarantine());
            reddit.setShowMedia(redditChildDataRes.getShowMedia());
            reddit.setShowMediaPreview(redditChildDataRes.getShowMediaPreview());
            reddit.setSpoilersEnabled(redditChildDataRes.getSpoilersEnabled());
            reddit.setSubmissionType(redditChildDataRes.getSubmissionType());
            reddit.setSubmitText(redditChildDataRes.getSubmitText());
            reddit.setSubmitTextHtml(redditChildDataRes.getSubmitTextHtml());
            reddit.setSubmitTextLabel(redditChildDataRes.getSubmitTextLabel());
            reddit.setSubredditType(redditChildDataRes.getSubredditType());
            reddit.setSubscribers(redditChildDataRes.getSubscribers());
            reddit.setTitle(redditChildDataRes.getTitle());
            reddit.setUrl(redditChildDataRes.getUrl());
            reddit.setUserFlairEnabledInSr(redditChildDataRes.getUserFlairEnabledInSr());
            reddit.setUserSrThemeEnabled(redditChildDataRes.getUserSrThemeEnabled());
            reddit.setWhitelistStatus(redditChildDataRes.getWhitelistStatus());
            reddit.setWikiEnabled(redditChildDataRes.getWikiEnabled());
            return reddit;
        }
    }
}
