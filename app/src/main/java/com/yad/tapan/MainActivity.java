package com.yad.tapan;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.yad.tapan.aktu_sample.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        LogoLauncher logoLauncher = new LogoLauncher();
        logoLauncher.start();
    }

    private class LogoLauncher extends Thread{
        public void run(){
            try{
                sleep(3000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
            MainActivity.this.finish();
        }
    }

    public void next(View view) {
        Intent inten = new Intent (MainActivity.this,Main2Activity.class);
        startActivity(inten);
    }
}
