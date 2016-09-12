package com.example.kaiso.arduinoanroidled2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int i,a,b,c,d,e = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    private void get(String url) {

        RequestPackage p = new RequestPackage();
        p.setMethod("GET");
        p.setUri(url);
        MyTask task = new MyTask();
        task.execute(p);

    }


    public void ledOne(View view){

        if(i % 2 == 0) {
            get("http://192.168.240.1/arduino/digital/13/0");
            System.out.println(i);
            i++;
        }else{
            get("http://192.168.240.1/arduino/digital/13/1");
            i++;
        }

    }
    public void ledTwo(View view){
        if(a % 2 == 0) {
            get("http://192.168.240.1/arduino/digital/12/0");
            a++;
        }else{
            get("http://192.168.240.1/arduino/digital/12/1");
            a++;
        }

    }
    public void ledThree(View view){
        if(b % 2 == 0) {
            get("http://192.168.240.1/arduino/digital/11/0");
            b++;
        }else{
            get("http://192.168.240.1/arduino/digital/11/1");
            b++;
        }

    }
    public void ledFour(View view){
        if(c % 2 == 0) {
            get("http://192.168.240.1/arduino/digital/10/0");
            c++;
        }else{
            get("http://192.168.240.1/arduino/digital/10/1");
            c++;
        }

    }
    public void ledFive(View view){
        if(d % 2 == 0) {
            get("http://192.168.240.1/arduino/digital/9/0");
            d++;
        }else{
            get("http://192.168.240.1/arduino/digital/9/1");
            d++;
        }


    }
    public void ledSix(View view){

        if(e % 2 == 0) {
            get("http://192.168.240.1/arduino/digital/8/0");
            e++;
        }else{
            get("http://192.168.240.1/arduino/digital/8/1");
            e++;
        }
    }
}
