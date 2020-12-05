package org.techtown.ideup;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class teamAdapter extends RecyclerView.Adapter<teamAdapter.ViewHolder>{
    ArrayList<team> items = new ArrayList<team>();

    @NonNull
    @Override
    public teamAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.team_item, parent, false);

        return new teamAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull teamAdapter.ViewHolder holder, int position) {
        team item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
    public void addItem(team item){
        items.add(item);
    }
    public void setItems(ArrayList<team> items){
        this.items = items;
    }

    public team getItem(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tname_tV, tinfo_tV;
        ImageView team_iV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tname_tV = itemView.findViewById(R.id.tname_tV);
            tinfo_tV = itemView.findViewById(R.id.tinfo_tV);
            team_iV = itemView.findViewById(R.id.team_iV);
        }

        public void setItem(team item){
            tname_tV.setText(item.getName());
            tinfo_tV.setText(item.getInfo());
            team_iV.setImageResource(item.getImage());
        }
    }
}
