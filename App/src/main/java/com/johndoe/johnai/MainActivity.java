package com.johndoe.johnai;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(24, 24, 24, 24);
        layout.setBackgroundColor(Color.rgb(12, 16, 30));

        TextView title = new TextView(this);
        title.setText("JOHN AI");
        title.setTextSize(34);
        title.setTextColor(Color.rgb(0, 220, 255));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Your personal AI assistant");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.WHITE);
        subtitle.setGravity(Gravity.CENTER);

        Button voiceButton = new Button(this);
        voiceButton.setText("VOICE CHAT");
        voiceButton.setOnClickListener(v ->
            Toast.makeText(this,
                "Voice chat setup is coming next!",
                Toast.LENGTH_SHORT).show()
        );

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(voiceButton);

        setContentView(layout);
    }
}
