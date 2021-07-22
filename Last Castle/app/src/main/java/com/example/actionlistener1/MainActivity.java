package com.example.actionlistener1;

import android.graphics.drawable.TransitionDrawable;
import android.support.v4.app.RemoteActionCompatParcelizer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Archer Win!!", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }
} //Hans Liongga 2201730425