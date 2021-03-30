package com.example.himawari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    String urlHimawari = "https://www.jma.go.jp/bosai/map.html#3/40.000/120.000&elem=vap&contents=himawari";
    String urlHimawariLandscape = "https://www.jma.go.jp/bosai/map.html#4/40.000/110.000&elem=vap&contents=himawari";
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        webview = (WebView) findViewById(R.id.webView1);

        //if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //    CookieManager.getInstance().removeAllCookies(null);
        //    CookieManager.getInstance().flush();
        //} else {
        //    CookieSyncManager cookieSyncMngr =
        //            CookieSyncManager.createInstance(getApplicationContext());
        //    cookieSyncMngr.startSync();
        //    CookieManager cookieManager = CookieManager.getInstance();
        //    cookieManager.removeAllCookie();
        //    cookieManager.removeSessionCookie();
        //    cookieManager.setAcceptCookie(true);
        //    cookieSyncMngr.stopSync();
        //    cookieSyncMngr.sync();
        //}


        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setCacheMode(WebSettings.LOAD_NO_CACHE);
        webview.getSettings().setSupportZoom(true);
        //webview.getSettings().setUseWideViewPort(false);
        //webview.getSettings().setLoadWithOverviewMode(false);
        //webview.setInitialScale(300);
        //webview.getSettings().setBuiltInZoomControls(true);
        //webview.getSettings().setDisplayZoomControls(false);
        //webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        //webview.getSettings().setPluginState(WebSettings.PluginState.ON);

        //webview.setVerticalScrollBarEnabled(true);
        //webview.setHorizontalScrollBarEnabled(true);
        //webview.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        //webview.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:86.0) Gecko/20100101 Firefox/86.0");
        //webview.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36 Edg/89.0.774.54");
        int orientation = getResources().getConfiguration().orientation;

        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            webview.loadUrl(urlHimawariLandscape);
        }

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            webview.loadUrl(urlHimawari);
        }
        //log();
        //webview.loadUrl(urlHimawari);
        //if (savedInstanceState == null) {
        //    log("savedInstanceState==null");
        //    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        //        url = urlHimawari;
        //    } else {
        //        url = urlMe;
        //    }
        //    webview.loadUrl(url);
        //} else {
        //    log("NOTsavedInstanceState==null");
        //}
    }
}