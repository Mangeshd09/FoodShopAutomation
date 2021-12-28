package com.example.foodshopautomation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView UserBottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UserBottomNavigation = findViewById(R.id.bottom_navigation_user);

        getSupportFragmentManager().beginTransaction().replace(R.id.user_container, new UserHomeFragment()).commit();
        UserBottomNavigation.getMenu().findItem(R.id.home).setChecked(true);

        UserBottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment temp = null;
                switch (item.getItemId()){

                    case R.id.home:
                        temp = new UserHomeFragment ();
                        break;

                    case R.id.view_menu:
                        temp = new UserMenuFragment();
                        break;

                    case R.id.cart:
                        temp = new CartFragment();
                        break;

                    case R.id.offers:
                        temp = new OfferFragment();
                        break;

                    case R.id.profile:
                        temp = new ProfileFragment();
                }

                getSupportFragmentManager().beginTransaction().replace(R.id.user_container, temp).commit();

                return true;
            }
        });

    }
}