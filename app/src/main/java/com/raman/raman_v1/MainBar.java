package com.raman.raman_v1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainBar extends AppCompatActivity {


    private DrawerLayout mDrawer;
    //    private Toolbar toolbar;
    private NavigationView nvDrawer;

    // Make sure to be using androidx.appcompat.app.ActionBarDrawerToggle version.
    private ActionBarDrawerToggle drawerToggle;

    enum FragmentEnum {
        ACCELERATION,
        INTERNATIONAL,
        EDUCTION,
        MEETING,
        WEBSITE
    }

    public static FragmentEnum fragmentEnum = FragmentEnum.ACCELERATION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_bar);

        final Fragment acceleratorFrag = new AcceleratorFrag();
        final Fragment internationalFrag = new InternationalFrag();
        final Fragment educationFrag = new EducationFrag();
        final Fragment meetingFrag = new MeetingFrag();
        final Fragment websiteFrag = new WebsiteFrag();

        FragmentManager fm = getSupportFragmentManager();
        final FragmentTransaction transaction = fm.beginTransaction();

        if(fragmentEnum == FragmentEnum.ACCELERATION) {
            transaction.replace(R.id.frag, acceleratorFrag).commit();
        } else if(fragmentEnum == FragmentEnum.INTERNATIONAL) {
            transaction.replace(R.id.frag, internationalFrag).commit();
        } if(fragmentEnum == FragmentEnum.EDUCTION) {
            transaction.replace(R.id.frag, educationFrag).commit();
        } if(fragmentEnum == FragmentEnum.MEETING) {
            transaction.replace(R.id.frag, meetingFrag).commit();
        } if(fragmentEnum == FragmentEnum.WEBSITE) {
            transaction.replace(R.id.frag, websiteFrag).commit();
        }

        final TextView title = (TextView) findViewById(R.id.activityTitle);
        ImageView imageTitle = (ImageView) findViewById(R.id.activityImageTitle);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.bringToFront();
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                final Fragment acceleratorFrag = new AcceleratorFrag();
                final Fragment internationalFrag = new InternationalFrag();
                final Fragment educationFrag = new EducationFrag();
                final Fragment meetingFrag = new MeetingFrag();
                final Fragment websiteFrag = new WebsiteFrag();

                FragmentManager fm = getSupportFragmentManager();
                final FragmentTransaction transaction = fm.beginTransaction();

                switch (item.getItemId()) {
                    case R.id.accelerator:
//                        startActivity(new Intent(getApplicationContext(), Accelerator.class));
                        transaction.replace(R.id.frag, acceleratorFrag).commit();
                        title.setText("Raman Accelerator");
                        return true;
                    case R.id.international:
//                        startActivity(new Intent(getApplicationContext(), International.class));
                        transaction.replace(R.id.frag, internationalFrag).commit();
                        title.setText("Raman International");
                        return true;
                    case R.id.education:
//                        startActivity(new Intent(getApplicationContext(), Education.class));
                        transaction.replace(R.id.frag, educationFrag).commit();
                        title.setText("Raman Educational Groups");
                        return true;
                    case R.id.meetings:
//                        startActivity(new Intent(getApplicationContext(), Meetings.class));
                        transaction.replace(R.id.frag, meetingFrag).commit();
                        title.setText("Raman Meetings/Online Courses");
                        return true;
                    case R.id.website:
//                        startActivity(new Intent(getApplicationContext(), Website.class));
                        transaction.replace(R.id.frag, websiteFrag).commit();
                        title.setText("Raman Website");
                        return true;
                }
                return false;
            }
        });




        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        // ...From section above...
        // Find our drawer view
        nvDrawer = (NavigationView) findViewById(R.id.nvView);
        // Setup drawer view
        setupDrawerContent(nvDrawer);

        Button button = (Button) findViewById(R.id.menuButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDrawer();
            }
        });
    }


    public void openDrawer(){
        mDrawer.openDrawer(GravityCompat.START);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar home/up action should open or close the drawer.
        if (item.getItemId() == android.R.id.home) {
            mDrawer.openDrawer(GravityCompat.START);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }

    public void selectDrawerItem(MenuItem menuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
//        Fragment fragment = null;
//        Class fragmentClass;
        switch(menuItem.getItemId()) {
//            case R.id.nav_first_fragment:
////                fragmentClass = FirstFragment.class;
//                Intent i = new Intent(MainActivity.this, MenuAccount.class);
//                startActivity(i);
//                finish();
//                break;
//            case R.id.nav_second_fragment:
////                fragmentClass = SecondFragment.class;
//                break;
//            case R.id.nav_third_fragment:
////                fragmentClass = ThirdFragment.class;
//                break;
//            default:
//                fragmentClass = FirstFragment.class;
        }

//        try {
//            fragment = (Fragment) fragmentClass.newInstance();
//            FragmentManager fragmentManager = getSupportFragmentManager();
//            fragmentManager.beginTransaction().replace(R.id.flContent,fragment ).commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // Insert the fragment by replacing any existing fragment
//        FragmentManager fragmentManager = getSupportFragmentManager();
//        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();


        // Highlight the selected item has been done by NavigationView
//        menuItem.setChecked(true);

        // Set action bar title
//        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        mDrawer.closeDrawers();

    }
}
