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
                .load(R.drawable.avatar_circle_bg) // nome exato do teu .gif
                .into(imgProfile);
    }
}
