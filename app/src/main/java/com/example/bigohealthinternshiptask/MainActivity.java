package com.example.bigohealthinternshiptask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.bigohealthinternshiptask.dataclass.City;
import com.example.bigohealthinternshiptask.dataclass.PatAppData;
import com.example.bigohealthinternshiptask.dataclass.PatId;
import com.example.bigohealthinternshiptask.dataclass.Response;
import com.example.bigohealthinternshiptask.dataclass.ResponseForPat;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<City> cities;
    private ImageView icon;
    private boolean selected;
    private View upper;
    private View lower;
    private RecyclerView app_view;
    private List<PatAppData> appList= new ArrayList<>();
    private AppointmentRecyclerViewAdapter appointmentRecyclerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences.Editor edit = this.getSharedPreferences("shared",0).edit();

        icon=findViewById(R.id.icon_c);

        FragmentManager fragmentManager;
        fragmentManager = getSupportFragmentManager();
        String token=BuildConfig.TOKEN;
        edit.putString("token",token);
        edit.apply();

        upper=findViewById(R.id.list_view);
        lower=findViewById(R.id.detail_view);
        app_view =findViewById(R.id.app_view);
        //ApiClient.getRetrofit();

        ListFragment listFragment= ListFragment.newInstance();
        listFragment.setMyListener(new ListFragment.OnListFragmentInteractionListener() {
            @Override
            public void onListFragmentInteraction(String s) {

                DoctorListFragment doctorListFragment= DoctorListFragment.newInstance(s);
                doctorListFragment.setMyListener(new DoctorListFragment.OnListFragmentInteractionListener() {
                    @Override
                    public void onListFragmentInteraction() {

                    }
                });
                FragmentTransaction Fragmenttransaction = fragmentManager.beginTransaction();
                Fragmenttransaction.replace(R.id.detail_view, doctorListFragment);
                Fragmenttransaction.commit();


            }
        });

        Picasso.get().load("https://www.vhv.rs/file/max/2/26550_appointment-icon-png.png").into(icon);
        selected=false;

        icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selected=!selected;
                if(selected){
                    Picasso.get().load("https://cdn4.iconfinder.com/data/icons/essentials-6/32/87-01-512.png").into((ImageView) v);
                    upper.setVisibility(View.GONE);
                    lower.setVisibility(View.GONE);
                    app_view.setVisibility(View.VISIBLE);
                }else{
                    Picasso.get().load("https://www.vhv.rs/file/max/2/26550_appointment-icon-png.png").into((ImageView) v);
                    lower.setVisibility(View.VISIBLE);
                    upper.setVisibility(View.VISIBLE);
                    app_view.setVisibility(View.GONE);
                }

            }
        });




        FragmentTransaction Fragmenttransaction = fragmentManager.beginTransaction();
        Fragmenttransaction.replace(R.id.list_view, listFragment);
        Fragmenttransaction.commit();

        appList.add(new PatAppData("https://bigohealth-images.s3.amazonaws.com/drmritunjaykumarsiwan.jpg","Dr. Mritunjay","Pediatrician"
                ,"qwertyui",56,"Beside HDFC Bank ATM Hospital Road, Siwan","18-90-1999","12pm"));

        app_view.setLayoutManager(new LinearLayoutManager(this));
        appointmentRecyclerViewAdapter =new AppointmentRecyclerViewAdapter(appList,this );
        app_view.setAdapter(appointmentRecyclerViewAdapter);



        ApiClientService apiClientService= ApiClient.getApiClientService(this);
        Call<ResponseForPat> call = apiClientService.getData(new PatId("eea33887-5b59-4fae-8a83-f80403b6a55c"));
        call.enqueue(new Callback<ResponseForPat>() {
            @Override
            public void onResponse(Call<ResponseForPat> call, retrofit2.Response<ResponseForPat> response) {
                if(response.body()!=null){
                    appList.clear();
                    appList.addAll(response.body().getData());
                    appointmentRecyclerViewAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<ResponseForPat> call, Throwable t) {

            }
        });







    }


}
