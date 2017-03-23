package id.sch.smktelkom_mlg.project2.xirpl22628.arika;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Mokleters on 3/23/2017.
 */

public class SplashScreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        Thread timerThread = new Thread(){
            public void run(){
                try {
                    sleep(4500);
                }catch (InterruptedException e){
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreen.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
