package org.techtown.ideup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.json.JSONException;

public class RegisterActivity extends AppCompatActivity {

    private Button userButton;
    private Button teamButton;

    private EditText join_email, join_password, join_name, join_pwck;
    private Button join_button, check_button, delete_button;
    private AlertDialog dialog;
    private boolean validate = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        userButton = (Button)findViewById(R.id.user_button);
        teamButton = (Button)findViewById(R.id.team_button);

        userButton.setOnClickListener(topButtonsListener);
        teamButton.setOnClickListener(topButtonsListener);

        userButton.performClick();

        //아이디값 찾아주기
        join_email = findViewById( R.id.join_email );
        join_password = findViewById( R.id.join_password );
        join_name = findViewById( R.id.join_name );
        join_pwck = findViewById(R.id.join_pwck);

        //아이디 중복 체크
        check_button = findViewById(R.id.check_button);
        check_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // 회원가입 유효성 확인
            }
        });

        join_button = findViewById( R.id.join_button);
        join_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //회원가입
            }
        });

        delete_button = findViewById(R.id.delete_button);
        delete_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 취소
                //Intent returnIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                finish();
                //startActivity(returnIntent);
            }
        });

    }

    View.OnClickListener topButtonsListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if(v.getId()==R.id.user_button){
                userButton.setSelected(true);
                teamButton.setSelected(false);
            }
            else{
                userButton.setSelected(false);
                teamButton.setSelected(true);
            }
        }
    };
}