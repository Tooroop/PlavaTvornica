package demo.plavatvornica.com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.plavatvornica.com.MainActivity;
import demo.plavatvornica.com.R;
import demo.plavatvornica.com.model.Accommodation;

/**
 * Fragment for displaying Accomodation details
 */
public class DetailFragment extends Fragment{
    public static final String TAG = "DetailFragment";
    public static final String EXTRA_ACCOMMODATION = "EXTRA_ACCOMMODATION";

    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.title) TextView title;
    @Bind(R.id.imgFeatured) ImageView imgFeatured;
    @Bind(R.id.imgStars) ImageView imgStars;
    @Bind(R.id.accomodationTitle) TextView accommodationTitle;
    @Bind(R.id.accomodationAddress) TextView accommodationAddress;
    @Bind(R.id.accomodationDescription) TextView accommodationDescription;
    @Bind(R.id.imgFirst) ImageView imgFirst;
    @Bind(R.id.imgSecond) ImageView imgSecond;
    @Bind(R.id.imgThird) ImageView imgThird;

    private Accommodation accommodation;

    public static DetailFragment newInstance(Accommodation accommodation){
        Bundle bundle = new Bundle();
        bundle.putParcelable(EXTRA_ACCOMMODATION, accommodation);

        DetailFragment detailFragment = new DetailFragment();
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    //region LIFECYCLE METHODS

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        accommodation = getArguments().getParcelable(EXTRA_ACCOMMODATION);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((MainActivity) getActivity()).setSupportActionBar(toolbar);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((MainActivity) getActivity()).getSupportActionBar().setDisplayShowHomeEnabled(true);

        //Setup toolbar title and back click
        title.setText(accommodation.getTitle());
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().onBackPressed();
            }
        });

        //Setup Accommodation data
        Glide.with(getActivity()).load(accommodation.getFeaturedImage()).into(imgFeatured);
        accommodationTitle.setText(accommodation.getTitle());
        accommodationAddress.setText(getString(R.string.accommodation_address, accommodation.getAddress(), accommodation.getPostCode()));
        accommodationDescription.setText(accommodation.getDescription());

        Glide.with(getActivity()).load(accommodation.getImagesResources()[0]).into(imgFirst);
        Glide.with(getActivity()).load(accommodation.getImagesResources()[1]).into(imgSecond);
        Glide.with(getActivity()).load(accommodation.getImagesResources()[2]).into(imgThird);

        if(accommodation.getScore() == 0){
            imgStars.setImageResource(R.drawable.stars_rank0);
        } else if(accommodation.getScore() == 1){
            imgStars.setImageResource(R.drawable.stars_rank1);
        }  else if(accommodation.getScore() == 2){
            imgStars.setImageResource(R.drawable.stars_rank2);
        }  else if(accommodation.getScore() == 3){
            imgStars.setImageResource(R.drawable.stars_rank3);
        }  else if(accommodation.getScore() == 4){
            imgStars.setImageResource(R.drawable.stars_rank4);
        }  else if(accommodation.getScore() == 5){
            imgStars.setImageResource(R.drawable.stars_rank5);
        }
    }

    //endregion

    @OnClick(R.id.imgFirst) void onFirstImageClick(){
        openGallery(0);

    }

    @OnClick(R.id.imgSecond) void onSecondImageClick(){
        openGallery(1);
    }

    @OnClick(R.id.imgThird) void onThirdImageClick(){
        openGallery(2);
    }

    private void openGallery(int position){
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        GalleryFragment galleryFragment = GalleryFragment.newInstance(accommodation.getImagesResources(), position);
        ft.add(R.id.fragment_container, galleryFragment, GalleryFragment.TAG);
        ft.addToBackStack(null);
        ft.commit();
    }
}
