package imaginamos.test.sart.com.testimg.data.preferences;

/**
 * Created by SergioAlejandro on 29/11/2017.
 */

public enum PreferencesKeys {

    FIRST_LOAD("firstLoad");

    private String value;

    PreferencesKeys(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
