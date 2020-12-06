package org.techtown.ideup.InfoTeam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.techtown.ideup.InfoTeam.mate;
import org.techtown.ideup.InfoTeam.mateAdapter;
import org.techtown.ideup.InfoTeam.post;
import org.techtown.ideup.InfoTeam.postAdapter;
import org.techtown.ideup.R;

public class MyTeamFragment extends Fragment {
    private RecyclerView mate_RV, post_RV;
    private org.techtown.ideup.InfoTeam.mateAdapter mateAdapter;
    private org.techtown.ideup.InfoTeam.postAdapter postAdapter;

    private ImageView team_iV;
    private TextView tname_tV, tinfo_tV;
    private Button mate_btn, edit_btn, post_btn, show_btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_my_team, container, false);

        init(rootView);
        setRecyclerview(rootView);
        addDummy();

        return rootView;
    }

    private void init(ViewGroup rootView){
        team_iV = rootView.findViewById(R.id.team_iV);
        tname_tV = rootView.findViewById(R.id.tname_tV);
        tinfo_tV = rootView.findViewById(R.id.tinfo_tV);
        mate_btn = rootView.findViewById(R.id.mate_btn);
        edit_btn = rootView.findViewById(R.id.edit_btn);
        post_btn = rootView.findViewById(R.id.post_btn);
        show_btn = rootView.findViewById(R.id.show_btn);

        mate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // See All Mates 눌렀을 때, 팀맺음 한 모든 사용자 보기
            }
        });

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //수정하기 눌렀을 때
            }
        });

        post_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //새로운 글 등록하기 눌렀을 때
            }
        });

        show_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //의견 보기 눌렀을 때
            }
        });
    }
    private void setRecyclerview(ViewGroup rootView){
        mate_RV = rootView.findViewById(R.id.mate_RV);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false);
        mate_RV.setLayoutManager(layoutManager);
        mateAdapter = new mateAdapter();
        mate_RV.setAdapter(mateAdapter);

        post_RV = rootView.findViewById(R.id.post_RV);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        post_RV.setLayoutManager(layoutManager2);
        postAdapter = new postAdapter();
        post_RV.setAdapter(postAdapter);
    }
    private void addDummy(){
        mateAdapter.addItem(new mate(R.drawable.ic_launcher_foreground, "홍길동"));
        mateAdapter.addItem(new mate(R.drawable.ic_launcher_foreground, "홍길동"));
        mateAdapter.addItem(new mate(R.drawable.ic_launcher_foreground, "홍길동"));
        mateAdapter.addItem(new mate(R.drawable.ic_launcher_foreground, "홍길동"));
        mateAdapter.addItem(new mate(R.drawable.ic_launcher_foreground, "홍길동"));

        postAdapter.addItem((new post("🎈앱 출시 이벤트🎈 리뷰쓰면 최대 50% 할인쿠폰이?", "저희 어플이 드디어 출시되었습니다~~")));
        postAdapter.addItem((new post("OOO 12월 뉴스 \"곧 어플이 출시된다고?\"", "OOO 12월 소식!"+"\n"+"저희 어플이 곧 출시된다는데요!!")));
    }
}