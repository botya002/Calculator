package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.MediaRouteButton;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvResult;
    private Integer firstValue, secondValue;
    private String operation;
    private Boolean isResultSuccess = false;
    private Button btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_Result);
        btnResult = findViewById(R.id.btn_rovno);
    }


    private void textNumber(View view) {
    }

    public void onClickNumber(View view) {
        if (isResultSuccess) {
            tvResult.setText("0");
            isResultSuccess = false;
            btnResult.setVisibility(View.GONE);
        }
        switch (view.getId()) {

            case R.id.btn_AC:
                tvResult.setText("0");
                break;


            case R.id.btn_one:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("1");
                } else {
                    tvResult.append("1");
                }
                break;


            case R.id.btn_two:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("2");
                } else {
                    tvResult.append("2");
                }
                break;


            case R.id.btn_three:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("3");
                } else {
                    tvResult.append("3");
                }
                break;


            case R.id.btn_four:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("4");
                } else {
                    tvResult.append("4");
                }
                break;


            case R.id.btn_five:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("5");
                } else {
                    tvResult.append("5");
                }
                break;


            case R.id.btn_six:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("6");
                } else {
                    tvResult.append("6");
                }
                break;


            case R.id.btn_seven:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("7");
                } else {
                    tvResult.append("7");
                }
                break;


            case R.id.btn_eight:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("8");
                } else {
                    tvResult.append("8");
                }
                break;


            case R.id.btn_nine:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("9");
                } else {
                    tvResult.append("9");
                }
                break;

            case R.id.btn_null:
                if (tvResult.getText().toString().equals("0")) {
                    tvResult.setText("0");
                } else {
                    tvResult.append("0");
                }
                break;
        }
    }


    public void onClickOperation(View view) {
        switch (view.getId()) {

            case R.id.btn_plus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "+";
                tvResult.setText(firstValue + "+");
                break;

            case R.id.btn_minus:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "-";
                tvResult.setText(firstValue + "-");
                break;

            case R.id.btn_delenie:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "/";
                tvResult.setText(firstValue + "/");
                break;

            case R.id.btn_X:
                firstValue = Integer.parseInt(tvResult.getText().toString());
                operation = "*";
                tvResult.setText(firstValue + "*");
                break;

            case R.id.btn_rovno:
                btnResult.setVisibility(View.VISIBLE);
                isResultSuccess = true;
                secondValue = Integer.parseInt(tvResult.getText().toString().replace(firstValue + operation, ""));
                switch (operation) {
                    case "+":
                        tvResult.setText(firstValue + operation + secondValue + "\n" + (firstValue + secondValue));
                        break;

                    case "-":
                        tvResult.setText(firstValue + operation + secondValue + "\n" + (firstValue - secondValue));
                        break;

                    case "/":
                        tvResult.setText(firstValue + operation + secondValue + "\n" + (firstValue / secondValue));
                        break;

                    case "*":
                        tvResult.setText(firstValue + operation + secondValue + "\n" + (firstValue * secondValue));
                        break;
                }
                break;
        }

    }
}
