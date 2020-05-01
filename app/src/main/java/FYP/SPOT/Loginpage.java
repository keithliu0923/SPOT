package FYP.SPOT;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Loginpage extends AppCompatActivity {

        private EditText Name;
        private EditText Password;
        private TextView Info;
        private Button Login;
        private int counter = 5;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_loginpage);

            Name = (EditText)findViewById(R.id.etName);
            Password = (EditText)findViewById(R.id.etPassword);
            Info = (TextView)findViewById(R.id.tvInfo);
            Login = (Button)findViewById(R.id.btnLogin);

            Info.setText("** 5 attempts left **");

            Login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    validate(Name.getText().toString(), Password.getText().toString());
                }
            });
        }

        private void validate(String userName, String userPassword){
            if((userName.equals("20023919")) && (userPassword.equals("20023919"))||(userName.equals("20090059")) && (userPassword.equals("20090059"))||(userName.equals("20091368")) && (userPassword.equals("20091368"))||(userName.equals("20093274")) && (userPassword.equals("20093274"))||(userName.equals("20079484")) && (userPassword.equals("20079484"))){
                Intent intent = new Intent(Loginpage.this, MainActivity.class);
                startActivity(intent);
            }else{
                counter--;

                Info.setText("**" + String.valueOf(counter) + " Attempts left **" );

                if(counter == 0){
                    Login.setEnabled(false);
                }
            }
        }

    }
