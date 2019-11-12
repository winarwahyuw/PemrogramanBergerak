package winarwahyuw.winw.mycardview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvBT21;
    private ArrayList<DataSet> list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(false);

        rvBT21=findViewById(R.id.rv_bt21);
        rvBT21.setHasFixedSize(true);

        list.addAll(ItemData.getListData());
        show();

    }

    private void show(){
        rvBT21.setLayoutManager(new LinearLayoutManager(this));
        CardViewAdapter cvAdapter=new CardViewAdapter(this,list);
        rvBT21.setAdapter(cvAdapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.about:
                Intent AboutIntent=new Intent(MainActivity.this,AboutActivity.class);
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


//    @Override
//    public boolean onSupportNavigateUp(){
//        onBackPressed();
//        return true;
//    }
}
