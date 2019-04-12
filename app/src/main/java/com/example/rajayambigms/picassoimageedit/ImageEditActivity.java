package com.example.rajayambigms.picassoimageedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageEditActivity extends AppCompatActivity {

    ImageView imageView;
    Button button;
    String url ="https://wallpapershome.com/images/pages/ico_h/21013.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_edit);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("EDIT IMAGE");

        imageView = (ImageView)findViewById(R.id.oriImageView);
        button = (Button)findViewById(R.id.editBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Picasso.with(getApplicationContext())
                        .load(url)
                        .resize(200,200)
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
