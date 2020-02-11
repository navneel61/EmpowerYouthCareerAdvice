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

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterCareerAdviceCategoryView extends RecyclerView.Adapter<AdapterCareerAdviceCategoryView.ViewHolder> {

    ArrayList<CareerAdviceCategoryModel> resumeModels;
    Context context,contexts;
    //OnItemClick onItemClick;
    //NavController navController;

    public AdapterCareerAdviceCategoryView(Context context,ArrayList<CareerAdviceCategoryModel> resumeModels)
    {
        this.context=context;
        this.resumeModels=resumeModels;

    }

   /* public AdapterCareerAdviceCategoryView(Context context,ArrayList<CareerAdviceCategoryModel> resumeModels,OnItemClick onItemClick)
    {
        this.context=context;
        this.resumeModels=resumeModels;
        this.onItemClick=onItemClick;

    }*/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_category_view,
                parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        if (position!=3){
            //holder.txtDescription.setText(model.getText_Content());
           // holder.buttonRead.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    context.startActivity(new Intent(context, ResumeTipsHireActivity.class));
//                }
//            });
            CareerAdviceCategoryModel model = resumeModels.get(position);
            holder.imageView.setBackgroundResource(model.getImage());
            holder.textTitle.setText(model.getTitle());

        }
        if (position == 3){
            holder.containerView.setVisibility(View.INVISIBLE);
            holder.viewAllView.setVisibility(View.VISIBLE);
        }
        holder.containerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CareerAdviceCategoryModel model = resumeModels.get(position);

                Bundle bundle=new Bundle();
                bundle.putInt("id",position);


                Navigation.findNavController(view).navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments,bundle);
            }
        });

        holder.viewAllView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CareerAdviceCategoryModel model = resumeModels.get(position);

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
        TextView txtDescription;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
         }
    }

}
