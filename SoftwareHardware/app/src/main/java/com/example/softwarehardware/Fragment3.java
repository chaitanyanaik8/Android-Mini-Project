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

public class Fragment3 extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState){
        View inf = inflater.inflate(R.layout.fragment3_layout, container, false);
        TextView tv3 = (TextView) inf.findViewById(R.id.txtfrag3);
        tv3.setText("CPU Information\n\n");
        tv3.append(ReadCPUinfo());
        tv3.setMovementMethod(new ScrollingMovementMethod());
        return inf;
    }

    private String ReadCPUinfo()
    {
        ProcessBuilder cmd;
        StringBuilder result= new StringBuilder();

        try{
            String[] args = {"/system/bin/cat", "/proc/cpuinfo"};
            cmd = new ProcessBuilder(args);

            Process process = cmd.start();
            InputStream in = process.getInputStream();
            byte[] re = new byte[1024];
            while(in.read(re) != -1){
                System.out.println(new String(re));
                result.append(new String(re));
            }
            in.close();
        } catch(IOException ex){
            ex.printStackTrace();
        }
        return result.toString();
    }
}
