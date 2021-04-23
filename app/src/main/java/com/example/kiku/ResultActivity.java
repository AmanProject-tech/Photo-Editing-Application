package com.example.kiku;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.kiku.databinding.ActivityResultBinding;

public class ResultActivity extends AppCompatActivity {

    ActivityResultBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        binding.image1.setImageURI(getIntent().getData());
    }
}