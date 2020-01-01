package winarwahyuw.winw.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TampilkanActivity extends AppCompatActivity implements View.OnClickListener {
    TextView Tampilkan;
    Button btnHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkan);

        Tampilkan=findViewById(R.id.tv_tampilkanInput);

        String value=getIntent().getStringExtra("value");
        Tampilkan.setText(value);

        btnHome=findViewById(R.id.btn_toHome);
        btnHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btn_toHome){
            Intent BacktoHomeIntent=new Intent(TampilkanActivity.this, MainActivity.class);
            startActivity(BacktoHomeIntent);
        }
    }
}
