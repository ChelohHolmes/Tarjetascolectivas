package com.example.chelohholmes.tarjetas_colectivas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class adapter  extends BaseAdapter{
    public ArrayList<tarjeta> ListaArreglo;
    Context context;

    @Override
    public int getCount() {
        return ListaArreglo.size();
    }

    @Override
    public Object getItem(int i) {
        return ListaArreglo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return ListaArreglo.get(i).ID;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflate;
        inflate = LayoutInflater.from(context);
        View v = inflate.inflate(R.layout.tarjetero, null);
        TextView nombre = (TextView) v.findViewById(R.id.Nombre);
        TextView edad = (TextView) v.findViewById(R.id.Edad);
        TextView descripion = (TextView) v.findViewById(R.id.Descripcion);
        nombre.setText(ListaArreglo.get(i).Nombre);
        edad.setText(ListaArreglo.get(i).Edad);
        descripion.setText(ListaArreglo.get(i).Descripcion);
        ImageView imagen=(ImageView)v.findViewById(R.id.Imagens);
        Picasso.with(context).load(ListaArreglo.get(i).Imagen).into(imagen);
        return v;
    }
}
