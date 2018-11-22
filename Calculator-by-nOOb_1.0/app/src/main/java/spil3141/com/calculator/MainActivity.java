package spil3141.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;

public class MainActivity extends AppCompatActivity implements ViewStub.OnClickListener {

    private double result;
    private boolean newNumber = false;
    private char symbol;

    //Instance Variables
    private AdView mAdView;
    //OUTPUT
    private TextView output;
    private TextView buffer;
    //Utility
    private Button btnreset;
    private Button calculate;
    private Button dot;
    //Operation
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    //INPUT
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /***************** Google Ads mob Initialization ************************/
        //For testing Us :ca-app-pub-3940256099942544/6300978111

        MobileAds.initialize(this,"ca-app-pub-3940256099942544/6300978111");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Linking Variables to View Objects
        /*********************** Output Declaration *************************/
        output = (TextView) findViewById(R.id.output);
        buffer = (TextView) findViewById(R.id.buff);
        /*********************** Input Declaration *************************/
        /********** Special Operations Declaration **********/
        btnreset = (Button) findViewById(R.id.reset);
        calculate = (Button) findViewById(R.id.calculate);
        dot = (Button) findViewById(R.id.dot);
        /********** Calculations Declaration **********/
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        /********** Input Declaration **********/
        btn0= (Button) findViewById(R.id.b0);
        btn1= (Button) findViewById(R.id.b1);
        btn2= (Button) findViewById(R.id.b2);
        btn3= (Button) findViewById(R.id.b3);
        btn4= (Button) findViewById(R.id.b4);
        btn5= (Button) findViewById(R.id.b5);
        btn6= (Button) findViewById(R.id.b6);
        btn7= (Button) findViewById(R.id.b7);
        btn8= (Button) findViewById(R.id.b8);
        btn9= (Button) findViewById(R.id.b9);


        /********** Many Buttons One Event Implementation **********/
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);





        /********************  Special Operation Methods *************************************/
        //Dot
        dot.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (output.getText().toString().contains(".") == false){
                    output.append(".");
                }
            }
        });
        // Reset
        btnreset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                output.setText("0");
                result = 0.0;
                buffer.setText("");
                newNumber = false;
            }
        });

        // Equal
        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                cal_method(symbol);
                buffer.setText("");
                output.setText(Double.toString(result));
            }
        });

        /******************************************************************************************/
    }

    private void cal_method(char temp){
        switch(temp){
            case '+':
                this.result += Double.parseDouble(output.getText().toString());
                break;
            case '-':
                this.result -= Double.parseDouble(output.getText().toString());
                break;
            case '*':
                this.result *= Double.parseDouble(output.getText().toString());
                break;
            case '/':
                this.result /= Double.parseDouble(output.getText().toString());
                break;

        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.b0:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("0");
                else
                    output.append("0");
                newNumber = false;
            break;
            case R.id.b1:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("1");
                else
                    output.append("1");
                newNumber = false;
                break;
            case R.id.b2:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("2");
                else
                    output.append("2");
                newNumber = false;
                break;
            case R.id.b3:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("3");
                else
                    output.append("3");
                newNumber = false;
                break;
            case R.id.b4:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("4");
                else
                    output.append("4");
                newNumber = false;
                break;
            case R.id.b5:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("5");
                else
                    output.append("5");
                newNumber = false;
                break;
            case R.id.b6:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("6");
                else
                    output.append("6");
                newNumber = false;
                break;
            case R.id.b7:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("7");
                else
                    output.append("7");
                newNumber = false;
                break;
            case R.id.b8:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("8");
                else
                    output.append("8");
                newNumber = false;
                break;
            case R.id.b9:
                if(output.getText().toString().equals("0") || newNumber == true)
                    output.setText("9");
                else
                    output.append("9");
                newNumber = false;
                break;
            case R.id.add:
                if(buffer.getText().toString().equals("")){
                    buffer.setText(output.getText().toString() + "+");
                    result = Double.parseDouble(output.getText().toString());
                }else{
                    buffer.append(output.getText().toString() + "+");
                    cal_method(symbol);
                    output.setText(Double.toString(result));
                }
                newNumber = true;
                symbol= '+';
                break;
            case R.id.mul:
                if(buffer.getText().toString().equals("")){
                    buffer.setText(output.getText().toString() + "*");
                    result = Double.parseDouble(output.getText().toString());
                }else{
                    buffer.append(output.getText().toString() + "*");
                    cal_method(symbol);
                    output.setText(Double.toString(result));
                }
                newNumber = true;
                symbol= '*';
                break;
            case R.id.div:
                if(buffer.getText().toString().equals("")){
                    buffer.setText(output.getText().toString() + "/");
                    result = Double.parseDouble(output.getText().toString());
                }else{
                    buffer.append(output.getText().toString() + "/");
                    cal_method(symbol);
                    output.setText(Double.toString(result));
                }
                newNumber = true;
                symbol= '/';
                break;
            case R.id.sub:
                if(buffer.getText().toString().equals("")){
                    buffer.setText(output.getText().toString() + "-");
                    result = Double.parseDouble(output.getText().toString());
                }else{
                    buffer.append(output.getText().toString() + "-");
                    cal_method(symbol);
                    output.setText(Double.toString(result));
                }
                newNumber = true;
                symbol= '-';
                break;
        }
    }
}
