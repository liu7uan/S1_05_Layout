package com.aq.s1_05_layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity {

    private CheckBox eatBox;
    private CheckBox sleepBox;
    private CheckBox dotaBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

                    eatBox=(CheckBox)findViewById(R.id.eat);
                   sleepBox=(CheckBox)findViewById(R.id.sleep);
                    dotaBox=(CheckBox)findViewById(R.id.dota);
/*            onBoxClickListener onbl=new onBoxClickListener();
            eatBox.setOnClickListener(onbl);
            sleepBox.setOnClickListener(onbl);
            dotaBox.setOnClickListener(onbl);*/

        CheckBoxlistener cbl=new CheckBoxlistener();
        eatBox.setOnCheckedChangeListener(cbl);
        sleepBox.setOnCheckedChangeListener(cbl);
        dotaBox.setOnCheckedChangeListener(cbl);

    }
    class CheckBoxlistener implements CompoundButton.OnCheckedChangeListener{

        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if(buttonView.getId()==R.id.eat){
                System.out.println("eat");
            }else if(buttonView.getId()==R.id.sleep){
                System.out.println("sleep");
            }else if(buttonView.getId()==R.id.dota){
                System.out.println("dota");
            }
            if (isChecked){
                System.out.println("checked");
            }else{
                System.out.println("no checked");
            }

        }
    }

/*    OnClickListener 使用方法*/
/*    class onBoxClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
        System.out.println("Checkbox is click"+v.getId());
            CheckBox box=(CheckBox)v;
            if(((CheckBox) v).isChecked()){
                System.out.println("Checked");
            }else{
                System.out.println("NO Checked");
            }
        }
    }*/

}
