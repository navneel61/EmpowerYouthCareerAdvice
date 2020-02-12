package com.example.empoweryouthcareeradvice;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;

import butterknife.ButterKnife;


public class BlogHomeFragment extends Fragment {

    RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4;
    TextView textView,textView1,textView2;
    ArrayList<CareerAdviceCategoryModel> modelList=new ArrayList<>();
    private final String[] titles = {"Should HR have a seat at the strategic table?", "3 Keys To Starting a Business with Student Loan Debt", "How to Get Ahead in the Business World", "5 Things I Wish I’d Known Before Becoming a Leader", "4 Simple Things That You Can Do To Improve Your Leadership Today", "5 Simple Qualities You Can Develop To Become a Better Leader", "Why Great Leaders Trust Their Teams", "What Customers Want: A Simple Guide To Being More Customer Focused"};
    private final Integer[] images = {R.drawable.first, R.drawable.second, R.drawable.third, R.drawable.fourth, R.drawable.fifthblog, R.drawable.sixthblog, R.drawable.eigthblog, R.drawable.ninthblog};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blog_home, container, false);
        ButterKnife.bind(this, view);
        initCategoryView1(view);
        initCategoryView2(view);
        initCategoryView3(view);
        initCategoryView4(view);
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
    }

    public void initCategoryView1(View view) {
        for (int i = 0; i < titles.length; i++) {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(images[i]);
            model.setTitle(titles[i]);
            modelList.add(model);
        }
        recyclerView1 = view.findViewById(R.id.featured_blog).findViewById(R.id.recyclerView);
        AdapterBlog adapterBlog = new AdapterBlog(getActivity(), modelList,0);
        recyclerView1.setAdapter(adapterBlog);
    }
    public void initCategoryView2(View view)
    {
        for(int i=0;i<3;i++)
        {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(images[i]);
            model.setTitle(titles[i]);
            modelList.add(model);
        }
        recyclerView2 = view.findViewById(R.id.other_blog_whats_new).findViewById(R.id.recyclerView);
        textView=view.findViewById(R.id.other_blog_whats_new).findViewById(R.id.text_view_title);
        textView.setText("WHAT'S NEW");
        textView.setTextSize(14);
        AdapterBlog adapterBlog = new AdapterBlog(getActivity(), modelList,1);
        recyclerView2.setAdapter(adapterBlog);
    }
    public void initCategoryView3(View view)
    {
        for(int i=0;i<3;i++)
        {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(images[i]);
            model.setTitle(titles[i]);
            modelList.add(model);
        }
        recyclerView3 = view.findViewById(R.id.other_blog_whats_popular).findViewById(R.id.recyclerView);
        textView1=view.findViewById(R.id.other_blog_whats_popular).findViewById(R.id.text_view_title);
        textView1.setText("WHAT'S POPULAR");
        textView1.setTextSize(14);
        AdapterBlog adapterBlog = new AdapterBlog(getActivity(), modelList,1);
        recyclerView3.setAdapter(adapterBlog);
    }
    public void initCategoryView4(View view)
    {
        for(int i=0;i<3;i++)
        {
            CareerAdviceCategoryModel model = new CareerAdviceCategoryModel();
            model.setImage(images[i]);
            model.setTitle(titles[i]);
            modelList.add(model);
        }
        recyclerView4 = view.findViewById(R.id.other_blog_trending_posts).findViewById(R.id.recyclerView);
        textView2=view.findViewById(R.id.other_blog_trending_posts).findViewById(R.id.text_view_title);
        textView2.setText("TRENDING POST");
        textView2.setTextSize(14);
        AdapterBlog adapterBlog = new AdapterBlog(getActivity(), modelList,1);
        recyclerView4.setAdapter(adapterBlog);
    }
}
