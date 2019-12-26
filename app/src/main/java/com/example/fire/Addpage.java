package com.example.fire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Addpage extends AppCompatActivity {
    EditText e1,e2,e3,e4;
    Button b;
    String s1,s2,s3,s4;
    Student st;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addpage);
        e1=(EditText) findViewById(R.id.ed1);
        e2=(EditText) findViewById(R.id.ed2);
        e3=(EditText) findViewById(R.id.ed3);
        e4=(EditText) findViewById(R.id.ed4);
        b=(Button)findViewById(R.id.buton);

        reference= FirebaseDatabase.getInstance().getReference().child("students");

        st=new Student();
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=e1.getText().toString().trim();
                s2=e2.getText().toString().trim();
                s3=e3.getText().toString().trim();
                s4=e4.getText().toString().trim();
                st.setName(s1);
                st.setRollno(s2);
                st.setAdno(s3);
                st.setColg(s4);
                
                reference.push().setValue(st);

                String st1=st.getName();
                String st2=st.getRollno();
                String st3=st.getAdno();
                String st4=st.getColg();
                Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
