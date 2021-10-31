package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class kumpulan_jawaban extends AppCompatActivity implements View.OnClickListener {



    private RecyclerView rvSoalJawab;
    private final ArrayList<Soal> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_jawaban);
        rvSoalJawab = findViewById(R.id.rv_jawaban);
        rvSoalJawab.setHasFixedSize(true);

        TextView view = findViewById(R.id.kumpulan_jawaban);
        view.setOnClickListener(this);




        list.addAll(getListSoal());
        showRecyclerList();

    }




    public ArrayList<Soal> getListSoal() {
        String[] dataSoal = getResources().getStringArray(R.array.data_soal);
        String[] dataJawaban = getResources().getStringArray(R.array.data_jawaban);


        ArrayList<Soal> listSoal= new ArrayList<>();
        for (int i = 0; i < dataSoal.length; i++) {
            Soal soal = new Soal();
            soal.setSoal(dataSoal[i]);
            soal.setJawaban(dataJawaban[i]);
            listSoal.add(soal);
        }
        return listSoal;
    }

    private void showRecyclerList(){
        rvSoalJawab.setLayoutManager(new LinearLayoutManager(this));
        ListSoalAdapter listSoalAdapter = new ListSoalAdapter(list);
        rvSoalJawab.setAdapter(listSoalAdapter);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()== R.id.kumpulan_jawaban){
            Intent moveToSignUp = new Intent(kumpulan_jawaban.this, MainActivity.class);
            startActivity(moveToSignUp);
        }
    }


}