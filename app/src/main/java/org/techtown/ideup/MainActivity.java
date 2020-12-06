package org.techtown.ideup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import org.techtown.ideup.R;
import org.techtown.ideup.UserComplainFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private UserComplainFragment userComplainFragment = new UserComplainFragment();
    private TeamComplainFragment teamComplainFragment = new TeamComplainFragment();
    private UserComplainRegisterFragment userComplainRegisterFragment = new UserComplainRegisterFragment();

    private infoTeamActivity infoTeamActivity = new infoTeamActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button companyInfoBT = findViewById(R.id.companyInfoBT);
        Button userComplainBT = findViewById(R.id.userComplainBT);
        Button teamComplainBT = findViewById(R.id.teamComplainBT);

        // 네비게이션바 버튼 클릭시

        companyInfoBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),infoTeamActivity.class);
                startActivity(intent);
            }
        });

        userComplainBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.frameLayout, userComplainFragment).commitAllowingStateLoss(); // UserComplainFragment 띄우기
            }
        });

        teamComplainBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.frameLayout, teamComplainFragment).commitAllowingStateLoss(); // UserComplainFragment 띄우기
            }
        });


    }

    public void setFragment(String fragment){ // 프래그먼트 replace

        if(fragment.equals("userComplain")){ // 소비자문의리스트 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.frameLayout, userComplainFragment).commit();
        }
        else if(fragment.equals("teamComplain")){ // 창업팀에서 보는 소비자문의리스트 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.frameLayout, teamComplainFragment).commit();
        }
        else if(fragment.equals("userComplainRegister")){ // 소비자문의 등록 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.frameLayout,userComplainRegisterFragment).commit();
        }

    }
}
