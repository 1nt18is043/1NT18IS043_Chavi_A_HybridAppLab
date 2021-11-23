package com.example.addingusingintents_043;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    Button add;
    TextView result;
    String TAG="MainActivity";
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","OnCreate invoked");

        n1=findViewById(R.id.num1);
        n2=findViewById(R.id.num2);
        add=findViewById(R.id.add);
        result=findViewById(R.id.res);
        intent=new Intent(this,MainActivity2.class);
        Toast.makeText(getApplicationContext(), "OnCreate invoked", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"onCreate invoked");


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r=Integer.parseInt(n1.getText().toString())+Integer.parseInt(n2.getText().toString());
                int numb1=Integer.parseInt(n1.getText().toString());
                int numb2=Integer.parseInt(n2.getText().toString());
                // res.setText("Result is:"+r);
                Log.i(TAG,"Number 1 is :"+n1);
                Log.i(TAG,"Number 2 is :"+n2);
                Log.i(TAG,"Sum is :"+r);

                Bundle extras=new Bundle();
                extras.putString("num1",numb1+"");
                extras.putString("num2",numb2+"");
                extras.putString("sum",r+"");
                intent.putExtras(extras);
                startActivity(intent);
            }
        });
    }
    protected void onStart(){
        super.onStart();
        //Log.i("stage1","onStart() started");  super.onStart();
        Toast.makeText(getApplicationContext(), "Onstart started", Toast.LENGTH_SHORT).show();//onStart Called
        Log.d("MainActivity","OnStart invoked");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","OnResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","OnPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity","OnStop invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","OnDestroy invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity","OnRestart invoked");
    }
}

