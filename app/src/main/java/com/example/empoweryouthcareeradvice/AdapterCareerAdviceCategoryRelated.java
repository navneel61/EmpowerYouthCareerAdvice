package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AdapterCareerAdviceCategoryRelated extends RecyclerView.Adapter<AdapterCareerAdviceCategoryRelated.ViewHolder> {

    private final ArrayList<CareerAdviceCategoryModel> relatedList;
    private final int type;

    public AdapterCareerAdviceCategoryRelated(Context context, ArrayList<CareerAdviceCategoryModel> relatedList, int type)
    {
        this.relatedList=relatedList;
        this.type=type;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_career_advice_related,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CareerAdviceCategoryModel model=relatedList.get(position);
        if(type==0)
        {
            holder.imageViewC.setImageResource(model.getImage());
            holder.textViewTitle.setText(model.getTitle());
            holder.textViewDescription.setText(model.getDescription());
            Log.d("type0size", String.valueOf(relatedList.size()));
            holder.textViewRead.setVisibility(View.GONE);
        }
        else if(type==1)
        {
            holder.cardView.setVisibility(View.GONE);
            holder.cardViewRelated.setVisibility(View.VISIBLE);
            holder.imageViewRelated.setImageResource(model.getImage());
            holder.textViewTitleRelated.setText(model.getTitle());
        }
        else if(type==2)
        {
            holder.cardView.setVisibility(View.GONE);
            holder.cardViewRelated.setVisibility(View.VISIBLE);
            holder.imageViewRelated.setImageResource(model.getImage());
            holder.textViewTitleRelated.setText(model.getTitle());
            holder.textViewBlogDescription.setText(model.getDescription());
            holder.textViewReadArticle.setVisibility(View.GONE);
        }
        if(type==0 || type==1)
        {
            holder.cardViewRelated.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_careerAdviceSummaryFragments_self));
        }
        else
        {
            holder.cardViewRelated.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.action_blogSummaryFragment_self));
        }
    }

    @Override
    public int getItemCount() {
        return relatedList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        final ImageView imageViewRelated;
        final ImageView imageViewC;
        final TextView textViewDescription;
        final TextView textViewTitle;
        final TextView textViewRead;
        final TextView textViewTitleRelated;
        TextView textViewBlogDescription,textViewReadArticle;
        final CardView cardView;
        final CardView cardViewRelated;
        private ViewHolder(@NonNull View itemView) {

            super(itemView);
            imageViewC=itemView.findViewById(R.id.image_view);
            textViewDescription=itemView.findViewById(R.id.text_description);
            textViewTitle=itemView.findViewById(R.id.text_title);
            cardView=itemView.findViewById(R.id.cardview_read);
            cardViewRelated=itemView.findViewById(R.id.cardview_related);
            imageViewRelated=itemView.findViewById(R.id.image_view_related);
            textViewTitleRelated=itemView.findViewById(R.id.title_related);
            textViewRead=itemView.findViewById(R.id.read_articles);
            textViewBlogDescription=itemView.findViewById(R.id.datemonthyear);
            textViewReadArticle=itemView.findViewById(R.id.read_articles);
        }
    }
}
