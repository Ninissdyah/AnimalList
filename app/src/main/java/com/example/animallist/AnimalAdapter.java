package com.example.animallist;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    private final ArrayList<Animal> values; //menampung data recycle view
    private final LayoutInflater inflater; //buat ngeset view


    public AnimalAdapter(Context context, ArrayList<Animal>values) {
        this.values = values;
        this.inflater = LayoutInflater.from(context);
    }

    //inflater dipake ngeset view di sini
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= inflater.inflate(R.layout.item_animal, parent, false);
        return new ViewHolder(view);
    }

    //mengatur warna dll agar dinamis
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Animal animal = values.get(position); //mengambil data sesuai dengan posisinya

        //assign inisiasi yg ada di bwh
        holder.txtName.setText(animal.name);
        holder.txtGender.setText(animal.gender);
        holder.txtDesc.setText(animal.desc);

        //ketika salah 1 diklik bakal tampil di halaman baru
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //intent ke halaman baru di detailAnimalActivity
                Intent intent = new Intent(holder.itemView.getContext(), DetailAnimalActivity.class);
               intent.putExtra("name", animal.name);
               intent.putExtra("gender", animal.gender);
               intent.putExtra("desc", animal.desc);
               holder.itemView.getContext().startActivity(intent);
//                Toast.makeText(holder.itemView.getContext(), String.valueOf(position), Toast.LENGTH_LONG).show();
            }
        });
    }

    //mengatur ukuran data misal ada 5 data tp return 2, jadi ya tampilnya cuma 2
    @Override
    public int getItemCount() {

        return values.size(2); //banyaknya sesuai dengan size
    }

    //inisiasi id
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtName, txtGender, txtDesc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txt_name);
            txtGender = itemView.findViewById(R.id.txt_gender);
            txtDesc = itemView.findViewById(R.id.txt_description);
        }
    }

}
