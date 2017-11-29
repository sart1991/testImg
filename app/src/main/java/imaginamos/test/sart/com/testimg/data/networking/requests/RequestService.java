package imaginamos.test.sart.com.testimg.data.networking.requests;

import imaginamos.test.sart.com.testimg.data.networking.models.Reddit;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class RequestService {

    private static final String REDDIT_BASE_URL = "https://www.reddit.com/";

    private OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private Retrofit.Builder builder =
            new Retrofit.Builder()
                .baseUrl(REDDIT_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create());

    private Retrofit retrofit = builder.client(httpClient.build()).build();

    private RedditClient redditClient = retrofit.create(RedditClient.class);

    private static RequestService instance;

    private RequestService() { }

    public static RequestService get() {
        if (instance == null) instance = getSync();
        return instance;
    }

    private static synchronized RequestService getSync() {
        if (instance == null) instance = new RequestService();
        return instance;
    }

    public void getReddit(Callback<Reddit> redditCallback) {
        Call<Reddit> call = redditClient.getReddit();
        enqueueRedditRequest(call, redditCallback);
    }

    private void enqueueRedditRequest(Call<Reddit> call, Callback<Reddit> redditCallback) {
        call.enqueue(redditCallback);
    }

}
