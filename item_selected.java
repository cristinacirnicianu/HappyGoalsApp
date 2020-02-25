package com.practice.mygoals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class item_selected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_selected);

        CheckBox mesajChecked = (CheckBox) findViewById(R.id.meditatie_selectat);
        final TextView felicitari = (TextView) findViewById(R.id.mesaj_meditatie);
        final TextView countConsecutive = (TextView) findViewById(R.id.count);


        mesajChecked.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                int countC = 0;
                if (isChecked) {
                    felicitari.setText("Felictari. Ai mediat o !");
                    countC++;

                } else {
                    felicitari.setText("Bifeaza activitate!");
                }
                countConsecutive.setText(countC + " zi(le)");
            }
        });
    }
    //https://abhiandroid.com/ui/calendarview
}
