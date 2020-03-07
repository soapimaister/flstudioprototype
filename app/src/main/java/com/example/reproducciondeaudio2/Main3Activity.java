package com.example.reproducciondeaudio2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.IpSecManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.File;

public class Main3Activity extends AppCompatActivity {

    Handler handler = new Handler();
    ProgressBar progressBar,progressBar2,progressBar3,progressbar4,progressbar5,progressbar6,progressBar7,progressBar8, progressBar9,
    progressBar10,progressBar11,progressBar12;
    int status = 0;
    int a = 50;
    SoundPool kick1,kick2,kick3,clap1,clap2,clap3,snare1,snare2,snare3,lofi1,lofi2,lofi3;
    int rpkick1,rpkick2,rpkick3,rpclap1,rpclap2,rpclap3,rpsnare1,rpsnare2,rpsnare3,rplofi1,rplofi2,rplofi3;
    private TextView tv1,tv2,tv3,tv4,tv5,tv6,tv7,tv8,tv9,tv10,tv11,tv12;
    private SeekBar sb,sb2,sb3,sb4,sb5,sb6,sb7,sb8,sb9,sb10,sb11,sb12;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar2 = (ProgressBar)findViewById(R.id.progressBar7);
        progressBar3 = (ProgressBar)findViewById(R.id.progressBar9);
        progressbar4 = (ProgressBar)findViewById(R.id.progressBar2);
        progressbar5 = (ProgressBar)findViewById(R.id.progressBar3);
        progressbar6 = (ProgressBar)findViewById(R.id.progressBar4);
        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        b3 = (Button)findViewById(R.id.button4);
        tv1 = (TextView)findViewById(R.id.textView);
        sb = (SeekBar)findViewById(R.id.seekBar2);
        sb2 = (SeekBar)findViewById(R.id.seekBar3);
        sb3 = (SeekBar)findViewById(R.id.seekBar4);
        tv2 = (TextView)findViewById(R.id.textView6);
        tv3 = (TextView)findViewById(R.id.textView10);
        b4 = (Button)findViewById(R.id.button5);
        b5 =(Button)findViewById(R.id.button6);
        b6 = (Button)findViewById(R.id.button7);
        tv4 = (TextView)findViewById(R.id.textView13);
        tv5 = (TextView)findViewById(R.id.textView14);
        tv6 = (TextView)findViewById(R.id.textView15);
        sb4 =(SeekBar)findViewById(R.id.seekBar);
        sb5 = (SeekBar)findViewById(R.id.seekBar5);
        sb6 = (SeekBar)findViewById(R.id.seekBar6);
        b7 = (Button)findViewById(R.id.button10);
        b8 = (Button)findViewById(R.id.button9);
        b9 = (Button)findViewById(R.id.button8);
        tv7 = (TextView)findViewById(R.id.textView17);
        tv8 = (TextView)findViewById(R.id.textView18);
        tv9 = (TextView)findViewById(R.id.textView19);
        progressBar7 = (ProgressBar)findViewById(R.id.progressBar6);
        progressBar8 = (ProgressBar)findViewById(R.id.progressBar8);
        progressBar9 = (ProgressBar)findViewById(R.id.progressBar10);
        sb7 = (SeekBar)findViewById(R.id.seekBar7);
        sb8 = (SeekBar)findViewById(R.id.seekBar9);
        sb9 =(SeekBar)findViewById(R.id.seekBar8);
        progressBar10 = (ProgressBar)findViewById(R.id.progressBar11);
        progressBar11 = (ProgressBar)findViewById(R.id.progressBar12);
        progressBar12 = (ProgressBar)findViewById(R.id.progressBar13);
        tv10 = (TextView)findViewById(R.id.textView21);
        tv11 = (TextView)findViewById(R.id.textView22);
        tv12 = (TextView)findViewById(R.id.textView23);
        sb10 = (SeekBar)findViewById(R.id.seekBar11);
        sb11 = (SeekBar)findViewById(R.id.seekBar12);
        sb12 = (SeekBar)findViewById(R.id.seekBar13);
        b10 = (Button)findViewById(R.id.button12);
        b11 = (Button)findViewById(R.id.button11);
        b12 = (Button)findViewById(R.id.button);

