package com.testecurso.planetclean.ui.Rastreamento;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.testecurso.planetclean.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RastreamentoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RastreamentoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public RastreamentoFragment() {
        // Required empty public constructor
    }

    public static RastreamentoFragment newInstance(String param1, String param2) {
        RastreamentoFragment fragment = new RastreamentoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rastreamento, container, false);
    }

    public void rastreamento1(View view) {
        //ira localizar o local mais proximo com contaminacao

        String endereco1 = "https://www.google.com/maps/place/Av.+Canal+-+Realengo,+Rio+de+Janeiro+-+RJ,+21755-410/@-22.8830115,-43.430329,18z/data=!3m1!4b1!4m5!3m4!1s0x9bdf614abecaef:0x678c4d147d5353ea!8m2!3d-22.883013!4d-43.4296592";
        Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco1) );
        startActivity(intent1);
    }

    public void rastreamento2(View view) {
        //ira localizar o local mais proximo para realizar o descarte adequado
        String endereco2 = "https://www.google.com/maps/place/Av.+Canal+-+Realengo,+Rio+de+Janeiro+-+RJ,+21755-410/@-22.8830115,-43.430329,18z/data=!3m1!4b1!4m5!3m4!1s0x9bdf614abecaef:0x678c4d147d5353ea!8m2!3d-22.883013!4d-43.4296592";
        Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco2));
        startActivity(intent2);
    }

}