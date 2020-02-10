package com.example.empoweryouthcareeradvice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ResumeTipsHireActivity extends AppCompatActivity {

    ImageView imge;
    TextView txtTitle,txtSummary,txtComments;
    Button btn,btnComment;
    EditText comments;
    private RecyclerView recyclerView;
    String titleContent[]={"30 RESUME TIPS TO HELP YOU GET HIRED","5 RESUME RED FLAGS TO AVOID","8 Resume Tips from a Former Hiring Manager — Jessica DW | Bright Space Coaching","3 RESUME TIPS YOU HAVEN’T HEARD BEFORE ","Resume Tips: How to Grab the Recruiter's Attention","Resume Tips: How to Grab the Recruiter's Attention","Top 8 Tips from a Professional Resume Writer","17 Things to Delete from Your Resume [Effective Immediately] - ForwardThink Careers","Apply for Jobs Quickly and Easily | How to Write a Master Resume\n","How to Nail it in a Job Interview • The Work Life Blend - Make Money Around Your Family\n","25 Tricky Interview Questions and How to Answer Them"
            ,"How to Ace an Interview: 8 Expert Tips\n"};
    String mainContent[]={"30 Resume Tips to Help You Get Hired - Advice from a fortune 500 recruiter and career coach","Your resume is your first impression with an employer, so it better be a good one. Recruiters are trained to scan your resume in a matter of seconds looking for ",
            "As a former hiring manager, I’ve combed through hundreds of resumes and cover letters. I’m also the go-to person in my friends and family circle when someone",
            "There is a lot of advice on how to improve your resume and some of it is really great and useful (and some of it is really not). In today’s competitive job market, ",
            "The job market has never been so competitive as it is these days. Recruiters receive hundreds of resumes and don’t have the time to read each one of them carefully ",
            "When you are writing your resume, you focus on getting your information on one piece of paper in the best presentation possible, right? You are trying to make it ","We work pretty hard to make sure we’re up-to-date with our clothes and hairstyle. Heck, even keeping up with the latest food fads can take some work. (Kale/go","I knew telling hopeful sophomores searching for their summer internships and nervous graduating seniors looking for a half decent job that they needed to submit ","Let me guess, you hate job interviews (I mean, who doesn’t?)? You’ve applied for a fantastic job and you’re through to the next stage – congratulations!","Securing a job would be so much easier if you know the questions a hiring manager will ask in your next interview. Well, we’ll give you the next best thing: a","Yes, it's important to craft a strong, accurate resume but like it or not, most jobs are secured or lost in the interview stage. Don't let your job search ride","Getting a job offer is not just about your experience and qualifications, but how you present yourself as a whole package. Your experience and qualifications"};

    int img[]={R.drawable.r1,R.drawable.r2,R.drawable.r3,R.drawable.r4,R.drawable.r5,R.drawable.r6,R.drawable.r7,R.drawable.r8,R.drawable.r9,R.drawable.r10,R.drawable.r11,R.drawable.r12};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_tips_hire);
        imge=findViewById(R.id.imageView);
        txtTitle=findViewById(R.id.txtTitle);
        txtSummary=findViewById(R.id.textViewSummary);
        txtComments=findViewById(R.id.textViewComments);
        btn=findViewById(R.id.button);
        btnComment=findViewById(R.id.buttonComment);
        comments=findViewById(R.id.editText);
        recyclerView=findViewById(R.id.resumeRecyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        ArrayList<CareerAdviceCategoryModel> models=new ArrayList<>();
        for(int i=0;i<img.length;i++)
        {
            CareerAdviceCategoryModel model1=new CareerAdviceCategoryModel();
            model1.setDescription(mainContent[i]);
            model1.setImage(img[i]);
            model1.setTitle(titleContent[i]);
            models.add(model1);

        }
        AdapterCareerAdviceCategoryView resumeTipsAdapter=new AdapterCareerAdviceCategoryView(this,models);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(resumeTipsAdapter);
    }
}
