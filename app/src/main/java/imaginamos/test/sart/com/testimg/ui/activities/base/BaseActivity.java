package imaginamos.test.sart.com.testimg.ui.activities.base;

import android.Manifest;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import imaginamos.test.sart.com.testimg.R;


/**
 * Created by sart1 on 11/27/2017.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private static final int REQUEST_INTERNET_PERMISSION = 1054;

    private AlertDialog mRationaleLocationPermissionsDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViews();
        requestInternetPermissions();
    }

    protected void bindViews() {
        mRationaleLocationPermissionsDialog = makeRationaleInternetPermissionsDialog();
    }

    private void requestInternetPermissions() {
        String internetPermission = Manifest.permission.INTERNET;
        String[] permissions = new String[] {internetPermission};

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, permissions, REQUEST_INTERNET_PERMISSION);
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
                        requestInternetPermissions();
                    }
                });
        return builder.create();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case REQUEST_INTERNET_PERMISSION:
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    onPermissionsGranted();
                } else {
                    if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                                                                            permissions[0])) {
                        mRationaleLocationPermissionsDialog.show();
                    } else {
                        onLocationPermissionDenied();
                    }
                }
                break;
        }
    }

    protected abstract void onPermissionsGranted();

    protected abstract void onLocationPermissionDenied();
}
