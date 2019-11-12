package winarwahyuw.winw.mycardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardDetail extends AppCompatActivity {
    private int card_id;
    ImageView imgDetail;
    TextView tvName, tvDetail;
    private ArrayList<DataSet> listCardDetail=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_detail);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        card_id=getIntent().getIntExtra("card_id", 0);
        tvName=findViewById(R.id.tv_card_Name);
        tvDetail=findViewById(R.id.tv_card_detail);
        imgDetail=findViewById(R.id.img_card_detail);

        listCardDetail.addAll(ItemData.getListData());
        setLayout();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

//        getSupportActionBar().setTitle("Title");
        String title=getIntent().getStringExtra("card_id2");
        getSupportActionBar().setTitle(title);


    }

    void setLayout(){
        tvName.setText(listCardDetail.get(card_id).getName());
        tvDetail.setText(listCardDetail.get(card_id).getCardDetail());
        Glide.with(this)
                .load(listCardDetail.get(card_id).getCardImages())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }

//    code for AboutActivity
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent AboutIntent=new Intent(CardDetail.this,AboutActivity.class);
                startActivity(AboutIntent);
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInf=getMenuInflater();
        menuInf.inflate(R.menu.aboutbutton, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }
}
