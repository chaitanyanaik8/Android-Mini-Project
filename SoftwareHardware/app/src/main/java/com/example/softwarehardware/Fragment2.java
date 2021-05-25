package com.example.softwarehardware;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View inf = inflater.inflate(R.layout.fragment2_layout, container, false);
        TextView tv2 = (TextView) inf.findViewById(R.id.txtfrag2);
        tv2.setText("SOC Information\n\n");
        tv2.append("Hardware: " + Build.HARDWARE + "\n");
        tv2.append("Number of cores: " + Runtime.getRuntime().availableProcessors() + "\n");
        tv2.append("Architecture: " + System.getProperty("os.arch"));
        return inf;
    }
}
