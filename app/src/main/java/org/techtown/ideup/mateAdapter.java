package org.techtown.ideup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class mateAdapter extends RecyclerView.Adapter<mateAdapter.ViewHolder>{
    ArrayList<mate> items = new ArrayList<mate>();

    @NonNull
    @Override
    public mateAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.mate_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull mateAdapter.ViewHolder holder, int position) {
        mate item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(mate item){
        items.add(item);
    }

    public void setItems(ArrayList<mate> items){
        this.items = items;
    }

    public mate getItem(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView member_image;
        TextView name;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            member_image = itemView.findViewById(R.id.member_image);
            name = itemView.findViewById(R.id.name);
        }

        public void setItem(mate item){
            member_image.setImageResource(item.getImage());
            name.setText(item.getName());
        }
    }
}
