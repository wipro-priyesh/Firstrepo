package com.wipro.wicruit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView reset;
    private Button login;
    String uname1;
    String password1;
    Database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new Database(this);

        login = (Button) this.findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To insert data into table
                //EditText uname = (EditText) findViewById(R.id.userNameBtn);
                //String uname1 = uname.getText().toString();
                //EditText password = (EditText) findViewById(R.id.passWordBtn);
                //String password1 = password.getText().toString();
                //db.insertData(uname1, password1); //inserting data into to database working

                GetEmail();
                GetPassword();
                checkCredentials();

            }
        });

        reset = (TextView) findViewById(R.id.forogtPword_btn);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resetPassowrd = new Intent(MainActivity.this, ResetPassword.class);
                startActivity(resetPassowrd);

            }
        });
    }


    private String GetEmail() {
        String empty = "";
        EditText uname = (EditText) findViewById(R.id.userNameBtn);
        uname1 = uname.getText().toString();
        String unamecheck = db.searchUname(uname1);
        if (TextUtils.isEmpty(uname1)) {
            Toast.makeText(this, "please enter username", Toast.LENGTH_SHORT).show();
            return "please enter username";
        }
        else if (!unamecheck.equals(uname1)){
            Toast.makeText(this, "Please enter a valid username", Toast.LENGTH_SHORT).show();
            return "Please enter a valid username";
        }
        return uname1;
    }

    private String GetPassword() {
        EditText password = (EditText) findViewById(R.id.passWordBtn);
        password1 = password.getText().toString();
        String passcheck = db.search(password1);
        if (TextUtils.isEmpty(password1)) {
            Toast.makeText(this, "please enter password", Toast.LENGTH_SHORT).show();
        }
      //  else if (!passcheck.equals(password1)){
        //    Toast.makeText(this, "Please enter a valid password", Toast.LENGTH_SHORT).show();
          //  return "Please enter a valid password";
       // }
        return password1;
    }

    public void checkCredentials(){
        String pass = db.search(password1);
        String uname = db.searchUname(uname1);
        if(pass.equals(password1) && uname.equals(uname1)){
            Intent successLogin = new Intent(MainActivity.this, Homepage.class);
            startActivity(successLogin);
        }
        else if(!TextUtils.isEmpty(password1) && !TextUtils.isEmpty(uname1)){
            Toast.makeText(MainActivity.this, "incorrect data login", Toast.LENGTH_SHORT).show();
        }
    }



}
