package com.bkhust.dungnd.mapdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

public class CustomActivity extends AppCompatActivity {
    private Button btnSend;
    private ImageView ivView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_activity );

        initView();
        byte[] byteArray = getIntent().getByteArrayExtra("b");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        ivView.setImageBitmap(bmp);
    }

    private void initView() {
        btnSend = findViewById(R.id.btn_send);
        ivView = findViewById(R.id.img_view);
    }
}
