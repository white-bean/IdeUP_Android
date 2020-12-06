package org.techtown.ideup.InfoTeam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.techtown.ideup.R;

public class infoTeamActivity extends AppCompatActivity {
    private RecyclerView mate_RV, post_RV;
    private mateAdapter mateAdapter;
    private postAdapter postAdapter;

    private ImageView team_iV;
    private TextView tname_tV, tinfo_tV;
    private Button mate_btn, send_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_team);

        init();
        setRecyclerview();
        addDummy();
    }
    private void init(){
        team_iV = findViewById(R.id.team_iV);
        tname_tV = findViewById(R.id.tname_tV);
        tinfo_tV = findViewById(R.id.tinfo_tV);
        mate_btn = findViewById(R.id.mate_btn);
        send_btn = findViewById(R.id.send_btn);

        mate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // See All Mates 눌렀을 때, 팀맺음 한 모든 사용자 보기
            }
        });

        send_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 의견보내기 눌렀을 때때
            }
       });
    }
    private void setRecyclerview(){
        mate_RV = findViewById(R.id.mate_RV);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        mate_RV.setLayoutManager(layoutManager);
        mateAdapter = new mateAdapter();
        mate_RV.setAdapter(mateAdapter);

        post_RV = findViewById(R.id.post_RV);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
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