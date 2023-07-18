package com.websarva.wings.android.buttonsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //button1 リスナー
        Button btClick1 = findViewById(R.id.btClick1);
        Button1ClickListener listener = new Button1ClickListener();
        btClick1.setOnClickListener(listener);

        //button3 匿名メソッド
        findViewById(R.id.btClick3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "button3が押されました", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //button1のリスナー
    private class Button1ClickListener implements View.OnClickListener{
;
        @Override
        public void onClick(View v) {

            Toast.makeText(MainActivity.this, "button1が押されました", Toast.LENGTH_SHORT).show();
            //Snackbar.make(v, "button1が押されました", Snackbar.LENGTH_SHORT).show();

        }
    }

    //button2のonClick属性
    public void onButton2Click(View view){
        Toast.makeText(MainActivity.this, "button2が押されました", Toast.LENGTH_SHORT).show();
    }

}