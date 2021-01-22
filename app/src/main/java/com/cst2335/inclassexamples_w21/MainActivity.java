package com.cst2335.inclassexamples_w21;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_linear); //shows the layout

        TextView myText = findViewById(R.id.text);//brings the textView from XML to Java
        myText.setText(R.string.hello_world);//nullPointer Exception

        EditText myEdit = findViewById(R.id.edit);

        Button myBtn = findViewById(R.id.btn);
        myBtn.setOnClickListener((vw) -> myText.setText("You clicked the button!") );
        ImageButton myImgBtn = findViewById(R.id.imgView);
   }
}