        tv1.setText("");
        tv2.setVisibility(View.INVISIBLE);
        tv3.setVisibility(View.INVISIBLE);

        tv4.setText("");
        tv5.setVisibility(View.INVISIBLE);
        tv6.setVisibility(View.INVISIBLE);

        tv7.setText("");
        tv8.setVisibility(View.INVISIBLE);
        tv9.setVisibility(View.INVISIBLE);

        tv10.setText("");
        tv11.setVisibility(View.INVISIBLE);
        tv12.setVisibility(View.INVISIBLE);

        kick1 = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        rpkick1 = kick1.load(this,R.raw.kick1,1);
        kick2 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpkick2 = kick2.load(this,R.raw.kick2,1);
        kick3 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpkick3 = kick3.load(this,R.raw.kick3,1);

        clap1 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpclap1 = clap1.load(this,R.raw.clap1,1);
        clap2 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpclap2 = clap2.load(this,R.raw.clap2,1);
        clap3 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpclap3 = clap3.load(this,R.raw.clap3,1);

        snare1 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpsnare1 = snare1.load(this,R.raw.snare1,1);
        snare2 = new SoundPool(1, AudioManager.STREAM_MUSIC,1);
        rpsnare2 = snare2.load(this,R.raw.snare2,1);
        snare3 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rpsnare3 = snare3.load(this,R.raw.snare3,1);

