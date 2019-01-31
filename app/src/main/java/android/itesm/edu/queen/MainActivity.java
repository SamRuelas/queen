package android.itesm.edu.queen;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        random = (Button) findViewById(R.id.random);

    }

    private void goSong(String file){
        Intent intent = new Intent(this, SongAct.class);
        intent.putExtra("file", file);
        startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 500 && resultCode == RESULT_OK){
            random.setText(data.getStringExtra("random"));
        }
    }

    public void sing(View view){
        String file = "";
        switch(view.getId()){
            case R.id.dust:
                file = "dust";
                goSong(file);
                break;
            case R.id.under:
                file = "under";
                goSong(file);
                break;
            case R.id.breakfree:
                file = "breakfree";
                goSong(file);
                break;
            case R.id.bohemian:
                file = "bohemian";
                goSong(file);
                break;
            case R.id.dont:
                file = "dont";
                goSong(file);
                break;

            case R.id.random:
                Intent intent = new Intent(this, RandomAct.class);
                //abre lo que tengas que abrir y cuando acabe das el resultado
                startActivityForResult(intent, 500);
                break;
            case R.id.site:
                Uri page = Uri.parse("http://www.android.com");
                Intent web = new Intent(Intent.ACTION_VIEW, page);
                startActivity(web);
                break;
        }

    }


}

