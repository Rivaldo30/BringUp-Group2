package id.ac.uversrivaldo.bringup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListSoalAdapter extends RecyclerView.Adapter<ListSoalAdapter.ListViewHolder>{
    private final ArrayList<Soal> listSoal;

    public ListSoalAdapter(ArrayList<Soal> list) {
        this.listSoal = list;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        Soal soal = listSoal.get(position);
        holder.tvSoal.setText(soal.getSoal());
        holder.tvJawaban.setText(soal.getJawaban());
    }

    @Override
    public int getItemCount() {
        return listSoal.size();
    }

    public static class ListViewHolder  extends RecyclerView.ViewHolder{
        TextView tvSoal, tvJawaban;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSoal = itemView.findViewById(R.id.soal);
            tvJawaban = itemView.findViewById(R.id.jawaban);
        }
    }
}
