package com.example.siamandsalahcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView t,f;
    RadioGroup r;
    RadioButton rb;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t = findViewById(R.id.dys);
        r = findViewById(R.id.grp);
        b = findViewById(R.id.button);
        f=findViewById(R.id.fidiy);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //2.5kg wheat for 96.25 for 1 saim or salah
        //96.25*dys*6 for slah & 96.25*dys*1 for saim
        int dys = Integer.parseInt(t.getText().toString());
        int selectedId = r.getCheckedRadioButtonId();
        float fidiy = 1.0F;
        if(selectedId == R.id.slh) {
            fidiy = (float) (dys*6*96.25);
        } else
            fidiy = (float) (dys*1*96.25);
        f.setText("Fidiya To Be Piad: "+fidiy+"0.0RS");
    }
}