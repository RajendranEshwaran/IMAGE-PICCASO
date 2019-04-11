package com.example.rajayambigms.picassoimageedit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button loadBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loadBtn = (Button)findViewById(R.id.optBtn7);

    }

    public void gotoLoadActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ImgLoadActivity.class);
        startActivity(intent);
    }

    public void gotoProfileActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ProfileActivity.class);
        startActivity(intent);
    }

    public void gotoDownloadActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,DownloadActivity.class);
        startActivity(intent);
    }

    /*public void gotoLoadActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ImgLoadActivity.class);
        startActivity(intent);
    }

    public void gotoLoadActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ImgLoadActivity.class);
        startActivity(intent);
    }

    public void gotoLoadActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ImgLoadActivity.class);
        startActivity(intent);
    }

    public void gotoLoadActivity(View view)
    {
        Intent intent = new Intent(MainActivity.this,ImgLoadActivity.class);
        startActivity(intent);
    }*/
}
