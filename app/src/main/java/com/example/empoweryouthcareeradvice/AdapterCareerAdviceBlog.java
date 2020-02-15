package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterCareerAdviceBlog extends RecyclerView.Adapter<AdapterCareerAdviceBlog.ViewHolder>{

    private final ArrayList<CareerAdviceCategoryModel> blogs;
    int type;
    Context context;
    //final String title;
    //OnItemClick onItemClick;
    //NavController navController;

    public AdapterCareerAdviceBlog(Context context, ArrayList<CareerAdviceCategoryModel> blogs,int type)
    {    this.context=context;
        this.blogs=blogs;
        this.type=type;


    }


    @NonNull
    @Override
    public AdapterCareerAdviceBlog.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AdapterCareerAdviceBlog.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_blog_home,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (type == 0) {
            CareerAdviceCategoryModel model = blogs.get(position);
            holder.imageView.setImageResource(model.getImage());
            holder.textTitle.setText(model.getTitle());
        }
        if (type == 1) {
            if (position < 3) {
                CareerAdviceCategoryModel model = blogs.get(position);
                holder.imageView.setImageResource(model.getImage());
                holder.textTitle.setText(model.getTitle());
            }
            if (position == 3) {
                holder.containerView.setVisibility(View.INVISIBLE);
                holder.viewAllView.setVisibility(View.VISIBLE);
            }
        }
        holder.cardView.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.action_blogHomeFragment_to_blogSummaryFragment));
    }
    @Override
    public int getItemCount() {
        return type==0 ? blogs.size():4;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textTitle;
        ConstraintLayout containerView;
        RelativeLayout viewAllView;
        CardView cardView;



        ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageviewBlog);
            textTitle=itemView.findViewById(R.id.text_view_title_blog);
            containerView=itemView.findViewById(R.id.container_view);
            viewAllView=itemView.findViewById(R.id.viewAllView);
            cardView=itemView.findViewById(R.id.cardviewBlog);
        }
    }

}
