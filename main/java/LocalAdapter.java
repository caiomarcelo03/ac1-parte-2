import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guiaturistico.R;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Crie os restaurantes
        List<Local> locais = Arrays.asList(
                new Local("Restaurante A", R.drawable.restaurante_a,
                        "Descrição do Restaurante A", "+5511999999999",
                        "http://sitea.com", -23.563210, -46.654321),
                new Local("Restaurante B", R.drawable.restaurante_b,
                        "Descrição do Restaurante B", "+5511888888888",
                        "http://siteb.com", -23.562210, -46.653321),
                new Local("Restaurante C", R.drawable.restaurante_c,
                        "Descrição do Restaurante C", "+5511777777777",
                        "http://sitec.com", -23.561210, -46.652321)
        );

        // Conectar o RecyclerView ao adaptador
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new LocalAdapter(locais, local -> {
            Intent intent = new Intent(MainActivity.this, DetalhesActivity.class);
            intent.putExtra("local", local);
            startActivity(intent);
        }));
    }
}
