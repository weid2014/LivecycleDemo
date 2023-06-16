package io.dcloud.lifecycledemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static MutableLiveData<String> liveData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        liveData=new MutableLiveData<>();
        liveData.observe(MainActivity.this, new Observer<String>() {
            @Override
            public void onChanged(String s) {

            }
        });
    }

    public void mainClick(View view) {
    }

    public void thread(View view) {
    }

    public void newActivity(View view) {
    }
}