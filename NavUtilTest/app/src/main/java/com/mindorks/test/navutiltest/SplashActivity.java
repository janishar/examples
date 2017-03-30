package com.mindorks.test.navutiltest;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by janisharali on 31/03/17.
 */

public class SplashActivity extends AppCompatActivity {

    public static Intent getStartIntent(Context context) {
        Intent intent = new Intent(context, HomeActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openNextActivity();
    }

    private void openNextActivity(){
        Uri data = this.getIntent().getData();
        if (data != null && data.isHierarchical()) {
            String uri = this.getIntent().getDataString();
            if (!handleDeepLink(uri)) {
                openDesiredActivity();
            }
        } else {
            // do the pre app launch preparations and then open the 1st screen according to the apps logic
            openDesiredActivity();
        }
    }

    private void openDesiredActivity() {
        HomeActivity.getStartIntent(this);
    }

    private boolean handleDeepLink(String uri) {

        if ("https://abc.xyz/sub".equals(uri)) {
            TaskStackBuilder.create(this)
                    .addNextIntentWithParentStack(SubActivity.getStartIntent(this))
                    .startActivities();
            return true;
        }

        if ("https://abc.xyz/sub/sub".equals(uri)) {
            TaskStackBuilder.create(this)
                    .addNextIntentWithParentStack(SubSubActivity.getStartIntent(this))
                    .startActivities();
            return true;
        }

        return false;
    }
}