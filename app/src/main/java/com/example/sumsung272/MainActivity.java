package com.example.sumsung272;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String login = "howtofinish";
    private String password = "ALLmyHoMeWoRk";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView fin = findViewById(R.id.textView);
        Button bt = findViewById(R.id.button);
        TextView gin = findViewById(R.id.editText2);
        final TextView pw = findViewById(R.id.editText3);
        View.OnClickListener listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent t;
                switch (v.getId()) {
                    case R.id.button:
                        t = new Intent(MainActivity.this, SecondActivity.class);
                        if(pw.getText().toString() == password){
                            fin.setText("Инициализация прошла успешно");
                        }
                        else {
                            startActivity(t);
                        }
                        break;
                }

            }
        };
        bt.setOnClickListener(listen);
        login = getIntent().getStringExtra("login");
        password = getIntent().getStringExtra("password");
        gin.setText(getIntent().getStringExtra("login"));
    }

}
