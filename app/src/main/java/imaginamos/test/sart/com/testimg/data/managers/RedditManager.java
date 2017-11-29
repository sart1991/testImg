package imaginamos.test.sart.com.testimg.data.managers;

import android.util.Log;

import imaginamos.test.sart.com.testimg.data.networking.models.Reddit;
import imaginamos.test.sart.com.testimg.data.networking.requests.RequestService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class RedditManager {

    private static final String TAG = RedditManager.class.getSimpleName();

    private RequestService mRequestService;

    private static RedditManager instance;

    private RedditManager() {
        mRequestService = RequestService.get();
    }

    static RedditManager get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized RedditManager getSync() {
        if (instance == null) instance = new RedditManager();
        return instance;
    }

    public void getReddit() {
        mRequestService.getReddit(new Callback<Reddit>() {
            @Override
            public void onResponse(Call<Reddit> call, Response<Reddit> response) {
                if (response.body() != null)
                    Log.i(TAG, "onResponse: " + response.body().getKind());
                else
                    Log.i(TAG, "onResponse: response correct body null");
            }

            @Override
            public void onFailure(Call<Reddit> call, Throwable t) {
                Log.i(TAG, "onFailure");
            }
        });
    }

}
