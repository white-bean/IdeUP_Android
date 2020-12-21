package org.techtown.ideup.ProjectList;

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

import org.techtown.ideup.R;

public class ProjectListFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_project_list, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.projectListRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

        ProjectListAdapter adapter = new ProjectListAdapter();
        adapter.addItem(new Project("창업팀1", "프로젝트1", "프로젝트 내용"));
        adapter.addItem(new Project("창업팀2", "프로젝트2", "프로젝트 내용"));
        adapter.addItem(new Project("창업팀3", "프로젝트3", "프로젝트 내용"));
        adapter.addItem(new Project("창업팀4", "프로젝트4", "프로젝트 내용"));

        recyclerView.setAdapter(adapter);

        return rootView;
    }
}
