package imaginamos.test.sart.com.testimg.ui.activities.details;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import imaginamos.test.sart.com.testimg.R;
import imaginamos.test.sart.com.testimg.data.db.models.Reddit;

public class DetailsActivity extends AppCompatActivity {

    private static final String TAG = DetailsActivity.class.getSimpleName();

    private String redditId;
    private DetailsViewModel viewModel;
    private ImageView imgBanner;
    private TextView txtTitle, txtDescription;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        viewModel = ViewModelProviders.of(this).get(DetailsViewModel.class);
        setUp();
    }

    private void setUp() {
        checkIntentInfo();
        bindViews();
        initInfo();
    }

    private void checkIntentInfo() {
        Bundle bundle = getIntent().getExtras();
        String redditIdKey = RedditDetailsConstants.INTENT_EXTRA_REDDIT_ID.getKey();
        if (bundle != null) {
            if (bundle.containsKey(redditIdKey)) {
                redditId = bundle.getString(redditIdKey);
                return;
            }
        }
    }

    private void bindViews() {
        imgBanner = findViewById(R.id.imageView_detailsActivity_banner);
        txtTitle = findViewById(R.id.textView_detailsActivity_title);
        txtDescription = findViewById(R.id.textView_detailsActivity_description);
        webView = findViewById(R.id.webView_detailsActivity_description);
    }

    private Context getCurrentContext() {
        return this;
    }

    private void initInfo() {
        viewModel.getReddit(redditId).observe(this, new Observer<Reddit>() {
            @Override
            public void onChanged(@Nullable final Reddit reddit) {
                Log.i(TAG, "onChanged: redditId" + reddit.getId());
                if (!TextUtils.isEmpty(reddit.getBannerImg())) {
                    Picasso.with(getCurrentContext()).load(reddit.getBannerImg())
                                                     .fit().centerCrop().into(imgBanner);
                }
                String title = reddit.getHeaderTitle();
                if (title == null) title = reddit.getTitle();
                txtTitle.setText(title);
                String description = Html.fromHtml(reddit.getDescriptionHtml()).toString();
                txtDescription.setText(description);
                webView.loadData(description, "text/html", "utf-8");
            }
        });
    }
}
