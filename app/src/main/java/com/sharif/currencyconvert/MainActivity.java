package com.sharif.currencyconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Spinner sp1,sp2;
EditText ed1;
Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp1=findViewById(R.id.spfrom);
        sp2=findViewById(R.id.spto);
        ed1=findViewById(R.id.txtamount);
        b1=findViewById(R.id.btn1);
      


        String[] from={"USD"};
        ArrayAdapter ad= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);

        String[] to={"Bangladesh Taka","Indian Rupess","Srilankan Rupess"};
        ArrayAdapter ad1= new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount = Double.parseDouble(ed1.getText().toString());
                if(sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Bangladesh Taka"){
                    tot = amount * 84.79500;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();

                }

                else if(sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Indian Rupess"){
                    tot = amount * 72.5902;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString()=="USD" && sp2.getSelectedItem().toString()=="Srilankan Rupess"){
                    tot = amount *197.108;
                    Toast.makeText(getApplicationContext(),tot.toString(),Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}