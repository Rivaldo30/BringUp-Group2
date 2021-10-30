package id.ac.uversrivaldo.bringup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PersonalData extends AppCompatActivity {

    Button btn1;
    ImageView gmbr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_data);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        btn1 = (Button) findViewById(R.id.btnSave);
        gmbr1 = (ImageView) findViewById(R.id.btnback);

        gmbr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back  = new Intent(PersonalData.this, Profile.class);
                startActivity(back);
            }
        });
        

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent save  = new Intent(PersonalData.this, Profile.class);
                startActivity(save);
            }
        });



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
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity.class));
                        overridePendingTransition(0,0);
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