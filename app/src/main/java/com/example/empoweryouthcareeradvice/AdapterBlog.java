package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterBlog extends RecyclerView.Adapter<AdapterBlog.ViewHolder> {
    private ArrayList<CareerAdviceCategoryModel> blogList;
    Context context;
    int type;
    AdapterBlog(Context context,ArrayList<CareerAdviceCategoryModel> blogList,int type)
    {
        this.context=context;
        this.blogList=blogList;
        this.type=type;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_blog,parent,false);
        return new AdapterBlog.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if(type==0)
        {
            CareerAdviceCategoryModel model=blogList.get(position);
            holder.imageView.setImageResource(model.getImage());
            holder.textView.setText(model.getTitle());
        }
        if(type==1)
        {
            if(position<3)
            {
                CareerAdviceCategoryModel model=blogList.get(position);
                holder.imageView.setImageResource(model.getImage());
                holder.textView.setText(model.getTitle());
            }
            if(position==3)
            {
                holder.containerView.setVisibility(View.INVISIBLE);
                holder.viewAllView.setVisibility(View.VISIBLE);
            }
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_blogHomeFragment_to_blogSummaryFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return type == 0 ? blogList.size() : 4;

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        ConstraintLayout containerView;
        RelativeLayout viewAllView;
        CardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image_view);
            textView=itemView.findViewById(R.id.text_view_title);
            containerView=itemView.findViewById(R.id.container_view);
            viewAllView=itemView.findViewById(R.id.viewAllView);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}
