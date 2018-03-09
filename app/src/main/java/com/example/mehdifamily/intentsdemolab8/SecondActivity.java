package com.example.mehdifamily.intentsdemolab8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btn = (Button) findViewById(R.id.btnReturn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(SecondActivity.this,MainActivity.class);
                intent.putExtra("Name", "NEW BUTTON");
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}