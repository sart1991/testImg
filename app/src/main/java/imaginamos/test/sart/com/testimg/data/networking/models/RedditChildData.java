package imaginamos.test.sart.com.testimg.data.networking.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class RedditChildData {

    @SerializedName("banner_img")
    @Expose
    private String bannerImg;
    @SerializedName("user_sr_theme_enabled")
    @Expose
    private Boolean userSrThemeEnabled;
    @SerializedName("user_flair_text")
    @Expose
    private Object userFlairText;
    @SerializedName("submit_text_html")
    @Expose
    private String submitTextHtml;
    @SerializedName("user_is_banned")
    @Expose
    private Object userIsBanned;
    @SerializedName("wiki_enabled")
    @Expose
    private Boolean wikiEnabled;
    @SerializedName("show_media")
    @Expose
    private Boolean showMedia;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("display_name_prefixed")
    @Expose
    private String displayNamePrefixed;
    @SerializedName("submit_text")
    @Expose
    private String submitText;
    @SerializedName("user_can_flair_in_sr")
    @Expose
    private Object userCanFlairInSr;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("header_img")
    @Expose
    private String headerImg;
    @SerializedName("description_html")
    @Expose
    private String descriptionHtml;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("collapse_deleted_comments")
    @Expose
    private Boolean collapseDeletedComments;
    @SerializedName("user_has_favorited")
    @Expose
    private Object userHasFavorited;
    @SerializedName("over18")
    @Expose
    private Boolean over18;
    @SerializedName("public_description_html")
    @Expose
    private String publicDescriptionHtml;
    @SerializedName("spoilers_enabled")
    @Expose
    private Boolean spoilersEnabled;
    @SerializedName("icon_size")
    @Expose
    private List<Integer> iconSize = null;
    @SerializedName("audience_target")
    @Expose
    private String audienceTarget;
    @SerializedName("suggested_comment_sort")
    @Expose
    private Object suggestedCommentSort;
    @SerializedName("active_user_count")
    @Expose
    private Object activeUserCount;
    @SerializedName("icon_img")
    @Expose
    private String iconImg;
    @SerializedName("header_title")
    @Expose
    private String headerTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("user_is_muted")
    @Expose
    private Object userIsMuted;
    @SerializedName("submit_link_label")
    @Expose
    private Object submitLinkLabel;
    @SerializedName("accounts_active")
    @Expose
    private Object accountsActive;
    @SerializedName("public_traffic")
    @Expose
    private Boolean publicTraffic;
    @SerializedName("header_size")
    @Expose
    private List<Integer> headerSize = null;
    @SerializedName("subscribers")
    @Expose
    private Integer subscribers;
    @SerializedName("user_flair_css_class")
    @Expose
    private Object userFlairCssClass;
    @SerializedName("submit_text_label")
    @Expose
    private String submitTextLabel;
    @SerializedName("whitelist_status")
    @Expose
    private String whitelistStatus;
    @SerializedName("user_sr_flair_enabled")
    @Expose
    private Object userSrFlairEnabled;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("user_is_moderator")
    @Expose
    private Object userIsModerator;
    @SerializedName("is_enrolled_in_new_modmail")
    @Expose
    private Object isEnrolledInNewModmail;
    @SerializedName("key_color")
    @Expose
    private String keyColor;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("user_flair_enabled_in_sr")
    @Expose
    private Boolean userFlairEnabledInSr;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("quarantine")
    @Expose
    private Boolean quarantine;
    @SerializedName("hide_ads")
    @Expose
    private Boolean hideAds;
    @SerializedName("created_utc")
    @Expose
    private Integer createdUtc;
    @SerializedName("banner_size")
    @Expose
    private List<Integer> bannerSize = null;
    @SerializedName("user_is_contributor")
    @Expose
    private Object userIsContributor;
    @SerializedName("allow_discovery")
    @Expose
    private Boolean allowDiscovery;
    @SerializedName("accounts_active_is_fuzzed")
    @Expose
    private Boolean accountsActiveIsFuzzed;
    @SerializedName("advertiser_category")
    @Expose
    private String advertiserCategory;
    @SerializedName("public_description")
    @Expose
    private String publicDescription;
    @SerializedName("link_flair_enabled")
    @Expose
    private Boolean linkFlairEnabled;
    @SerializedName("allow_images")
    @Expose
    private Boolean allowImages;
    @SerializedName("show_media_preview")
    @Expose
    private Boolean showMediaPreview;
    @SerializedName("comment_score_hide_mins")
    @Expose
    private Integer commentScoreHideMins;
    @SerializedName("subreddit_type")
    @Expose
    private String subredditType;
    @SerializedName("submission_type")
    @Expose
    private String submissionType;
    @SerializedName("user_is_subscriber")
    @Expose
    private Object userIsSubscriber;

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public Boolean getUserSrThemeEnabled() {
        return userSrThemeEnabled;
    }

    public void setUserSrThemeEnabled(Boolean userSrThemeEnabled) {
        this.userSrThemeEnabled = userSrThemeEnabled;
    }

    public Object getUserFlairText() {
        return userFlairText;
    }

    public void setUserFlairText(Object userFlairText) {
        this.userFlairText = userFlairText;
    }

    public String getSubmitTextHtml() {
        return submitTextHtml;
    }

    public void setSubmitTextHtml(String submitTextHtml) {
        this.submitTextHtml = submitTextHtml;
    }

    public Object getUserIsBanned() {
        return userIsBanned;
    }

    public void setUserIsBanned(Object userIsBanned) {
        this.userIsBanned = userIsBanned;
    }

    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    public void setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    public Boolean getShowMedia() {
        return showMedia;
    }

    public void setShowMedia(Boolean showMedia) {
        this.showMedia = showMedia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayNamePrefixed() {
        return displayNamePrefixed;
    }

    public void setDisplayNamePrefixed(String displayNamePrefixed) {
        this.displayNamePrefixed = displayNamePrefixed;
    }

    public String getSubmitText() {
        return submitText;
    }

    public void setSubmitText(String submitText) {
        this.submitText = submitText;
    }

    public Object getUserCanFlairInSr() {
        return userCanFlairInSr;
    }

    public void setUserCanFlairInSr(Object userCanFlairInSr) {
        this.userCanFlairInSr = userCanFlairInSr;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCollapseDeletedComments() {
        return collapseDeletedComments;
    }

    public void setCollapseDeletedComments(Boolean collapseDeletedComments) {
        this.collapseDeletedComments = collapseDeletedComments;
    }

    public Object getUserHasFavorited() {
        return userHasFavorited;
    }

    public void setUserHasFavorited(Object userHasFavorited) {
        this.userHasFavorited = userHasFavorited;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public String getPublicDescriptionHtml() {
        return publicDescriptionHtml;
    }

    public void setPublicDescriptionHtml(String publicDescriptionHtml) {
        this.publicDescriptionHtml = publicDescriptionHtml;
    }

    public Boolean getSpoilersEnabled() {
        return spoilersEnabled;
    }

    public void setSpoilersEnabled(Boolean spoilersEnabled) {
        this.spoilersEnabled = spoilersEnabled;
    }

    public List<Integer> getIconSize() {
        return iconSize;
    }

    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    public String getAudienceTarget() {
        return audienceTarget;
    }

    public void setAudienceTarget(String audienceTarget) {
        this.audienceTarget = audienceTarget;
    }

    public Object getSuggestedCommentSort() {
        return suggestedCommentSort;
    }

    public void setSuggestedCommentSort(Object suggestedCommentSort) {
        this.suggestedCommentSort = suggestedCommentSort;
    }

    public Object getActiveUserCount() {
        return activeUserCount;
    }

    public void setActiveUserCount(Object activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getUserIsMuted() {
        return userIsMuted;
    }

    public void setUserIsMuted(Object userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    public Object getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public void setSubmitLinkLabel(Object submitLinkLabel) {
        this.submitLinkLabel = submitLinkLabel;
    }

    public Object getAccountsActive() {
        return accountsActive;
    }

    public void setAccountsActive(Object accountsActive) {
        this.accountsActive = accountsActive;
    }

    public Boolean getPublicTraffic() {
        return publicTraffic;
    }

    public void setPublicTraffic(Boolean publicTraffic) {
        this.publicTraffic = publicTraffic;
    }

    public List<Integer> getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(List<Integer> headerSize) {
        this.headerSize = headerSize;
    }

    public Integer getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    public Object getUserFlairCssClass() {
        return userFlairCssClass;
    }

    public void setUserFlairCssClass(Object userFlairCssClass) {
        this.userFlairCssClass = userFlairCssClass;
    }

    public String getSubmitTextLabel() {
        return submitTextLabel;
    }

    public void setSubmitTextLabel(String submitTextLabel) {
        this.submitTextLabel = submitTextLabel;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public Object getUserSrFlairEnabled() {
        return userSrFlairEnabled;
    }

    public void setUserSrFlairEnabled(Object userSrFlairEnabled) {
        this.userSrFlairEnabled = userSrFlairEnabled;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Object getUserIsModerator() {
        return userIsModerator;
    }

    public void setUserIsModerator(Object userIsModerator) {
        this.userIsModerator = userIsModerator;
    }

    public Object getIsEnrolledInNewModmail() {
        return isEnrolledInNewModmail;
    }

    public void setIsEnrolledInNewModmail(Object isEnrolledInNewModmail) {
        this.isEnrolledInNewModmail = isEnrolledInNewModmail;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUserFlairEnabledInSr() {
        return userFlairEnabledInSr;
    }

    public void setUserFlairEnabledInSr(Boolean userFlairEnabledInSr) {
        this.userFlairEnabledInSr = userFlairEnabledInSr;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    public Boolean getHideAds() {
        return hideAds;
    }

    public void setHideAds(Boolean hideAds) {
        this.hideAds = hideAds;
    }

    public Integer getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Integer createdUtc) {
        this.createdUtc = createdUtc;
    }

    public List<Integer> getBannerSize() {
        return bannerSize;
    }

    public void setBannerSize(List<Integer> bannerSize) {
        this.bannerSize = bannerSize;
    }

    public Object getUserIsContributor() {
        return userIsContributor;
    }

    public void setUserIsContributor(Object userIsContributor) {
        this.userIsContributor = userIsContributor;
    }

    public Boolean getAllowDiscovery() {
        return allowDiscovery;
    }

    public void setAllowDiscovery(Boolean allowDiscovery) {
        this.allowDiscovery = allowDiscovery;
    }

    public Boolean getAccountsActiveIsFuzzed() {
        return accountsActiveIsFuzzed;
    }

    public void setAccountsActiveIsFuzzed(Boolean accountsActiveIsFuzzed) {
        this.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
    }

    public String getAdvertiserCategory() {
        return advertiserCategory;
    }

    public void setAdvertiserCategory(String advertiserCategory) {
        this.advertiserCategory = advertiserCategory;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Boolean getLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    public void setLinkFlairEnabled(Boolean linkFlairEnabled) {
        this.linkFlairEnabled = linkFlairEnabled;
    }

    public Boolean getAllowImages() {
        return allowImages;
    }

    public void setAllowImages(Boolean allowImages) {
        this.allowImages = allowImages;
    }

    public Boolean getShowMediaPreview() {
        return showMediaPreview;
    }

    public void setShowMediaPreview(Boolean showMediaPreview) {
        this.showMediaPreview = showMediaPreview;
    }

    public Integer getCommentScoreHideMins() {
        return commentScoreHideMins;
    }

    public void setCommentScoreHideMins(Integer commentScoreHideMins) {
        this.commentScoreHideMins = commentScoreHideMins;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public String getSubmissionType() {
        return submissionType;
    }

    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    public Object getUserIsSubscriber() {
        return userIsSubscriber;
    }

    public void setUserIsSubscriber(Object userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
    }

}
