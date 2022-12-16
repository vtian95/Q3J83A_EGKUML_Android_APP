package com.example.beadando_mobil_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.beadando_mobil_02.domain.Notebook;
import com.example.beadando_mobil_02.ui.home.HomeFragment;
import com.example.beadando_mobil_02.ui.notedetails.notedetailsFragment;
import com.example.beadando_mobil_02.ui.notelist.notelistFragment;
import com.example.beadando_mobil_02.ui.profile.ProfileFragment;
import com.example.beadando_mobil_02.ui.retrofit.retrofitFragment;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private EditText searchEditText;
    private Button searchButton;
    private Button randomButton;
    private Button trendingButton;
    private TextView resultTextView;
    private ImageView resultImageView;
    private boolean seged = false;
    private Notebook selectedNotebook;

    @SuppressLint("MissingInflatedId")
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
    public Notebook getSelectedNotebook() {
        return selectedNotebook;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_home:
                //showMessage("Home");
                loadFragment(new HomeFragment(), "home" , true );
                return true;
            case R.id.action_notebook_list:
                loadFragment(new notelistFragment(), "notebook_list", true);
                return true;
            case R.id.action_profile:
                //Leírás;
                loadFragment(new ProfileFragment(), "home" , true);
                return true;
            case R.id.action_retrofit:
                loadFragment(new retrofitFragment(), "retrofit" , true);

                return true;
        }
        return true;
    }



    @Override
    protected void onStart() {
        super.onStart();



        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.tenor.com/v1/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        TenorClient client = retrofit.create(TenorClient.class);
        String key = "LIVDSRZULELA";
        Call<TenorResponse> call = client.getRandom(key);

        //kérés elküldése callback függvény
        call.enqueue(new Callback<TenorResponse>() {
            @Override
            public void onResponse(Call<TenorResponse> call, Response<TenorResponse> response) {
                if(response.isSuccessful())
                {

                        setContentView(R.layout.retrofit);


                        searchEditText = findViewById(R.id.searchEditText);
                        searchButton = findViewById(R.id.searchButton);
                        randomButton = findViewById(R.id.randomButton);
                        trendingButton = findViewById(R.id.trendingButton);
                        resultTextView = findViewById(R.id.resultTextView);
                        resultImageView = findViewById(R.id.resultImageView);

                    String url = response.body().results.get(0).mediaList.get(0).gif.url;
                    resultTextView.setText(url);
                   Glide.with(getApplication()).load(url)
                            .into(resultImageView);
                }else
                {
                    resultTextView.setText("code :" + response.code());
                }
            }

            @Override
            public void onFailure(Call<TenorResponse> call, Throwable t) {

            }

        }
        );

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
    public void navigateToNotebookDetails(Notebook notebook) {
        this.selectedNotebook = notebook;
        loadFragment(new notedetailsFragment(), "notebook_details", true    );

    }





}