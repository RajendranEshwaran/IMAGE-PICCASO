package com.example.rajayambigms.picassoimageedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.net.URL;

public class ImgLoadActivity extends AppCompatActivity {


    ImageView imageView;
    Button button;
    String url ="https://www.thecrazyprogrammer.com/wp-content/uploads/2015/07/The-Crazy-Programmer.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_img_load);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("LOAD IMAGE");


        imageView = (ImageView)findViewById(R.id.loadImgView);
        button = (Button)findViewById(R.id.loadBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Picasso.with(getApplicationContext())
                        .load(url)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.ic_error_black_24dp)
                        .into(imageView);


            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id == android.R.id.home)
        {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
