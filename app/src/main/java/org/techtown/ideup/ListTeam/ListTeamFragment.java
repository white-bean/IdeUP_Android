package org.techtown.ideup.ListTeam;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import org.techtown.ideup.InfoTeam.infoTeamActivity;
import org.techtown.ideup.R;


public class ListTeamFragment extends Fragment {
    private RecyclerView listTeam_RV;
    private teamAdapter teamAdapter;
    private EditText search_edit;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list_team, container, false);

        init(rootView);
        setRecyclerview(rootView);
        addDummy();

        return rootView;
    }

    private void init(ViewGroup rootView){
        search_edit = rootView.findViewById(R.id.search_edit);
        search_edit.addTextChangedListener(new TextWatcher() {
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
    }
    
    private void setRecyclerview(ViewGroup rootView){
        listTeam_RV = rootView.findViewById(R.id.listTeam_RV);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        listTeam_RV.setLayoutManager(layoutManager);
        teamAdapter = new teamAdapter();
        listTeam_RV.setAdapter(teamAdapter);
    }

    private void addDummy(){
        teamAdapter.addItem(new team(R.drawable.ic_launcher_foreground, "OO팀", "OO을 위한 OO을 주제로 개발 중인 OO팀입니다."));
        teamAdapter.addItem(new team(R.drawable.ic_launcher_foreground, "OO팀", "저희와 함께 하실 분들 컴온요 베이베"));
        teamAdapter.addItem(new team(R.drawable.ic_launcher_foreground, "OO팀", "얄리얄리얄라셩 얄라리얄라"));
        teamAdapter.addItem(new team(R.drawable.ic_launcher_foreground, "OO팀", "눈누난나"));
        teamAdapter.addItem(new team(R.drawable.ic_launcher_foreground, "OO팀", "드랍 더 빝~!"));
    }
}