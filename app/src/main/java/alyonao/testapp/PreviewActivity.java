package alyonao.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class PreviewActivity extends AppCompatActivity implements View.OnClickListener {

    private AdView mAdView;
    String val;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);

        Button btn1 = (Button) findViewById(R.id.button3);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button4);
        btn2.setOnClickListener(this);

        Intent intent = getIntent();
        val = intent.getStringExtra("page");

        btn1.setText("Article 1 from page " + val);
        btn2.setText("Article 2 from page " + val);

      //  MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713"); //test id
        mAdView = findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

        @Override
        public void onClick(View v){
        int a = 1;
        int b = 2;
            Intent intent = new Intent(PreviewActivity.this, ContentActivity.class);
            switch (v.getId()) {
                case R.id.button3:
                    intent.putExtra("page", "" + val);
                    intent.putExtra("article", "" + 1);
                    break;
                case R.id.button4:
                    intent.putExtra("page", "" + val);
                    intent.putExtra("article", "" + 2);
                    break;
            }
            startActivity(intent);

    }
}
