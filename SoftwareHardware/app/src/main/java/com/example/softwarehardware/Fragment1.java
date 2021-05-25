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

public class Fragment1 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View inf = inflater.inflate(R.layout.fragment1_layout, container, false);
        TextView tv1 = (TextView) inf.findViewById(R.id.txtfrag1);
        tv1.setText("DEVICE Information\n\n");
        tv1.append("Model: " + Build.MODEL + "\n");
        tv1.append("Board: " + Build.BOARD + "\n");
        tv1.append("Brand: " + Build.BRAND + "\n");
        tv1.append("Manufacturer: " + Build.MANUFACTURER + "\n");
        tv1.append("Device: " + Build.DEVICE + "\n");
        tv1.append("Product: " + Build.PRODUCT + "\n");
        tv1.append("TAGS: " + Build.TAGS + "\n");
        tv1.append("Serial: " + Build.SERIAL);
        return inf;
    }
}
