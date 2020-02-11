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
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterCareerAdviceCategoryView extends RecyclerView.Adapter<AdapterCareerAdviceCategoryView.ViewHolder> {

   private ArrayList<CareerAdviceCategoryModel> list;
   private Context contexts;


    public AdapterCareerAdviceCategoryView(Context contexts, ArrayList<CareerAdviceCategoryModel> list) {
        this.contexts = contexts;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_category_view,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        if (position != 3) {
            CareerAdviceCategoryModel model = list.get(position);
            holder.textTitle.setText(model.getTitle());
            holder.imageView.setImageResource(model.getImage());
        }
        if (position == 3) {
            holder.containerView.setVisibility(View.INVISIBLE);
            holder.viewAllView.setVisibility(View.VISIBLE);
        }
        holder.containerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Navigation.findNavController(view).navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments);
            }
        });
        holder.viewAllView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceViewAllFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.image_view)
        ImageView imageView;
        @BindView(R.id.text_title)
        TextView textTitle;
        @BindView(R.id.button_read)
        TextView buttonRead;
        @BindView(R.id.container_view)
        ConstraintLayout containerView;
        @BindView(R.id.cardViewAll)
        CardView cardViewAll;
        @BindView(R.id.viewAllView)
        RelativeLayout viewAllView;
        @BindView(R.id.text_description)
        TextView textViewDescription;
        @BindView(R.id.text_view_all)
        TextView textViewAll;
        @BindView(R.id.imageViewAll)
        ImageView imageViewAll;


        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);

        }

    }
}
