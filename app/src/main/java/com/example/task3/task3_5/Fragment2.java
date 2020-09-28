package com.example.task3.task3_5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.task3.R;

public class Fragment2 extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        Button button1 = view.findViewById(R.id.button1);
        Button button2 = view.findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button1:
                Navigation.findNavController(v).navigate(R.id.action_fragment2_to_fragment1);
                break;
            case R.id.button2:
                Navigation.findNavController(v).navigate(R.id.action_fragment2_to_fragment3);
                break;
        }
    }
}