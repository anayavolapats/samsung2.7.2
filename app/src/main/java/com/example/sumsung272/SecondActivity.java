package com.example.sumsung272;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button bn = findViewById(R.id.button);
        final TextView pass = findViewById(R.id.editText);
        final TextView log = findViewById(R.id.editText4);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(SecondActivity.this, MainActivity.class);
                g.putExtra("login", log.getText().toString());
                g.putExtra("password", pass.getText().toString());
                startActivity(g);
            }
        };
        bn.setOnClickListener(listener);
    }
}

