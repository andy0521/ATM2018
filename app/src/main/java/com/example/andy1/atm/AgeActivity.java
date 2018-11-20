package com.example.andy1.atm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AgeActivity extends BasicActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);
    }
    public void next (View view){
        EditText edAge=findViewById(R.id.edAge);
        String a = edAge.getText().toString();
        int age = Integer.parseInt(a);
        user.setAge(age);

        Intent gender = new Intent(this,GenderActivity.class);
        startActivity(gender);
    }
    public void back (View view){
        finish();
    }
}
