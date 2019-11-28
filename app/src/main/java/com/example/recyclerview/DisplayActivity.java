package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    ImageView circleImg;
    TextView tvname,tvphone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        circleImg=findViewById(R.id.imageView);
        tvname=findViewById(R.id.textView);
        tvphone=findViewById(R.id.textView2);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null)
        {
            circleImg.setImageResource(bundle.getInt("image"));
            tvname.setText(bundle.getString("name"));
            tvphone.setText(bundle.getString("phone"));
        }
    }
}
