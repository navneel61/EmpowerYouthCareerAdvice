package com.example.empoweryouthcareeradvice;

import android.content.Context;
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
    private ArrayList<CareerAdviceCategoryModel> resumeModels;
    private final int type;


    public AdapterCareerAdviceCategoryRelated(Context context, ArrayList<CareerAdviceCategoryModel> resumeModels, int type)
    {
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
        else if(type==2) {

            holder.cardView.setVisibility(View.GONE);
            holder.cardViewRelated.setVisibility(View.VISIBLE);
            holder.imageViewRelated.setImageResource(model.getImage());
            holder.textViewTitleRelated.setText(model.getTitle());
            holder.textViewBlogDescription.setText(model.getDescription());
            holder.textViewReadArticle.setVisibility(View.GONE);
        }
        if(type==0|| type==1)
             holder.cardViewRelated.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_careerAdviceSummaryFragments_self));
        else
            holder.cardViewRelated.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_blogSummaryFragment_to_self));
    }




    @Override
    public int getItemCount() {
        return resumeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        final ImageView imageViewRelated;
        final ImageView imageViewC;
        final TextView textViewDescription;
        final TextView textViewTitle;
        final TextView textViewRead;
        final TextView textViewTitleRelated;
        final TextView textViewDate;
        final Button buttonRead;
        final CardView cardView;
        final TextView textViewBlogDescription,textViewReadArticle;

        final CardView cardViewRelated;

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
            textViewBlogDescription=itemView.findViewById(R.id.datemonthyear);
            textViewReadArticle=itemView.findViewById(R.id.read_articles);
        }

    }


}
