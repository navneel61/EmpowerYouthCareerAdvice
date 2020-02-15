package com.example.empoweryouthcareeradvice;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareerAdviceHomeFragment extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private final CareerAdviceCategoryModel model=new CareerAdviceCategoryModel();
    private final CareerAdviceCategoryModel model1=new CareerAdviceCategoryModel();
    private final CareerAdviceCategoryModel model2=new CareerAdviceCategoryModel();
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6,recyclerView7,recyclerView8,recyclerView9,recyclerView10,recyclerView11,recyclerView12;
    private final ArrayList<CareerAdviceCategoryModel> modelList=new ArrayList<>();

    private final String[] titleList = {"How To Write Cover Letter","Resume Tips","Job Interviews","Finding Your Dream Company","Finding Your Passion","Self Empowerment","Enterpreneurship","Job Search","Career Advancement","Networking", "Personal Branding","Employers Corner"};
    private final Integer[] drawableImages = {R.drawable.coverrletter,R.drawable.resumetip,R.drawable.jobinterviews,R.drawable.findcompany,R.drawable.findpassions,R.drawable.selfimprovement,R.drawable.entrepreneurship,R.drawable.jobsearchs,R.drawable.careeradvancements,R.drawable.networkings,R.drawable.brand,R.drawable.employee};
    private final String[] slug={"how-to-write-cover-letter","resume-tips","job-interviews","finding-your-dream-company","finding-your-passion","self-improvement","entrepreneurship","job-search","career-advancement","networking","personal-branding","employers-corner"};

    public CareerAdviceHomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_career_advice_home, container, false);
        ButterKnife.bind(this, view);
        initCategory1(view);
        initCategory2(view);
        initCategory3(view);
        initCategory4(view);
        initCategory5(view);
        initCategory6(view);
        initCategory7(view);
        initCategory8(view);
        initCategory9(view);
        initCategory10(view);
        initCategory11(view);
        initCategory12(view);
//        recyclerView2 = view.findViewById(R.id.cat2).findViewById(R.id.recyclerView);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        toolbar.setTitleTextColor(ContextCompat.getColor(getActivity(), R.color.colorWhite));
        recyclerView1.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView3.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView4.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView5.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView6.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView7.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView8.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView9.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView10.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView11.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        recyclerView12.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
        //recyclerView1.setAdapter(new AdapterCareerAdviceCategoryView());
