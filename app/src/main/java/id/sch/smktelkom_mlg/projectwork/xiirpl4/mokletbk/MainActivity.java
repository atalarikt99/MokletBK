package id.sch.smktelkom_mlg.projectwork.xiirpl4.mokletbk;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ProgressBar;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Mokleters on 1/12/2018.
 */

public class MainActivity extends AppCompatActivity {
    private Button btnLapor, btnStat, signOut;
    private ProgressBar progressBar;
    private FirebaseAuth.AuthStateListener authListener;
    private FirebaseAuth auth;


}
