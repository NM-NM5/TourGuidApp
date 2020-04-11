package com.example.tourguidapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;
    ViewPager viewPager;
    PagerAdapter adapter;

    private int[] tabIcons = {
            R.drawable.ic_home,
            R.drawable.ic_hotel,
            R.mipmap.ic_launcher,
            R.drawable.ic_account_balance,
            R.mipmap.ic_launcher,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpager);

        adapter = new PagerAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(adapter);

        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(tabIcons[0]);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(tabIcons[1]);
        Objects.requireNonNull(tabLayout.getTabAt(2)).setIcon(tabIcons[2]);
        Objects.requireNonNull(tabLayout.getTabAt(3)).setIcon(tabIcons[3]);
        Objects.requireNonNull(tabLayout.getTabAt(4)).setIcon(tabIcons[4]);
    }
}
