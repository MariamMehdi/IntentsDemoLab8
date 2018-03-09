package com.example.mehdifamily.intentsdemolab8;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static int REQUEST_CODE=0;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE && resultCode==RESULT_OK)
        {
            Button btn1 = (Button) findViewById(R.id.btnIntent1);
            String name=data.getStringExtra("Name");
            btn1.setText(name);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btnIntent1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,REQUEST_CODE);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btnIntent2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("tel:03131234567");
                Intent i = new Intent(Intent.ACTION_DIAL,url);
                startActivity(i);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btnIntent3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri url = Uri.parse("https://www.yahoo.com");
                Intent i = new Intent(Intent.ACTION_VIEW,url);
                startActivity(i);
            }
        });
    }
}
