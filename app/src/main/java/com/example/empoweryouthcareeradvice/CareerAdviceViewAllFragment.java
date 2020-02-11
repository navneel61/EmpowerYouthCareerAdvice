package com.example.empoweryouthcareeradvice;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class CareerAdviceViewAllFragment extends Fragment {

    NavController navController;
    ImageView imageView1;
    TextView textView1;
    TextView textViews1;
    Button button1;
    RecyclerView recyclerView;
    String[] titlesContent={"5 Easy Steps to Writing a Cover Letter","How To Write A Cover Letter","One Common Cover Letter Mistake to Avoid | My Secret Tip to Fix It","What to Write when Emailing a Resume - Perfectly Employed","7 tips for a beautiful authentic cover letter","7 SECRETS FOR WRITING THE PERFECT COVER LETTER","How to Write a Great Cover Letter in 6 Steps","How to Write a Brilliant Cover Letter | Life with Caitlyn","HOW TO QUICKLY WRITE A KILLER COVER LETTER","\n" +
            "How to Write a Cover Letter (With \"No\" Experience)"};
    String[] mainsContent={"Writing a cover letter doesn't have to be so difficult. Here, we break down the cover letter into 5 sections to make sure you impress that recruiter.","Knowing how to write a cover letter will make the difference between landing a job interview or not. Although not all job postings require a cover letter, se","When I was working in Career Services, the thing I got the most questions about was cover letters. No one seemed to know why they needed one, if they needed one","Applying for jobs can be awkward, especially when companies ask for an application process that feels disjointed. We often see employers ask for applicants to e","If you’re not comfortable tooting your own horn, writing a cover letter can be even worse than crafting a beautiful resume- telling your future employer why t","Do recruiters and hiring managers read cover letters today? Absolutely! The reason cover letters get such a bad reputation is because most job seekers don’t t","Your cover letter is an opportunity to impress. Get it right and a hiring manager will open your beautifully crafted resume with relish and a sense of optimism."
            ,"I had no idea what a cover letter was until about a month into my first semester of college when I went to apply to be an orientation leader. Then I was scrambl","As a professional resume writer, you’d think that writing a killer cover letter would come easily to me. Yet, I regularly dreaded having to sit down and write","By the time you’re looking for your first job that requires a cover letter, you’re likely at least 18 years old. In 18 years, you have acquired applicable e"};
    Integer[] imgProfile={R.drawable.coverbasic,R.drawable.coversecond,R.drawable.images,R.drawable.resumewriting,R.drawable.coverletterthree,R.drawable.writecoverlettertwo,R.drawable.writecoverletterthree,R.drawable.brilliantcoverletter,R.drawable.killcover,R.drawable.careerexperience};
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_career_advice_view_all, container, false);
        ButterKnife.bind(this, view);
        initViewCategory1(view);
        return view;
    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
    }
    private void  initViewCategory1(View view)
    {
       // imageView1=view.findViewById(R.id.cat1).findViewById(R.id.imageView_content);
      //  textView1=view.findViewById(R.id.cat1).findViewById(R.id.textView_title);
       // textViews1=view.findViewById(R.id.cat1).findViewById(R.id.textView_content);
      //  button1=view.findViewById(R.id.cat1).findViewById(R.id.button_read);
        recyclerView=view.findViewById(R.id.recyclerView);
        ArrayList<CareerAdviceCategoryModel> models=new ArrayList<>();
        for(int i=0;i<titlesContent.length;i++)
        {
            CareerAdviceCategoryModel model=new CareerAdviceCategoryModel();
            model.setImage(imgProfile[i]);
            model.setTitle(titlesContent[i]);
            model.setDescription(mainsContent[i]);
            models.add(model);
        }
        AdapterCareerAdviceCategoryRelated adapterCareerAdviceCategoryRelated =new AdapterCareerAdviceCategoryRelated(getActivity(),models,0);
        recyclerView.setAdapter(adapterCareerAdviceCategoryRelated);

      //  imageView1.setImageResource(imgProfile[0]);
      //  textView1.setText(titlesContent[0]);
      //  textViews1.setText(mainsContent[0]);
    }
}
