package imaginamos.test.sart.com.testimg;

import android.app.Application;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class App extends Application {

    private static App instance;
    public static App get() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

}
