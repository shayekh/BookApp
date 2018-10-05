package com.example.android.bookapp;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class BookLoader extends AsyncTaskLoader<List<Book>> {
    private static final String LOG_TAG = BookLoader.class.getName();

    private String mUrl;
    public BookLoader(Context context,String url) {
        super(context);
        mUrl=url;
    }
    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG,"start loading");
        forceLoad();
    }

    @Override
    public List<Book> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        Log.i(LOG_TAG,"loadInBackground");
       // Button b = (Button) findViewById(R.id.button);

        // Perform the network request, parse the response, and extract a list of earthquakes.
        List<Book> result = Utils.fetchEarthquakeData(mUrl);
        return result;
    }
}
