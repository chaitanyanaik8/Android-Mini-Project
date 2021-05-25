package com.example.softwarehardware;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.io.IOException;
import java.io.InputStream;

public class Fragment4 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View inf = inflater.inflate(R.layout.fragment4_layout, container, false);
        TextView tv4 = (TextView) inf.findViewById(R.id.txtfrag4);
        tv4.setText("MEMORY Information\n\n");
        tv4.append(getMemoryInfo());
        tv4.setMovementMethod(new ScrollingMovementMethod());
        return inf;
    }

    public String getMemoryInfo() {
        ProcessBuilder cmd;
        StringBuilder result= new StringBuilder();

        try {
            String[] args = {"/system/bin/cat", "/proc/meminfo"};
            cmd = new ProcessBuilder(args);

            Process process = cmd.start();
            InputStream in = process.getInputStream();
            byte[] re = new byte[1024];
            while(in.read(re) != -1){
                System.out.println(new String(re));
                result.append(new String(re));
            }
            in.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
