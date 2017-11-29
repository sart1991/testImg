package imaginamos.test.sart.com.testimg.data.networking.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class Reddit {
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("data")
    @Expose
    private RedditData data;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public RedditData getData() {
        return data;
    }

    public void setData(RedditData data) {
        this.data = data;
    }
}
