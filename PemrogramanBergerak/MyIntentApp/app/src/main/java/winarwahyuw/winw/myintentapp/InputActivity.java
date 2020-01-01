package winarwahyuw.winw.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.Validator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editInput;
    Button btnTampilkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        editInput=findViewById(R.id.et_input);

        btnTampilkan=findViewById(R.id.btn_kirim);
        btnTampilkan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_kirim) {
            String isi=editInput.getText().toString();

            Intent TampilkanIntent=new Intent(InputActivity.this, TampilkanActivity.class);
            startActivity(TampilkanIntent.putExtra("value",isi));

        }

    }
}
