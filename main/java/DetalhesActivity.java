import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guiaturistico.R;

public class DetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        // Recebe o objeto Local
        Local local = (Local) getIntent().getSerializableExtra("local");

        ImageView imageViewDetalhe = findViewById(R.id.imageViewDetalhe);
        TextView textViewNomeDetalhe = findViewById(R.id.textViewNomeDetalhe);
        TextView textViewDescricao = findViewById(R.id.textViewDescricao);
        Button buttonVerMapa = findViewById(R.id.buttonVerMapa);
        Button buttonAbrirSite = findViewById(R.id.buttonAbrirSite);
        Button buttonLigar = findViewById(R.id.buttonLigar);

        imageViewDetalhe.setImageResource(local.getImagem());
        textViewNomeDetalhe.setText(local.getNome());
        textViewDescricao.setText(local.getDescricao());

        buttonVerMapa.setOnClickListener(v -> {
            Uri uri = Uri.parse("geo:" + local.getLatitude() + "," + local.getLongitude());
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        buttonAbrirSite.setOnClickListener(v -> {
            Uri uri = Uri.parse(local.getSite());
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        buttonLigar.setOnClickListener(v -> {
            Uri uri = Uri.parse("tel:" + local.getTelefone());
            Intent intent = new Intent(Intent.ACTION_DIAL, uri);
            startActivity(intent);
        });
    }
}
