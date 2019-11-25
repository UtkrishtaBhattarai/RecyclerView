package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);

        List<Contacts>contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Rajesh Hamal","9802365784",R.drawable.rajesh));
        contactsList.add(new Contacts("Bhuwan KC","9845632147",R.drawable.bhuwan));
        contactsList.add(new Contacts("Anmol KC","9874523621",R.drawable.anmol));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

}
