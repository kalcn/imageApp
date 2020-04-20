package com.kalcn.imageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    ImageView imgmina,imgmomo,imgsana,imgtzuyu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgmina=findViewById(R.id.imgmina);
        imgmomo=findViewById(R.id.imgmomo);
        imgsana=findViewById(R.id.imgsana);
        imgtzuyu=findViewById(R.id.imgtzuyu);
    }

    public void btnOK(View view) {
        imgmina.setVisibility(View.GONE);
        imgmomo.setVisibility(View.GONE);
        imgsana.setVisibility(View.GONE);
        imgtzuyu.setVisibility(View.GONE);

        CheckBox chk;
        int[] id = {R.id.chkmina,R.id.chkmomo,R.id.chksana,R.id.chktzuyu};

        for(int i : id){

            chk=findViewById(i);

            if(chk.isChecked()){
                if (chk.getId()==R.id.chkmina)
                    imgmina.setVisibility(View.VISIBLE);
                if (chk.getId()==R.id.chkmomo)
                    imgmomo.setVisibility(View.VISIBLE);
                if (chk.getId()==R.id.chksana)
                    imgsana.setVisibility(View.VISIBLE);
                if (chk.getId()==R.id.chktzuyu)
                    imgtzuyu.setVisibility(View.VISIBLE);
            }
        }
    }
}
