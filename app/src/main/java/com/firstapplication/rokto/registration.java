package com.firstapplication.rokto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class registration extends AppCompatActivity {

    private Button donorButton,recipientButton;
    private TextView backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        donorButton = findViewById(R.id.donorButton);
        recipientButton = findViewById(R.id.receipientButton);
        backButton = findViewById(R.id.backButton);

        donorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(registration.this,DonorRegistration.class);
                startActivity(intent);
            }
        });
        recipientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(registration.this,RecipientRegistration.class);
                startActivity(intent);
            }
        });
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(registration.this,Login.class);
                startActivity(intent);
            }
        });

    }
}