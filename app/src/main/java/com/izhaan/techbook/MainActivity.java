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

import me.ibrahimsn.lib.SmoothBottomBar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

