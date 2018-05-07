package com.example.cobra.hashmd5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMD5(View view) {
        EditText etInput = (EditText) findViewById(R.id.password);
        TextView tvOutPut = (TextView) findViewById(R.id.codigo);
        byte[] md5Input = etInput.getText().toString().getBytes();
        BigInteger md5Data = null;

        try {
            md5Data = new BigInteger(1,md5.encryptMD5(md5Input));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String md5Str = md5Data.toString(16);
        tvOutPut.setText(md5Str);
    }
}
