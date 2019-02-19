package com.example.lavisha.retrofit;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class DetailActivity extends AppCompatActivity {
    TextView title,dateTournament,maxPart,Part,platform,prizeMoney,venue;
    ImageView image;
    MyResponse myResponse;
    ProgressDialog dialog;
    String tournamentid;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail_activity);

        title=findViewById(R.id.tvDetailTitle);
        dateTournament=findViewById(R.id.tvDetailtournament_date);
        maxPart=findViewById(R.id.tvDetailmax_participants);
        Part=findViewById(R.id.tvDetailparticipants);
        prizeMoney=findViewById(R.id.tvDetailprize_money);
        venue=findViewById(R.id.tvDetailtournament_venue);
        platform=findViewById(R.id.tvDetailplatform);
        image=findViewById(R.id.imgDetail);
        Button btnBack=findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        dialog = ProgressDialog.show(DetailActivity.this, "",
                "Loading. Please wait...", true);


        if(getIntent().hasExtra("ID"))
        {
            tournamentid = getIntent().getStringExtra("ID");
            Log.e("TAG",""+tournamentid);
        }


        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl("https://www.ultimatebattle.in")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrieveDataInterface retrieveDataInterface=retrofit.create(RetrieveDataInterface.class);
        Call<MyResponse> call=retrieveDataInterface.gettournamentDetail(tournamentid);
        call.enqueue(new Callback<MyResponse>() {
            @Override
            public void onResponse(Call<MyResponse> call, Response<MyResponse> response) {
                dialog.dismiss();
                myResponse=response.body();
                title.setText(myResponse.getData().getTitle());
                platform.setText(myResponse.getData().getPlatform());
                venue.setText(myResponse.getData().getTournamentVenue());
                prizeMoney.setText(myResponse.getData().getPrizeMoney());
                dateTournament.setText(myResponse.getData().getTournamentDate());
                Integer num=myResponse.getData().getMaxParticipants();
                String ans=num.toString();
                maxPart.setText(ans);
                Part.setText(myResponse.getData().getNoOfParticipants());
                Picasso.get().load(myResponse.getData().getImage()).into(image);
            }

            @Override
            public void onFailure(Call<MyResponse> call, Throwable t) {

                dialog.dismiss();
                Log.e("TAG","Failed");

            }
        });
    }
}
