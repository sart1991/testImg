package imaginamos.test.sart.com.testimg.data.networking.requests;

import imaginamos.test.sart.com.testimg.data.networking.models.RedditRes;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

interface RedditClient {

    @GET("reddits.json")
    Call<RedditRes> getReddit();
}
