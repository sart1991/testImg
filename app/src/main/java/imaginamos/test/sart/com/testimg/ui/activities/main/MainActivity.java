package imaginamos.test.sart.com.testimg.ui.activities.main;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import imaginamos.test.sart.com.testimg.R;
import imaginamos.test.sart.com.testimg.ui.activities.base.BaseActivity;

public class MainActivity extends BaseActivity {

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
        mViewModel.getReddit();
    }
}
