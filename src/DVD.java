public class DVD extends Midia {
    private String idioma;
    private boolean possuiLegenda;
    private String idiomaLegenda;



    public DVD(String codigo, Double preco, String nome, String idioma, boolean possuiLegenda, String idiomaLegenda) {
        super (codigo, preco, nome);
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

    public boolean getPossuiLegenda() {
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

    public void legenda(boolean ligar, String idioma){
        if(ligar){
            System.out.println("Ligando legenda em " + idioma);
        }else{
            System.out.println("Desligando legenda");
        }
    }

    //legenda(boolean ligarDesligar)

    @Override
    public void darPlay()   {
        System.out.println("Filme Iniciado");
    }

    @Override
    public String toString() {
        return super.toString() + "DVD{" +
                "idioma='" + idioma + '\'' +
                ", possuiLegenda=" + possuiLegenda +
                ", idiomaLegenda='" + idiomaLegenda + '\'' +
                '}';
    }
}
