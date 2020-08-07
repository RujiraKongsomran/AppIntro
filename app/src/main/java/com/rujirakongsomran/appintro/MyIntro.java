package com.rujirakongsomran.appintro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2Fragment;

public class MyIntro extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntro2Fragment.newInstance("Android Spread",
                "Beverage",
                R.drawable.ic_coffee,
                Color.parseColor("#51e2b7")));

        addSlide(AppIntro2Fragment.newInstance("Android Spread",
                "Dessert",
                R.drawable.ic_cake,
                Color.parseColor("#8c50e3")));

        addSlide(AppIntro2Fragment.newInstance("Android Spread",
                "Fruit",
                R.drawable.ic_grape,
                Color.parseColor("#4fd7ff")));

        addSlide(AppIntro2Fragment.newInstance("Android Spread",
                "Food",
                R.drawable.ic_food,
                Color.parseColor("#00bcd4")));

        showStatusBar(false);
        setBarColor(Color.parseColor("#333639"));
        setSeparatorColor(Color.parseColor("#2196F3"));
    }

    @Override
    public void onDonePressed() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        Toast.makeText(this, "On Skip Clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged() {
        Toast.makeText(this, "On Slide Changed", Toast.LENGTH_SHORT).show();
    }
}