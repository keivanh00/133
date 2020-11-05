package com.example.a133;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterPage extends AppCompatActivity {

    private TextView textViewLoginHere;

    /**
     * @Override
     * This is the textView that calls the method to
     * take us to the Login Page, from the Register page.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        textViewLoginHere = (TextView) findViewById(R.id.textViewLoginHere);
        textViewLoginHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginPage();
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
}
