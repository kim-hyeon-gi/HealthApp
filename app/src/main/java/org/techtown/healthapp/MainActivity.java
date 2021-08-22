package org.techtown.healthapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity  extends AppCompatActivity {
    Fragment fragment1;
    Fragment fragment2;
    Fragment fragment3;
    Fragment fragment4;
    Fragment fragment5;
    Fragment fragment6;
    private final int Fragment_1 = 1;
    private final int Fragment_2 = 2;
    BottomNavigationView bottomNavigation;
    TabLayout tabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        fragment5 = new Fragment5();
        fragment6 = new Fragment6();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();

        bottomNavigation = findViewById(R.id.bottom);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                                                                 @Override
                                                                 public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                                                                     switch (item.getItemId()) {

                                                                         case R.id.tab1:
                                                                             getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
                                                                             return true;
                                                                         case R.id.tab2:
                                                                             getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
                                                                             return true;
                                                                         case R.id.tab3:
                                                                             getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment3).commit();
                                                                             return true;
                                                                         case R.id.tab4:
                                                                             getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment4).commit();
                                                                             return true;

                                                                     }
                                                                     return false;
                                                                 }
                                                             }


        );

    }
    public void onButton1Clicked(View view){
        FragmentView(Fragment_1);

    }
    public void onButton2Clicked(View view){
        FragmentView(Fragment_2);

    }

    private void FragmentView(int fragment){





        switch (fragment){
            case 1:

                Fragment5 fragment5 = new Fragment5();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment5).commit();
                break;

            case 2:

                Fragment6 fragment6 = new Fragment6();
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment6).commit();
                break;
        }

    }


}
