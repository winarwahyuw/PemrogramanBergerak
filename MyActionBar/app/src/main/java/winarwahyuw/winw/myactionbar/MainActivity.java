package winarwahyuw.winw.myactionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options_menu, menu);

        SearchManager searchMng=(SearchManager)getSystemService(Context.SEARCH_SERVICE);
        if(searchMng!=null){
            SearchView search_view=(SearchView)(menu.findItem(R.id.search)).getActionView();
            search_view.setSearchableInfo(searchMng.getSearchableInfo(getComponentName()));
            search_view.setQueryHint(getResources().getString(R.string.search_hint));
            search_view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    Toast.makeText(MainActivity.this, query, Toast.LENGTH_SHORT);
                    return true;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    return false;
                }
            });
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.menu1:
                Intent Activity1=new Intent(MainActivity.this, MenuActivity1.class);
                startActivity(Activity1);
                return true;
            case R.id.menu2:
                Intent Activity2=new Intent(MainActivity.this, MenuActivity2.class);
                startActivity(Activity2);
                return true;
            default:
                return true;
        }
    }

}
