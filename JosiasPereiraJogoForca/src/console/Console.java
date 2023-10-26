package console;

import java.util.Scanner;
import sistem.JogoDaForca;
import sistem.PalavraSecreta;
import sistem.Tabuleiro;
import sistem.Jogador;

public class Console {

    private JogoDaForca jogo;
    private Tabuleiro tabuleiro;
    private Jogador jogador;

   public Console (){
        this.jogador = new Jogador("Josias");
        this.tabuleiro = new Tabuleiro(); 
        this.jogo = new JogoDaForca(this.jogador, this.tabuleiro);
   }

   private String lerValor(String rotulo){
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }

    public void menu() {
        char opcao;
        do {
            System.out.println("JOGO DA FORCA");
            System.out.println("1 - Jogar");
            System.out.println("s - Finalizar sistema");
            opcao = this.lerValor("Informe a opção desejada").charAt(0);
            switch (opcao) {
                case '1': jogar(); break;
                case '2':  break;
            }
        } while (opcao != 's');
    }

    public void jogar(){
        System.out.println("");
        String palavraSecreta = this.jogo.getPalavraSecreta();
        this.tabuleiro.definirPalavraSecreta(palavraSecreta);
        int cont;
        char letra;
        boolean ganhou = false;
        do{
            System.out.println("");
            this.tabuleiro.mostrarTabuleiro();
            this.tabuleiro.mostrarVidas(jogador);
            letra = this.jogo.fazerPalpite();    
            cont = this.jogo.verificarLetra(palavraSecreta,letra);
            this.jogo.verificarCertoErrado(cont, letra);
            ganhou = this.tabuleiro.verificarVitoria();
            System.out.println("");
            if(jogador.vida == 0){
                System.out.println("Voce perdeu! Melhore na proxima");
                break;
            }    
            if(ganhou == true){
                System.out.println("Voce Ganhou! Parabens !"+"\nPalavra Secreta: "+palavraSecreta);
                break;
            }
        }while(jogador.vida>0);
        System.out.println("");
    }


}
