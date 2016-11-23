package com.example.cristian.muscleregistrationylogin;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cristian on 18/11/2016.
 */

public class RutineAdapter extends ArrayAdapter{
    List list = new ArrayList<>();


    public RutineAdapter(Context context, int resource) {
        super(context, resource);

    }

    static class DataHandler{

        ImageView Poster;
        TextView Title;
        TextView Reps;

    }
    @Override
    public void add(Object object) {
        super.add(object);
        list.add(object);

    }

    @Override
    public int getCount() {
        return this.list.size();
    }


    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View row;
        row = convertView;
        DataHandler handler;
        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row =  inflater.inflate(R.layout.row_layout12,parent,false);
            handler = new DataHandler();
            handler.Poster= (ImageView) row.findViewById(R.id.rutine_poster);
            handler.Title= (TextView) row.findViewById(R.id.rutine_name);
            handler.Reps= (TextView) row.findViewById(R.id.rutine_reps);
            row.setTag(handler);
        }else{
            handler= (DataHandler) row.getTag();

        }

        ProveedorDeRutinas proveedor;
        proveedor = (ProveedorDeRutinas) this.getItem(position);
        handler.Poster.setImageResource(proveedor.getRutine_poster_resurce());
        handler.Title.setText(proveedor.getRutine_title());
        handler.Reps.setText(proveedor.getRutine_reps());

        return row;
    }
}
