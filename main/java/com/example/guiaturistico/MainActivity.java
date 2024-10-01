package com.example.guiaturistico;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        List<Local> locais = Arrays.asList(
                new Local("Restaurante Outback", R.drawable.restaurante_a,
                        "Restaurante especializado em pratos gourmet, ambiente sofisticado e atendimento excelente.",
                        "+5511998765432", "http://restaurantegourmet.com",
                        -23.550520, -46.633308),
                new Local("Pastelaria Tammy", R.drawable.restaurante_b,
                        "Restaurante com uma veriedade de pasteis para todos gostos e sabores.",
                        "+5511888888888", "http://restaurantevegano.com",
                        -23.562210, -46.653321),
                new Local("Restaurante Kaori", R.drawable.restaurante_c,
                        "Churrascaria com carnes de alta qualidade e serviço rodízio.",
                        "+5511777777777", "http://churrascariatradicional.com",
                        -23.561210, -46.652321)
        );

    }

}