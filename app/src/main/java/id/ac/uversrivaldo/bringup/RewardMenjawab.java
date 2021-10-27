package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class RewardMenjawab extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_menjawab);

        ImageView backToLogin = findViewById(R.id.back2);
        backToLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.back2) {
            Intent moveToLogin = new Intent(RewardMenjawab.this, Login.class);
            startActivity(moveToLogin);
        }
    }
}