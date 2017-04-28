package nextu.com.diseno_swipe_con_fragmentos;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ListaDeReproduccion listaDeReproduccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.paginas);
        listaDeReproduccion = new ListaDeReproduccion(getSupportFragmentManager());
        viewPager.setAdapter(listaDeReproduccion);
    }
}
