package org.techtown.ideup.UserComplain;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.techtown.ideup.MainActivity;
import org.techtown.ideup.R;

public class UserComplainFragment extends Fragment {
    //MainActivity activity = (MainActivity)getActivity();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup)inflater.inflate(R.layout.fragment_user_complain, container, false);

        Button registerComplainBT = rootView.findViewById(R.id.registerComplainBT);
        registerComplainBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).setFragment("userComplainRegister");
            }
        });

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
