package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerAdapter1 extends RecyclerView.Adapter<recyclerAdapter1.ViewHolder> {
    ArrayList<Model1> resumeModels=new ArrayList<>();
    Context context;
    int type;


    public recyclerAdapter1(Context context,ArrayList<Model1> resumeModels,int type)
    {
        this.context=context;
        this.resumeModels=resumeModels;
        this.type=type;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View vi= LayoutInflater.from(parent.getContext()).inflate(R.layout.resume,parent,false);
        return new ViewHolder(vi);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model1 model = resumeModels.get(position);

        holder.imageView_C.setBackgroundResource(model.getImage());
        holder.textView_C.setText(model.getTitle_Content());

         if(type==0) {

             holder.textView.setText(model.getText_Content());
             holder.btn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     context.startActivity(new Intent(context, ResumeTipsHireActivity.class));
                 }
             });
             holder.txtRelated.setVisibility(View.GONE);
         }
         else if(type==1){

            // holder.textView.setVisibility(View.GONE);
             holder.btn.setVisibility(View.GONE);
             holder.textView.setText("08-11-2019");



         }


    }

    @Override
    public int getItemCount() {
        return resumeModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView_C;
        TextView textView,textView_C,txtRelated;
        Button btn;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);

            imageView_C=itemView.findViewById(R.id.image_view);
            textView=itemView.findViewById(R.id.text_description);
            textView_C=itemView.findViewById(R.id.text_title);
            btn=itemView.findViewById(R.id.button_read);
            txtRelated=itemView.findViewById(R.id.txtRead);

        }
        private void setData(int imge,String text_Contents,String title_Content)
        {
            imageView_C.setImageResource(imge);
            textView.setText(text_Contents);
            textView_C.setText(title_Content);
        }
    }


}
