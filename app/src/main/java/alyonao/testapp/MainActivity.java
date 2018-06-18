package alyonao.testapp;

import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AdView mAdView;
    ConstraintLayout llMain;
    int wrapContent = ConstraintLayout.LayoutParams.WRAP_CONTENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713"); //test id
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(this);

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
    }

        @Override
        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this, PreviewActivity.class);
            switch (v.getId()) {
                case R.id.button:
                    intent.putExtra("page", "" + 1);
                    break;
                case R.id.button2:
                    intent.putExtra("page", "" + 2);
                    break;
            }
            startActivity(intent);
        }
     /*   //adding layout's elements
        llMain = (ConstraintLayout) findViewById(R.id.llMain);
        ConstraintLayout.LayoutParams lParams = new ConstraintLayout.LayoutParams(
                wrapContent, wrapContent);
        Button btnNew = new Button(this);
        btnNew.setText("Page 1");
        btnNew.setGravity(Gravity.LEFT);
        //btnNew.setId(btnNew.ge);
        llMain.addView(btnNew, lParams);
        btnNew = (Button) findViewById(R.id.) */

}