        lofi1 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rplofi1 = lofi1.load(this,R.raw.lofiwords1,1);
        lofi2 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rplofi2 = lofi2.load(this,R.raw.lofiwords2,1);
        lofi3 = new SoundPool(1,AudioManager.STREAM_MUSIC,1);
        rplofi3 = lofi3.load(this,R.raw.lofiwords3,1);








        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, final int progress, boolean fromUser) {
               String a = String.valueOf(progress);
                tv1.setText(a);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb.setProgress(100);

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String be = String.valueOf(progress);
                tv2.setText(be);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sb2.setProgress(100);

        sb3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String ba = String.valueOf(progress);
                tv3.setText(ba);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb3.setProgress(100);

        sb4.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String ce = String.valueOf(progress);
                tv4.setText(ce);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb4.setProgress(100);

        sb5.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String aa = String.valueOf(progress);
                tv5.setText(aa);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb5.setProgress(100);

        sb6.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String bb = String.valueOf(progress);
                tv6.setText(bb);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb6.setProgress(100);

        sb7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String aa1 = String.valueOf(progress);
                tv7.setText(aa1);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb7.setProgress(100);

        sb8.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String aa2 = String.valueOf(progress);
                tv8.setText(aa2);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb8.setProgress(100);

        sb9.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String aa3 = String.valueOf(progress);
                tv9.setText(aa3);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb9.setProgress(100);

        sb10.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String aa = String.valueOf(progress);
                tv10.setText(aa);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb10.setProgress(100);

        sb11.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String bb = String.valueOf(progress);
                tv11.setText(bb);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb11.setProgress(100);

        sb12.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                String cc = String.valueOf(progress);
                tv12.setText(cc);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        sb12.setProgress(100);





        b1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        tv1.setVisibility(View.VISIBLE);

                        new Thread(new Runnable() {
                            @Override
                            public void run() {

                                String tener = tv1.getText().toString();
                                int numero = Integer.valueOf(tener);
                                while (status < numero) {
                                                                    status++;
                                                                    android.os.SystemClock.sleep(001);
                                                                    handler.post(new Runnable() {
                                                                        @Override
                                                                        public void run() {
                                                                            progressBar.setProgress(status);
                                                                            b1.setAlpha(0.7f);
                                                                        }
                                                                    });
                                                                }
                                                                handler.post(new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                        while (status > 0) {
                                                                            status--;
                                                                            progressBar.setProgress(status);
                                                                        }
                                                                    }
                                                                });

                                handler.post(new Runnable() {
                                                                   @Override
                                                                    public void run() {
                                                                        b1.setAlpha(1f);
                                                                       tv2.setVisibility(View.INVISIBLE);
                                                                       tv3.setVisibility(View.INVISIBLE);
                                                                   }
                                                                });

                            }
                        }).start();
                        String floats = tv1.getText().toString();
                        switch (floats){
                            case "100":
                                kick1.play(rpkick1,1.0f,1.0f,1,0,0);
                                break;
                            case "99":
                            case "98":
                            case "97":
                            case "96":
                            case "95":
                            case "94":
                            case "93":
                            case "92":
                            case "91":
                            case "90":
                                kick1.play(rpkick1,0.9f,0.9f,1,0,0);

                                break;
                            case "89":
                            case "88":
                            case "87":
                            case "86":
                            case "85":
                            case "84":
                            case "83":
                            case "82":
                            case "81":
                            case "80":
                                kick1.play(rpkick1,0.8f,0.8f,1,0,0);

                                break;
                            case "79":
                            case "78":
                            case "77":
                            case "76":
                            case "75":
                            case "74":
                            case "73":
                            case "72":
                            case "71":
                            case "70":
                                kick1.play(rpkick1,0.7f,0.7f,1,0,0);

                                break;
                            case "69":
                            case "68":
                            case "67":
                            case "66":
                            case "65":
                            case "64":
                            case "63":
                            case "62":
                            case "61":
                            case "60":
                                kick1.play(rpkick1,0.6f,0.6f,1,0,0);

                                break;
                            case "59":
                            case "58":
                            case "57":
                            case "56":
                            case "55":
                            case "54":
                            case "53":
                            case "52":
                            case "51":
                            case "50":
                                kick1.play(rpkick1,0.5f,0.5f,1,0,0);
                                break;
                            case "49":
                            case "48":
                            case "47":
                            case "46":
                            case "45":
                            case "44":
                            case "43":
                            case "42":
                            case "41":
                            case "40":
                                kick1.play(rpkick1,0.4f,0.4f,1,0,0);

                                break;
                            case "39":
                            case "38":
                            case "37":
                            case "36":
                            case "35":
                            case "34":
                            case "33":
                            case "32":
                            case "31":
                            case "30":
                                kick1.play(rpkick1,0.3f,0.3f,1,0,0);

                                break;
                            case "29":
                            case "28":
                            case "27":
                            case "26":
                            case "25":
                            case "24":
                            case "23":
                            case "22":
                            case "21":
                            case "20":
                                kick1.play(rpkick1,0.2f,0.2f,1,0,0);
                                break;
                            case "19":
                            case "18":
                            case "17":
                            case "16":
                            case "15":
                            case "14":
                            case "13":
                            case "12":
                            case "11":
                            case "10":
                                kick1.play(rpkick1,0.1f,0.1f,1,0,0);

                                break;
                            case "9":
                            case "8":
                            case "7":
                            case "6":
                            case "5":
                            case "4":
                            case "3":
                            case "2":
                            case "1":
                            case "0":
                                kick1.play(rpkick1,0.0f,0.0f,1,0,0);
                                break;

                        }

                    }
                });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv2.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String tener1 = tv2.getText().toString();
                        int numero2 = Integer.valueOf(tener1);
                        while (status < numero2) {
                            status++;
                            SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar2.setProgress(status);
                                    b2.setAlpha(0.7f);

                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar2.setProgress(status);
                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b2.setAlpha(1f);
                                tv1.setVisibility(View.INVISIBLE);
                                tv3.setVisibility(View.INVISIBLE);
                            }
                        });


                    }
                }).start();
                String floats = tv2.getText().toString();
                switch (floats) {
                    case "100":
                        kick2.play(rpkick2, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        kick2.play(rpkick2, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        kick2.play(rpkick2, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        kick2.play(rpkick2, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        kick2.play(rpkick2, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        kick2.play(rpkick2, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        kick2.play(rpkick2, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        kick2.play(rpkick2, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        kick2.play(rpkick2, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        kick2.play(rpkick2, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        kick2.play(rpkick2, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }

            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv3.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String tener2 = tv3.getText().toString();
                        int numero3 = Integer.valueOf(tener2);
                        while (status < numero3) {
                            status++;
                            SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar3.setProgress(status);
                                    b3.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar3.setProgress(status);
                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b3.setAlpha(1f);
                                tv1.setVisibility(View.INVISIBLE);
                                tv2.setVisibility(View.INVISIBLE);
                            }
                        });


                    }
                }).start();
                String floats = tv3.getText().toString();
                switch (floats) {
                    case "100":
                        kick3.play(rpkick3, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        kick3.play(rpkick3, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        kick3.play(rpkick3, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        kick3.play(rpkick3, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        kick3.play(rpkick3, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        kick3.play(rpkick3, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        kick3.play(rpkick3, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        kick3.play(rpkick3, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        kick3.play(rpkick3, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        kick3.play(rpkick3, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        kick3.play(rpkick3, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }


            }


        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv4.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String tener4 = tv4.getText().toString();
                        int numero3 = Integer.valueOf(tener4);
                        while (status < numero3) {
                            status++;
                            SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressbar4.setProgress(status);
                                    b4.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressbar4.setProgress(status);
                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b4.setAlpha(1f);
                                tv5.setVisibility(View.INVISIBLE);
                                tv6.setVisibility(View.INVISIBLE);
                            }
                        });


                    }
                }).start();
                String floats = tv4.getText().toString();
                switch (floats) {
                    case "100":
                        clap1.play(rpclap1, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        clap1.play(rpclap1, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        clap1.play(rpclap1, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        clap1.play(rpclap1, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        clap1.play(rpclap1, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        clap1.play(rpclap1, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        clap1.play(rpclap1, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        clap1.play(rpclap1, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        clap1.play(rpclap1, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        clap1.play(rpclap1, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        clap1.play(rpclap1, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }


            }


        });



        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv5.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String tener5 = tv5.getText().toString();
                        int numero3 = Integer.valueOf(tener5);
                        while (status < numero3) {
                            status++;
                            SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressbar5.setProgress(status);
                                    b5.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressbar5.setProgress(status);
                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b5.setAlpha(1f);
                                tv4.setVisibility(View.INVISIBLE);
                                tv6.setVisibility(View.INVISIBLE);
                            }
                        });


                    }
                }).start();
                String floats = tv5.getText().toString();
                switch (floats) {
                    case "100":
                        clap2.play(rpclap2, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        clap2.play(rpclap2, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        clap2.play(rpclap2, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        clap2.play(rpclap2, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        clap2.play(rpclap2, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        clap2.play(rpclap2, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        clap2.play(rpclap2, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        clap2.play(rpclap2, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        clap2.play(rpclap2, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        clap2.play(rpclap2, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        clap2.play(rpclap2, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }


            }


        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv6.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String tener6 = tv6.getText().toString();
                        int numero3 = Integer.valueOf(tener6);
                        while (status < numero3) {
                            status++;
                            SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressbar6.setProgress(status);
                                    b6.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressbar6.setProgress(status);
                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b6.setAlpha(1f);
                                tv4.setVisibility(View.INVISIBLE);
                                tv5.setVisibility(View.INVISIBLE);
                            }
                        });


                    }
                }).start();
                String floats = tv6.getText().toString();
                switch (floats) {
                    case "100":
                        clap3.play(rpclap3, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        clap3.play(rpclap3, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        clap3.play(rpclap3, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        clap3.play(rpclap3, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        clap3.play(rpclap3, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        clap3.play(rpclap3, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        clap3.play(rpclap3, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        clap3.play(rpclap3, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        clap3.play(rpclap3, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        clap3.play(rpclap3, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        clap3.play(rpclap3, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }


            }


        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv7.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String aa = tv7.getText().toString();
                        int numero4 = Integer.valueOf(aa);
                        while (status < numero4){
                            status++;
                            android.os.SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar7.setProgress(status);
                                    b7.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar7.setProgress(status);

                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b7.setAlpha(1.0f);
                                tv8.setVisibility(View.INVISIBLE);
                                tv9.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }).start();
                String floats = tv7.getText().toString();
                switch (floats) {
                    case "100":
                        snare1.play(rpsnare1, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        snare1.play(rpsnare1, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        snare1.play(rpsnare1, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        snare1.play(rpsnare1, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        snare1.play(rpsnare1, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        snare1.play(rpsnare1, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        snare1.play(rpsnare1, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        snare1.play(rpsnare1, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        snare1.play(rpsnare1, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        snare1.play(rpsnare1, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        snare1.play(rpsnare1, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }



            }
        });


        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv8.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String aa = tv8.getText().toString();
                        int numero4 = Integer.valueOf(aa);
                        while (status < numero4){
                            status++;
                            android.os.SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar8.setProgress(status);
                                    b8.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar8.setProgress(status);

                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b8.setAlpha(1.0f);
                                tv7.setVisibility(View.INVISIBLE);
                                tv9.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }).start();
                String floats = tv8.getText().toString();
                switch (floats) {
                    case "100":
                        snare2.play(rpsnare2, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        snare2.play(rpsnare2, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        snare2.play(rpsnare2, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        snare2.play(rpsnare2, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        snare2.play(rpsnare2, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        snare2.play(rpsnare2, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        snare2.play(rpsnare2, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        snare2.play(rpsnare2, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        snare2.play(rpsnare2, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        snare2.play(rpsnare2, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        snare2.play(rpsnare2, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }



            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv9.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String aa = tv9.getText().toString();
                        int numero4 = Integer.valueOf(aa);
                        while (status < numero4){
                            status++;
                            android.os.SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar9.setProgress(status);
                                    b9.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar9.setProgress(status);

                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b9.setAlpha(1.0f);
                                tv7.setVisibility(View.INVISIBLE);
                                tv8.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }).start();
                String floats = tv9.getText().toString();
                switch (floats) {
                    case "100":
                        snare3.play(rpsnare3, 1.0f, 1.0f, 1, 0, 0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        snare3.play(rpsnare3, 0.9f, 0.9f, 1, 0, 0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        snare3.play(rpsnare3, 0.8f, 0.8f, 1, 0, 0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        snare3.play(rpsnare3, 0.7f, 0.7f, 1, 0, 0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        snare3.play(rpsnare3, 0.6f, 0.6f, 1, 0, 0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        snare3.play(rpsnare3, 0.5f, 0.5f, 1, 0, 0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        snare3.play(rpsnare3, 0.4f, 0.4f, 1, 0, 0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        snare3.play(rpsnare3, 0.3f, 0.3f, 1, 0, 0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        snare3.play(rpsnare3, 0.2f, 0.2f, 1, 0, 0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        snare3.play(rpsnare3, 0.1f, 0.1f, 1, 0, 0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        snare3.play(rpsnare3, 0.0f, 0.0f, 1, 0, 0);
                        break;
                }



            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv10.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String aa = tv10.getText().toString();
                        int numero4 = Integer.valueOf(aa);
                        while (status < numero4){
                            status++;
                            android.os.SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar10.setProgress(status);
                                    b10.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar10.setProgress(status);

                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b10.setAlpha(1.0f);
                                tv11.setVisibility(View.INVISIBLE);
                                tv12.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }).start();
                String floats = tv10.getText().toString();
                switch (floats) {
                    case "100":
                        lofi1.play(rplofi1,1.0f,1.0f,1,0,0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        lofi1.play(rplofi1,0.9f,0.9f,1,0,0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        lofi1.play(rplofi1,0.8f,0.8f,1,0,0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        lofi1.play(rplofi1,0.7f,0.7f,1,0,0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        lofi1.play(rplofi1,0.6f,0.6f,1,0,0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        lofi1.play(rplofi1,0.5f,0.5f,1,0,0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        lofi1.play(rplofi1,0.4f,0.4f,1,0,0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        lofi1.play(rplofi1,0.3f,0.3f,1,0,0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        lofi1.play(rplofi1,0.2f,0.2f,1,0,0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        lofi1.play(rplofi1,0.1f,0.1f,1,0,0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        lofi1.play(rplofi1,0.0f,0.0f,1,0,0);
                        break;
                }



            }
        });


        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv11.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String aa = tv11.getText().toString();
                        int numero4 = Integer.valueOf(aa);
                        while (status < numero4){
                            status++;
                            android.os.SystemClock.sleep(001);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar11.setProgress(status);
                                    b11.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar11.setProgress(status);

                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b11.setAlpha(1.0f);
                                tv10.setVisibility(View.INVISIBLE);
                                tv12.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }).start();
                String floats = tv11.getText().toString();
                switch (floats) {
                    case "100":
                        lofi2.play(rplofi2,1.0f,1.0f,1,0,0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        lofi2.play(rplofi2,0.9f,0.9f,1,0,0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        lofi2.play(rplofi2,0.8f,0.8f,1,0,0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        lofi2.play(rplofi2,0.7f,0.7f,1,0,0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        lofi2.play(rplofi2,0.6f,0.6f,1,0,0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        lofi2.play(rplofi2,0.5f,0.5f,1,0,0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        lofi2.play(rplofi2,0.4f,0.4f,1,0,0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        lofi2.play(rplofi2,0.3f,0.3f,1,0,0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        lofi2.play(rplofi2,0.2f,0.2f,1,0,0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        lofi2.play(rplofi2,0.1f,0.1f,1,0,0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        lofi2.play(rplofi2,0.0f,0.0f,1,0,0);
                        break;
                }



            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv12.setVisibility(View.VISIBLE);
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String aa = tv12.getText().toString();
                        int numero4 = Integer.valueOf(aa);
                        while (status < numero4){
                            status++;
                            android.os.SystemClock.sleep(003);
                            handler.post(new Runnable() {
                                @Override
                                public void run() {
                                    progressBar12.setProgress(status);
                                    b12.setAlpha(0.7f);
                                }
                            });
                        }
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                while (status > 0){
                                    status--;
                                    progressBar12.setProgress(status);

                                }
                            }
                        });
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                b12.setAlpha(1.0f);
                                tv11.setVisibility(View.INVISIBLE);
                                tv10.setVisibility(View.INVISIBLE);
                            }
                        });
                    }
                }).start();
                String floats = tv12.getText().toString();
                switch (floats) {
                    case "100":
                        lofi3.play(rplofi3,1.0f,1.0f,1,0,0);
                        break;
                    case "99":
                    case "98":
                    case "97":
                    case "96":
                    case "95":
                    case "94":
                    case "93":
                    case "92":
                    case "91":
                    case "90":
                        lofi3.play(rplofi3,0.9f,0.9f,1,0,0);

                        break;
                    case "89":
                    case "88":
                    case "87":
                    case "86":
                    case "85":
                    case "84":
                    case "83":
                    case "82":
                    case "81":
                    case "80":
                        lofi3.play(rplofi3,0.8f,0.8f,1,0,0);

                        break;
                    case "79":
                    case "78":
                    case "77":
                    case "76":
                    case "75":
                    case "74":
                    case "73":
                    case "72":
                    case "71":
                    case "70":
                        lofi3.play(rplofi3,0.7f,0.7f,1,0,0);

                        break;
                    case "69":
                    case "68":
                    case "67":
                    case "66":
                    case "65":
                    case "64":
                    case "63":
                    case "62":
                    case "61":
                    case "60":
                        lofi3.play(rplofi3,0.6f,0.6f,1,0,0);

                        break;
                    case "59":
                    case "58":
                    case "57":
                    case "56":
                    case "55":
                    case "54":
                    case "53":
                    case "52":
                    case "51":
                    case "50":
                        lofi3.play(rplofi3,0.5f,0.5f,1,0,0);
                        break;
                    case "49":
                    case "48":
                    case "47":
                    case "46":
                    case "45":
                    case "44":
                    case "43":
                    case "42":
                    case "41":
                    case "40":
                        lofi3.play(rplofi3,0.4f,0.4f,1,0,0);

                        break;
                    case "39":
                    case "38":
                    case "37":
                    case "36":
                    case "35":
                    case "34":
                    case "33":
                    case "32":
                    case "31":
                    case "30":
                        lofi3.play(rplofi3,0.3f,0.3f,1,0,0);

                        break;
                    case "29":
                    case "28":
                    case "27":
                    case "26":
                    case "25":
                    case "24":
                    case "23":
                    case "22":
                    case "21":
                    case "20":
                        lofi3.play(rplofi3,0.2f,0.2f,1,0,0);
                        break;
                    case "19":
                    case "18":
                    case "17":
                    case "16":
                    case "15":
                    case "14":
                    case "13":
                    case "12":
                    case "11":
                    case "10":
                        lofi3.play(rplofi3,0.1f,0.1f,1,0,0);

                        break;
                    case "9":
                    case "8":
                    case "7":
                    case "6":
                    case "5":
                    case "4":
                    case "3":
                    case "2":
                    case "1":
                    case "0":
                        lofi3.play(rplofi3,0.0f,0.0f,1,0,0);
                        break;
                }



            }
        });





















    }



    }



























