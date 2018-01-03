package com.cyw.a2018010302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

        WebView wv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv1=(WebView)findViewById(R.id.webView);
        wv1.setWebViewClient(new WebViewClient());
        //wv1.setWebChromeClient(new WebChromeClient());
        //開啟javascript功能才能看更多內容
        wv1.getSettings().setJavaScriptEnabled(true);
        //wv1.loadUrl("http://www.youtube.com");
        //1.利用youtube影片上分享=>內嵌的code貼到data裡  2.放自己html網頁
        wv1.loadData("<iframe width=\"380\" height=\"215\" src=\"https://www.youtube.com/embed/48hoGzws_XE\" frameborder=\"0\" gesture=\"media\" allow=\"encrypted-media\" allowfullscreen></iframe>","text/html; charset=UTF-8",null);
    }
}
