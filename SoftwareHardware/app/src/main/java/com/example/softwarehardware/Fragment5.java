package com.example.softwarehardware;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.text.SimpleDateFormat;

public class Fragment5 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View inf = inflater.inflate(R.layout.fragment5_layout, container, false);
        TextView tv5 = (TextView) inf.findViewById(R.id.txtfrag5);
        tv5.setText("OS Information\n\n");
        tv5.append("Build release: " + Build.VERSION.RELEASE + "\n");
        tv5.append("Incremental release: " + Build.VERSION.INCREMENTAL + "\n");
        tv5.append("Base OS: " + Build.VERSION.BASE_OS + "\n");
        tv5.append("CODE Name: " + Build.VERSION.CODENAME + "\n");
        tv5.append("Security patch: " + Build.VERSION.SECURITY_PATCH + "\n");
        tv5.append("Preview SDK: " + Build.VERSION.PREVIEW_SDK_INT + "\n");
        tv5.append("SDK/API version: " + Build.VERSION.SDK_INT + "\n");
        tv5.append("Display build: " + Build.DISPLAY + "\n");
        tv5.append("Finger print: " + Build.FINGERPRINT + "\n") ;
        tv5.append("Build ID: " + Build.ID + "\n");

        @SuppressLint("SimpleDateFormat") SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, yyyy 'at' h:mm a");
        String date = sdf.format(Build.TIME);

        tv5.append("Build Time: " + date + "\n");
        tv5.append("Build Type: " + Build.TYPE + "\n");
        tv5.append("Build User: " + Build.USER + "\n");
        tv5.append("Bootloader: " + Build.BOOTLOADER + "\n");
        tv5.append("Kernel version: " + System.getProperty("os.version"));
        tv5.setMovementMethod(new ScrollingMovementMethod());
        return inf;
    }
}
