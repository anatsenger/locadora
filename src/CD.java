public class CD extends Midia {
    private String artista;
    private int quantidadeFaixas;


    @Override
    public void darPlay() {

        System.out.println("Primeira faixa tocando");
    }

    public CD(String codigo, Double preco, String nome, String artista, int quantidadeFaixas) {
        super (codigo, preco, nome);
        this.artista = artista;
        this.quantidadeFaixas = quantidadeFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantidadeFaixas() {
        return quantidadeFaixas;
    }

    public void setQuantidadeFaixas(int quantidadeFaixas) {
        this.quantidadeFaixas = quantidadeFaixas;
    }


    @Override
    public String toString() {
        return  "CD: " + super.toString() +
                ", artista='" + artista + '\'' +
                ", quantidadeFaixas=" + quantidadeFaixas +
                '}';
    }

}
