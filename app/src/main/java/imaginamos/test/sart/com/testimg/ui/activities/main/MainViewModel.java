package imaginamos.test.sart.com.testimg.ui.activities.main;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.data.managers.DataManager;

/**
 * Created by SergioAlejandro on 28/11/2017.
 */

public class MainViewModel extends ViewModel {

    private DataManager dataManager;
    private LiveData<List<Reddit>> liveRedditsList;

    public MainViewModel() {
        dataManager = DataManager.get();
        initializeData();
    }

    private void initializeData() {
        dataManager.getRedditManager().downloadAndSaveReddits();
        liveRedditsList = dataManager.getRedditManager().getLiveReddits();
    }

    public LiveData<List<Reddit>> getLiveReddits() {
        return liveRedditsList;
    }
}
