package cl.nextu.ejercicioswipe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cl.nextu.ejercicioswipe.adaptadores.EstilosMusica;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    EstilosMusica estilosMusica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.gmViewPager);
        estilosMusica = new EstilosMusica(getSupportFragmentManager());
        viewPager.setAdapter(estilosMusica);
    }
}
