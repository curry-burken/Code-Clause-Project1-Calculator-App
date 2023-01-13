package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int[] check = {0};
        final int[] t1_init = {0};
        final int[] t3_init = {0};
        final double[] val1 = {0};
        final double[] val2 = {0};
        final double[] result = {0};
        final Character[] op =new Character[1];
        TextView t1= (TextView) findViewById(R.id.textView);
        TextView t2= (TextView) findViewById(R.id.textView2);
        TextView t3= (TextView) findViewById(R.id.textView3);
        TextView t5= (TextView) findViewById(R.id.textView5);
        Button b1= (Button) findViewById(R.id.button);
        Button b2= (Button) findViewById(R.id.button2);
        Button b3= (Button) findViewById(R.id.button3);
        Button b4= (Button) findViewById(R.id.button4);
        Button b5= (Button) findViewById(R.id.button5);
        Button b6= (Button) findViewById(R.id.button6);
        Button b7= (Button) findViewById(R.id.button7);
        Button b8= (Button) findViewById(R.id.button8);
        Button b9= (Button) findViewById(R.id.button9);
        Button b10= (Button) findViewById(R.id.button10);
        Button b11= (Button) findViewById(R.id.button11);
        Button b12= (Button) findViewById(R.id.button12);
        Button b13= (Button) findViewById(R.id.button13);
        Button b14= (Button) findViewById(R.id.button14);
        Button b15= (Button) findViewById(R.id.button15);
        Button b16= (Button) findViewById(R.id.button16);
        Button b17= (Button) findViewById(R.id.button17);
        Button b18= (Button) findViewById(R.id.button18);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                check[0] =0;
                t1.setText("First Input");
                t1_init[0] =0;
                t2.setText("Operator");
                t3.setText("Second Input");
                t3_init[0] =0;
                t5.setText("");
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0]==0)
                {
                    CharSequence temp=t1.getText();
                    StringBuilder sb = new StringBuilder(temp.length());
                    sb.append(temp);
                    String tempstr =sb.toString();
                    int tempstr_len=tempstr.length();
                    tempstr=tempstr.substring(0,tempstr_len-1);
                    t1.setText(tempstr);
                }
                if(check[0]==1)
                {
                    CharSequence temp=t3.getText();
                    StringBuilder sb = new StringBuilder(temp.length());
                    sb.append(temp);
                    String tempstr =sb.toString();
                    int tempstr_len=tempstr.length();
                    tempstr=tempstr.substring(0,tempstr_len-1);
                    t3.setText(tempstr);
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("0");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"0");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("0");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"0");
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("1");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"1");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("1");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"1");
                }
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                CharSequence temp = t1.getText();
                StringBuilder sb = new StringBuilder(temp.length());
                sb.append(temp);
                String tempstr = sb.toString();
                try {
                    val1[0] =Float.parseFloat(tempstr);
                } catch (NumberFormatException ex) {
                    ex.printStackTrace();
                }
                check[0] = 1;
                op[0] = '+';
                t2.setText("+");
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("2");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"2");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("2");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"2");
                }
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("3");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"3");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("3");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"3");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("4");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"4");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("4");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"4");
                }
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CharSequence temp=t1.getText();
                StringBuilder sb = new StringBuilder(temp.length());
                sb.append(temp);
                String tempstr =sb.toString();
                try{
                    val1[0]=Float.parseFloat(tempstr);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                check[0]=1;
                op[0] ='-';
                t2.setText("-");
            }
        });
        b10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("5");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"5");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("5");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"5");
                }
            }
        });
        b11.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("6");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"6");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("6");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"6");
                }
            }
        });
        b12.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("7");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"7");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("7");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"7");
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CharSequence temp=t1.getText();
                StringBuilder sb = new StringBuilder(temp.length());
                sb.append(temp);
                String tempstr =sb.toString();
                try{
                    val1[0]=Float.parseFloat(tempstr);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                check[0]=1;
                op[0] ='*';
                t2.setText("*");
            }
        });
        b14.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("8");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"8");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("8");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"8");
                }
            }
        });
        b15.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText("9");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+"9");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText("9");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+"9");
                }
            }
        });
        b16.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(check[0] ==0 && t1_init[0] ==0)
                {
                    t1.setText(".");
                    t1_init[0] =1;
                }
                else if(check[0] ==0)
                {
                    t1.setText(t1.getText()+".");
                }
                else if(check[0] ==1 && t3_init[0] ==0)
                {
                    t3.setText(".");
                    t3_init[0] =1;
                }
                else if(check[0] ==1)
                {
                    t3.setText(t3.getText()+".");
                }
            }
        });
        b17.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CharSequence temp=t1.getText();
                StringBuilder sb = new StringBuilder(temp.length());
                sb.append(temp);
                String tempstr =sb.toString();
                try{
                    val1[0]=Float.parseFloat(tempstr);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                check[0]=1;
                op[0] ='/';
                t2.setText("/");
            }
        });
        b18.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                CharSequence temp=t3.getText();
                StringBuilder sb = new StringBuilder(temp.length());
                sb.append(temp);
                String tempstr =sb.toString();
                try{
                    val2[0]=Float.parseFloat(tempstr);
                }
                catch (NumberFormatException ex){
                    ex.printStackTrace();
                }
                switch (op[0])
                {
                    case '+':
                        result[0]=val1[0]+val2[0];
                        break;
                    case '-':
                        result[0]=val1[0]-val2[0];
                        break;
                    case '*':
                        result[0]=val1[0]*val2[0];
                        break;
                    case '/':
                        result[0]=(double) val1[0]/val2[0];
                        break;
                }
                double temconvert=result[0];
                String newresult=String.valueOf(temconvert);
                t5.setText(newresult);
            }
        });
    }
}