package demo.plavatvornica.com.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import demo.plavatvornica.com.MainActivity;
import demo.plavatvornica.com.R;
import demo.plavatvornica.com.adapters.AccommodationsAdapter;
import demo.plavatvornica.com.model.Accommodation;
import demo.plavatvornica.com.util.DataHelper;

/**
 * Fragment displaying list of accommodations
 */
public class MainFragment extends Fragment implements AccommodationsAdapter.AccomodationAdapterListener{
    public static final String TAG = "MainFragment";

    //region CLASS VARIABLES

    @Bind(R.id.toolbar) Toolbar toolbar;
    @Bind(R.id.rec_accommodations) RecyclerView recAccommodations;

    private ArrayList<Accommodation> accommodations;

    //endregion

    //region CLASS CONSTRUCT

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    //endregion

    //region LIFECYCLE METHODS

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        accommodations = DataHelper.getAccommodations();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //Setup toolbar
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);

        //Setup RecyclerView and adapter
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recAccommodations.setLayoutManager(llm);
        recAccommodations.setHasFixedSize(true);
        AccommodationsAdapter accommodationsAdapter = new AccommodationsAdapter(getActivity(), accommodations);
        accommodationsAdapter.setListener(this);
        recAccommodations.setAdapter(accommodationsAdapter);

    }

    //endregion

    //region LISTENER METHODS

    /**
     * Opens detail view of accommodation that was clicked in the RecyclerView
     *
     * @param accommodation Accommodation that was clicked
     */
    @Override
    public void onAccomodationClick(Accommodation accommodation) {
        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        DetailFragment detailFragment = DetailFragment.newInstance(accommodation);
        ft.add(R.id.fragment_container, detailFragment, DetailFragment.TAG);
        ft.addToBackStack(null);
        ft.commit();
    }

    //endregion
}

