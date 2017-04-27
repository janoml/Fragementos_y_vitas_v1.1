package cl.sawp.mltiplespantallasdinmicas.fragmentos;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import cl.sawp.mltiplespantallasdinmicas.R;

/**
 * Created by Admin on 27-04-2017.
 */

public class Lista extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);

        String [] listaDeOpciones = getResources().getStringArray(R.array.opciones);

        ListAdapter listAdapter = new ArrayAdapter<String>(
                getActivity(), android.R.layout.simple_list_item_1, listaDeOpciones);
        setListAdapter(listAdapter);

    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
       /* Login login = new Login();
        Ayuda ayuda = new Ayuda();*/

        Fragment fragment= new Fragment();
        FragmentTransaction fragmentTransaction =
                getActivity().getFragmentManager().beginTransaction();

        switch (position){
            case 0:
                 fragment = new Principal();
                break;
            case 1:
               fragment= new Tecnologia();
                break;
            case 2:
                fragment= new Deporte();
                break;
            default:
                break;
        }
        fragmentTransaction.replace(R.id.flNoticias, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Inicio");
    }

}