//        recyclerView2.setLayoutManager(new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false));
//        recyclerView2.setAdapter(new AdapterCareerAdviceCategoryView());
    }

    private void initCategory1 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverletter);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView1 = view.findViewById(R.id.cat1).findViewById(R.id.recyclerView);
        ImageView imageView1 = view.findViewById(R.id.cat1).findViewById(R.id.image_category_icon);
        TextView textView1 = view.findViewById(R.id.cat1).findViewById(R.id.text_view_title);
        CardView cardView1 = view.findViewById(R.id.cat1).findViewById(R.id.card_view_image);
            imageView1.setImageResource(drawableImages[0]);
            textView1.setText(titleList[0]);
        cardView1.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorhowtowritecoverletter));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[0]);
        recyclerView1.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory2 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView2 = view.findViewById(R.id.cat2).findViewById(R.id.recyclerView);
        ImageView imageView2 = view.findViewById(R.id.cat2).findViewById(R.id.image_category_icon);
        TextView textView2 = view.findViewById(R.id.cat2).findViewById(R.id.text_view_title);
        CardView cardView2 = view.findViewById(R.id.cat2).findViewById(R.id.card_view_image);
        imageView2.setImageResource(drawableImages[1]);
        textView2.setText(titleList[1]);
        cardView2.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorresumetips));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[1]);
        recyclerView2.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory3 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView3 = view.findViewById(R.id.cat3).findViewById(R.id.recyclerView);
        ImageView imageView3 = view.findViewById(R.id.cat3).findViewById(R.id.image_category_icon);
        TextView textView3 = view.findViewById(R.id.cat3).findViewById(R.id.text_view_title);
        CardView cardView3 = view.findViewById(R.id.cat3).findViewById(R.id.card_view_image);
        imageView3.setImageResource(drawableImages[2]);
        textView3.setText(titleList[2]);
        cardView3.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorjobinterviews));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[2]);
        recyclerView3.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory4 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView4 = view.findViewById(R.id.cat4).findViewById(R.id.recyclerView);
        ImageView imageView4 = view.findViewById(R.id.cat4).findViewById(R.id.image_category_icon);
        TextView textView4 = view.findViewById(R.id.cat4).findViewById(R.id.text_view_title);
        CardView cardView4 = view.findViewById(R.id.cat4).findViewById(R.id.card_view_image);
        imageView4.setImageResource(drawableImages[3]);
        textView4.setText(titleList[3]);
        cardView4.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorfindingyourdreamcompany));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[3]);
        recyclerView4.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory5 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView5 = view.findViewById(R.id.cat5).findViewById(R.id.recyclerView);
        ImageView imageView5 = view.findViewById(R.id.cat5).findViewById(R.id.image_category_icon);
        TextView textView5 = view.findViewById(R.id.cat5).findViewById(R.id.text_view_title);
        CardView cardView5 = view.findViewById(R.id.cat5).findViewById(R.id.card_view_image);
        imageView5.setImageResource(drawableImages[4]);
        textView5.setText(titleList[4]);
        cardView5.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorfindingyourpassion));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[4]);
        recyclerView5.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory6 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView6 = view.findViewById(R.id.cat6).findViewById(R.id.recyclerView);
        ImageView imageView6 = view.findViewById(R.id.cat6).findViewById(R.id.image_category_icon);
        TextView textView6 = view.findViewById(R.id.cat6).findViewById(R.id.text_view_title);
        CardView cardView6 = view.findViewById(R.id.cat6).findViewById(R.id.card_view_image);
        imageView6.setImageResource(drawableImages[5]);
        textView6.setText(titleList[5]);
        cardView6.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorselfempowerment));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[5]);
        recyclerView6.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory7 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView7 = view.findViewById(R.id.cat7).findViewById(R.id.recyclerView);
        ImageView imageView7 = view.findViewById(R.id.cat7).findViewById(R.id.image_category_icon);
        TextView textView7 = view.findViewById(R.id.cat7).findViewById(R.id.text_view_title);
        CardView cardView7 = view.findViewById(R.id.cat7).findViewById(R.id.card_view_image);
        imageView7.setImageResource(drawableImages[6]);
        textView7.setText(titleList[6]);
        cardView7.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorenterpreneurship));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[6]);
        recyclerView7.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory8 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView8 = view.findViewById(R.id.cat8).findViewById(R.id.recyclerView);
        ImageView imageView8 = view.findViewById(R.id.cat8).findViewById(R.id.image_category_icon);
        TextView textView8 = view.findViewById(R.id.cat8).findViewById(R.id.text_view_title);
        CardView cardView8 = view.findViewById(R.id.cat8).findViewById(R.id.card_view_image);
        imageView8.setImageResource(drawableImages[7]);
        textView8.setText(titleList[7]);
        cardView8.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorjobsearch));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[7]);
        recyclerView8.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory9 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView9 = view.findViewById(R.id.cat9).findViewById(R.id.recyclerView);
        ImageView imageView9 = view.findViewById(R.id.cat9).findViewById(R.id.image_category_icon);
        TextView textView9 = view.findViewById(R.id.cat9).findViewById(R.id.text_view_title);
        CardView cardView9 = view.findViewById(R.id.cat9).findViewById(R.id.card_view_image);
        imageView9.setImageResource(drawableImages[8]);
        textView9.setText(titleList[8]);
        cardView9.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorcareeradvancement));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[8]);
        recyclerView9.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory10 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView10 = view.findViewById(R.id.cat10).findViewById(R.id.recyclerView);
        ImageView imageView10 = view.findViewById(R.id.cat10).findViewById(R.id.image_category_icon);
        TextView textView10 = view.findViewById(R.id.cat10).findViewById(R.id.text_view_title);
        CardView cardView10 = view.findViewById(R.id.cat10).findViewById(R.id.card_view_image);
        imageView10.setImageResource(drawableImages[9]);
        textView10.setText(titleList[9]);
        cardView10.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colornetworking));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[9]);
        recyclerView10.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory11 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView11 = view.findViewById(R.id.cat11).findViewById(R.id.recyclerView);
        ImageView imageView11 = view.findViewById(R.id.cat11).findViewById(R.id.image_category_icon);
        TextView textView11 = view.findViewById(R.id.cat11).findViewById(R.id.text_view_title);
        CardView cardView11 = view.findViewById(R.id.cat11).findViewById(R.id.card_view_image);
        imageView11.setImageResource(drawableImages[10]);
        textView11.setText(titleList[10]);
        cardView11.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorpersonalbranding));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[10]);
        recyclerView11.setAdapter(adapterCareerAdviceCategoryView);
    }
    private void initCategory12 (View view){
        model.setImage(R.drawable.coverbasic);
        model.setTitle("How To Write Cover Letter");
        modelList.add(model);
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView12 = view.findViewById(R.id.cat12).findViewById(R.id.recyclerView);
        ImageView imageView12 = view.findViewById(R.id.cat12).findViewById(R.id.image_category_icon);
        TextView textView12 = view.findViewById(R.id.cat12).findViewById(R.id.text_view_title);
        CardView cardView12 = view.findViewById(R.id.cat12).findViewById(R.id.card_view_image);
        imageView12.setImageResource(drawableImages[11]);
        textView12.setText(titleList[11]);
        cardView12.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.coloremployerscorner));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList,titleList[11]);
        recyclerView12.setAdapter(adapterCareerAdviceCategoryView);
    }
}
