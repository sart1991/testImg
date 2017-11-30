package imaginamos.test.sart.com.testimg.ui.activities.details;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.data.managers.DataManager;

/**
 * Created by SergioAlejandro on 29/11/2017.
 */

public class DetailsViewModel extends ViewModel {

    private DataManager dataManager;

    public DetailsViewModel() {
        dataManager = DataManager.get();
    }

    public LiveData<Reddit> getReddit(String id) {
        return dataManager.getRedditManager().getLiveReddit(id);
    }

}
