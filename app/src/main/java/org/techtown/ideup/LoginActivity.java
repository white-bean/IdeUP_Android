package org.techtown.ideup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText login_email, login_password;
    private Button login_button, join_button;

    Button userButton;
    Button teamButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userButton = (Button)findViewById(R.id.user_button);
        teamButton = (Button)findViewById(R.id.team_button);

        userButton.setOnClickListener(topButtonsListener);
        teamButton.setOnClickListener(topButtonsListener);

        userButton.performClick();

        login_email = findViewById(R.id.login_email);
        login_password =findViewById(R.id.login_password);

        join_button=findViewById(R.id.join_button);
        join_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view ){
                Intent intent = new Intent( LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        login_button = findViewById(R.id.login_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //로그인 유효성 확인
                String UserEmail = login_email.getText().toString();
                String UserPwd = login_password.getText().toString();
                //if(){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    if(userButton.isSelected()){
                        intent.putExtra("UserState", "user");
                    }
                    else{
                        intent.putExtra("UserState","team");
                    }
                setResult(Activity.RESULT_OK, intent);
                finish();
                //}
                //else{
                //    Toast.makeText(getApplicationContext(),"로그인 실패", Toast.LENGTH_SHORT).show();
                //    return;
                //}
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