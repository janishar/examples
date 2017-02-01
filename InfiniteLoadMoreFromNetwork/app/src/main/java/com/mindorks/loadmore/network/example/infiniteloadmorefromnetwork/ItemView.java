package com.mindorks.loadmore.network.example.infiniteloadmorefromnetwork;

import android.widget.TextView;

import com.androidnetworking.widget.ANImageView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;


/**
 * Created by janisharali on 24/08/16.
 */
@Layout(R.layout.load_more_item_view)
public class ItemView {

    @View(R.id.titleTxt)
    private TextView titleTxt;

    @View(R.id.captionTxt)
    private TextView captionTxt;

    @View(R.id.timeTxt)
    private TextView timeTxt;

    @View(R.id.imageView)
    private ANImageView anImageView;

    private InfiniteFeedInfo mInfo;

    public ItemView(InfiniteFeedInfo info) {
        mInfo = info;
    }

    @Resolve
    private void onResolved() {
        titleTxt.setText(mInfo.getTitle());
        captionTxt.setText(mInfo.getCaption());
        timeTxt.setText(mInfo.getTime());
        anImageView.setImageUrl(mInfo.getImageUrl());
    }
}
