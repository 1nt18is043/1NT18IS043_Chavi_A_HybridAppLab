package com.example.listview_043;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv= (ListView) findViewById(R.id.progList);
        final String values[]= {"C","C++","Java","Android","C#","Assembly","Python","Ruby","VB","Scala" };

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, Arrays.asList(values));
        lv.setAdapter(arrayAdapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "U clicked : "+ values[position],Toast.LENGTH_SHORT).show();
            }
        });
    }
}