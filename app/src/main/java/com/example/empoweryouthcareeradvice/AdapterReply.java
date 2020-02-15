package com.example.empoweryouthcareeradvice;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterReply extends RecyclerView.Adapter<AdapterReply.ViewHolder> {
    ArrayList<CareerAdviceCategoryModel> models;
    public AdapterReply(ArrayList<CareerAdviceCategoryModel> models) {
        this.models=models;

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
        holder.imageView_usr.setImageResource(model.getImage());
        holder.textView_name.setText(model.getTitle());
        holder.textView_comment.setText(model.getDescription());
        holder.button_reply.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView_usr;
        TextView textView_name,textView_comment;
        TextView button_reply;
        RecyclerView recyclerView_reply;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView_usr=itemView.findViewById(R.id.imageview_user);
            textView_name=itemView.findViewById(R.id.textviewtitle);
            textView_comment=itemView.findViewById(R.id.textComment);
            button_reply=itemView.findViewById(R.id.buttonReply);
            recyclerView_reply=itemView.findViewById(R.id.repliesRecyclerView);
        }
    }
}
