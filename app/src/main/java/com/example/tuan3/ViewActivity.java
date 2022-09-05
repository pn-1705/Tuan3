package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewActivity extends AppCompatActivity {

    String ten, masv, lop, ns, gt;
    private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_nhaplai = (Button) findViewById(R.id.btn_nhaplai);
        context = this;

        btn_nhaplai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, MainActivity.class);

//            // send data if need
//            intent.putExtra(KEY_USER_TO_MAIN, userName);
//            intent.putExtra(KEY_PASSWORD_TO_MAIN, password);

                startActivity(intent);
            }
        });
    }
}