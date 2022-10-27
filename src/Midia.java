public class Midia {
    private String codigo;
    private Double preco;
    private String nome;

    public Midia(String codigo, Double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void darPlay() {
        System.out.println("Midia tocando");
    }
    @Override
    public String toString() {
        return "Codigo='" + codigo + '\'' +
                ", Preço=" + preco +
                ", Nome='" + nome + '\'';
    }
}
