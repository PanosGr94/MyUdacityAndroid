package com.example.android.explicitintent;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Lenovo pPc on 14-Feb-17.
 */

public class ChildActivity extends AppCompatActivity{

    // Do steps 6 & 7 in ChildActivity.java
// TODO (6) Create a TextView field to display your message
// TODO (7) Get a reference to your TextView in Java

TextView mTextInChild;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mTextInChild = (TextView) findViewById(R.id.tv_display);

    }
}
