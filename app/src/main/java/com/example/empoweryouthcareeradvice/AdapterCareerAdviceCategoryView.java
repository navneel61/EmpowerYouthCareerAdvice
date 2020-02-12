package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterCareerAdviceCategoryView extends RecyclerView.Adapter<AdapterCareerAdviceCategoryView.ViewHolder> {

   private final ArrayList<CareerAdviceCategoryModel> list;
    private final String title;
    public AdapterCareerAdviceCategoryView(Context contexts, ArrayList<CareerAdviceCategoryModel> list,String title) {
        this.list = list;
        this.title=title;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_category_view,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
            Bundle bundle = new Bundle();
            if (position != 3) {
                CareerAdviceCategoryModel model = list.get(position);
                holder.textTitle.setText(model.getTitle());
                holder.imageView.setImageResource(model.getImage());
            }
            if (position == 3) {
                holder.containerView.setVisibility(View.INVISIBLE);
                holder.viewAllView.setVisibility(View.VISIBLE);
            }
            holder.containerView.setOnClickListener(view -> {
                bundle.putInt("id", position);
                Log.d("position", String.valueOf(position));
                Navigation.findNavController(view).navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments, bundle);
            });
            holder.viewAllView.setOnClickListener(v -> {
                bundle.putString("idis", title);
                Navigation.findNavController(v).navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceViewAllFragment, bundle);
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
        @BindView(R.id.container_view)
        ConstraintLayout containerView;
        @BindView(R.id.viewAllView)
        RelativeLayout viewAllView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

    }
}
