package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterCommentsReply extends RecyclerView.Adapter<AdapterCommentsReply.ViewHolder> {

    ArrayList<CareerAdviceCategoryModel> models;
    Context context;



   public AdapterCommentsReply(Context context,ArrayList<CareerAdviceCategoryModel> models)
    {
        this.context=context;
        this.models=models;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_comment_reply,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

            CareerAdviceCategoryModel model=models.get(position);
        holder.imageView.setBackgroundResource(model.getImage());
        holder.txtPerson.setText(model.getTitle());
        holder.txtComment.setText(model.getDescription());
            models.add(model);
            holder.btnReply.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    holder.recyclerViewReply.setVisibility(View.VISIBLE);

                    ArrayList<CareerAdviceCategoryModel> modellist=new ArrayList<>();
                    CareerAdviceCategoryModel model=new CareerAdviceCategoryModel();
                    model.setImage(R.drawable.username);
                    model.setTitle("Ajay");
                    model.setDescription("good");
                    modellist.add(model);
                    AdapterReply adapterReply=new AdapterReply(modellist);
                    holder.recyclerViewReply.setAdapter(adapterReply);

                }
            });
    }

    @Override
    public int getItemCount() {
       return models.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtPerson,txtComment;
        TextView btnReply;
        RecyclerView recyclerViewReply;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview_user);
            txtPerson=itemView.findViewById(R.id.textviewtitle);
            txtComment=itemView.findViewById(R.id.textComment);
            btnReply=itemView.findViewById(R.id.buttonReply);
            recyclerViewReply=itemView.findViewById(R.id.repliesRecyclerView);
        }
    }

}
