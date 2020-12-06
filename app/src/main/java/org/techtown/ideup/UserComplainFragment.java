package org.techtown.ideup;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.ideup.R;

public class UserComplainFragment extends Fragment {
    private EditText searchHashTag;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_user_complain, container, false);

        searchHashTag = rootView.findViewById(R.id.search_hashtag);


        RecyclerView recyclerView = rootView.findViewById(R.id.userComplainRecycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL,false));
        // vertical linearLayout 설정
        UserComplainAdapter adapter = new UserComplainAdapter();
        adapter.addItem(new UserComplain("불편1"));
        adapter.addItem(new UserComplain("불편2"));
        adapter.addItem(new UserComplain("불편3"));
        adapter.addItem(new UserComplain("불편4"));
        adapter.addItem(new UserComplain("불편5"));

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
