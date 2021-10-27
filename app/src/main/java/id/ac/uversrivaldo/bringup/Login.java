package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);
        Button btnLogin = findViewById(R.id.signIn);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.signUp){
            Intent moveToSignUp = new Intent(Login.this, SignUp.class);
            startActivity(moveToSignUp);
        }
        if (view.getId() == R.id.signIn){
            Intent moveToMenu = new Intent(Login.this, RewardMenjawab.class);
            startActivity(moveToMenu);
        }

    }

}