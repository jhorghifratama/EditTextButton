package com.jhorghifratama_201103643.edittextbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button okbutton = (Button)findViewById(R.id.okButton);

        okbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText namaEditText = (EditText)findViewById(R.id.namaEditText);
                String nama = namaEditText.getText().toString();
                String pesan = "Hello, " + nama + "!";
                TextView infoTextView = (TextView)findViewById(R.id.infoTextView);
                infoTextView.setText(pesan);
            }
        });
    }
}