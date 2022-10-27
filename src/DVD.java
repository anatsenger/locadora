import java.util.Scanner;

public class DVD extends Midia{
    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;

    private boolean ligaLegenda = false;

    public DVD(String codigo, Double preco, String nome, String idioma, boolean possuiLegenda, String idiomaLegenda) {
        super(codigo, preco, nome);
        this.idioma = idioma;
        this.possuiLegenda = possuiLegenda;
        this.idiomaLegenda = idiomaLegenda;
    }
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public boolean isPossuiLegenda() {
        return possuiLegenda;
    }

    public void setPossuiLegenda(boolean possuiLegenda) {
        this.possuiLegenda = possuiLegenda;
    }

    public String getIdiomaLegenda() {
        return idiomaLegenda;
    }

    public void setIdiomaLegenda(String idiomaLegenda) {
        this.idiomaLegenda = idiomaLegenda;
    }

    public boolean isLigaLegenda() {
        return ligaLegenda;
    }

    public void setLigaLegenda(boolean ligaLegenda) {
        this.ligaLegenda = ligaLegenda;
    }

    @Override
    public String toString() {
        return "DVD: " + super.toString() +
                ", idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                '}';
    }

    @Override
    public void darPlay()   {
        System.out.println("Filme Iniciado");
    }

    public void legenda(boolean ligaLegenda){
        Scanner leitor = new Scanner(System.in);
        String resposta;
        if(!ligaLegenda){
            System.out.println("Deseja ligar a legenda? s/n");
            resposta = leitor.nextLine();
            if (resposta.equals("s") || resposta.equals("sim")){
                setLigaLegenda(true);
            } else if (resposta.equals("n") || resposta.equals("não") || resposta.equals("nao")){
                setLigaLegenda(false);
            } else {
                System.out.println("reposta invalida, tente apens 's' para ligar a legenda e 'n' para não ligar");
            }
        }
    }
    public void legenda(boolean ligaLegenda, String idioma){
        if(ligaLegenda){
            System.out.println("Ligando legenda em " + idioma);
        }else{
            System.out.println("Desligando legenda");
        }
    }
}
