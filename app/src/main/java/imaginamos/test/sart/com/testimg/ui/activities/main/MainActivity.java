package imaginamos.test.sart.com.testimg.ui.activities.main;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.List;

import imaginamos.test.sart.com.testimg.R;
import imaginamos.test.sart.com.testimg.data.db.models.Reddit;
import imaginamos.test.sart.com.testimg.ui.activities.base.BaseActivity;
import imaginamos.test.sart.com.testimg.ui.activities.details.DetailsActivity;
import imaginamos.test.sart.com.testimg.ui.activities.details.RedditDetailsConstants;
import imaginamos.test.sart.com.testimg.ui.adapters.RedditRecyclerAdapter;

public class MainActivity extends BaseActivity implements RedditRecyclerAdapter.RedditCardDelegate {

    private static final String TAG = MainActivity.class.getSimpleName();

    private MainViewModel mViewModel;
    private RecyclerView mRecyclerReddits;
    private RedditRecyclerAdapter mRedditRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        setUp();
    }

    private void setUp() {
        bindViews();
        confViews();
        initInformation();
    }

    private void bindViews() {
        mRecyclerReddits = findViewById(R.id.recyclerView_mainActivity_reddits);
    }

    private void confViews() {
        LinearLayoutManager llm = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false);
        mRecyclerReddits.setLayoutManager(llm);
        mRedditRecyclerAdapter = new RedditRecyclerAdapter(this);
        mRecyclerReddits.setAdapter(mRedditRecyclerAdapter);
    }

    private void initInformation() {
        mViewModel.getLiveReddits().observe(this, new Observer<List<Reddit>>() {
            @Override
            public void onChanged(@Nullable List<Reddit> reddits) {
                if (reddits == null) {
                    Log.i(TAG, "onChanged: observer reddits == null");
                    return;
                }
                mRedditRecyclerAdapter.setRedditsList(reddits);
            }
        });
    }

    @Override
    public void onClickCard(Reddit reddit) {
        Intent intentRedditDetail = new Intent(this, DetailsActivity.class);
        intentRedditDetail.putExtra(RedditDetailsConstants.INTENT_EXTRA_REDDIT_ID.getKey(),
                                    reddit.getId());
        startActivity(intentRedditDetail);
    }
}
