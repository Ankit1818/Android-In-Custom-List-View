package com.example.test01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Main3Activity extends AppCompatActivity {

    ListView listView;
    List list;

    int[] img=
            {
               R.mipmap.ic_launcher,
            R.drawable.a

    };
    String[] name={
            "Android",
            "IOS"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


    listView =findViewById(R.id.l1);
    list=new ArrayList();
    costem costem=new costem(getApplicationContext(),img,name);
    listView.setAdapter(costem);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);

        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();
        switch (id)
        {
            case R.id.m1:
                Intent i =new Intent(Main3Activity.this,Main4Activity.class);
                startActivity(i);
                break;
            case R.id.m2:
                Intent i2=new Intent(Main3Activity.this,Main5Activity.class);
                startActivity(i2);
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
