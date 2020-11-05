package com.example.a133;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LoginPage extends AppCompatActivity {

    //TODO look up how to use the text edit buttons, then take the input in as an if statement
    //then enter the values in from the register page as strings


    private TextInputEditText EnterUsername, EnterPassword;
    private Button LoginButton;
    private TextView textViewRegisterHere;

    /**
     * @Override
     * This is the textView that calls the method to
     * take us to the Register Page, from the Login page.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        textViewRegisterHere = (TextView) findViewById(R.id.textViewRegisterHere);
        textViewRegisterHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegisterPage();
            }
        });
    }



    /**
     * The method that opens the Register Page
     */
    public void openRegisterPage()
    {
        Intent intent = new Intent(this, RegisterPage.class);
        startActivity(intent);
    }
}

