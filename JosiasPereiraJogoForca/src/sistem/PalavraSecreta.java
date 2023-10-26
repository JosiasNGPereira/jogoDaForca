package sistem;

import java.util.Random;

public class PalavraSecreta {

    PalavraSecreta palavraSecreta;

    public PalavraSecreta (){
    }
    private static String[] listaPalavras = {
        "banana", "abacaxi", "morango", "laranja", "uva", 
        "manga", "limao", "melancia", "pera", "maca"
    };
     public static String gerarPalavraSecreta() {
        Random random = new Random();
        int indice = random.nextInt(listaPalavras.length);
        return listaPalavras[indice];
    }
    public PalavraSecreta getPalavraSecreta() {
        return palavraSecreta;
    }
}
 