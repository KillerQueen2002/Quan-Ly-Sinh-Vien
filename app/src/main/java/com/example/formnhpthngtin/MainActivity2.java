package com.example.formnhpthngtin;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
public class MainActivity2 extends AppCompatActivity {
    TextView txtHoten, txtNamsinh, txtTruong, txtGioitinh;
    TextView txtSothich, txtSothich2, txtSothich3;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtHoten = findViewById(R.id.hienThiTen);
        txtNamsinh = findViewById(R.id.hienThiNamsinh);
        txtTruong = findViewById(R.id.hienThiTruong);
        txtGioitinh = findViewById(R.id.hienThiGioiTinh);
        txtSothich = findViewById(R.id.hienThiSoThich);
        txtSothich2 = findViewById(R.id.hienThiSoThich2);
        txtSothich3 = findViewById(R.id.hienThiSoThich3);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String hoTen1 = bundle.getString("key_hoten", "Ko hien j");
            String namSinh1 = bundle.getString("key_namsinh", "Ko hien j");
            String tenTruong1 = bundle.getString("key_truong", "Ko hien j");
            String gioiTinh1 = bundle.getString("key_gioitinh", "Ko hien j");
            String soThich1 = bundle.getString("key_thethao", "");
            String soThich2 = bundle.getString("key_dulich", "");
            String soThich3 = bundle.getString("key_game", "");


            txtHoten.setText(hoTen1);
            txtNamsinh.setText(namSinh1);
            txtTruong.setText(tenTruong1);
            txtGioitinh.setText(gioiTinh1);

            // ko chac da dung
            txtSothich.setText(soThich1);
            txtSothich2.setText(soThich2);
            txtSothich3.setText(soThich3);

        }

    }
}