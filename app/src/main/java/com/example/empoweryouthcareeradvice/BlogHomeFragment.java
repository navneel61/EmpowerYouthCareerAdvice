package com.example.empoweryouthcareeradvice;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlogHomeFragment extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    ProgressBar progressBar;
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4;
    private TextView textView1;
    private ImageView imageView;
    View container1;
    private final String[] featuredBlogList = {"Should HR have a seat at the strategic table?", "3 Keys To Starting a Business with Student Loan Debt", "How to Get Ahead in the Business World", "5 Things I Wish I’d Known Before Becoming a Leader", "4 Simple Things That You Can Do To Improve Your Leadership Today", "5 Simple Qualities You Can Develop To Become a Better Leader", "Why Great Leaders Trust Their Teams", "What Customers Want: A Simple Guide To Being More Customer Focused"};
    private final Integer[] image = {R.drawable.blog1, R.drawable.blog2, R.drawable.blog3, R.drawable.blog4, R.drawable.blog5, R.drawable.blog6, R.drawable.blog7, R.drawable.blog8};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blog_home, container, false);
        ButterKnife.bind(this, view);
        //initviews1(view);
        initviews2(view);
        initviews3(view);
        initviews4(view);
        // recyclerView2 = view.findViewById(R.id.cat2).findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //navController= Navigation.findNavController(view);
        container1=view.findViewById(R.id.featured_blog);
        View viewPageNotFound=container1.findViewById(R.id.featured_progress);
        recyclerView1=container1.findViewById(R.id.recyclerViewBlog);
        progressBar=viewPageNotFound.findViewById(R.id.progressBar);
        imageView=viewPageNotFound.findViewById(R.id.pagenotfounderror);
        toolbar.setTitleTextColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        progressBar=view.findViewById(R.id.featured_progress).findViewById(R.id.progressBar);
        imageView=view.findViewById(R.id.featured_progress).findViewById(R.id.pagenotfounderror);
        progressBar.setVisibility(View.VISIBLE);
        imageView.setVisibility(View.GONE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.GONE);
                imageView.setVisibility(View.VISIBLE);
                //initviews1(view);

            }
        },3000);
    }
    private void initviews1(View view)

    {
        ArrayList<CareerAdviceCategoryModel> list=new ArrayList<>();
        for(int i=0;i<featuredBlogList.length;i++) {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(image[i]);
            model.setTitle(featuredBlogList[i]);
            list.add(model);
        }
//        imageView=view.findViewById(R.id.featured_blog).findViewById(R.id.imageviewBlog);
//        textView1=view.findViewById(R.id.featured_blog).findViewById(R.id.text_view_title_blog);

        AdapterCareerAdviceBlog adapterCareerAdviceBlog=new AdapterCareerAdviceBlog(getActivity(),list,0);
        recyclerView1.setAdapter(adapterCareerAdviceBlog);
    }
    private void initviews2(View view)

    {
        ArrayList<CareerAdviceCategoryModel> list=new ArrayList<>();
        for(int i=0;i<3;i++) {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(image[i]);
            model.setTitle(featuredBlogList[i]);
            list.add(model);
        }
        recyclerView2= view.findViewById(R.id.otherBlog_whats_new).findViewById(R.id.recyclerViewBlog);
        //imageView=view.findViewById(R.id.otherBlog_whats_new).findViewById(R.id.imageviewBlog);
        textView1=view.findViewById(R.id.otherBlog_whats_new).findViewById(R.id.text_view_title);
        textView1.setText("What's New");

        AdapterCareerAdviceBlog adapterCareerAdviceBlog=new AdapterCareerAdviceBlog(getActivity(),list,1);
        recyclerView2.setAdapter(adapterCareerAdviceBlog);
    }
    private void initviews3(View view)

    {
        ArrayList<CareerAdviceCategoryModel> list=new ArrayList<>();
        for(int i=0;i<3;i++) {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(image[i]);
            model.setTitle(featuredBlogList[i]);
            list.add(model);
        }
        recyclerView3 = view.findViewById(R.id.otherBlog_whatsPopular).findViewById(R.id.recyclerViewBlog);
        imageView=view.findViewById(R.id.otherBlog_whatsPopular).findViewById(R.id.imageviewBlog);
        TextView textView2 = view.findViewById(R.id.otherBlog_whatsPopular).findViewById(R.id.text_view_title);
        textView2.setText("What's Popular");

        AdapterCareerAdviceBlog adapterCareerAdviceBlog=new AdapterCareerAdviceBlog(getActivity(),list,1);
        recyclerView3.setAdapter(adapterCareerAdviceBlog);
    }
    private void initviews4(View view)

    {
        ArrayList<CareerAdviceCategoryModel> list=new ArrayList<>();
        for(int i=0;i<3;i++) {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(image[i]);
            model.setTitle(featuredBlogList[i]);
            list.add(model);
        }
        recyclerView4= view.findViewById(R.id.otherBlog_trendingPosts).findViewById(R.id.recyclerViewBlog);
        imageView=view.findViewById(R.id.otherBlog_trendingPosts).findViewById(R.id.imageviewBlog);
        TextView textView3 = view.findViewById(R.id.otherBlog_trendingPosts).findViewById(R.id.text_view_title);
        textView3.setText("Trending Posts");

        AdapterCareerAdviceBlog adapterCareerAdviceBlog=new AdapterCareerAdviceBlog(getActivity(),list,1);
        recyclerView4.setAdapter(adapterCareerAdviceBlog);
    }

    }