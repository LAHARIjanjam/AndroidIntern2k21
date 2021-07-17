package com.example.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hsalf.smileyrating.SmileyRating;

public class Smileyrating extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smileyrating);
        SmileyRating smileyRating = findViewById(R.id.smile_rating);
        smileyRating.setSmileySelectedListener(new SmileyRating.OnSmileySelectedListener() {
            @Override
            public void onSmileySelected(SmileyRating.Type type) {
                switch(type) {
                    case BAD:
                        Toast.makeText(Smileyrating.this, "Bad", Toast.LENGTH_SHORT).show();
                        break;
                    case GOOD:
                        Toast.makeText(Smileyrating.this, "Good", Toast.LENGTH_SHORT).show();
                        break;
                    case GREAT:
                        Toast.makeText(Smileyrating.this, "Great", Toast.LENGTH_SHORT).show();
                        break;
                    case OKAY:
                        Toast.makeText(Smileyrating.this, "Okay", Toast.LENGTH_SHORT).show();
                        break;
                    case TERRIBLE:
                        Toast.makeText(Smileyrating.this, "Terrible", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        /*SmileRating smileRating = (SmileRating)findViewById(R.id.smile_rating);
        smileyRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener() {
            @Override
            public void onSmileySelected(int smiley, boolean reselected) {
                switch (smiley){
                    case SmileRating.BAD:
                        Toast.makeText(Smileyrating.this, "Bad", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GOOD:
                        Toast.makeText(Smileyrating.this, "Good", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.GREAT:
                        Toast.makeText(Smileyrating.this, "Great", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.OKAY:
                        Toast.makeText(Smileyrating.this, "Okay", Toast.LENGTH_SHORT).show();
                        break;
                    case SmileRating.TERRIBLE:
                        Toast.makeText(Smileyrating.this, "Terrible", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener() {
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                Toast.makeText(Smileyrating.this, "Selected Rating", Toast.LENGTH_SHORT).show();
            }
        });*/


    }

    public void Submit(View view) {
      /*  Intent i =new Intent (this,SecondActivity.class);
        i.putExtra("key",n);
        startActivity(i);*/
        Intent i = new Intent(this,SubmitActivity.class);
        startActivity(i);
    }
}