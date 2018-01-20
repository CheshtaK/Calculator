package com.example.cheshta.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b;
    EditText et1, et2;
    TextView tv;
    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button add, subtract, multiply, divide, clear, back;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.t1);
        et2 = (EditText) findViewById(R.id.t2);
        tv = (TextView) findViewById(R.id.text);
        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);

        add = (Button) findViewById(R.id.add);
        subtract = (Button) findViewById(R.id.subtract);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        back = (Button) findViewById(R.id.back);
        clear = (Button) findViewById(R.id.clear);

        zero.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);

        add.setOnClickListener(this);
        subtract.setOnClickListener(this);
        multiply.setOnClickListener(this);
        divide.setOnClickListener(this);
        back.setOnClickListener(this);
        clear.setOnClickListener(this);

        et1.setText("");
        et2.setText("");
        tv.setText("");

    }

    @Override
    public void onClick(View view) {
        if (et1.hasFocus()) {
            String s1 = et1.getText().toString();
            switch (view.getId()) {
                case R.id.zero:
                    et1.setText(s1 + zero.getText());
                    break;
                case R.id.one:
                    et1.setText(s1 + one.getText());
                    break;
                case R.id.two:
                    et1.setText(s1 + two.getText());
                    break;
                case R.id.three:
                    et1.setText(s1 + three.getText());
                    break;
                case R.id.four:
                    et1.setText(s1 + four.getText());
                    break;
                case R.id.five:
                    et1.setText(s1 + five.getText());
                    break;
                case R.id.six:
                    et1.setText(s1 + six.getText());
                    break;
                case R.id.seven:
                    et1.setText(s1 + seven.getText());
                    break;
                case R.id.eight:
                    et1.setText(s1 + eight.getText());
                    break;
                case R.id.nine:
                    et1.setText(s1 + nine.getText());
                    break;
                case R.id.clear:
                    et1.setText("");
                    break;
                case R.id.back:
                    a = et1.getText().toString();
                    if (a.length() > 0) {
                        a = a.substring(0, a.length() - 1);
                        et1.setText(a);
                    }
            }
        }
        if (et2.hasFocus()) {
            String s2 = et2.getText().toString();
            switch (view.getId()) {
                case R.id.zero:
                    et2.setText(s2 + zero.getText());
                    break;
                case R.id.one:
                    et2.setText(s2 + one.getText());
                    break;
                case R.id.two:
                    et2.setText(s2 + two.getText());
                    break;
                case R.id.three:
                    et2.setText(s2 + three.getText());
                    break;
                case R.id.four:
                    et2.setText(s2 + four.getText());
                    break;
                case R.id.five:
                    et2.setText(s2 + five.getText());
                    break;
                case R.id.six:
                    et2.setText(s2 + six.getText());
                    break;
                case R.id.seven:
                    et2.setText(s2 + seven.getText());
                    break;
                case R.id.eight:
                    et2.setText(s2 + eight.getText());
                    break;
                case R.id.nine:
                    et2.setText(s2 + nine.getText());
                    break;
                case R.id.clear:
                    et2.setText("");
                    break;
                case R.id.back:
                    a = et2.getText().toString();
                    if (a.length() > 0) {
                        a = a.substring(0, a.length() - 1);
                        et2.setText(a);
                    }
            }
        }

        Integer result = 0;

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        if (et1.getText().toString().equals("") || et2.getText().toString().equals("")) {
            Toast toast1 = Toast.makeText(context, "Enter both the numbers", duration);
            toast1.show();
        } else if (Integer.parseInt(et2.getText() + "") == 0 && view.getId() == R.id.divide) {
            Toast toast2 = Toast.makeText(context, "Cannot divide by zero", duration);
            toast2.show();
        } else {
            switch (view.getId()) {
                case R.id.add:
                    result = Integer.parseInt(et1.getText().toString()) + Integer.parseInt(et2.getText().toString());
                    tv.setText("" + result);
                    break;
                case R.id.subtract:
                    result = Integer.parseInt(et1.getText().toString()) - Integer.parseInt(et2.getText().toString());
                    tv.setText("" + result);
                    break;
                case R.id.multiply:
                    result = Integer.parseInt(et1.getText().toString()) * Integer.parseInt(et2.getText().toString());
                    tv.setText("" + result);
                    break;
                case R.id.divide:
                    result = Integer.parseInt(et1.getText().toString()) / Integer.parseInt(et2.getText().toString());
                    tv.setText("" + result);
                    break;
            }
        }

        Intent i = new Intent(MainActivity.this,ResultActivity.class);
        i.putExtra("result",result);
        startActivity(i);
    }
}
