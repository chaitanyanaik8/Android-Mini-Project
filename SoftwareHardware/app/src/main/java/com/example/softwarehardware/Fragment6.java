package com.example.softwarehardware;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;
import java.util.Objects;

public class Fragment6 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inf = inflater.inflate(R.layout.fragment6_layout, container, false);
        SensorManager sm = (SensorManager) Objects.requireNonNull(getActivity()).getSystemService(Context.SENSOR_SERVICE);
        List<Sensor> list = sm.getSensorList(Sensor.TYPE_ALL);
        TextView tv6 = inf.findViewById(R.id.txtfrag6);
        tv6.setText("SENSORS Information\n\n");
        for (Sensor s : list) {
            tv6.append(s.getName() + "\n");
        }
        tv6.setMovementMethod(new ScrollingMovementMethod());
        return inf;
    }
}
