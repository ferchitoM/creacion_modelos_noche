package com.example.creacion_modelos_noche;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.creacion_modelos_noche.models.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> productList = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText password = findViewById(R.id.password);
        ImageButton toggleVisibility = findViewById(R.id.toggleVisibility);

        toggleVisibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    //Si el textView está mostrando la contraseña, la oculta y cambia el icono
                if (password.getInputType() == InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD) {
                    password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                    toggleVisibility.setImageResource(R.drawable.ic_visibility_off);

                    //Si el textView está ocultando la contaseña, la muestra y cambia el icono
                } else {
                    password.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    toggleVisibility.setImageResource(R.drawable.ic_visibility);
                }
                // Mueve el cursor al final del texto
                password.setSelection(password.getText().length());
            }
        });

        /*productList.add(new Product("Pizza hawaiana", 0L, "hawaiana_image", Product.defaultSizes()));
        productList.add(new Product("Pizza napolitana", 0L, "napolitana_image", Product.defaultSizes()));
        productList.add(new Product("Pizza mozzarella", 0L, "mozzarella_image", Product.defaultSizes()));
        productList.add(new Product("Pizza pepperoni", 0L, "pepperoni_image", Product.defaultSizes()));
        productList.add(new Product("Cuatro quesos", 0L, "cuatro_quesos_image", Product.defaultSizes()));*/

    }
}