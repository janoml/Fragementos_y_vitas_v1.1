package nextu.com.fragmentosdinamicosswipe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Next University.
 */
public class ProgramacionAyer extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.programacion_ayer, container, false);

        String [] programacion_ayer = new String[] {"Inter vs. Milan", "Roland Garros"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, programacion_ayer);
        ListView listView = (ListView) view.findViewById(R.id.programacion_ayer);
        listView.setAdapter(arrayAdapter);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(isVisibleToUser){
            getActivity().setTitle("Programación de Ayer");
        }

    }
}
