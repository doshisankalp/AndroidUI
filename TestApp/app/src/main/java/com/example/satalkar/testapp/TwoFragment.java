package com.example.satalkar.testapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class TwoFragment extends Fragment {

    WebView myWebView;


    public TwoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_two, container, false);
        myWebView = (WebView) v.findViewById(R.id.webview);
        myWebView.loadUrl("https://en.wikipedia.org/wiki/China");
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.setHorizontalScrollBarEnabled(false);

//        myWebView.jav

        // Inflate the layout for this fragment
        return v;
    }


}
