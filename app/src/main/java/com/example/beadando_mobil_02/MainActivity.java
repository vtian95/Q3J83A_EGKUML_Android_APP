package com.example.beadando_mobil_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.beadando_mobil_02.ui.home.HomeFragment;
import com.example.beadando_mobil_02.ui.profile.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mainToolbar = findViewById(R.id.mainToolbar);
        setSupportActionBar(mainToolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                //showMessage("Home");
                loadFragment(new HomeFragment(), "home" , true );
                return true;
            case R.id.action_profile:
                //showMessage("Profile");
                loadFragment(new ProfileFragment(), "home" , true);
                return true;
            case R.id.action_settings:
                showMessage("Settings");
                return true;
        }
        return true;
    }
    private void loadFragment(Fragment fragment, String tag, boolean addToBackStack)
    {
       FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment, tag);
        if(addToBackStack)
            transaction.addToBackStack(tag);
        transaction.commit();


    }
    private void showMessage(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();

    }
}