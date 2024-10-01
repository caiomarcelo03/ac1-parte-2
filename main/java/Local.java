import com.example.guiaturistico.R;

import java.io.Serializable;

public class Local implements Serializable {
    private String nome;
    private int imagem;
    private String descricao;
    private String telefone;
    private String site;
    private double latitude;
    private double longitude;

    public Local(String nome, int imagem, String descricao, String telefone, String site, double latitude, double longitude) {
        this.nome = nome;
        this.imagem = imagem;
        this.descricao = descricao;
        this.telefone = telefone;
        this.site = site;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Adicionar métodos de acesso (getters)
    public String getNome() { return nome; }
    public int getImagem() { return imagem; }
    public String getDescricao() { return descricao; }
    public String getTelefone() { return telefone; }
    public String getSite() { return site; }
    public double getLatitude() { return latitude; }
    public double getLongitude() { return longitude; }

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

}
