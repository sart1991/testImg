package imaginamos.test.sart.com.testimg.ui.activities.base;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import imaginamos.test.sart.com.testimg.R;


/**
 * Created by sart1 on 11/27/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private AlertDialog mRationaleLocationPermissionsDialog;

    private boolean mIsInternetPermissionGranted = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUp();
        requestInternetPermissions();
    }

    private void setUp() {
        bindViews();
    }

    private void bindViews() {
        mRationaleLocationPermissionsDialog = makeRationaleInternetPermissionsDialog();
    }

    private void requestInternetPermissions() {

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET)
                != PackageManager.PERMISSION_GRANTED) {
            mRationaleLocationPermissionsDialog.show();
            mIsInternetPermissionGranted = false;
        } else {
            mIsInternetPermissionGranted = true;
        }
    }

    private AlertDialog makeRationaleInternetPermissionsDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.permissionsInternet_rationale_title);
        builder.setMessage(R.string.permissionsInternet_rationale_content);
        builder.setPositiveButton(R.string.permissionsInternet_rationale_positiveButton,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        return builder.create();
    }

    protected boolean isInternetPermissionGrantes() {
        return mIsInternetPermissionGranted;
    }
}
