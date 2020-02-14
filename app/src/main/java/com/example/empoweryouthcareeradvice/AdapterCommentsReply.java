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

public class AdapterCommentsReply extends RecyclerView.Adapter<AdapterCommentsReply.commentsreply>{
    Context context;
    ArrayList<CareerAdviceCategoryModel> modelList;
    View v;
    public AdapterCommentsReply(Context context,ArrayList<CareerAdviceCategoryModel> modelList) {
        this.context=context;
        this.modelList=modelList;
    }

    @NonNull
    @Override
    public commentsreply onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_reply,parent,false);
        return new AdapterCommentsReply.commentsreply(view);
    }

    @Override
    public void onBindViewHolder(@NonNull commentsreply holder, int position) {
        CareerAdviceCategoryModel model=modelList.get(position);
        holder.imageView_usr_img.setImageResource(model.getImage());
        holder.textView_usr_name.setText(model.getTitle());
        holder.textView_usr_comment.setText(model.getDescription());
        holder.button_reply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.recyclerView_reply.setVisibility(View.VISIBLE);
                ArrayList<CareerAdviceCategoryModel> modellist=new ArrayList<>();
                CareerAdviceCategoryModel model=new CareerAdviceCategoryModel();
                model.setImage(R.drawable.usrimg);
                model.setTitle("Ajay");
                model.setDescription("good");
                modellist.add(model);
                AdapterReply adapterReply=new AdapterReply(modellist);
                holder.recyclerView_reply.setAdapter(adapterReply);
            }
        });
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public class commentsreply extends RecyclerView.ViewHolder {
        ImageView imageView_usr_img;
        TextView textView_usr_name,textView_usr_comment;
        TextView button_reply;
        RecyclerView recyclerView_reply;
        public commentsreply(@NonNull View itemView) {
            super(itemView);
            imageView_usr_img=itemView.findViewById(R.id.imageView_user_image);
            textView_usr_name=itemView.findViewById(R.id.user_name);
            textView_usr_comment=itemView.findViewById(R.id.user_comment);
            button_reply=itemView.findViewById(R.id.button_reply);
            recyclerView_reply=itemView.findViewById(R.id.recyclerView_reply_comment);
        }
    }
}
