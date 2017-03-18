package com.example.android.galgulator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class TopFragment extends Fragment {

    private TextView number1;
    private TextView number2;
    private TextView sign;
    private TextView Result;
    private double value1;
    double value2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_fragment, container, false);

        number1 = (TextView) view.findViewById(R.id.number);
        number2 = (TextView) view.findViewById(R.id.number2);
        sign = (TextView) view.findViewById(R.id.sign);
        Result = (TextView) view.findViewById(R.id.result);



        return view;


    }

    public void setResult(double a)
    {
        Result.setText(Double.toString(a));
    }

    public void setSign(String sign){
        this.sign.setText(sign);

    }

    public void setNumber2(double num){

        number2.setText(Double.toString(num));
    }


    public void setNumber1(double num){

        number1.setText(Double.toString(num));
    }
}
