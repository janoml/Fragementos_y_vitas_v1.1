package nextu.com.diseno_swipe_con_fragmentos;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Next University.
 */
public class ListaDeReproduccion extends FragmentPagerAdapter {

    static final int CANT_PAG = 3;

    public ListaDeReproduccion(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        if(position == 0){
            return new Pop();
        }
        if(position == 1){
            return new Rock();
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
