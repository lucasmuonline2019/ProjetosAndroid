package br.com.fiap.exercicios.drawerandfragments.rm77078;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/**
 * Created by logonrm on 29/03/2017.
 */

public class VeraneioFragment extends Fragment {


    public VeraneioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.veraneio_fragment, container, false);
    }
}