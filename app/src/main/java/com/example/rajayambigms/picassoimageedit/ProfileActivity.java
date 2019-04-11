package com.example.rajayambigms.picassoimageedit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class ProfileActivity extends AppCompatActivity {


    CircleImageView circleImageView;
    Button button;
    String url ="http://blog.concretesolutions.com.br/wp-content/uploads/2015/04/Android1.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("PROFILE IMAGE");

        circleImageView = (CircleImageView)findViewById(R.id.circleImageView);
        button = (Button)findViewById(R.id.loadProfileBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Picasso.with(getApplicationContext())
                        .load(url)
                        .placeholder(R.drawable.placeholder)
                        .error(R.drawable.ic_error_black_24dp)
                        .into(circleImageView);

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
