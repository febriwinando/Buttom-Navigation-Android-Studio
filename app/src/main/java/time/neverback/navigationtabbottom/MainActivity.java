package time.neverback.navigationtabbottom;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import time.neverback.navigationtabbottom.Fragment.BlankFragment1;
import time.neverback.navigationtabbottom.Fragment.BlankFragment2;
import time.neverback.navigationtabbottom.Fragment.BlankFragment3;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.btnNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);

        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, new BlankFragment1()).commit();

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectFragment = null;
            switch (item.getItemId()){
                case R.id.home:
                    selectFragment = new BlankFragment1();
                    break;
                case R.id.home2:
                    selectFragment = new BlankFragment2();
                    break;
                case R.id.home3:
                    selectFragment = new BlankFragment3();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, selectFragment).commit();
            return true;
        }
    };
}
