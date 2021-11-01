package com.example.a1101appcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    CheckBox ck1, ck2;
    TextView tv1 ;
    RadioGroup rg;
    RadioButton rd1,rd2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ck1 = (CheckBox) findViewById(R.id.ck1);
        ck2 = (CheckBox) findViewById(R.id.ck2);
        tv1 = findViewById(R.id.tv1);
        ck2.setOnCheckedChangeListener(mylistener);
        ck1.setOnCheckedChangeListener(mylistener);
        rg = findViewById(R.id.rg);
        rd1 = findViewById(R.id.rd1);
        rd2 = findViewById(R.id.rd2);
        rg.setOnCheckedChangeListener(rglistener);

    }
    private RadioGroup.OnCheckedChangeListener rglistener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int rd = radioGroup.indexOfChild((RadioButton) findViewById(i));
        }
    };



    private CompoundButton.OnCheckedChangeListener mylistener = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
            String result = "";
            if(ck1.isChecked()){
                result +=ck1.getText()+" ";
            }
            if(ck2.isChecked()){
                result +=ck2.getText()+" ";
            }
            tv1.setText(result);
        }
    };
}