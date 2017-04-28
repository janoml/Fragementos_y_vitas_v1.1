package cl.nextu.ejercicioswipev11;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Admin on 28-04-2017.
 */

public class RockSpaniol extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.rock_espaniol, container, false);
        String[] listMetal = getResources().getStringArray(R.array.heavy_metal);
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, listMetal);
        ListView listView = (ListView) view.findViewById(R.id.rockListView);
        listView.setAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            getActivity().setTitle("Rock Español");
        }
    }


}
