package winarwahyuw.winw.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MoveActivityWithData extends AppCompatActivity {

    public static final String EXTRA_NAME="extra_name";
    public static final String EXTRA_AGE="extra_age";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        TextView TvDataReceived=findViewById(R.id.tv_data_received);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        String umur = getIntent().getStringExtra(EXTRA_AGE);

        String text="Nama\t:" +nama+ "\nUmur\t:" +umur;
        TvDataReceived.setText(text);
    }
}
