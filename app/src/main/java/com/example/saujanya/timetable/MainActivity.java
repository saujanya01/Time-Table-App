package com.example.saujanya.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity
{
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView textView=findViewById(R.id.textView);
        String[] days={"Monday","Tuesday","Wednesday","Thursday","Friday"};
        spinner=(Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,days);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {
                String str=spinner.getSelectedItem().toString();
                if (str=="Monday")
                {
                    String s="08:00 - 09:00 : EE\n09:00 - 10:00 : EM-I\n10:00 - 11:00 : EMI\n13:00 - 14:00 : DSP\n14:00 - 15:00 : BS";
                    textView.setText(s);
                    Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                }
                if (str=="Tuesday")
                {
                    String s="08:00 - 09:00 : DSP\n09:00 - 12:00 : EM Lab(E1)/EMI Lab(E2)\n14:00 - 15:00 : EE\n15:00 - 16:00 : EM-I\n16:00 - 17:00 : EMI";
                    textView.setText(s);
                    Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                }
                if (str=="Wednesday")
                {
                    String s="13:00 - 14:00 : DSP\n14:00 - 15:00 : BS\n15:00 - 16:00 : EE";
                    textView.setText(s);
                    Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                }
                if (str=="Thursday")
                {
                    String s="08:00 - 09:00 : EE\n09:00 - 12:00 : DSP Lab\n14:00 - 17:00 : NCC/NSS/PTG/CA";
                    textView.setText(s);
                    Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                }
                if (str=="Friday")
                {
                    String s="08:00 - 09:00 : BS\n09:00 - 10:00 : EM-I\n10:00 - 11:00 : DSP\n11:00 - 12:00 : EMI\n14:00 - 17:00 : EM Lab(E2)/EMI Lab(E1)";
                    textView.setText(s);
                    Toast.makeText(getBaseContext(),str,Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {

            }
        });
    }
}
