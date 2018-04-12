package com.learn2crack.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> countries;
    private ArrayList<String> deskripsi;
    private ArrayList<Integer> gambar;


    public DataAdapter(ArrayList<String> countries, ArrayList<String> deskripsi, ArrayList<Integer> gambar) {
        this.countries = countries;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {
        viewHolder.tv_country.setText(countries.get(i));
        viewHolder.tv_descountry.setText(deskripsi.get(i));
        viewHolder.pic_negara.setImageResource(gambar.get(i));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_country;
        private TextView tv_descountry;
        private ImageView pic_negara;
        public ViewHolder(View view) {
            super(view);
            tv_descountry = (TextView)view.findViewById(R.id.tv_countrydesc);
            tv_country = (TextView)view.findViewById(R.id.tv_country);
            pic_negara = (ImageView)view.findViewById(R.id.picCountry);
        }
    }

}
