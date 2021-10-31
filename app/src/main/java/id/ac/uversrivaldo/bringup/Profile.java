package id.ac.uversrivaldo.bringup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Profile extends AppCompatActivity {

    TextView tprofil, tsettings, tinvite, turquest, turanswer;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        btn1 = (Button) findViewById(R.id.btnLogout);

        tprofil = (TextView) findViewById(R.id.toProfile);
        tsettings = (TextView) findViewById(R.id.toSettings);
        tinvite = (TextView) findViewById(R.id.btn_invite);
        turquest = (TextView) findViewById(R.id.btn_yourQuest);
        turanswer = (TextView) findViewById(R.id.btn_yourAnswer);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(Profile.this, Login.class);
                startActivity(logout);
                finish();
            }
        });


        tinvite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent invite = new Intent(Intent.ACTION_SEND);
                invite.putExtra(invite.EXTRA_TEXT, "Find your answer here");
                invite.setType("text/plan");

                startActivity(Intent.createChooser(invite, "Share to:"));
            }
        });

        turanswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent answer = new Intent(Profile.this, Your_Answer.class);
                startActivity(answer);
            }
        });

        turquest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent question = new Intent(Profile.this, Your_Question.class);
                startActivity(question);
            }
        });


        tprofil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profil = new Intent(Profile.this, PersonalData.class);
                startActivity(profil);
            }
        });


        tsettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent setting  = new Intent(Profile.this, Settings.class);
                startActivity(setting);
            }
        });



        bottomNavigationView.setSelectedItemId(R.id.profile);

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
                        return true;
                }
                return false;
            }
        });
    }
}