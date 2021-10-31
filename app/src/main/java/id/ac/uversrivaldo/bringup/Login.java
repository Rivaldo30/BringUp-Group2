package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    Button btnLogin;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signUp = findViewById(R.id.signUp);
        signUp.setOnClickListener(this);


        btnLogin = (Button) findViewById(R.id.signIn);
        username = (EditText) findViewById(R.id.usernameId);
        password = (EditText) findViewById(R.id.passwordId);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = username.getText().toString();
                String passwordKey = password.getText().toString();

                if(usernameKey.equals("admin") && passwordKey.equals("12345")) {
                    Toast.makeText(Login.this, "Login Berhasil", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(Login.this, MainActivity.class);
                    Login.this.startActivity(i);
                    finish();
                } else if(usernameKey.trim().equals("") && passwordKey.trim().equals("")){
                    username.setError("Tidak boleh kosong");
                    password.setError("Masukkan password");
                }else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password anda salah!").setNegativeButton("Coba Lagi", null).create().show();
                }

            }
        });
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.signUp){
            Intent moveToSignUp = new Intent(Login.this, SignUp.class);
            startActivity(moveToSignUp);
        }
    }

}