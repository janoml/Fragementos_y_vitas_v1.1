package cl.nextu.ejercicioswipe.adaptadores;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import cl.nextu.ejercicioswipe.fragmentos.Electronica;
import cl.nextu.ejercicioswipe.fragmentos.HeavyMetal;
import cl.nextu.ejercicioswipe.fragmentos.RockSpaniol;

/**
 * Created by Admin on 28-04-2017.
 */

public class EstilosMusica extends FragmentPagerAdapter {

    static final int CANT_PAG = 3;

    public EstilosMusica(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new HeavyMetal();
        }
        if(position == 1){
            return new RockSpaniol();
        }
        else{
            return new Electronica();
        }

    }

    @Override
    public int getCount() {
        return CANT_PAG;
    }
}
