package ru.startandroid.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtView;
    Button btnJava;
    Button btnAndroid;
    ImageView imgView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Находим наши View елементы
        txtView = (TextView) findViewById(R.id.textView);
        btnJava = (Button) findViewById(R.id.button);
        btnAndroid = (Button) findViewById(R.id.button2);
        imgView = (ImageView) findViewById(R.id.imageView);
        //Присваеваем обработчик кнопкам
        btnJava.setOnClickListener(this);
        btnAndroid.setOnClickListener(this);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub
        // добавляем пункты меню
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                txtView.setText(R.string.Java);
                try {
                    imgView.setImageDrawable(getResources().getDrawable(R.drawable.ic_airplay_black_48dp));
                }
                catch (NullPointerException e) {
                    txtView.setText(R.string.ExpImageView);
                }
                break;
            case R.id.button2:
                txtView.setText(R.string.Android);
                imgView.setImageDrawable(getResources().getDrawable(R.drawable.ic_equalizer_black_48dp));
                break;
        }
    }

}
