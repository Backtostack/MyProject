package ru.startandroid.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtView;
    Button btnJava;
    Button btnAndroid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Находим наши View елементы
        txtView = (TextView) findViewById(R.id.textView);
        btnJava = (Button) findViewById(R.id.button);
        btnAndroid = (Button) findViewById(R.id.button2);
        //Присваеваем обработчик кнопкам
        btnJava.setOnClickListener(this);
        btnAndroid.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                txtView.setText(R.string.Java);
                break;
            case R.id.button2:
                txtView.setText(R.string.Android);
        }
    }

}
