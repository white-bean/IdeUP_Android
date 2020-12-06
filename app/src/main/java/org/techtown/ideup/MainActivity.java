package org.techtown.ideup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    ListTeamFragment listTeamFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listTeamFragment = new ListTeamFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, listTeamFragment).commit();
    }
}