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
public class Electronica extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.electronica, container, false);

        String [] electronica = new String[] {"Titanium ft. Sia", "Love Is Gone", "Blue",
                "The World Is Mine", "Destination"};
        ArrayAdapter arrayAdapter = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, electronica);
        ListView listView = (ListView) view.findViewById(R.id.electronica);
        listView.setAdapter(arrayAdapter);

        return view;
        }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);

        if(isVisibleToUser){
            getActivity().setTitle("Electrónica");
        }

    }
}
