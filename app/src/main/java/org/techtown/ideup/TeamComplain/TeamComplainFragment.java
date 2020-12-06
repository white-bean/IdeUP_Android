package org.techtown.ideup.TeamComplain;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.ideup.R;

public class TeamComplainFragment extends Fragment {

    private EditText search_hashtag;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_team_complain, container, false);

        search_hashtag = rootView.findViewById(R.id.search_hashtag);

        search_hashtag.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        RecyclerView recyclerView = rootView.findViewById(R.id.teamComplainRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        // vertical linearLayout 설정
        TeamComplainAdapter adapter = new TeamComplainAdapter();
        adapter.addItem(new TeamComplain("창업팀이 보는 소비자가 등록한 불편글 1"));
        adapter.addItem(new TeamComplain("창업팀이 보는 소비자가 등록한 불편글 2"));
        adapter.addItem(new TeamComplain("창업팀이 보는 소비자가 등록한 불편글 3"));
        adapter.addItem(new TeamComplain("창업팀이 보는 소비자가 등록한 불편글 4"));
        adapter.addItem(new TeamComplain("창업팀이 보는 소비자가 등록한 불편글 5"));

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}