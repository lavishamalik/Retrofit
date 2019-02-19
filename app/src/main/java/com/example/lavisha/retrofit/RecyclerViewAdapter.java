package com.example.lavisha.retrofit;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    onItemClickListener onItemClickListener1;
    public RecyclerViewAdapter(ArrayList<Post> arrayList, Context context) {
        this.arrayList = arrayList;
        onItemClickListener1 = (onItemClickListener) context;
    }

    ArrayList<Post> arrayList;
    Context context;


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_row_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder,final int i) {
        Post data=arrayList.get(i);
        viewHolder.tvtitle.setText(data.getTitle());
        viewHolder.tvplatform.setText(data.getPlatform());
        viewHolder.tvdate.setText(data.getDate());
        Picasso.get().load(data.getImage()).into( viewHolder.image);
        viewHolder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onItemClickListener1 != null) {
                    onItemClickListener1.onItemClick(i, v);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvtitle,tvdate,tvplatform;
        ImageView image;
        LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvtitle=itemView.findViewById(R.id.tvTitle);
            tvplatform=itemView.findViewById(R.id.tvplatform);
            tvdate=itemView.findViewById(R.id.tvdate);
            image=itemView.findViewById(R.id.img);
            linearLayout=itemView.findViewById(R.id.linear_layout);
        }
    }

}
