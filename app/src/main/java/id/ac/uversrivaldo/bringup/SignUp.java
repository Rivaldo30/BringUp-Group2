package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImageView backToLogin = findViewById(R.id.back1);
        backToLogin.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.back1){
            Intent moveToLogin = new Intent(SignUp.this, Login.class);
            startActivity(moveToLogin);
        }
    }
}