package com.example.gt_3m_2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {

    private TextView tvResult;
    private Button btnPlus;
    private Button btnMinus;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
        initListener();

    }


    private void initView(View view) {
        Log.d("gg", "gg");
        tvResult = view.findViewById(R.id.tv_result);
        btnPlus = view.findViewById(R.id.btn_plus);
        btnMinus = view.findViewById(R.id.btn_minus);

    }

    private void initListener() {
        Log.d("gg", "gg2");
        btnPlus.setOnClickListener(view -> {
            tvResult.setText(String.valueOf(Integer.parseInt(tvResult.getText().toString()) +  1));
        });

        btnMinus.setOnClickListener(view -> {
            tvResult.setText(String.valueOf(Integer.parseInt(tvResult.getText().toString()) -  1));
        });

    }
}