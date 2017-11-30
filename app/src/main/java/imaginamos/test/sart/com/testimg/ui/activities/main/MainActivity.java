package imaginamos.test.sart.com.testimg.ui.activities.main;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import java.util.List;

import imaginamos.test.sart.com.testimg.R;
import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.ui.activities.base.BaseActivity;

public class MainActivity extends BaseActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    private MainViewModel mViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onPermissionsGranted() {
        setUp();
    }

    @Override
    protected void onLocationPermissionDenied() {

    }

    private void setUp() {
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        mViewModel.getLiveReddits().observe(this, new Observer<List<Reddit>>() {
            @Override
            public void onChanged(@Nullable List<Reddit> reddits) {
                if (reddits == null) {
                    Log.i(TAG, "onChanged: observer reddits == null");
                    return;
                }
                for (Reddit r : reddits) {
                    Log.i(TAG, "onChanged: observer redditId " + r.getId());
                }
            }
        });
    }
}
