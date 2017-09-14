package com.i012114.programacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.i012114.programacion.Json.JsonUser;
import com.i012114.programacion.Models.Person;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView txtListUsers;
    EditText et_FirstName;
    EditText et_LastName;
    List <Person> ListPerson = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtListUsers = (TextView) findViewById(R.id.txt_1);
        et_FirstName = (EditText) findViewById(R.id.et_firstName);
        et_LastName = (EditText) findViewById(R.id.et_lastName);



        //String[] arrayUsers = JsonUser.ListUSerDos();

        //for (String user : arrayUsers){
            //txtListUsers.append(user + "\n\n\n");

        //}


    }


    public void createPerson(View view){
        Person user = new Person();
        user.setFirst_name(et_FirstName.getText().toString());
        user.setLast_name(et_LastName.getText().toString());
        ListPerson.add(user);



        //Toast.makeText(this, et_FirstName.getText(), Toast.LENGTH_SHORT).show();

    }

    public void ListUser(View view){


       for (Person e: ListPerson) {
           txtListUsers.append("Nombre " + e.getFirst_name() + "Apellido " + e.getLast_name() + "\n\n\n");
       }

    }
}
