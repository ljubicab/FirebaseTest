package com.example.ljubica.firebasetest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends Activity {


    private ListView mListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mListView = (ListView) findViewById(R.id.lvEvents);

        DatabaseReference dbRef = FirebaseDatabase.getInstance().getReferenceFromUrl("https://test-99cc3.firebaseio.com/Events");

        FirebaseListAdapter<String> firebaseListAdapter = new FirebaseListAdapter<String>(
                this,
                String.class,
                R.layout.activity_item,
                dbRef
        ) {
            @Override
            protected void populateView(View v, String model, int position) {

                TextView textView = (TextView) v.findViewById(R.id.tvEventTitle);
                textView.setText(model);
            }
        };
        mListView.setAdapter(firebaseListAdapter);

    }
}

