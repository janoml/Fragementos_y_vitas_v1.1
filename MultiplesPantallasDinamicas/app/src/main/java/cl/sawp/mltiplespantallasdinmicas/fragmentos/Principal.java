package cl.sawp.mltiplespantallasdinmicas.fragmentos;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import cl.sawp.mltiplespantallasdinmicas.R;

/**
 * Created by Admin on 27-04-2017.
 */

public class Principal extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.principales, container, false);
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Principal");
    }
}
