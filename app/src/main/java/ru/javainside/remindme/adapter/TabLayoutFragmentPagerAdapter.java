package ru.javainside.remindme.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ru.javainside.remindme.fragment.MainFragment;

/**
 * Created by User on 24.01.2016.
 */
public class TabLayoutFragmentPagerAdapter extends FragmentPagerAdapter{
    private String[] tabs;


    public TabLayoutFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[]{"Tab 1", "Tab 2", "Tab 3"};
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return MainFragment.getInstance();
            case 1:
                return MainFragment.getInstance();
            case 3:
                return MainFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
