package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.ButterKnife;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class CareerAdviceSummaryFragment extends Fragment {
    NavController navController;
    ImageView image;
    TextView textTitle,textSummary,textComments,textRelatedArticles,txtDescription;
    RecyclerView recyclerView;
    Button btnComment,btnOriginalArticle;
    EditText commentBox;
    String idtitle="";

    String titleContent[]={"30 RESUME TIPS TO HELP YOU GET HIRED","5 RESUME RED FLAGS TO AVOID","8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching","3 RESUME TIPS YOU HAVEN’T HEARD BEFORE ","Resume Tips: How to Grab the Recruiter's Attention","Resume Tips: How to Grab the Recruiter's Attention","Top 8 Tips from a Professional Resume Writer","17 Things to Delete from Your Resume [Effective Immediately] - ForwardThink Careers","Apply for Jobs Quickly and Easily | How to Write a Master Resume\n","How to Nail it in a Job Interview • The Work Life Blend - Make Money Around Your Family\n","25 Tricky Interview Questions and How to Answer Them"
            ,"How to Ace an Interview: 8 Expert Tips\n"};
    String mainContent[]={"30 Resume Tips to Help You Get Hired - Advice from a fortune 500 recruiter and career coach","Your resume is your first impression with an employer, so it better be a good one. Recruiters are trained to scan your resume in a matter of seconds looking for ",
            "As a former hiring manager, I’ve combed through hundreds of resumes and cover letters. I’m also the go-to person in my friends and family circle when someone",
            "There is a lot of advice on how to improve your resume and some of it is really great and useful (and some of it is really not). In today’s competitive job market, ",
            "The job market has never been so competitive as it is these days. Recruiters receive hundreds of resumes and don’t have the time to read each one of them carefully ",
            "When you are writing your resume, you focus on getting your information on one piece of paper in the best presentation possible, right? You are trying to make it ","We work pretty hard to make sure we’re up-to-date with our clothes and hairstyle. Heck, even keeping up with the latest food fads can take some work. (Kale/go","I knew telling hopeful sophomores searching for their summer internships and nervous graduating seniors looking for a half decent job that they needed to submit ","Let me guess, you hate job interviews (I mean, who doesn’t?)? You’ve applied for a fantastic job and you’re through to the next stage – congratulations!","Securing a job would be so much easier if you know the questions a hiring manager will ask in your next interview. Well, we’ll give you the next best thing: a","Yes, it's important to craft a strong, accurate resume but like it or not, most jobs are secured or lost in the interview stage. Don't let your job search ride","Getting a job offer is not just about your experience and qualifications, but how you present yourself as a whole package. Your experience and qualifications"};

    int img[]={R.drawable.r1,R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5,R.drawable.r6,R.drawable.r7,R.drawable.r8,R.drawable.r9,R.drawable.r10,R.drawable.r11,R.drawable.r12};


    public CareerAdviceSummaryFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_career_advice_summary, container, false);
        ButterKnife.bind(this, view);
        initviews(view);
        idtitle=getArguments().getString("ids");
        Log.d("idtitle",idtitle);
        return view;

    }
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        navController= Navigation.findNavController(view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));

    }
    public void initviews(View view){
        ArrayList<CareerAdviceCategoryModel> list=new ArrayList<>();

        CareerAdviceCategoryModel model1=new CareerAdviceCategoryModel();
        model1.setImage(R.drawable.r1);
        model1.setTitle("30 Resume Tips to help you get hired");
        list.add(model1);

        CareerAdviceCategoryModel model2=new CareerAdviceCategoryModel();
        model2.setImage(R.drawable.r2);
        model2.setTitle("5 RESUME RED FLAGS TO AVOID");
        list.add(model2);

        CareerAdviceCategoryModel model3=new CareerAdviceCategoryModel();
        model3.setImage(R.drawable.r3);
        model3.setTitle(" 8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching");
        list.add(model3);

        recyclerView = view.findViewById(R.id.summaryFragment).findViewById(R.id.resumeRecyclerView);
        image=view.findViewById(R.id.summaryFragment).findViewById(R.id.imageView);
        textTitle=view.findViewById(R.id.summaryFragment).findViewById(R.id.txtTitle);
        textSummary=view.findViewById(R.id.summaryFragment).findViewById(R.id.textViewSummary);
        btnOriginalArticle=view.findViewById(R.id.summaryFragment).findViewById(R.id.button);
        btnComment=view.findViewById(R.id.summaryFragment).findViewById(R.id.buttonComment);
        textComments=view.findViewById(R.id.summaryFragment).findViewById(R.id.textViewComments);
        commentBox=view.findViewById(R.id.summaryFragment).findViewById(R.id.editText);
        textRelatedArticles=view.findViewById(R.id.summaryFragment).findViewById(R.id.relatedArticles);
        txtDescription=view.findViewById(R.id.summaryFragment).findViewById(R.id.textViewDescription);
        image.setBackgroundResource(img[0]);
        textTitle.setText(titleContent[0]);
        txtDescription.setText(mainContent[0]);
        AdapterCareerAdviceCategoryRelated adapterCareerAdviceCategoryRelated=new AdapterCareerAdviceCategoryRelated(getActivity(),list,1);
        recyclerView.setAdapter(adapterCareerAdviceCategoryRelated);




    }
}
