package org.techtown.ideup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class postAdapter extends RecyclerView.Adapter<postAdapter.ViewHolder>{
    ArrayList<post> items = new ArrayList<post>();

    @NonNull
    @Override
    public postAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.post_item, parent, false);

        return new postAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull postAdapter.ViewHolder holder, int position) {
        post item = items.get(position);
        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public void addItem(post item){
        items.add(item);
    }

    public void setItems(ArrayList<post> items){
        this.items = items;
    }

    public post getItem(int position){
        return items.get(position);
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView subject, content;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            subject = itemView.findViewById(R.id.subject_tV);
            content = itemView.findViewById(R.id.content_tV);
        }

        public void setItem(post item){
            subject.setText(item.getsubject());
            content.setText(item.getcontent());
        }
    }
}
