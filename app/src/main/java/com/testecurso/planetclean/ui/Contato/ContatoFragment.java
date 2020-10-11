package com.testecurso.planetclean.ui.Contato;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.testecurso.planetclean.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ContatoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ContatoFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ContatoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ContatoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ContatoFragment newInstance(String param1, String param2) {
        ContatoFragment fragment = new ContatoFragment();
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
        String descricao = "O planeta clean é um aplicativo para reunir pessoas voluntárias para realizações de ações sociais para a coleta de lixo nas nossas praias, bem como incentivar as pessoas para coleta e preservação do Meio ambiente.";
        Element versao = new Element();
        versao.setTitle("Versao 1.0");

        return new AboutPage(getActivity() )
                .setImage(R.drawable.navlogo)
                .setDescription(descricao)

                //criando grupo de contatos
                .addGroup("Entre em Contato")
                .addEmail("atendimento@planetclean.com.br","Envie um email")
                .addWebsite("https://www.google.com.br/","Acesse nosso site")

                //criando grupo de rede socias
                .addGroup("Redes sociais")
                .addFacebook("planet.clean.app","Facebook")
                .addInstagram("planetcleanpp","Instagram")
                .addTwitter("planet_clean","Twitter")
                .addYoutube("UC77kU6EO7sn-wg9KFcTj3Kw","youtube")
                .addPlayStore("com.facebook.katana","Downloadapp")
                .addItem(versao)


                .create();
    }
}