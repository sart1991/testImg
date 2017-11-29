package imaginamos.test.sart.com.testimg.data.networking.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class RedditRes {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private RedditDataRes data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public RedditDataRes getData() {
        return data;
    }

    public void setData(RedditDataRes data) {
        this.data = data;
    }
}
