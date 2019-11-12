package winarwahyuw.winw.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnDonasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDonasi=findViewById(R.id.btn_donasi);
        btnDonasi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_donasi:
                Intent DonasiIntent=new Intent(MainActivity.this, DonasiActivity.class);
                startActivity(DonasiIntent);
                break;
        }
    }
}
