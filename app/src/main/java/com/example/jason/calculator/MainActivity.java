package com.example.jason.calculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText operand1;
    private EditText operand2;
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private TextView txtResult;
    private Button btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        operand1 = (EditText) findViewById(R.id.input1);
        operand2 = (EditText) findViewById(R.id.input2);
        btnAddition = (Button) findViewById(R.id.plus);
        btnSubtraction = (Button) findViewById(R.id.minus);
        btnDivision = (Button) findViewById(R.id.divide);
        btnMultiplication = (Button) findViewById(R.id.multiply);
        txtResult = (TextView) findViewById(R.id.result);
        btnClear = (Button) findViewById(R.id.clear);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnAddition.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0 )){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0 )){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0 )){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if ((operand1.getText().length() > 0) && (operand2.getText().length() > 0 )){
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter number in both operand fields", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                operand1.setText("");
                operand2.setText("");
                txtResult.setText("(result will appear here)");
                operand1.requestFocus();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
