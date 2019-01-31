package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RandomAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random);
    }
    public void done(View view){
        Intent intent = new Intent();
        int random = (int)(Math.random()* canciones.length);
        //String value = ((int)(Math.random()* 100)) + "";
        String value = canciones[random];
        ((TextView)findViewById(R.id.textView)).setText(value);
        intent.putExtra("random", value);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    private String[] canciones ={"Bohemian Rhapsody.",
            "I want to break free.",
            "The show must go on.",
            "Under Pressure.",
            "Don´t stop me now.",
            "Another one bites the dust.",
            "Somebody to love.",
            "We are the champions.",
            "Crazy little thing called love.",
            "Who wants to live forever."};

}
