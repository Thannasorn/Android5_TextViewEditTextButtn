package com.thannasorn.textviewedittextbuttn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText dataText;
    Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked me",

                        Toast.LENGTH_SHORT).show();

            }
        });
        dataText = (EditText) findViewById(R.id.dataText);
        dataText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                String text = dataText.getText().toString();
                Toast.makeText(MainActivity.this, "onChanged : " + text,
                        Toast.LENGTH_SHORT).show();

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);
    }

    public void onClickEditText(View v) {
        Toast.makeText(this, "You clecked or enter from editText : " +

                dataText.getText().toString(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        String text = dataText.getText().toString();
        Toast.makeText(this, "You clicked Add Data Button : " + text,

                Toast.LENGTH_SHORT).show();

    }
}