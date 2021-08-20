package org.techtown.healthapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Fragment fragment1;
    Fragment fragment2;
    Fragment fragment3;
    Fragment fragment4;
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();

        bottomNavigation = findViewById(R.id.bottom);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                            case R.id.tab1:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment1).commit();
                                return true;
                            case R.id.tab2:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment2).commit();
                                return true;
                            case R.id.tab3:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment3).commit();
                                return true;
                            case R.id.tab4:
                                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment4).commit();
                                return true;

                        }
                        return false;
                    }
                }

        );
    }
}