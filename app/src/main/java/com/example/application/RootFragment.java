package com.example.application;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.application.databinding.FragmentRootBinding;


public class RootFragment extends Fragment {
    private FragmentRootBinding fragmentRootBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentRootBinding = FragmentRootBinding.inflate(inflater, container, false);

        fragmentRootBinding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RRRR","Settings click");
                Navigation.findNavController(v).navigate(R.id.action_rootFragment_to_settingsFragment);
            }
        });


        fragmentRootBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("RRRR","Profile click");
               // NavHostFragment nav = supportFragmentManager
                NavHostFragment.findNavController(RootFragment.this.).navigate(R.id.action_rootFragment_to_profileFragment);

                //Navigation.findNavController().navigate(R.id.action_rootFragment_to_profileFragment);
            }
        });



       /* View view = inflater.inflate(R.layout.fragment_root,container,false);
        Button settings = view.findViewById(R.id.button1);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(view).navigate(R.id.action_rootFragment_to_settingsFragment);
            }
        });*/

         return fragmentRootBinding.getRoot();

    }
}