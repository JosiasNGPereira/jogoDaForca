package sistem;

public class Tabuleiro {
    public String palavra;
    String letrasErradas ="";

    public Tabuleiro(){}

    public Jogador jogador = new Jogador("Josias");
    private String palavraSecreta = "";
    private String palavraJogador = "";

    public void mostrarVidas(Jogador jogadorVida){
        System.out.println("Vidas: "+ jogadorVida.vida);
    }
    
    public void mostrarPalavraErrada(char letraErrada){
        this.letrasErradas = this.letrasErradas + letraErrada;
    }
    public void mostrarTabuleiro(){
        System.out.print(this.palavraJogador);
        System.out.println("\nQuantidade de letras: "+this.palavraSecreta.length());
        System.out.print("Letras erradas: ");
        System.out.println(this.letrasErradas);
    }
    public void definirPalavraSecreta(String palavraSecreta){
        this.palavraSecreta = palavraSecreta;
        for (int i = 0; i<palavraSecreta.length(); i ++){
            this.palavraJogador += "_";
        }
    }
    public void definarPalavraCerta(char letra){
        StringBuilder novaString = new StringBuilder(this.palavraJogador);
        for (int i = 0; i<this.palavraSecreta.length(); i ++){
            if(letra==this.palavraSecreta.charAt(i)){
                novaString.setCharAt(i, letra);
            }
        }
        this.palavraJogador = novaString.toString();
    }

    public boolean verificarVitoria(){
        for (int i = 0; i<this.palavraJogador.length(); i ++){
            if (this.palavraJogador.charAt(i) == '_') return false;
        }
        return true;
    }

}


