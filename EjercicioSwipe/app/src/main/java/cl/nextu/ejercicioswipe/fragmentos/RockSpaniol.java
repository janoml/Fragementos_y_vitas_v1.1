package cl.nextu.ejercicioswipe.fragmentos;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import cl.nextu.ejercicioswipe.R;

//import cl.nextu.ejercicioswipe.R;

/**
 * Created by Admin on 28-04-2017.
 */

public class RockSpaniol extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rock_espaniol, container, false);

       final String [] listRock= getResources().getStringArray(R.array.rock_es);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1,listRock);
        ListView listView = (ListView) view.findViewById(R.id.rockListView);
        listView.setAdapter(arrayAdapter);

        return view;
    }
    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if (isVisibleToUser) {
            getActivity().setTitle("Rock Espaniol");
        }

    }
}

