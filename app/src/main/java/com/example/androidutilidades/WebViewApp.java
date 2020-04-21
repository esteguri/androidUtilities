package com.example.androidutilidades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_app);

        WebView webView = (WebView) findViewById(R.id.webViewApp);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://google.com");
    }
}
