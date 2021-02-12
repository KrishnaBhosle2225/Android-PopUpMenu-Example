package com.krishna.popupmenuexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPopup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopup = findViewById(R.id.btnpopup);
        btnPopup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopupMenu popupMenu = new PopupMenu(MainActivity.this,btnPopup);
                popupMenu.getMenuInflater().inflate(R.menu.popupmenu,popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {

                        int id = item.getItemId();
                        switch (id){
                            case R.id.cut1:
                                Toast.makeText(MainActivity.this, "Cut is Clicked", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.copy:
                                Toast.makeText(MainActivity.this, "Copy is Clicked", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.paste:
                                Toast.makeText(MainActivity.this, "Paste is Clicked", Toast.LENGTH_SHORT).show();
                                break;

                            case R.id.delete:
                                Toast.makeText(MainActivity.this,"Delete is clicked",Toast.LENGTH_LONG).show();
                                break;
                        }

                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }
}