package demo.plavatvornica.com.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import demo.plavatvornica.com.fragments.GalleryItemFragment;

/**
 * Created by Tooroop on 28-Feb-16.
 */
public class GalleryPagerAdapter extends FragmentStatePagerAdapter{

    private int[] gallery;

    public GalleryPagerAdapter(FragmentManager fm, int[] gallery) {
        super(fm);
        this.gallery = gallery;
    }

    @Override
    public Fragment getItem(int position) {
        return GalleryItemFragment.newInstance(gallery[position]);
    }

    @Override
    public int getCount() {
        return gallery.length;
    }
}
