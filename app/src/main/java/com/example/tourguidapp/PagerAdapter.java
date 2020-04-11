package com.example.tourguidapp;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(Context context, FragmentManager fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 1:
                return new HotelsFragment();
            case 2:
                return new IntertaimentFragment();
            case 3:
                return new HistoricalFragment();
            case 4:
                return new AttractionsFragment();
            default:
                return new AboutFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
