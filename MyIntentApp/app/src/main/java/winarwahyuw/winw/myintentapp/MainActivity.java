package winarwahyuw.winw.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.TypeVariable;
import java.net.Inet4Address;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static final String EXTRA_AGE="extra_age";
    public static final String EXTRA_NAME="extra_name";

    Button btnMove;
    Button btnMoveData;
    Button btnDialPhone;
    Button btnWebPolines;
    Button btnInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//      untuk btnMove
        btnMove = findViewById(R.id.btn_move_activity);
        btnMove.setOnClickListener(this);

        btnMoveData=findViewById(R.id.btn_move_activity_data);
        btnMoveData.setOnClickListener(this);

        btnDialPhone = findViewById(R.id.btn_dial_phone);
        btnDialPhone.setOnClickListener(this);

        btnWebPolines=findViewById(R.id.btn_web_polines);
        btnWebPolines.setOnClickListener(this);

        btnInput=findViewById(R.id.btn_input);
        btnInput.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_move_activity:
                Intent moveActivity=new Intent(MainActivity.this, newActivity.class);
                startActivity(moveActivity);
                break;
            case R.id.btn_move_activity_data:
                Intent moveDataIntent = new Intent(MainActivity.this, MoveActivityWithData.class);

                moveDataIntent.putExtra(MoveActivityWithData.EXTRA_NAME, "Winar Wahyu W.");
                moveDataIntent.putExtra(MoveActivityWithData.EXTRA_AGE, "19");
                startActivity(moveDataIntent);
                break;
            case R.id.btn_dial_phone:
                String phoneNumber="081226083292";
                Intent dialPhoneIntent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);
                break;
            case R.id.btn_web_polines:
                Uri uri=Uri.parse("https://www.polines.ac.id");
                Intent WebAddressIntent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(WebAddressIntent);
                break;
            case R.id.btn_input:
                Intent InputIntent=new Intent(MainActivity.this, InputActivity.class);
                startActivity(InputIntent);
                break;
        }
    }
}
