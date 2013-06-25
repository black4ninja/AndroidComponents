package com.example.Adapter_ListView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MyActivity extends Activity {

    private static final String TAG = MyActivity.class.getSimpleName();

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ListView listView = (ListView) findViewById(R.id.list_data);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

        // we have added a button on our list view
        // for that reason, list view on item click wont get the event
        // we need to implement click listener in custom adapter
        // this method will work if we do not add button on our list view

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//
//                DataModel dataModel = (DataModel) adapterView.getItemAtPosition(i);
//
//                Log.d(TAG, "string: " + dataModel.getName());
//                Log.d(TAG, "int: " + dataModel.getAnInt());
//                Log.d(TAG, "double: " + dataModel.getaDouble());
//                Log.d(TAG, "otherData: " + dataModel.getOtherData());
//
//                Toast.makeText(MyActivity.this, "Item Clicked: " + i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}