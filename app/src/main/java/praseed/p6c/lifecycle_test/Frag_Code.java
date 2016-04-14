package praseed.p6c.lifecycle_test;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Frag_Code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frag__code);

       FirstFrag first = new FirstFrag();
        SecondFrag second = new SecondFrag();
        FragmentManager FM = getSupportFragmentManager();
        FragmentTransaction transaction = FM.beginTransaction();
        transaction.add(R.id.first,first,"first");
        transaction.add(R.id.second,second,"second");
        transaction.commit();
    }
}
