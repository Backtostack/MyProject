package ru.startandroid.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txtView;
    Button btnJava;
    Button btnAndroid;
    /*ImageView imgView;*/
    CheckBox checkBox, checkBox2, checkBox3;
    SeekBar sbWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Находим наши View елементы
        txtView = (TextView) findViewById(R.id.textView);
        btnJava = (Button) findViewById(R.id.button);
        btnAndroid = (Button) findViewById(R.id.button2);
        /*imgView = (ImageView) findViewById(R.id.imageView);*/
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        sbWeight = (SeekBar) findViewById(R.id.sbWeight);

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
    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem itemaudio = menu.findItem(R.id.saudio);
        MenuItem itemvideo = menu.findItem(R.id.svideo);
        if (checkBox.isChecked()) {
            itemaudio.setVisible(true);
            itemvideo.setVisible(true);
        } else {
            itemaudio.setVisible(false);
            itemvideo.setVisible(false);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public void onClick(View v) {
        Animation animalpha = null;
        /*Animation animtranslate = null;*/
        animalpha = AnimationUtils.loadAnimation(this, R.anim.myalpha);
        switch (v.getId()) {
            case R.id.button:
                if (checkBox2.isChecked()) {
                    txtView.setText(R.string.Java);
                    btnJava.startAnimation(animalpha);
                } else {
                    txtView.setText(R.string.Java);
                }
                if (checkBox3.isChecked()) {
                    Intent intentJ = new Intent(this, ActivityJava.class);
                    startActivity(intentJ);
                } else {
                    txtView.setText(R.string.Java);
                }
                break;
            case R.id.button2:
                if (checkBox2.isChecked()) {
                    txtView.setText(R.string.Android);
                    btnAndroid.startAnimation(animalpha);
                } else {
                    txtView.setText(R.string.Android);
                }
                if (checkBox3.isChecked()) {
                    Intent intentA = new Intent(this, ActivityAndroid.class);
                    startActivity(intentA);
                } else {
                    txtView.setText(R.string.Android);
                }
                break;
            default:
                break;
        }
    }

}
