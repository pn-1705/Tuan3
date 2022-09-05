package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edittext_ten, edittext_masv, edittext_lop, edittext_ns, edittext_gt;
    Button button_view;
    String ten, masv, lop, ns, gt;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext_ten = (EditText) findViewById(R.id.edt_name);
        edittext_lop = (EditText) findViewById(R.id.edt_class);
        edittext_ns = (EditText) findViewById(R.id.edt_year);
        edittext_gt = (EditText) findViewById(R.id.edt_gender);
        edittext_masv = (EditText) findViewById(R.id.edt_id);
        button_view = (Button) findViewById(R.id.btn_view);
        ControlButton();
        context = this;
    }

    private void intent() {
        Intent intent = new Intent(context, MainActivity2.class);
        startActivity(intent);
    }

    private void ControlButton() {
        button_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent();
            }
        });
    }
}