package com.example.eservice_fa.demofragmentsfixe;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class FragmentFixe extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        afficheMessage("Fragment : onCreateView");
        return inflater.inflate(R.layout.fragment_fixe, container, false);
    }

    /*
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        afficheMessage("Fragment : onCreate");
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        afficheMessage("Fragment : onAttach");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        afficheMessage("Fragment : onActivityCreated");
    }

    @Override
    public void onStart(){
        super.onStart();
        afficheMessage("Fragment : onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        afficheMessage("Fragment : onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        afficheMessage("Fragment : onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        afficheMessage("Fragment : onStop");
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
        afficheMessage("Fragment : onDestroyView");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        afficheMessage("Fragment : onDetach");
    }*/

    public void afficheMessage(String message) {
        Toast.makeText(this.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
