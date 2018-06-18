package alyonao.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    private ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
//check if extras is not null
        if (extras!=null) {
            String page = (String) extras.get("page");
            String article = (String) extras.get("article");
            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText("Page " + page + " article "+ article + " ");

            mImageView = (ImageView) findViewById(R.id.imageView1);

            if (page.equalsIgnoreCase("1"))
                switch (article){
                    case "1":
                        mImageView.setImageResource(R.drawable.catboxicon);
                        break;
                    case "2":
                        mImageView.setImageResource(R.drawable.g14578489bdcf15c);
                        break;
                }

            if (page.equalsIgnoreCase("2"))
                switch (article){
                    case "1":
                        mImageView.setImageResource(R.drawable.cosmogirlicon);
                        break;
                    case "2":
                        mImageView.setImageResource(R.drawable.linuxicon);
                        break;
                }
        }
    //    String page = intent.getStringExtra("page");
     //   String article = intent.getStringExtra("article");

    }
}
