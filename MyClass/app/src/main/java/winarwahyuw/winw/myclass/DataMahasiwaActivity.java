package winarwahyuw.winw.myclass;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.sql.Ref;

public class DataMahasiwaActivity extends AppCompatActivity {
    String[] daftar;
    ListView listView;
    protected Cursor cursor;
    DataHelper dbcenter;
    public static DataMahasiwaActivity dataMahasiwaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mahasiwa);

        Button button=findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DataMahasiwaActivity.this, InputDataActivity.class);
                startActivity(intent);
            }
        });

        dataMahasiwaActivity=this;
        dbcenter=new DataHelper(this);
        RefreshList();
    }

    public void RefreshList(){
        SQLiteDatabase database=dbcenter.getReadableDatabase();
        cursor=database.rawQuery("SELECT * FROM biodata",null);
        daftar=new String[cursor.getCount()];

        cursor.moveToFirst();
        for (int cc=0; cc<cursor.getCount(); cc++){
            cursor.moveToPosition(cc);
            daftar[cc]=cursor.getString(1).toString();
        }
        listView=(ListView)findViewById(R.id.listview1);
        listView.setAdapter(new ArrayAdapter(this, android.R.layout.simple_list_item_1, daftar));
        listView.setSelected(true);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                final String selection=daftar[position];
                final CharSequence[] dialogitem={"Lihat Data", "Update Data", "Hapus Data"};
                AlertDialog.Builder builder=new AlertDialog.Builder(DataMahasiwaActivity.this);
                builder.setTitle("Pilihan");

                builder.setItems(dialogitem, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which){
                            case 0:
                                Intent i=new Intent(getApplicationContext(), DetailData.class);
                                i.putExtra("nama", selection);
                                startActivity(i);
                                break;
                            case 1:
                                Intent in=new Intent(getApplicationContext(), UpdateData.class);
                                in.putExtra("nama", selection);
                                startActivity(in);
                                break;
                            case 2:
                                SQLiteDatabase sqLiteDatabase=dbcenter.getWritableDatabase();
                                sqLiteDatabase.execSQL("delete from biodata where nama =''" +selection+ "");
                                RefreshList();
                                break;
                        }
                    }
                });
                builder.create().show();
            }
        });
        ((ArrayAdapter) listView.getAdapter()).notifyDataSetInvalidated();
    }
}
