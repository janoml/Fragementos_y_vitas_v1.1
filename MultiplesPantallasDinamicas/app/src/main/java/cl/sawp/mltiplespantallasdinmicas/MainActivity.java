package cl.sawp.mltiplespantallasdinmicas;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cl.sawp.mltiplespantallasdinmicas.fragmentos.Principal;

public class MainActivity extends AppCompatActivity {
boolean dinamica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View view = findViewById(R.id.flNoticias);

        if(view == null){
            dinamica = false;
        }
        else{
           Principal principal = new Principal();
            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
            fragmentTransaction.add(R.id.flNoticias,principal);
            fragmentTransaction.commit();
        }
    }

    @Override
    public void onBackPressed() {
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            fm.popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}