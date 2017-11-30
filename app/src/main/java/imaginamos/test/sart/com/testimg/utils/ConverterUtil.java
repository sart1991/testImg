package imaginamos.test.sart.com.testimg.utils;

import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.data.networking.models.RedditChildDataRes;

/**
 * Created by SergioAlejandro on 30/11/2017.
 */

public class ConverterUtil {

    private ConverterUtil() {}

    public static Reddit convert(RedditChildDataRes redditChildDataRes) {
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
