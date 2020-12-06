package org.techtown.ideup.TeamComplain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.ideup.R;

import java.util.ArrayList;

public class TeamComplainAdapter extends RecyclerView.Adapter<TeamComplainAdapter.ViewHolder> {

    OnTeamComplainClickListener listener;
    ArrayList<TeamComplain> complains = new ArrayList<>();

    @NonNull
    @Override
    public TeamComplainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_team_complain, parent, false);
        return new TeamComplainAdapter.ViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamComplainAdapter.ViewHolder holder, int position) {
        TeamComplain complain = complains.get(position);
        holder.setTextView(complain);
//        ChallengeItem item = items.get(position);
//        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return complains.size();
    }

    public void addItem(TeamComplain complain) {
        complains.add(complain);
    }

    public void setItems(ArrayList<TeamComplain> complains) { //ArrayList전체를 설정할 수 있는 함수
        this.complains = complains;
    }


    public TeamComplain getItem(int position) {
        return complains.get(position);
    }

    public void setComplain(int position, TeamComplain complain) {
        complains.set(position, complain);
    }

    public void setOnItemClickListener(OnTeamComplainClickListener listener) { //아이템뷰에 onClickListener 설정하기
        this.listener = listener;
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;

        public ViewHolder(final View itemView, final OnTeamComplainClickListener listener) {
            super(itemView);

            textView = itemView.findViewById(R.id.complainRegisterText);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

        }

        public void setTextView(TeamComplain complain) {
            textView.setText(complain.getComplain());
        }


    }
}