package com.example.empoweryouthcareeradvice;


import android.os.Bundle;
import android.util.Log;
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
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareerAdviceHomeFragment extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    CoverLetterModel model=new CoverLetterModel();
    CoverLetterModel model1=new CoverLetterModel();
    CoverLetterModel model2=new CoverLetterModel();
    private RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5,recyclerView6,recyclerView7,recyclerView8,recyclerView9,recyclerView10,recyclerView11,recyclerView12;
    private ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,imageView10,imageView11,imageView12;
    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,textView11,textView12;
    private CardView cardView1,cardView2,cardView3,cardView4,cardView5,cardView6,cardView7,cardView8,cardView9,cardView10,cardView11,cardView12;
    ArrayList<CoverLetterModel> modelList=new ArrayList<>();

    String[] titleList = {"How To Write Cover Letter","Resume Tips","Job Interviews","Finding Your Dream Company","Finding Your Passion","Self Empowerment","Enterpreneurship","Job Search","Career Advancement","Networking", "Personal Branding","Employers Corner"};
    Integer[] drawableImages = {R.drawable.coverrletter,R.drawable.resumetip,R.drawable.jobinterviews,R.drawable.findcompany,R.drawable.findpassions,R.drawable.selfimprovement,R.drawable.entrepreneurship,R.drawable.jobsearchs,R.drawable.careeradvancements,R.drawable.networkings,R.drawable.brand,R.drawable.employee};

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
        model1.setImage(R.drawable.coverbasic);
        model1.setTitle("How To Write Cover Letter");
        modelList.add(model1);
        model2.setImage(R.drawable.coverbasic);
        model2.setTitle("How To Write Cover Letter");
        modelList.add(model2);
        recyclerView1 = view.findViewById(R.id.cat1).findViewById(R.id.recyclerView);
        imageView1=view.findViewById(R.id.cat1).findViewById(R.id.image_category_icon);
        textView1=view.findViewById(R.id.cat1).findViewById(R.id.text_view_title);
        cardView1=view.findViewById(R.id.cat1).findViewById(R.id.card_view_image);
        imageView1.setImageResource(drawableImages[0]);
        textView1.setText(titleList[0]);
        cardView1.setCardBackgroundColor(ContextCompat.getColor(getActivity(),R.color.colorSkyBlue));
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView2=view.findViewById(R.id.cat2).findViewById(R.id.image_category_icon);
        textView2=view.findViewById(R.id.cat2).findViewById(R.id.text_view_title);
        cardView2=view.findViewById(R.id.cat1).findViewById(R.id.card_view_image);
        imageView2.setImageResource(drawableImages[1]);
        textView2.setText(titleList[1]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView3=view.findViewById(R.id.cat3).findViewById(R.id.image_category_icon);
        textView3=view.findViewById(R.id.cat3).findViewById(R.id.text_view_title);
        cardView3=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView3.setImageResource(drawableImages[2]);
        textView3.setText(titleList[2]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView4=view.findViewById(R.id.cat4).findViewById(R.id.image_category_icon);
        textView4=view.findViewById(R.id.cat4).findViewById(R.id.text_view_title);
        cardView4=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView4.setImageResource(drawableImages[3]);
        textView4.setText(titleList[3]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView5=view.findViewById(R.id.cat5).findViewById(R.id.image_category_icon);
        textView5=view.findViewById(R.id.cat5).findViewById(R.id.text_view_title);
        cardView5=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView5.setImageResource(drawableImages[4]);
        textView5.setText(titleList[4]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView6=view.findViewById(R.id.cat6).findViewById(R.id.image_category_icon);
        textView6=view.findViewById(R.id.cat6).findViewById(R.id.text_view_title);
        cardView6=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView6.setImageResource(drawableImages[5]);
        textView6.setText(titleList[5]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView7=view.findViewById(R.id.cat7).findViewById(R.id.image_category_icon);
        textView7=view.findViewById(R.id.cat7).findViewById(R.id.text_view_title);
        cardView7=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView7.setImageResource(drawableImages[6]);
        textView7.setText(titleList[6]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView8=view.findViewById(R.id.cat8).findViewById(R.id.image_category_icon);
        textView8=view.findViewById(R.id.cat8).findViewById(R.id.text_view_title);
        cardView8=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView8.setImageResource(drawableImages[7]);
        textView8.setText(titleList[7]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView9=view.findViewById(R.id.cat9).findViewById(R.id.image_category_icon);
        textView9=view.findViewById(R.id.cat9).findViewById(R.id.text_view_title);
        cardView9=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView9.setImageResource(drawableImages[8]);
        textView9.setText(titleList[8]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView10=view.findViewById(R.id.cat10).findViewById(R.id.image_category_icon);
        textView10=view.findViewById(R.id.cat10).findViewById(R.id.text_view_title);
        cardView10=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView10.setImageResource(drawableImages[9]);
        textView10.setText(titleList[9]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView11=view.findViewById(R.id.cat11).findViewById(R.id.image_category_icon);
        textView11=view.findViewById(R.id.cat11).findViewById(R.id.text_view_title);
        cardView11=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView11.setImageResource(drawableImages[10]);
        textView11.setText(titleList[10]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
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
        imageView12=view.findViewById(R.id.cat12).findViewById(R.id.image_category_icon);
        textView12=view.findViewById(R.id.cat12).findViewById(R.id.text_view_title);
        cardView12=view.findViewById(R.id.cat1).findViewById(R.id.cardview);
        imageView12.setImageResource(drawableImages[11]);
        textView12.setText(titleList[11]);
        AdapterCareerAdviceCategoryView adapterCareerAdviceCategoryView=new AdapterCareerAdviceCategoryView(getActivity(),modelList);
        recyclerView12.setAdapter(adapterCareerAdviceCategoryView);
    }
}
