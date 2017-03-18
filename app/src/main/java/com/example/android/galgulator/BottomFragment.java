package com.example.android.galgulator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BottomFragment extends Fragment{

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button difference;
    private Button multiply;
    private Button divison;
    private Button equal;
    private Button clear;

    String num1="";
    String num2="";
    String answer="";
    String sign="";



    BottomSectionListener activityCommander;


    public interface BottomSectionListener{
        public void display(String number);
        public void display2(String number);
        public void displaySign(String sign);
        public void Result(double result);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (BottomSectionListener) activity;
        }catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_fragment,container,false);

        one = (Button) view.findViewById(R.id.one);
        two = (Button) view.findViewById(R.id.two);
        three = (Button) view.findViewById(R.id.three);
        four = (Button) view.findViewById(R.id.four);
        five = (Button) view.findViewById(R.id.five);
        six = (Button) view.findViewById(R.id.six);
        seven = (Button) view.findViewById(R.id.seven);
        eight = (Button) view.findViewById(R.id.eight);
        nine = (Button) view.findViewById(R.id.nine);
        zero = (Button) view.findViewById(R.id.zero);
        plus = (Button) view.findViewById(R.id.plus);
        difference = (Button) view.findViewById(R.id.difference);
        multiply = (Button) view.findViewById(R.id.multiply);
        divison = (Button) view.findViewById(R.id.divison);
        equal = (Button) view.findViewById(R.id.equal);
        clear = (Button) view.findViewById(R.id.clear);




        one.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 1;

                        activityCommander.display(num1);





                    }
                }
        );

        two.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 2;
                        activityCommander.display(num1);

                    }
                }
        );

        three.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 3;
                        activityCommander.display(num1);

                    }
                }
        );

        four.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 4;
                        activityCommander.display(num1);

                    }
                }
        );

        five.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 5;
                        activityCommander.display(num1);

                    }
                }
        );

        six.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 6;
                        activityCommander.display(num1);

                    }
                }
        );

        seven.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 7;
                        activityCommander.display(num1);

                    }
                }
        );

        eight.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 8;
                        activityCommander.display(num1);

                    }
                }
        );

        nine.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1= num1 + 9;
                        activityCommander.display(num1);

                    }
                }
        );

        zero.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        num1 = num1 + 0;
                        activityCommander.display(num1);
                    }
                }
        );

        plus.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v){
                        sign="+";

                        activityCommander.displaySign(sign);


                        one.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 1;

                                        activityCommander.display2(num2);





                                    }
                                }
                        );

                        two.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 2;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        three.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 3;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        four.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 4;

                                        activityCommander.display2(num2);
                                        ;

                                    }
                                }
                        );

                        five.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 5;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        six.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 6;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        seven.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 7;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        eight.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 8;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        nine.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 9;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        zero.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 0;

                                        activityCommander.display2(num2);

                                    }
                                }
                        );


                    }
                }
        );
        difference.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sign = "-";

                        activityCommander.displaySign(sign);
                        one.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 1;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        two.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 2;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        three.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 3;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        four.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 4;

                                        activityCommander.display2(num2);
                                        ;

                                    }
                                }
                        );

                        five.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 5;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        six.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 6;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        seven.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 7;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        eight.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 8;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        nine.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 9;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        zero.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 0;

                                        activityCommander.display2(num2);

                                    }
                                }
                        );


                    }
                }
        );

        multiply.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sign = "*";

                        activityCommander.displaySign(sign);
                        one.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 1;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        two.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 2;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        three.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 3;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        four.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 4;

                                        activityCommander.display2(num2);
                                        ;

                                    }
                                }
                        );

                        five.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 5;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        six.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 6;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        seven.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 7;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        eight.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 8;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        nine.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 9;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        zero.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 0;

                                        activityCommander.display2(num2);

                                    }
                                }
                        );


                    }
                }
        );


        divison.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sign = "/";

                        activityCommander.displaySign(sign);
                        one.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 1;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        two.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 2;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        three.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 3;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        four.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 4;

                                        activityCommander.display2(num2);
                                        ;

                                    }
                                }
                        );

                        five.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 5;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        six.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 6;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        seven.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 7;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        eight.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 8;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        nine.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 9;

                                        activityCommander.display2(num2);


                                    }
                                }
                        );

                        zero.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num2 = num2 + 0;

                                        activityCommander.display2(num2);

                                    }
                                }
                        );


                    }
                }
        );





        equal.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        double r = 0;
                        double n1 = Double.parseDouble(num1);
                        double n2 = Double.parseDouble(num2);
                        if(sign == "+"){
                            r = n1 + n2;
                        }else if (sign == "-"){
                            r = n1- n2;
                        }else if (sign=="*"){
                            r = n1 *n2;
                        }else if(sign == "/"){
                            r = n1/n2;
                        }else if (sign == "%"){
                            r = n1%n2;
                        }

                        activityCommander.Result(r);


                    }
                }
        );

        clear.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        sign = "Sign";
                        num1 = "";
                        num2 = "";

                        activityCommander.displaySign(sign);
                        activityCommander.display("0");
                        activityCommander.display2("0");
                        activityCommander.Result(0);


                        one.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 1;

                                        activityCommander.display(num1);





                                    }
                                }
                        );

                        two.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 2;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        three.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 3;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        four.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 4;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        five.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 5;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        six.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 6;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        seven.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 7;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        eight.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 8;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        nine.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1= num1 + 9;
                                        activityCommander.display(num1);

                                    }
                                }
                        );

                        zero.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        num1 = num1 + 0;
                                        activityCommander.display(num1);
                                    }
                                }
                        );

                        plus.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v){
                                        sign="+";

                                        activityCommander.displaySign(sign);


                                        one.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 1;

                                                        activityCommander.display2(num2);





                                                    }
                                                }
                                        );

                                        two.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 2;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        three.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 3;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        four.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 4;

                                                        activityCommander.display2(num2);
                                                        ;

                                                    }
                                                }
                                        );

                                        five.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 5;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        six.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 6;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        seven.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 7;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        eight.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 8;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        nine.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 9;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        zero.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 0;

                                                        activityCommander.display2(num2);

                                                    }
                                                }
                                        );


                                    }
                                }
                        );
                        difference.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        sign = "-";

                                        activityCommander.displaySign(sign);
                                        one.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 1;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        two.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 2;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        three.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 3;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        four.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 4;

                                                        activityCommander.display2(num2);
                                                        ;

                                                    }
                                                }
                                        );

                                        five.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 5;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        six.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 6;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        seven.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 7;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        eight.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 8;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        nine.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 9;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        zero.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 0;

                                                        activityCommander.display2(num2);

                                                    }
                                                }
                                        );


                                    }
                                }
                        );

                        multiply.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        sign = "*";

                                        activityCommander.displaySign(sign);
                                        one.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 1;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        two.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 2;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        three.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 3;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        four.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 4;

                                                        activityCommander.display2(num2);
                                                        ;

                                                    }
                                                }
                                        );

                                        five.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 5;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        six.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 6;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        seven.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 7;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        eight.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 8;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        nine.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 9;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        zero.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 0;

                                                        activityCommander.display2(num2);

                                                    }
                                                }
                                        );


                                    }
                                }
                        );


                        divison.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        sign = "/";

                                        activityCommander.displaySign(sign);
                                        one.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 1;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        two.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 2;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        three.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 3;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        four.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 4;

                                                        activityCommander.display2(num2);
                                                        ;

                                                    }
                                                }
                                        );

                                        five.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 5;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        six.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 6;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        seven.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 7;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        eight.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 8;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        nine.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 9;

                                                        activityCommander.display2(num2);


                                                    }
                                                }
                                        );

                                        zero.setOnClickListener(
                                                new View.OnClickListener() {
                                                    @Override
                                                    public void onClick(View v) {
                                                        num2 = num2 + 0;

                                                        activityCommander.display2(num2);

                                                    }
                                                }
                                        );


                                    }
                                }
                        );





                        equal.setOnClickListener(
                                new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        double r = 0;
                                        double n1 = Double.parseDouble(num1);
                                        double n2 = Double.parseDouble(num2);
                                        if(sign == "+"){
                                            r = n1 + n2;
                                        }else if (sign == "-"){
                                            r = n1- n2;
                                        }else if (sign=="*"){
                                            r = n1 *n2;
                                        }else if(sign == "/"){
                                            r = n1/n2;
                                        }else if (sign == "%"){
                                            r = n1%n2;
                                        }

                                        activityCommander.Result(r);


                                    }
                                }
                        );


                    }
                }
        );






        return view;
    }
}
