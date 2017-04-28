package cl.nextu.ejercicioswipe.fragmentos;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.nextu.ejercicioswipe.R;

/**
 * Created by Admin on 28-04-2017.
 */

public class Electronica extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.electronica, container, false);

        //String[] programacion_ayer = new String[]{"Inter vs. Milan", "Roland Garros"};

        String [] listaElectronica= getResources().getStringArray(R.array.electronica);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1,listaElectronica);
        ListView listView = (ListView) view.findViewById(R.id.elecListView);
        listView.setAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser) {
            getActivity().setTitle("Música electrónica");
        }

    }

}
