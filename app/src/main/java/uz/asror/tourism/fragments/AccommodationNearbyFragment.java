package uz.asror.tourism.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import uz.asror.tourism.R;
import uz.asror.tourism.adapter.ViewPagerAdapter;


public class AccommodationNearbyFragment extends Fragment {

    ViewPager mViewPager;
    ViewPagerAdapter mViewPagerAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Initializing the ViewPager Object
        mViewPager = (ViewPager) mViewPager.findViewById(R.id.viewPagerMain);

        int[] images = {R.drawable.yangi_sharq_img, R.drawable.yangi_sharq1, R.drawable.yangi_sharq2, R.drawable.yangi_sharq3};


        // Initializing the ViewPagerAdapter
        mViewPagerAdapter = new ViewPagerAdapter(getContext(), images);

        // Adding the Adapter to the ViewPager
        mViewPager.setAdapter(mViewPagerAdapter);
        return inflater.inflate(R.layout.fragment_accommodation_nearby, container, false);
    }
}