package com.example.empoweryouthcareeradvice;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlogSummaryFragment extends Fragment {
    private RecyclerView recyclerView,recyclerViewComment,recyclerViewReply;
    Button btnComment;
    String[] chipnames={"HR","Human Resource","Strategic Role","Talent-Driven","Businesses","Talent","CEOs","Human resource Management","HR Manager","human Resource Planning","HR Meaning","human resource Development"};
    ChipGroup chipGroup;
    Chip chip;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_blog_summary,container,false);
        ButterKnife.bind(this, view);
        initviews(view);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerViewComment.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false));

    }

    public void initviews(View view)
    {
        chipGroup=view.findViewById(R.id.blog_summary).findViewById(R.id.chipgroup);
        ArrayList<CareerAdviceCategoryModel> list=new ArrayList<>();

        CareerAdviceCategoryModel model1=new CareerAdviceCategoryModel();
        model1.setImage(R.drawable.relatedblogfirst);
        model1.setTitle("How To Handle Being Bullied At Work");
        model1.setDescription("When we think of bullying, we tend to revert back to our");
        list.add(model1);

        CareerAdviceCategoryModel model2=new CareerAdviceCategoryModel();
        model2.setImage(R.drawable.relatedblogsecond);
        model2.setTitle("With Leadership Comes Great Responsibilty");
        model2.setDescription("When you take on the role of a leader, and put yourself ");
        list.add(model2);

        CareerAdviceCategoryModel model3=new CareerAdviceCategoryModel();
        model3.setImage(R.drawable.relatedblogthird);
        model3.setTitle(" Interview on HR Leaders Podcast");
        model3.setDescription("I had a great interview with Chris Rainey on his HR Leaders podcast. We covered a lot of topics, we talked about Employee");
        list.add(model3);

        recyclerView = view.findViewById(R.id.blog_summary).findViewById(R.id.recyclerView);
        recyclerViewComment=view.findViewById(R.id.blog_summary).findViewById(R.id.recyclerView_comment);
        btnComment=view.findViewById(R.id.blog_summary).findViewById(R.id.button_comment);

        ArrayList<CareerAdviceCategoryModel> modelList=new ArrayList<>();
        CareerAdviceCategoryModel model=new CareerAdviceCategoryModel();
        model.setImage(R.drawable.username);
        model.setTitle("Ajay");
        model.setDescription("good");
        modelList.add(model);
        btnComment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerViewComment.setVisibility(View.VISIBLE);

                AdapterCommentsReply adapterCommentsReply=new AdapterCommentsReply(getActivity(),modelList);
                recyclerViewComment.setAdapter(adapterCommentsReply);
            }
        });


        AdapterCareerAdviceCategoryRelated adapterCareerAdviceCategoryRelated=new AdapterCareerAdviceCategoryRelated(getActivity(),list,2);
        recyclerView.setAdapter(adapterCareerAdviceCategoryRelated);
        for(int i=0;i<chipnames.length;i++)
        {
            chip=new Chip(getContext());
            chip.setText(chipnames[i]);
            chipGroup.addView(chip);
        }
    }
}
