package com.example.learningfrench;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class userHome extends AppCompatActivity {

    ImageView ivPlayGames,ivPlayQuiz,ivWatchVideo,ivNewWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);

        ivPlayGames = findViewById(R.id.ivPlayGames);
        ivPlayQuiz = findViewById(R.id.ivPlayQuiz);
        ivWatchVideo = findViewById(R.id.ivWatchVideo);
        ivNewWords = findViewById(R.id.ivNewWords);

        ivPlayGames.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userHome.this, Game.class);
                startActivity(intent);
            }
        });
        ivPlayQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userHome.this, quiz.class);
                startActivity(intent);
            }
        });

        ivWatchVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userHome.this, videoLearning.class);
                startActivity(intent);
            }
        });

        ivNewWords.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(userHome.this, newWord.class);
                startActivity(intent);
            }
        });


    }
}
