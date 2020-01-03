package winarwahyuw.winw.myclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button LihatData=findViewById(R.id.lihatbtn);
        final Button InputData=findViewById(R.id.inputbtn);
        Button informasi=findViewById(R.id.infobtn);

        LihatData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, DataMahasiwaActivity.class);
                startActivity(intent);
            }
        });
        InputData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, InputDataActivity.class);
                startActivity(intent);

            }
        });
        informasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, InformasiActivity.class);
                startActivity(intent);
            }
        });
    }
}
