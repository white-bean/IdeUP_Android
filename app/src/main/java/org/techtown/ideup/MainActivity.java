package org.techtown.ideup;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.techtown.ideup.InfoTeam.MyTeamFragment;
import org.techtown.ideup.InfoTeam.infoTeamActivity;
import org.techtown.ideup.ListTeam.ListTeamFragment;
import org.techtown.ideup.ProjectList.ProjectListFragment;
import org.techtown.ideup.TeamComplain.TeamComplainFragment;
import org.techtown.ideup.UserComplain.UserComplainFragment;
import org.techtown.ideup.UserComplain.UserComplainRegisterFragment;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fragmentManager = getSupportFragmentManager();
    private UserComplainFragment userComplainFragment = new UserComplainFragment();
    private TeamComplainFragment teamComplainFragment = new TeamComplainFragment();
    private UserComplainRegisterFragment userComplainRegisterFragment = new UserComplainRegisterFragment();
    private ProjectListFragment projectListFragment = new ProjectListFragment();
    private ListTeamFragment listTeamFragment = new ListTeamFragment();
    private MyTeamFragment myTeamFragment = new MyTeamFragment();

//    private org.techtown.ideup.InfoTeam.infoTeamActivity infoTeamActivity = new infoTeamActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        fragmentManager.beginTransaction().replace(R.id.main_layout, myTeamFragment).commitAllowingStateLoss();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.tab1: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, userComplainFragment).commitAllowingStateLoss();
         // if 창업가  getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, teamComplainFragment).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.tab2: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, listTeamFragment).commitAllowingStateLoss();

//if 창업가               getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, myTeamFragment).commitAllowingStateLoss();

                        return true;
                    }
                    case R.id.tab3: {
                        getSupportFragmentManager().beginTransaction().replace(R.id.main_layout, projectListFragment).commitAllowingStateLoss();
                        return true;
                    }
                    case R.id.tab4: {
                        // 4번 버튼.?
                        return true;
                    }
                    default:
                        return false;
                }
            }
        });
    }

    public void setFragment(String fragment){ // 프래그먼트 replace

        if(fragment.equals("userComplain")){ // 소비자문의리스트 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.main_layout, userComplainFragment).commit();
        }
        else if(fragment.equals("teamComplain")){ // 창업팀에서 보는 소비자문의리스트 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.main_layout, teamComplainFragment).commit();
        }
        else if(fragment.equals("userComplainRegister")){ // 소비자문의 등록 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.main_layout,userComplainRegisterFragment).commit();
        }
        else if(fragment.equals("projectList")){ // 프로젝트 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.main_layout,projectListFragment).commit();
        }
        else if(fragment.equals("listTeam")){
            fragmentManager.beginTransaction().replace(R.id.main_layout, listTeamFragment).commit();
        }

    }
}
        /*
        Button companyInfoBT = findViewById(R.id.companyInfoBT);
        Button userComplainBT = findViewById(R.id.userComplainBT);
        Button teamComplainBT = findViewById(R.id.teamComplainBT);
        Button projectListBT = findViewById(R.id.projectListBT);
        Button teamListBT = findViewById(R.id.teamListBT);


        // 네비게이션바 버튼 클릭시

        companyInfoBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(),infoTeamActivity.class);
                //startActivity(intent);
                fragmentManager.beginTransaction().replace(R.id.frameLayout, myTeamFragment).commitAllowingStateLoss();
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

        projectListBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.frameLayout, projectListFragment).commitAllowingStateLoss(); // UserComplainFragment 띄우기
            }
        });

        teamListBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().replace(R.id.frameLayout, listTeamFragment).commitAllowingStateLoss();
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
        else if(fragment.equals("projectList")){ // 프로젝트 프래그먼트
            fragmentManager.beginTransaction().replace(R.id.frameLayout,projectListFragment).commit();
        }
        else if(fragment.equals("listTeam")){
            fragmentManager.beginTransaction().replace(R.id.frameLayout, listTeamFragment).commit();
        }

    }
}*/