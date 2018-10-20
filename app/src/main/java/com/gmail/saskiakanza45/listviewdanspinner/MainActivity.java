package com.gmail.saskiakanza45.listviewdanspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listBuah;
    String DaftarBuah[] = {"Pepaya", "Mangga", "Pisang", "Jambu", "Pepaya", "Mangga", "Pisang", "Jambu", "Pepaya", "Mangga", "Pisang", "Jambu"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listBuah = (ListView)findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.textView, DaftarBuah);//text viewe berada di list item dan akan diterapkan di this saat ini

        //menyiapkan adapter
        listBuah.setAdapter(arrayAdapter);

    }
}
