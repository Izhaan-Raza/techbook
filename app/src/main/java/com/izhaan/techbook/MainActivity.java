package com.izhaan.techbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Toast;

import com.iammert.library.readablebottombar.ReadableBottomBar;
import com.izhaan.techbook.databinding.ActivityMainBinding;
import com.izhaan.techbook.fragment.HomeFragment;
import com.izhaan.techbook.fragment.NotificationFragment;
import com.izhaan.techbook.fragment.PostFragment;
import com.izhaan.techbook.fragment.SearchFragment;
import com.izhaan.techbook.fragment.UserFragment;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, new HomeFragment());
        transaction.commit();

        binding.readableBottomBar.setOnItemSelectListener(new ReadableBottomBar.ItemSelectListener() {
            @Override
            public void onItemSelected(int i) {

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

                switch (i){
                    case 0://Home
                        transaction.replace(R.id.container, new HomeFragment());
                        Toast.makeText(MainActivity.this, "Home", Toast.LENGTH_SHORT).show();
                        break;
                    case 1://Search
                        transaction.replace(R.id.container, new SearchFragment());
                        Toast.makeText(MainActivity.this, "Search", Toast.LENGTH_SHORT).show();
                        break;
                    case 3://notification
                        transaction.replace(R.id.container, new NotificationFragment());
                        Toast.makeText(MainActivity.this, "notification", Toast.LENGTH_SHORT).show();
                        break;
                    case 4://user
                        transaction.replace(R.id.container, new UserFragment());
                        Toast.makeText(MainActivity.this, "user", Toast.LENGTH_SHORT).show();
                        break;
                    case 2://user
                        transaction.replace(R.id.container, new PostFragment());
                        Toast.makeText(MainActivity.this, "post", Toast.LENGTH_SHORT).show();
                        break;
                }
                transaction.commit();


            }
        });
    }
}