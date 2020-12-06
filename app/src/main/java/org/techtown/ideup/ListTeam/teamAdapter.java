package org.techtown.ideup.ListTeam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.ideup.R;

import java.util.ArrayList;

public class teamAdapter extends RecyclerView.Adapter<teamAdapter.ViewHolder> implements OnTeamItemClickListener{
    ArrayList<team> items = new ArrayList<team>();
    OnTeamItemClickListener listener;

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

    public void setOnItemClickListener(OnTeamItemClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onItemClick(ViewHolder holder, View view, int position) {
        if (listener != null){
            listener.onItemClick(holder, view, position);
        }
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
