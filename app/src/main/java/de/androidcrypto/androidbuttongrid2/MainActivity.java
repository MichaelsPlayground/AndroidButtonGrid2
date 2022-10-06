package de.androidcrypto.androidbuttongrid2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // populate the buttons
        GridView gridview = (GridView) findViewById(R.id.activity_grid);
        gridview.setAdapter(new ButtonAdapter(this));
    }
}