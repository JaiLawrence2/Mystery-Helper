package com.example.mysteryhelpercs408_1a;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.mysteryhelpercs408_1a.databinding.ActivityMainBinding;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String[] hints;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        hints = getResources().getStringArray(R.array.hints);
        binding.demoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView t = binding.outputLabel;
                Random random = new Random();
                String randStr = hints[random.nextInt(hints.length)];
                t.setText(randStr);
            }
        });
    }
}