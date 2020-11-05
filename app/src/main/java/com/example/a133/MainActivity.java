package com.example.a133;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * The functionalities of the first page when the application is first opened
 *
 */
public class MainActivity extends AppCompatActivity
{
    private Button GoToReg;
    private Button GoToLogin;


    /**
     * @Override
     * This is the textView that calls the methods to
     * take us to the Login and Register Page.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GoToLogin = (Button) findViewById(R.id.GoToLogin);
        GoToLogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openLoginPage();
            }
        });

        GoToReg = (Button) findViewById(R.id.GoToReg);
        GoToReg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                openRegisterPage();
            }
        });
    }


    /**
     * The method that opens the Login Page
     */
    public void openLoginPage()
    {
        Intent intent = new Intent(this, LoginPage.class);
        startActivity(intent);
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