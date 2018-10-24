package spil3141.com.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private double solution;
    private boolean newNumber = false;

    //Instance Variables
    private AdView mAdView;
    //OUTPUT
    private TextView result;
    //Utility
    private Button btnreset;
    private Button calculate;
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

        //Implementation
        MobileAds.initialize(this,"ca-app-pub-3940256099942544/6300978111");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        //Linking Variables to View Objects
        ////////// Output /////////////////
        result = (TextView) findViewById(R.id.result);
        result.setText("0");
        /////////  INPUT /////////////////
        btnreset = (Button) findViewById(R.id.reset);
        calculate = (Button) findViewById(R.id.calculate);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
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




        // Reset
        btnreset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                result.setText("0");
                newNumber = false;
            }
        });
        // Equal
        calculate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
        // Add  Button
        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
        //Subtract
        sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
        //Multiple  Button
        mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });
        //Divide  Button
        div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
            }
        });

        //////////////////////////////////////////////////////////////////////
        btn0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText() == "0")
                            result.setText("0");
                        else
                            result.append("0");


                    }
                });
        btn1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText() == "0" )
                            result.setText("1");
                        else if (result.getText() != "0")
                            result.append("1");
                    }
                });
        btn2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("2");
                        else
                            result.append("2");
                    }
                });
        btn3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("3");
                        else
                            result.append("3");
                    }
                });
        btn4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("4");
                        else
                            result.append("4");
                    }
                });
        btn5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("5");
                        else
                            result.append("5");
                    }
                });
        btn6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("6");
                        else
                            result.append("6");
                    }
                });
        btn7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("7");
                        else
                            result.append("7");
                    }
                });
        btn8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("8");
                        else
                            result.append("8");
                    }
                });
        btn9.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if(result.getText().toString() == "0" )
                            result.setText("9");
                        else
                            result.append("9");
                    }
                });


    }


    private void cal_method(char temp){
        switch(temp){
            case '+':
                this.solution += Double.parseDouble(result.getText().toString());
                break;
            case '-':
                this.solution -= Double.parseDouble(result.getText().toString());
                break;
            case '*':
                this.solution *= Double.parseDouble(result.getText().toString());
                break;
            case '/':
                this.solution /= Double.parseDouble(result.getText().toString());
                break;

        }
    }
}
