import java.util.Random;

public class DoacaoMidia {

    public static void main(String[] args) {

        Midia midia = pegarMidiaAleatoria();

        System.out.println(midia);

        midia.darPlay();



}

        public static Midia pegarMidiaAleatoria() {


        CD cd1 = new CD("123", 10.0, "CD1", "Artista mt fodinha", 10);

        CD cd2 = new CD("456", 20.0, "CD2", "Artista mt fodinha", 10);

        DVD dvd1 = new DVD("666 ", 30.0, "As branquelas", "Portugues", false, "Portugues");

        DVD dvd2 = new DVD("777", 70.0, "os carrinhos", "Alemão", true, "Portugues");

        Random gerador = new Random();

        int valorAleatorio = gerador.nextInt(4);

        switch (valorAleatorio) {
            case 0:
                return cd1;
            case 1:
                return cd2;
            case 2:
                return dvd1;
            case 3:
                return dvd2;
            default:
                return null;

        }

    }





    //pegarMidiaAleatoria() que devolve uma midia já criada na biblioteca aleatória

    //darPlay() que chama o método darPlay() da midia

    //assisitirFilme(Dvd dvd) e chamar os dois métodos de legenda

    //main deve pegar uma midia aleatoria e dar o play
}
