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
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterCareerAdviceCategoryRelated extends RecyclerView.Adapter<AdapterCareerAdviceCategoryRelated.CoverLetters> {

    ArrayList<CareerAdviceCategoryModel> coverLetterModels;
    Context context;

    public AdapterCareerAdviceCategoryRelated(Context context, ArrayList<CareerAdviceCategoryModel> coverLetterModels)
    {
        this.context=context;
        this.coverLetterModels=coverLetterModels;
    }

    @NonNull
    @Override
    public CoverLetters onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_summary_related,parent,false);
        return new CoverLetters(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull CoverLetters holder, int position) {
        CareerAdviceCategoryModel model=coverLetterModels.get(position);
       holder.imageViewC.setImageResource(model.getImage());
        holder.textViewC.setText(model.getTitle());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(v).navigate(R.id.action_careerAdviceSummaryFragments_self);
            }
        });
    }

    @Override
    public int getItemCount() {
        return coverLetterModels.size();
    }

    public class CoverLetters extends RecyclerView.ViewHolder
    {
        ImageView imageView,imageViewC;
        TextView textView,textViewC,textViewRead;
        Button buttonRead;
        CardView cardView;
        ImageView imgRelatedAticles;
        TextView textViewRelatedArticleTitle;
        public CoverLetters(@NonNull View itemView) {

            super(itemView);
            imageViewC=itemView.findViewById(R.id.image_view);
            textView=itemView.findViewById(R.id.datemonthyear);
            textViewC=itemView.findViewById(R.id.text_title);
            cardView=itemView.findViewById(R.id.cardview_read);
            textViewRead=itemView.findViewById(R.id.text_view_read);
        }
    }
}
