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
    private infoTeamActivity infoTeamActivity = new infoTeamActivity();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button companyInfoBT = findViewById(R.id.companyInfoBT);
        Button userComplainBT = findViewById(R.id.userComplainBT);
        Button teamComplainBT = findViewById(R.id.teamComplainBT);

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
}
