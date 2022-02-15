package com.example.th01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int gcd(int a, int b) {
        int tmp;
        while(b != 0) {
            tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText soA = findViewById(R.id.ed_soA);
        EditText soB = findViewById(R.id.ed_soB);
        TextView kq = findViewById(R.id.tv_KQ);
        Button btnTong = findViewById(R.id.btn_Tong);
        Button btnHieu = findViewById(R.id.btn_Hieu);
        Button btnTich = findViewById(R.id.btn_Tich);
        Button btnThuong = findViewById(R.id.btn_Thuong);
        Button btnUCLN = findViewById(R.id.btn_UCLN);
        Button btnThoat = findViewById(R.id.btn_Thoat);

        btnTong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int tong = a+b;
                kq.setText(Integer.toString(tong));

            }
        });
        btnHieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int hieu = a-b;
                kq.setText(Integer.toString(hieu));
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                int tich = a*b;
                kq.setText(Integer.toString(tich));
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(soA.getText().toString());
                int b = Integer.parseInt(soB.getText().toString());
                float thuong = (float) (a*1.0/b);
                kq.setText(Float.toString(thuong));
            }
        });

        btnUCLN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int ucln =  gcd(Integer.parseInt(soA.getText().toString()),Integer.parseInt(soB.getText().toString()));
               kq.setText(Integer.toString(ucln));
            }
        });
        btnThoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }
}