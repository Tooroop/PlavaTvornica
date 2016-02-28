package demo.plavatvornica.com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import demo.plavatvornica.com.R;

/**
 * Fragment representing one gallery item
 */
public class GalleryItemFragment extends Fragment {
    public static final String EXTRA_IMAGE_RESOURCE = "EXTRA_IMAGE_RESOURCE";

    //region CLASS VARIABLES

    @Bind(R.id.accommodationImage) ImageView accommodationImage;

    private int imageResource;

    //endregion

    //region CLASS CONSTRUCT

    public static GalleryItemFragment newInstance(int imageResource){
        Bundle bundle = new Bundle();
        bundle.putInt(EXTRA_IMAGE_RESOURCE, imageResource);

        GalleryItemFragment galleryItemFragment = new GalleryItemFragment();
        galleryItemFragment.setArguments(bundle);
        return galleryItemFragment;
    }

    //endregion

    //region LIFECYCLE METHODS

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        imageResource = getArguments().getInt(EXTRA_IMAGE_RESOURCE);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_gallery_item, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Load gallery image into imageview
        Glide.with(getActivity()).load(imageResource).into(accommodationImage);
    }

    //endregion
}
