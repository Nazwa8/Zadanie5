package com.example.zadanie5;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int liczniklike = 0;
    private TextView wyswLike;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wyswLike = findViewById(R.id.wyswPolub);
        Button polub = findViewById(R.id.polub);
        Button usun = findViewById(R.id.usun);
        Button zapisz = findViewById(R.id.zapisz);

        polub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liczniklike++;
                polubienia();
            }
        });

        usun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (liczniklike > 0) {
                    liczniklike--;
                }
                polubienia();
            }
        });

        zapisz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tu nic nie ma
            }
        });
    }

    private void polubienia() {
        String like = liczniklike + " polubień";
        wyswLike.setText(like);
    }
}
