package developer.hussain.com.storybiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity3 extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        webView = (WebView)findViewById(R.id.webview);

        int position = getIntent().getIntExtra("story_key",0);

        if (position==0){
            webView.loadUrl("file:///android_asset/Usefull Websites.html");

        }else if (position==1){
            webView.loadUrl("file:///android_asset/Hussain.html");
        }

    }
}