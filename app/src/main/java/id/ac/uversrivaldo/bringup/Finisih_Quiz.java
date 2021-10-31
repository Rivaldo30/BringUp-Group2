package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Finisih_Quiz extends AppCompatActivity {

    Button btn1,btn2;
    TextView txt_nilai, txt_comment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finisih_quiz);

        btn2 = (Button) findViewById(R.id.btnComplete);

        txt_nilai = (TextView) findViewById(R.id.txt_nilai);
        txt_comment = (TextView) findViewById(R.id.txt_comment);
        btn1 = (Button) findViewById(R.id.btn_cobalagi);

        int nilai = getIntent().getExtras().getInt("nilai");
        txt_nilai.setText(String.valueOf(nilai));


        if(nilai >= 85){
            txt_comment.setText("Wah Nilai yang bagus, Hebat!");
        } else if (nilai >= 75) {
            txt_comment.setText("Cukup bagus, tingkatkan lagi!");
        } else {
            txt_comment.setText("Kurangin main gamenya!");
        }

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cobalagi = new Intent(Finisih_Quiz.this, Quiz.class);
                startActivity(cobalagi);
                finish();
            }
        });




        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent complete = new Intent(Finisih_Quiz.this, MainActivity.class);
                startActivity(complete);
            }
        });
    }
}