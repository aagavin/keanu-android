package ca.aagavin.keanu;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PizzaType extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_type);
        //
        RadioGroup rg = (RadioGroup) findViewById(R.id.pizzaType);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                RadioButton radiobtn = (RadioButton) findViewById(i);
                selectedType(radiobtn.getText().toString());
            }
        });

    }

    public void selectedType(String selectText){
        Intent i = new Intent(this, SelectPizza.class);
        i.putExtra("selection", selectText);
        startActivity(i);
    }
}
