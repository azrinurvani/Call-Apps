package com.mobile.azrinurvani.callapps;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout)findViewById(R.id.tabCall);
        viewPager = (ViewPager)findViewById(R.id.vpCall);
        adapter = new ViewPagerAdapter(getSupportFragmentManager());


//        Add fragment
        adapter.AddFragment(new FragmentCall(),"");
        adapter.AddFragment(new FragmentContact(),"");
        adapter.AddFragment(new FragmentFav(),"");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

//        At icon tab layout base position
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contact);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favourites);


//        remove shadow from the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);

    }
}
