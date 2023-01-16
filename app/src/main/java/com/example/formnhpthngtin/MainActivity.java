package com.example.formnhpthngtin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText nhapTen, nhapNamsinh, nhapTruong;
    Button hienThi, nhapLai;
    RadioButton rd1, rd2;
    CheckBox cb1, cb2, cb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hienThi = findViewById(R.id.hienThi);
        hienThi.setOnClickListener(this);

        nhapLai = findViewById(R.id.nhapLai);
        nhapLai.setOnClickListener(this);

        nhapTen = findViewById(R.id.nhapTen);
        nhapNamsinh = findViewById(R.id.nhapNaminh);
        nhapTruong = findViewById(R.id.nhapTruong);

        rd1 = findViewById(R.id.r1);
        rd2 = findViewById(R.id.r2);

        cb1 = findViewById(R.id.c1);
        cb1.setOnClickListener(this);
        cb2 = findViewById(R.id.c2);
        cb2.setOnClickListener(this);
        cb3 = findViewById(R.id.c3);
        cb3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.hienThi){

            Toast.makeText(this, "Đã lưu thông tin", Toast.LENGTH_SHORT).show();

            // chuyen man hinh
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putString("key_hoten", nhapTen.getText().toString());
            bundle.putString("key_namsinh", nhapNamsinh.getText().toString());
            bundle.putString("key_truong", nhapTruong.getText().toString());

            if(rd1.isChecked()){
                bundle.putString("key_gioitinh", rd1.getText().toString());
            }
            else if(rd2.isChecked()){
                bundle.putString("key_gioitinh", rd2.getText().toString());
            }

            // ko chac da dung
            if(cb1.isChecked()){
                bundle.putString("key_thethao", cb1.getText().toString());
            }
            if(cb2.isChecked()){
                bundle.putString("key_dulich", cb2.getText().toString());
            }
            if(cb3.isChecked()){
                bundle.putString("key_game", cb3.getText().toString());
            }
            intent.putExtras(bundle);
            startActivity(intent);
        }

        else if(view.getId() == R.id.nhapLai){
            Toast.makeText(this, "Đã xóa thông tin", Toast.LENGTH_SHORT).show();

            // xoa du lieu
            nhapTen.getText().clear();
            nhapNamsinh.getText().clear();
            nhapTruong.getText().clear();

            // set lai data cho gioiTinh
            if(rd1.isChecked()){
                rd1.setChecked(false);
            }
            if(rd2.isChecked()){
                rd2.setChecked(false);
            }

            // set lai data cho sothich
            if(cb1.isChecked()){
                cb1.setChecked(false);
            }
            if(cb2.isChecked()){
                cb2.setChecked(false);
            }
            if(cb3.isChecked()){
                cb3.setChecked(false);
            }

        }

    }

//    public void checkGioiTinh()







//    private void onCheckboxClicked() {
//        // Is the view now checked?
//        boolean checked = ((CheckBox) view).isChecked();
//
//        // Check which checkbox was clicked
//        switch(view.getId()) {
//            case R.id.checkbox_meat:
//                if (checked)
//                // Put some meat on the sandwich
//            else
//                // Remove the meat
//                break;
//            case R.id.checkbox_cheese:
//                if (checked)
//                // Cheese me
//            else
//                // I'm lactose intolerant
//                break;
//            // TODO: Veggie sandwich
//        }
//    }


}