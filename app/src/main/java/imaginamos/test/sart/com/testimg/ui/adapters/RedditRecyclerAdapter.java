package imaginamos.test.sart.com.testimg.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import imaginamos.test.sart.com.testimg.R;
import imaginamos.test.sart.com.testimg.data.db.models.Reddit;

/**
 * Created by SergioAlejandro on 29/11/2017.
 */

public class RedditRecyclerAdapter extends
        RecyclerView.Adapter<RedditRecyclerAdapter.RedditViewHolder> {

    private List<Reddit> mReddits = new ArrayList<>();
    private RedditCardDelegate mCardDelegate;
    private Context mContext;

    public RedditRecyclerAdapter(RedditCardDelegate cardDelegate) {
        mCardDelegate = cardDelegate;
    }

    public void setRedditsList(List<Reddit> reddits) {
        mReddits = reddits;
        notifyDataSetChanged();
    }

    @Override
    public RedditViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mContext = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_reddit, parent, false);

        return new RedditViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RedditViewHolder holder, int position) {
        Reddit reddit = mReddits.get(position);
        String title = reddit.getHeaderTitle();
        if (title == null)
            title = reddit.getTitle();
        if (TextUtils.isEmpty(reddit.getIconImg())) {
            holder.imgRedditIcon.setImageResource(R.mipmap.ic_launcher);
        } else {
            Picasso.with(mContext).load(reddit.getIconImg())
                    .fit().centerInside().into(holder.imgRedditIcon);
        }

        holder.txtRedditTitle.setText(title);
        holder.txtRedditSubtitle.setText(reddit.getTitle());
        holder.txtRedditTopic.setText(reddit.getAudienceTarget());
    }

    @Override
    public int getItemCount() {
        return mReddits.size();
    }

    class RedditViewHolder extends RecyclerView.ViewHolder {

        ImageView imgRedditIcon;
        TextView txtRedditTitle;
        TextView txtRedditSubtitle;
        TextView txtRedditTopic;

        RedditViewHolder(View itemView) {
            super(itemView);
            bindViews(itemView);
        }

        private void bindViews(View v) {
            imgRedditIcon = v.findViewById(R.id.imageView_cardReddit_icon);
            txtRedditTitle = v.findViewById(R.id.textView_cardReddit_title);
            txtRedditSubtitle = v.findViewById(R.id.textView_cardReddit_subtitle);
            txtRedditTopic = v.findViewById(R.id.textView_cardReddit_topic);

            bindActions();
        }

        private void bindActions() {
            itemView.setOnClickListener(onClickCard);
        }

        private View.OnClickListener onClickCard = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCardDelegate.onClickCard(mReddits.get(getAdapterPosition()));
            }
        };
    }

    public interface RedditCardDelegate {

        void onClickCard(Reddit reddit);

    }
}
