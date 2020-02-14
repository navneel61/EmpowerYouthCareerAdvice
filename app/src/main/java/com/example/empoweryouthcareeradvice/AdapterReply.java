package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterReply extends RecyclerView.Adapter<AdapterReply.ViewHolder>{
    ArrayList<CareerAdviceCategoryModel> models;
    public AdapterReply(ArrayList<CareerAdviceCategoryModel> models) {
        this.models=models;
        Log.d("models", String.valueOf(models.size()));
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_reply,parent,false);
        return new AdapterReply.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CareerAdviceCategoryModel model=models.get(position);
        holder.imageView_usr_img.setImageResource(model.getImage());
        holder.textView_usr_name.setText(model.getTitle());
        holder.textView_usr_comment.setText(model.getDescription());
        holder.button_reply.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView_usr_img;
        TextView textView_usr_name,textView_usr_comment;
        TextView button_reply;
        RecyclerView recyclerView_reply;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_usr_img=itemView.findViewById(R.id.imageView_user_image);
            textView_usr_name=itemView.findViewById(R.id.user_name);
            textView_usr_comment=itemView.findViewById(R.id.user_comment);
            button_reply=itemView.findViewById(R.id.button_reply);
            recyclerView_reply=itemView.findViewById(R.id.recyclerView_reply_comment);
        }
    }
}
