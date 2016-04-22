package esy.es.cronsystems.plus512;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro2;

public class HelpIntro extends AppIntro2 {
    @Override
    public void init(Bundle savedInstanceState) {

// Здесь указываем количество слайдов, например нам нужно 3
        addSlide(IntroSlide.newInstance(R.layout.)); //
        addSlide(IntroSlide.newInstance(R.layout.intro_2));
        addSlide(IntroSlide.newInstance(R.layout.intro_3));

    }

    private void loadMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    @Override
    public void onNextPressed() {
        // Do something here
    }

    @Override
    public void onDonePressed() {
        finish();
    }

    @Override
    public void onSlideChanged() {
        // Do something here
    }

}