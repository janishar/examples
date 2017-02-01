package com.mindorks.loadmore.network.example.infiniteloadmorefromnetwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.mindorks.placeholderview.InfinitePlaceHolderView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements LoadMoreView.Callback {

    private InfinitePlaceHolderView mInfiniteView;

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mInfiniteView = (InfinitePlaceHolderView) findViewById(R.id.loadMoreView);
        setupView();
    }

    private void setupView() {
        mInfiniteView.setLoadMoreResolver(new LoadMoreView(this));
        onLoadMore();
    }

    /**
     * Api response for the list is being send from mocky.io
     * Call the api with page number for the real api call
     */
    @Override
    public void onLoadMore() {
        // simulation of 5 pages is done
        if (count++ == 5) {
            mInfiniteView.noMoreToLoad();
        }
        AndroidNetworking.post("http://www.mocky.io/v2/5891dd92100000ab1c198c95")
                .build()
                .getAsObjectList(InfiniteFeedInfo.class, new ParsedRequestListener<List<InfiniteFeedInfo>>() {
                    @Override
                    public void onResponse(List<InfiniteFeedInfo> response) {
                        if (response != null && response.size() > 0) {
                            for (InfiniteFeedInfo infiniteFeedInfo : response) {
                                mInfiniteView.addView(new ItemView(infiniteFeedInfo));
                            }
                        }
                        mInfiniteView.loadingDone();
                    }

                    @Override
                    public void onError(ANError anError) {

                    }
                });
    }
}
