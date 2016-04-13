package praseed.p6c.lifecycle_test;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String TAG="check";
    public TextView Increment_diplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");
        Increment_diplay = (TextView) findViewById(R.id.inc_dispaly);
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"onStart");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG,"onRestart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"onDestroy");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.exit){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putCharSequence("inc",Increment_diplay.getText());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        CharSequence value = savedInstanceState.getCharSequence("inc");
        Increment_diplay.setText(value);
    }

    public void launchDialog(View view) {
//        Intent intent = new Intent(this,AlertD.class);
//        startActivity(intent);

       AlertDialog.Builder builder = new AlertDialog.Builder(this);
       builder.setMessage("Iam a Dialog").show();

    }

    public void launchActivity(View view) {
        Intent cintent = new Intent(this,New.class);
        startActivity(cintent);
    }

    public void increment(View view) {
        String val = (String) Increment_diplay.getText();
        if(val != null && !val.isEmpty()){
            int intval = Integer.parseInt(val);
            intval +=1;
            Increment_diplay.setText(intval+"");
        }
    }
}
