package com.example.bigohealthinternshiptask;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DoctorDetailActivity extends AppCompatActivity {


    TextView name, fees, awards, add,time,about,pat_name,aw_age,fee_date;
    ImageView img;
    private TextView spec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        name = (TextView) findViewById(R.id.name_d);
        spec = (TextView) findViewById(R.id.spec);
        fees = (TextView) findViewById(R.id.fees);
        awards = (TextView) findViewById(R.id.award);
        time = (TextView) findViewById(R.id.time);
        add = (TextView) findViewById(R.id.address);
        about = (TextView) findViewById(R.id.desc);
        pat_name = (TextView) findViewById(R.id.view_p);
        aw_age = (TextView) findViewById(R.id.aw_age);
        fee_date = (TextView) findViewById(R.id.fee_date);
        img = findViewById(R.id.doc_img_d);

        Intent intent= getIntent();
        if(intent!=null&&"detail".equals(intent.getStringExtra("for"))){

            name.setText(intent.getStringExtra("name"));
            add.setText(intent.getStringExtra("add"));
            spec.setText(intent.getStringExtra("spec"));
            if("".equals(intent.getStringExtra("fees"))){
                fees.setText("N.A");
            }else{
                fees.setText(intent.getStringExtra("fees"));
            }
            awards.setText(intent.getStringExtra("award"));
            time.setText(intent.getStringExtra("time"));
            about.setText(intent.getStringExtra("about"));

            Picasso.get().load(intent.getStringExtra("img")).into(img);
        }
        if(intent!=null&&"app".equals(intent.getStringExtra("for"))) {


            name.setText(intent.getStringExtra("name"));
            spec.setText(intent.getStringExtra("spec"));
            add.setText(intent.getStringExtra("add"));
            awards.setText(intent.getStringExtra("age"));
            time.setText(intent.getStringExtra("time"));
            fees.setText(intent.getStringExtra("date"));
            pat_name.setText(intent.getStringExtra("pat_name"));
            aw_age.setText("Age");
            fee_date.setText("Date");


            Picasso.get().load(intent.getStringExtra("img")).into(img);
            about.setVisibility(View.GONE);


        }


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }
}
