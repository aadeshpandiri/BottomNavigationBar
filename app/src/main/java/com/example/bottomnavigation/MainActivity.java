package com.example.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {
    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chipNavigationBar = findViewById(R.id.bottom_nav_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatiner,new Fragment1()).commit();
        bottomMenu();
    }

    private void bottomMenu() {
    chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
        @Override
        public void onItemSelected(int i) {
            Fragment fragment = null;
            switch (i)
            {
                case R.id.bottom_nav_dashboard:
                    fragment = new Fragment1();
                    break;

                case R.id.bottom_nav_manage:
                    fragment = new Fragment2();
                    break;
                case R.id.bottom_nav_profile:
                    fragment = new Fragment3();
                    break;
            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_conatiner,fragment).commit();

        }
    });
    }
}