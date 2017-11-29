package imaginamos.test.sart.com.testimg.data.networking.requests;

import imaginamos.test.sart.com.testimg.data.networking.models.Reddit;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public interface RedditClient {

    @GET("reddits.json")
    Call<Reddit> getReddit();
}
