package imaginamos.test.sart.com.testimg.data.networking.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class RedditData {

    @SerializedName("modhash")
    @Expose
    private String modhash;
    @SerializedName("whitelist_status")
    @Expose
    private String whitelistStatus;
    @SerializedName("children")
    @Expose
    private List<RedditChild> children = null;

    public String getModhash() {
        return modhash;
    }

    public void setModhash(String modhash) {
        this.modhash = modhash;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public List<RedditChild> getChildren() {
        return children;
    }

    public void setChildren(List<RedditChild> children) {
        this.children = children;
    }

}
