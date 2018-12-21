package com.example.guest3.myfirst;

import android.support.v4.view.PagerTabStrip;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

import android.widget.TextView;

import android.support.v4.view.ViewPager;
import android.support.v4.app.FragmentActivity;

import android.view.View;





import android.view.Gravity;
import android.view.LayoutInflater;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    TextView mTextView; 
    ViewPager viewpager1;
    PagerTabStrip pagertab1;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.test100);
        mTextView.setText("Welcome to Dynamic TextView");


    }

    public void onClick(View v)
    {
        final int id = v.getId();
        switch (id)
        {

            ///////////////////////  Note: Original code redacted due to request by employer
            case R.id.testbutton1:
                MainActivity.this.setContentView(R.layout.testpage); 

                mTextView = (TextView) findViewById(R.id.test3); 
                mTextView.setText("Welcome to Dynamic TextView");



                break;


            case R.id.button1:
                Toast.makeText(MainActivity.this,"YOUR MESSAGE",Toast.LENGTH_LONG).show();
                MainActivity.this.setContentView(R.layout.lesson1page);
                
                break;
            case R.id.button2:
                MainActivity.this.setContentView(R.layout.lesson2page);
                
                break;
            case R.id.button3:
                MainActivity.this.setContentView(R.layout.l31);
                
                break;
            case R.id.button4:
                MainActivity.this.setContentView(R.layout.l41);
                break;
            
            case R.id.back:
                MainActivity.this.setContentView(R.layout.activity_main); 
                break;

            

            case R.id.backl12:
                MainActivity.this.setContentView(R.layout.lesson1page); 
                break;

            case R.id.backl13:
                MainActivity.this.setContentView(R.layout.l12); 
                break;

            case R.id.backl14:
                MainActivity.this.setContentView(R.layout.l13);
                break;

            case R.id.backl15:
                MainActivity.this.setContentView(R.layout.l14); 
                break;

            case R.id.backl16:
                MainActivity.this.setContentView(R.layout.l15); 
                break;

            case R.id.backl2:
                MainActivity.this.setContentView(R.layout.activity_main); 
                break;

            case R.id.backl22:
                MainActivity.this.setContentView(R.layout.lesson2page); 
                break;

            case R.id.backl23:
                MainActivity.this.setContentView(R.layout.l22); 
                break;

            //Next 10 buttons

            case R.id.backl24:
                MainActivity.this.setContentView(R.layout.l23); 
                break;

            case R.id.backl25:
                MainActivity.this.setContentView(R.layout.l24); 
                break;

            case R.id.backl26:
                MainActivity.this.setContentView(R.layout.l25); 
                break;

            case R.id.backl27:
                MainActivity.this.setContentView(R.layout.l26); 
                break;

            case R.id.backl28:
                MainActivity.this.setContentView(R.layout.l27); 
                break;

            case R.id.backl29:
                MainActivity.this.setContentView(R.layout.l28); 
                break;

            case R.id.backl210:
                MainActivity.this.setContentView(R.layout.l29); 
                break;

            case R.id.backl211:
                MainActivity.this.setContentView(R.layout.l210); 
                break;

            case R.id.backl212:
                MainActivity.this.setContentView(R.layout.l211); 
                break;

            case R.id.backl213:
                MainActivity.this.setContentView(R.layout.l212); 
                break;

            //Next 10 buttons (20 done)

            case R.id.backl214:
                MainActivity.this.setContentView(R.layout.l213); 
                break;

            case R.id.backl31:
                MainActivity.this.setContentView(R.layout.activity_main);  
                break;

            case R.id.backl32:
                MainActivity.this.setContentView(R.layout.l31); 
                break;

            case R.id.backl33:
                MainActivity.this.setContentView(R.layout.l32); 
                break;

            case R.id.backl34:
                MainActivity.this.setContentView(R.layout.l33); 
                break;

            case R.id.backl35:
                MainActivity.this.setContentView(R.layout.l34); 
                break;

            case R.id.backl36:
                MainActivity.this.setContentView(R.layout.l35); 
                break;

            case R.id.backl37:
                MainActivity.this.setContentView(R.layout.l36); 
                break;

            case R.id.backl38:
                MainActivity.this.setContentView(R.layout.l37); 
                break;

            case R.id.backl39:
                MainActivity.this.setContentView(R.layout.l38); 
                break;

            //(30)

            case R.id.backl310:
                MainActivity.this.setContentView(R.layout.l39); 
                break;

            case R.id.backl311:
                MainActivity.this.setContentView(R.layout.l310); 
                break;



            case R.id.backl42:
                MainActivity.this.setContentView(R.layout.l41); 
                break;

            case R.id.backl43:
                MainActivity.this.setContentView(R.layout.l42); 
                break;

            case R.id.backl44:
                MainActivity.this.setContentView(R.layout.l43); 
                break;

            case R.id.backl45:
                MainActivity.this.setContentView(R.layout.l44); 
                break;

            case R.id.backl46:
                MainActivity.this.setContentView(R.layout.l45); 
                break;

            case R.id.backl47:
                MainActivity.this.setContentView(R.layout.l46); 
                break;

            case R.id.backl48:
                MainActivity.this.setContentView(R.layout.l47); 
                break;

            case R.id.backl49:
                MainActivity.this.setContentView(R.layout.l48); 
                break;

            case R.id.backl410:
                MainActivity.this.setContentView(R.layout.l49); 
                break;

            case R.id.backl411:
                MainActivity.this.setContentView(R.layout.l410); 
                break;

            case R.id.backl412:
                MainActivity.this.setContentView(R.layout.l411); 
                break;

            case R.id.backl413:
                MainActivity.this.setContentView(R.layout.l412); 
                break;

            case R.id.backl414:
                MainActivity.this.setContentView(R.layout.l413); 
                break;

            //42 completed back buttons

            //42 buttons for next now, 1-10

            case R.id.nextl1:
                MainActivity.this.setContentView(R.layout.l12); 
                break;

            case R.id.nextl12:
                MainActivity.this.setContentView(R.layout.l13); 
                break;

            case R.id.nextl13:
                MainActivity.this.setContentView(R.layout.l14); 
                break;

            case R.id.nextl14:
                MainActivity.this.setContentView(R.layout.l15); 
                break;

            case R.id.nextl15:
                MainActivity.this.setContentView(R.layout.l16); 
                break;

            case R.id.nextl16:
                Toast.makeText(MainActivity.this,"You have completed Lesson 1",Toast.LENGTH_LONG).show();
                MainActivity.this.setContentView(R.layout.activity_main); 
                break;


            case R.id.nextl2:
                MainActivity.this.setContentView(R.layout.l22); 
                break;

            case R.id.nextl22:
                MainActivity.this.setContentView(R.layout.l23); 
                break;

            case R.id.nextl23:
                MainActivity.this.setContentView(R.layout.l24); 
                break;

            case R.id.nextl24:
                MainActivity.this.setContentView(R.layout.l25); 
                break;

            //10 buttons done

            case R.id.nextl25:
                MainActivity.this.setContentView(R.layout.l26); 
                break;

            case R.id.nextl26:
                MainActivity.this.setContentView(R.layout.l27); 
                break;

            case R.id.nextl27:
                MainActivity.this.setContentView(R.layout.l28); 
                break;

            case R.id.nextl28:
                MainActivity.this.setContentView(R.layout.l29); 
                break;

            case R.id.nextl29:
                MainActivity.this.setContentView(R.layout.l210); 
                break;

            case R.id.nextl210:
                MainActivity.this.setContentView(R.layout.l211); 
                break;

            case R.id.nextl211:
                MainActivity.this.setContentView(R.layout.l212);  
                break;

            case R.id.nextl212:
                MainActivity.this.setContentView(R.layout.l213); 
                break;

            case R.id.nextl213:
                MainActivity.this.setContentView(R.layout.l214); 
                break;

            case R.id.nextl214:
                Toast.makeText(MainActivity.this,"You have completed lesson 2",Toast.LENGTH_LONG).show();
                MainActivity.this.setContentView(R.layout.activity_main); 
                break;

            // 20 buttons done

            case R.id.nextl31:
                MainActivity.this.setContentView(R.layout.l32); 
                break;

            case R.id.nextl32:
                MainActivity.this.setContentView(R.layout.l33); 
                break;

            case R.id.nextl33:
                MainActivity.this.setContentView(R.layout.l34); 
                break;

            case R.id.nextl34:
                MainActivity.this.setContentView(R.layout.l35); 
                break;

            case R.id.nextl35:
                MainActivity.this.setContentView(R.layout.l36); 
                break;

            case R.id.nextl36:
                MainActivity.this.setContentView(R.layout.l37); 
                break;

            case R.id.nextl37:
                MainActivity.this.setContentView(R.layout.l38); 
                break;

            case R.id.nextl38:
                MainActivity.this.setContentView(R.layout.l39); 
                break;

            case R.id.nextl39:
                MainActivity.this.setContentView(R.layout.l310); 
                break;

            case R.id.nextl310:
                MainActivity.this.setContentView(R.layout.l311); 
                break;

            

            case R.id.nextl311:
                Toast.makeText(MainActivity.this,"You have completed lesson 3",Toast.LENGTH_LONG).show();
                MainActivity.this.setContentView(R.layout.activity_main); 
                break;

            case R.id.nextl41:
                MainActivity.this.setContentView(R.layout.l42); 
                break;

            case R.id.nextl42:
                MainActivity.this.setContentView(R.layout.l43); 
                break;

            case R.id.nextl43:
                MainActivity.this.setContentView(R.layout.l44); 
                break;

            case R.id.nextl44:
                MainActivity.this.setContentView(R.layout.l45); 
                break;

            case R.id.nextl45:
                MainActivity.this.setContentView(R.layout.l46); 
                break;

            case R.id.nextl46:
                MainActivity.this.setContentView(R.layout.l47); 
                break;

            case R.id.nextl47:
                MainActivity.this.setContentView(R.layout.l48); 
                break;

            case R.id.nextl48:
                MainActivity.this.setContentView(R.layout.l49); 
                break;

            case R.id.nextl49:
                MainActivity.this.setContentView(R.layout.l410); 
                break;

            case R.id.nextl410:
                MainActivity.this.setContentView(R.layout.l411); 
                break;

            case R.id.nextl411:
                MainActivity.this.setContentView(R.layout.l412); 
                break;

            case R.id.nextl412:
                MainActivity.this.setContentView(R.layout.l413); 
                break;

            case R.id.nextl413:
                MainActivity.this.setContentView(R.layout.l414); 
                break;

            case R.id.nextl414:
                Toast.makeText(MainActivity.this,"You have completed lesson 4",Toast.LENGTH_LONG).show();
                MainActivity.this.setContentView(R.layout.activity_main); 
                break;

                    
        }
    }



}


