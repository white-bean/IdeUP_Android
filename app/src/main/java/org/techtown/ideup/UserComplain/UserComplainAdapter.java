package org.techtown.ideup.UserComplain;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.ideup.R;

import java.util.ArrayList;

public class UserComplainAdapter extends RecyclerView.Adapter<UserComplainAdapter.ViewHolder> {

    OnUserComplainClickListener listener;
    ArrayList<UserComplain> complains = new ArrayList<>();

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_user_complain, parent, false);
        return new ViewHolder(itemView, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserComplain complain = complains.get(position);
        holder.setTextView(complain);
//        ChallengeItem item = items.get(position);
//        holder.setItem(item);
    }

    @Override
    public int getItemCount() {
        return complains.size();
    }

    public void addItem(UserComplain complain){
        complains.add(complain);
    }

    public void setItems(ArrayList<UserComplain> complains){ //ArrayList전체를 설정할 수 있는 함수
        this.complains = complains;
    }


    public UserComplain getItem(int position){
        return complains.get(position);
    }

    public void setComplain(int position, UserComplain complain){
        complains.set(position, complain);
    }

    public void setOnItemClickListener(OnUserComplainClickListener listener){ //아이템뷰에 onClickListener 설정하기
        this.listener=listener;
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textView;
        private Button likeBT;
        private Button replyBT;
        public ViewHolder(final View itemView, final OnUserComplainClickListener listener) {
            super(itemView);

            textView = itemView.findViewById(R.id.complainText);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });

        }
        public void setTextView(UserComplain complain){
            textView.setText(complain.getComplain());
        }


    }
}
