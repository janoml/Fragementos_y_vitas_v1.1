package nextu.com.diseno_swipe_con_fragmentos;

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
public class Pop extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pop, container, false);

        String [] pop = new String[] {"Thriller", "Take on me", "Like a Prayer",
        "Telephone", "Gangnam Style"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, pop);
        ListView listView = (ListView) view.findViewById(R.id.pop);
        listView.setAdapter(arrayAdapter);

        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(isVisibleToUser){
            getActivity().setTitle("Pop");
        }

    }

}
