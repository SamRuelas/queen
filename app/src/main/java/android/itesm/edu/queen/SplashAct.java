package android.itesm.edu.queen;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {// a thread in Android
            @Override
            public void run() {
                //intento objeto que conecta entre dos pantallas
                Intent intent = new Intent( SplashAct.this  ,  MainActivity.class  );
                startActivity(intent); // Go, go, go
                finish(); // kill this activity
            }
        },3000); // time in milliseconds
    }
}
