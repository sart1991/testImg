package imaginamos.test.sart.com.testimg.data.networking.requests;

import org.junit.Test;

import imaginamos.test.sart.com.testimg.data.networking.models.RedditRes;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static org.junit.Assert.*;

/**
 * Created by SergioAlejandro on 30/11/2017.
 */

public class RequestServiceTest {

    @Test
    public void testGetRedditBodyNotNull_positive() {
        RequestService.get().getReddit(new Callback<RedditRes>() {
            @Override
            public void onResponse(Call<RedditRes> call, Response<RedditRes> response) {
                assertTrue("Download body is null, failed to convert",
                            response.body() != null);
            }

            @Override
            public void onFailure(Call<RedditRes> call, Throwable t) {

            }
        });
    }


    @Test
    public void testGetRedditChildsGreaterThenZero_positive() {
        RequestService.get().getReddit(new Callback<RedditRes>() {
            @Override
            public void onResponse(Call<RedditRes> call, Response<RedditRes> response) {
                assertTrue("Download children size is not greater then 0 is null," +
                                " failed to convert",
                        response.body().getData().getChildren().size() > 0);
            }

            @Override
            public void onFailure(Call<RedditRes> call, Throwable t) {

            }
        });
    }
}
