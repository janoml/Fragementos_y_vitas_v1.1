package cl.nextu.ejercicioswipev11;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

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
