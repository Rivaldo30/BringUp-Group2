package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity implements View.OnClickListener {

    Button btn1;
    TextView txt1,txt2,txt3,txt4,txt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        ImageView backToLogin = findViewById(R.id.back1);
        backToLogin.setOnClickListener(this);


        txt1 = (TextView) findViewById(R.id.et_firtsname);
        txt2 = (TextView) findViewById(R.id.et_lastname);
        txt3 = (TextView) findViewById(R.id.et_phonenumber);
        txt4 = (TextView) findViewById(R.id.et_email);
        txt5 = (TextView) findViewById(R.id.et_password);



        btn1 = (Button) findViewById(R.id.btnSignup);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String firstname = txt1.getText().toString();
                String lastname = txt2.getText().toString();
                String phone = txt3.getText().toString();
                String email = txt4.getText().toString();
                String password = txt5.getText().toString();

                if(firstname.trim().equals("") && lastname.trim().equals("") && phone.trim().equals("") && email.trim().equals("") && password.trim().equals("")){
                    txt1.setError("Tidak boleh kosong");
                    txt2.setError("Tidak boleh kosong");
                    txt3.setError("Masukan nomor handphone");
                    txt4.setError("Masukan email mu");
                    txt5.setError("Password tidak boleh kosong");
                }else {
                    Intent singup = new Intent(SignUp.this, Login.class);
                    startActivity(singup);
                    Toast.makeText(SignUp.this, "Sign Up Berhasil", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.back1){
            Intent moveToLogin = new Intent(SignUp.this, Login.class);
            startActivity(moveToLogin);
        }
    }
}