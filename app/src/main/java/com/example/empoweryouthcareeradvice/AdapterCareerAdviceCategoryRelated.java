package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterCareerAdviceCategoryRelated extends RecyclerView.Adapter<AdapterCareerAdviceCategoryRelated.ViewHolder> {
    ArrayList<CareerAdviceCategoryModel> resumeModels=new ArrayList<>();
    Context context;
    int type;


    public AdapterCareerAdviceCategoryRelated(Context context, ArrayList<CareerAdviceCategoryModel> resumeModels, int type)
    {
        this.context=context;
        this.resumeModels=resumeModels;
        this.type=type;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vi= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_related,parent,false);
        return new ViewHolder(vi);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CareerAdviceCategoryModel model = resumeModels.get(position);

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_careerAdviceSummaryFragments_self);

            }
        });

        if(type==0)
        {
            holder.imageViewC.setImageResource(model.getImage());
            holder.textViewTitle.setText(model.getTitle());
            holder.textViewDescription.setText(model.getDescription());
            holder.textViewRead.setVisibility(View.GONE);
        }
        else if(type==1)
        {
            holder.cardView.setVisibility(View.GONE);
            holder.cardViewRelated.setVisibility(View.VISIBLE);
            holder.imageViewRelated.setImageResource(model.getImage());
            holder.textViewTitleRelated.setText(model.getTitle());
        }
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Navigation.findNavController(v).navigate(R.id.action_careerAdviceHomeFragment_to_careerAdviceSummaryFragments);
            }
        });
    }




    @Override
    public int getItemCount() {
        return resumeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageViewRelated,imageViewC;
        TextView textViewDescription,textViewTitle,textViewRead,textViewTitleRelated,textViewDate;
        Button buttonRead;
        CardView cardView,cardViewRelated;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            imageViewC=itemView.findViewById(R.id.image_view);
            textViewDescription=itemView.findViewById(R.id.text_description);
            textViewTitle=itemView.findViewById(R.id.text_title);
            buttonRead=itemView.findViewById(R.id.button_read);
            cardView=itemView.findViewById(R.id.cardview_read);
            cardViewRelated=itemView.findViewById(R.id.cardview_related);
            imageViewRelated=itemView.findViewById(R.id.image_view_related);
            textViewTitleRelated=itemView.findViewById(R.id.title_related);
            textViewDate=itemView.findViewById(R.id.datemonthyear);
            textViewRead=itemView.findViewById(R.id.read_articles);
        }

    }


}
