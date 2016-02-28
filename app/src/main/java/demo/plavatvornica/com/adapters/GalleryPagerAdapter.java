package demo.plavatvornica.com.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import demo.plavatvornica.com.fragments.GalleryItemFragment;

/**
 * ViewPager adapter for displaying gallery items
 */
public class GalleryPagerAdapter extends FragmentStatePagerAdapter{

    private int[] gallery;

    public GalleryPagerAdapter(FragmentManager fm, int[] gallery) {
        super(fm);
        this.gallery = gallery;
    }

    @Override
    public Fragment getItem(int position) {
        //Return instance of GalleryItemFragment with a certain image displayed
        return GalleryItemFragment.newInstance(gallery[position]);
    }

    @Override
    public int getCount() {
        return gallery.length;
    }
}
