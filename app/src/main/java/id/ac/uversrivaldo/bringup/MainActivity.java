package id.ac.uversrivaldo.bringup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


import com.google.android.material.bottomnavigation.BottomNavigationView;

import nl.joery.animatedbottombar.AnimatedBottomBar;

public class MainActivity extends AppCompatActivity {
    

    ImageView card1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        card1 = (ImageView) findViewById(R.id.card1);
        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent card1 = new Intent(MainActivity.this, To_Quiz.class);
                startActivity(card1);
            }
        });

        bottomNavigationView.setSelectedItemId(R.id.home);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
               switch (menuItem.getItemId()){
                   case R.id.jawaban:
                       startActivity(new Intent(getApplicationContext()
                       ,kumpulan_jawaban.class));
                       overridePendingTransition(0,0);
                       return true;

                   case R.id.home:
                       return true;

                   case R.id.reward:
                       startActivity(new Intent(getApplicationContext()
                               ,RewardMenjawab.class));
                       overridePendingTransition(0,0);
                       return true;

                   case R.id.profile:
                       startActivity(new Intent(getApplicationContext()
                               ,Profile.class));
                       overridePendingTransition(0,0);
                       return true;
               }
                return false;
            }
        });
    }
}