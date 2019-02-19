package com.example.lavisha.retrofit;

import android.app.DownloadManager;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class    MainActivity extends AppCompatActivity implements onItemClickListener{
    private RecyclerView recyclerView;
    private ArrayList<Post> data=new ArrayList<>();
    private RecyclerViewAdapter adapter;
    ProgressDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }
    private void initViews(){
        dialog = ProgressDialog.show(MainActivity.this, "",
                "Loading. Please wait...", true);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        loadJSON();
    }

    private void loadJSON() {
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.ultimatebattle.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrieveDataInterface request = retrofit.create(RetrieveDataInterface.class);
        Call<JSONResponse>res=request.getJSON();
        res.enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {
                dialog.dismiss();
                JSONResponse jsonResponse = response.body();
                data = new ArrayList<>(Arrays.asList(jsonResponse.getPosts()));
                adapter = new RecyclerViewAdapter(data,MainActivity.this);
                recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call< JSONResponse> call, Throwable t) {
                Log.e("TAG","Failed");
            }
        });
    }


    @Override
    public void onItemClick(int position, View V) {
        String id1=data.get(position).getId();
        Intent intent=new Intent(MainActivity.this,DetailActivity.class);
        intent.putExtra("ID",id1);
        startActivity(intent);
    }
}
