package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = (EditText)findViewById(R.id.name);
        EditText number = (EditText)findViewById(R.id.number);
        EditText mail = (EditText)findViewById(R.id.mail);
        EditText feedback = (EditText)findViewById(R.id.feedback);
        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL,new String("xyz@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT,"FeedBack From App");
                i.putExtra(Intent.EXTRA_TEXT,"Name:"+name.getText()+
                        "\n Message:"+feedback.getText());
                try {
                    startActivity(Intent.createChooser(i,"Please Select Email"));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText(MainActivity.this, "There are no Email Clients", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void scrn2(View view) {
        Intent intent = new Intent(this, Smileyrating.class);
        startActivity(intent);

    }
}