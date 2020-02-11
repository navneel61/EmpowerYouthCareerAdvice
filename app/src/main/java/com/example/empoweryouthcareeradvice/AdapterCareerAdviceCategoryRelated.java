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
    int type;

    public AdapterCareerAdviceCategoryRelated(Context context, ArrayList<CareerAdviceCategoryModel> coverLetterModels, int type)
    {
        this.context=context;
        this.coverLetterModels=coverLetterModels;
        Log.d("conssize", String.valueOf(this.coverLetterModels.size()));
        this.type=type;
    }

    @NonNull
    @Override
    public CoverLetters onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vie= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_related,parent,false);
        if(type==1)
        {

        }
        return new CoverLetters(vie);
    }

    @Override
    public void onBindViewHolder(@NonNull CoverLetters holder, int position) {
        CareerAdviceCategoryModel model=coverLetterModels.get(position);
        if(type==0)
        {
            holder.imageViewC.setImageResource(model.getImage());
            holder.textViewTitle.setText(model.getTitle());
            Log.d("titleis",model.getTitle());
            holder.textViewDescription.setText(model.getDescription());
            Log.d("type0size", String.valueOf(coverLetterModels.size()));
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
        return coverLetterModels.size();
    }

    public class CoverLetters extends RecyclerView.ViewHolder
    {
        ImageView imageViewRelated,imageViewC;
        TextView textViewDescription,textViewTitle,textViewRead,textViewTitleRelated,textViewDate;
        Button buttonRead;
        CardView cardView,cardViewRelated;
        ImageView imgRelatedAticles;
        TextView textViewRelatedArticleTitle;
        public CoverLetters(@NonNull View itemView) {

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
