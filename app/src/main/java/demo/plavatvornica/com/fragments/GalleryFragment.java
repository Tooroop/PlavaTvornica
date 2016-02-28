package demo.plavatvornica.com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Gallery;

import com.viewpagerindicator.CirclePageIndicator;

import java.nio.BufferUnderflowException;
import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import demo.plavatvornica.com.R;
import demo.plavatvornica.com.adapters.GalleryPagerAdapter;

/**
 * Created by Tooroop on 28-Feb-16.
 */
public class GalleryFragment extends Fragment {
    public static final String TAG = "GalleryFragment";
    public static final String EXTRA_GALLERY = "EXTRA_GALLERY";
    public static final String EXTRA_POSITION = "EXTRA_POSITION";

    @Bind(R.id.viewPager) ViewPager viewPager;
    @Bind(R.id.indicator) CirclePageIndicator indicator;

    private int[] gallery;
    private int position;

    public static GalleryFragment newInstance(int[] gallery, int position){
        Bundle bundle = new Bundle();
        bundle.putIntArray(EXTRA_GALLERY, gallery);
        bundle.putInt(EXTRA_POSITION, position);

        GalleryFragment galleryFragment = new GalleryFragment();
        galleryFragment.setArguments(bundle);
        return galleryFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gallery = getArguments().getIntArray(EXTRA_GALLERY);
        position = getArguments().getInt(EXTRA_POSITION);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        GalleryPagerAdapter galleryPagerAdapter = new GalleryPagerAdapter(getChildFragmentManager(), gallery);
        viewPager.setAdapter(galleryPagerAdapter);
        viewPager.setCurrentItem(position);
        indicator.setViewPager(viewPager);
    }
}
