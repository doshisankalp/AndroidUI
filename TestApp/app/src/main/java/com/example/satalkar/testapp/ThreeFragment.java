package com.example.satalkar.testapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;


/**
 * A simple {@link Fragment} subclass.
 */
public class ThreeFragment extends Fragment {

    WebView myWebView;
    public ThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_two, container, false);
        myWebView = (WebView) v.findViewById(R.id.webview);
        myWebView.loadUrl("https://www.lonelyplanet.com/china");
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.canScrollHorizontally(0);
//        myWebView.jav

        // Inflate the layout for this fragment
        return v;
    }

}
