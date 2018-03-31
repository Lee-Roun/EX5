package com.example.jeonwon.ex5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMent, textViewResult;
    private Button buttonSelection1,buttonSelection2,buttonSelection3, buttonSelection4, buttonRestart;
    private int randNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random random = new Random();
        randNum = random.nextInt(1000) % 4;

        textViewMent = (TextView)findViewById(R.id.textViewMent);
        textViewResult = (TextView)findViewById(R.id.textViewResult);


        buttonSelection1 = (Button)findViewById(R.id.button1);
        buttonSelection2 = (Button)findViewById(R.id.button2);
        buttonSelection3 = (Button)findViewById(R.id.button3);
        buttonSelection4 = (Button)findViewById(R.id.button4);
        buttonRestart = (Button)findViewById(R.id.buttonRestart);

        buttonSelection1.setOnClickListener(new setButtonSelection());
        buttonSelection2.setOnClickListener(new setButtonSelection());
        buttonSelection3.setOnClickListener(new setButtonSelection());
        buttonSelection4.setOnClickListener(new setButtonSelection());
        buttonRestart.setOnClickListener(new setButtonSelection());

    }

    private class setButtonSelection implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int num = (int)view.getId()%4;

            switch (view.getId()){
                case R.id.button1:
                    if(num == randNum){
                        textViewResult.setText("축하합니다. 이정원님\n당첨되었습니다.");
                        buttonRestart.setVisibility(View.VISIBLE);

                    }
                    else{
                        textViewResult.setText("결과");
                        buttonRestart.setVisibility(View.INVISIBLE);

                    }


                    break;
                case R.id.button2:
                    if(num == randNum){
                        textViewResult.setText("축하합니다. 이정원님\n당첨되었습니다.");
                        buttonRestart.setVisibility(View.VISIBLE);

                    }
                    else{
                        textViewResult.setText("결과");
                        buttonRestart.setVisibility(View.INVISIBLE);

                    }
                    break;
                case R.id.button3:
                    if(num == randNum){
                        textViewResult.setText("축하합니다. 이정원님\n당첨되었습니다.");
                        buttonRestart.setVisibility(View.VISIBLE);

                    }
                    else{
                        textViewResult.setText("결과");
                        buttonRestart.setVisibility(View.INVISIBLE);

                    }
                    break;
                case R.id.button4:
                    if(num == randNum){
                        textViewResult.setText("축하합니다. 이정원님\n당첨되었습니다.");
                        buttonRestart.setVisibility(View.VISIBLE);
                    }
                    else{
                        textViewResult.setText("결과");
                        buttonRestart.setVisibility(View.INVISIBLE);

                    }
                    break;
                case R.id.buttonRestart:
                    Random random = new Random();
                    randNum = random.nextInt(1000) % 4;
                    textViewResult.setText("결과");
                    buttonRestart.setEnabled(false);
                    break;
            }
        }
    }


}
