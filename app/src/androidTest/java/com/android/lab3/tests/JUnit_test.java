package com.android.lab3.tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

import com.android.lab3.MainActivity;
import com.android.lab3.R;

import org.w3c.dom.Text;

/**
 * Created by Sandra Soueid on 4/20/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {
    MainActivity mainActivity;
    public JUnit_test(){
        super(MainActivity.class);

    }

    public void test_first(){
        mainActivity = getActivity();

        int summ = mainActivity.sum(2, 5);

        assertEquals(7, summ);

    }
}
