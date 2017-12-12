package com.example.intern.guessthenumber;

import android.content.Context;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,btnLstn;
    TextView txtView;
    TextToSpeech t1;
    int ran;
    String sran,str;
    boolean done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       txtView = (TextView) findViewById(R.id.textView);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);
        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);
        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);
        btnLstn = (Button) findViewById(R.id.btnlisten);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    t1.setLanguage(Locale.UK);
                }
            }
        });

        done = false;
        btnLstn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                done = true;
                Random rand = new Random();
                ran = rand.nextInt(10);
                if(ran == 0) ran = 1;
                sran = Integer.toString(ran);
                txtView.setText(" ");
                t1.speak("Please Johana press "+sran, TextToSpeech.QUEUE_FLUSH, null);
            }
        });


//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b1.getText();
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b1.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b2.getText();
//                if(done == true){
//
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b2.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b3.getText();
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b3.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b4.getText();
//
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b4.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b5.getText();
//
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b5.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b6.getText();
//
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b6.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b7.getText();
//
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b7.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b8.getText();
//
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b8.getText().toString());
//                }
//                done = false;
//            }
//        });
//
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String s = (String) b9.getText();
//
//                if(done == true){
//                    txtView.setText(s);
//                    dataChcek(txtView, t1);
//                }
//                else {
//                    t1.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
//                    txtView.setText(b9.getText().toString());
//                }
//                done = false;
//            }
//        });
    }


//    public void dataCheck(TextView txt, TextToSpeech t1){
//        String val = (String) txt.getText();
//        Context context = getApplicationContext();
//        int duration = Toast.LENGTH_SHORT;
//        if (sran.equals(val)){
//            //txt.setText("Correct");
//
//            CharSequence text = "Correct";
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//            toast.show();
//
//
//            t1.speak("Johana pressed "+val+". Correct", TextToSpeech.QUEUE_FLUSH, null);
//        }
//        else{
//            CharSequence text = "Wrong";
//            Toast toast = Toast.makeText(context, text, duration);
//            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
//            toast.show();
//            t1.speak("Johana pressed"+val+". Wrong", TextToSpeech.QUEUE_FLUSH, null);
//        }
//    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                str=(String)b1.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn2:
                str=(String)b2.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn3:
                str=(String)b3.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn4:
                str=(String)b4.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn5:
                str=(String)b5.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn6:
                str=(String)b6.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn7:
                str=(String)b7.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn8:
                str=(String)b8.getText();
                buttonSpeak(str,txtView,t1);
                break;
            case R.id.btn9:
                str=(String)b9.getText();
                buttonSpeak(str,txtView,t1);
                break;
        }

    }

    public void buttonSpeak(String s, TextView txt, TextToSpeech t){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        if(done){
            txt.setText(s);
            if (sran.equals(s)){
                //txt.setText("Correct");

                CharSequence text = "Correct";
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();


                t.speak("Johana pressed "+s+". Correct", TextToSpeech.QUEUE_FLUSH, null);
            }
            else{
                CharSequence text = "Wrong";
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.show();
                t.speak("Johana pressed"+s+". Wrong", TextToSpeech.QUEUE_FLUSH, null);
            }
        }
        else{
            t.speak("Johana pressed "+s, TextToSpeech.QUEUE_FLUSH, null);
            txt.setText(s);
        }
        done = false;
    }

}
