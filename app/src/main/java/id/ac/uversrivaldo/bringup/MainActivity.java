package id.ac.uversrivaldo.bringup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvSoal;
    private final ArrayList<Soal> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSoal = findViewById(R.id.recycle);
        rvSoal.setHasFixedSize(true);


        list.addAll(getListSoal());
        showRecyclerList();
    }
    public ArrayList<Soal> getListSoal() {
        String[] dataSoal = getResources().getStringArray(R.array.data_soal);


        ArrayList<Soal> listSoal= new ArrayList<>();
        for (int i = 0; i < dataSoal.length; i++) {
            Soal soal = new Soal();
            soal.setSoal(dataSoal[i]);
            listSoal.add(soal);
        }
        return listSoal;
    }

    private void showRecyclerList(){
        rvSoal.setLayoutManager(new LinearLayoutManager(this));
        ListSoalAdapter listSoalAdapter = new ListSoalAdapter(list);
        rvSoal.setAdapter(listSoalAdapter);
    }
}