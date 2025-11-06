package com.example.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView imgProfile = findViewById(R.id.imgProfile);

        Glide.with(this)
                .asGif()
                .load(R.raw.avatar_animado) // nome do seu arquivo .gif
                .into(imgProfile);
    }
}
