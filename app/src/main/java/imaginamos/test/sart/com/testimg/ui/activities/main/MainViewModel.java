package imaginamos.test.sart.com.testimg.ui.activities.main;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.support.annotation.NonNull;

import imaginamos.test.sart.com.testimg.data.managers.DataManager;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class MainViewModel extends AndroidViewModel {

    private DataManager dataManager;

    public MainViewModel(@NonNull Application application) {
        super(application);
        dataManager = DataManager.get();
    }

    public void getReddit() {
        dataManager.getRedditManager().getReddit();
    }
}
