package com.example.task3.task3_5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import com.example.task3.R;

public class Fragment1 extends Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        Button button1 = view.findViewById(R.id.button1);
        button1.setOnClickListener(this);
        Button button2 = view.findViewById(R.id.button2);
        button2.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button1:
                Navigation.findNavController(v).navigate(R.id.action_fragment1_to_fragment2);
                break;
            case R.id.button2:
                Navigation.findNavController(v).navigate(R.id.action_fragment1_to_fragment3);
                break;
        }
    }
}