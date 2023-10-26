package sistem;

import java.util.Scanner;

public class JogoDaForca {
    
    Tabuleiro tabuleiro;
    PalavraSecreta palavraSecreta;
    Jogador jogador;
    
    public JogoDaForca (Jogador jogador, Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        this.jogador = jogador;
    }

    public String getPalavraSecreta(){
        String palavra = sistem.PalavraSecreta.gerarPalavraSecreta();
        return palavra;
    }
    public char fazerPalpite() {
        Scanner scanner = new Scanner(System.in);
        char lowercase;
        System.out.print(this.jogador.getNome() + ", faça um palpite (letra): ");
        char palpite = scanner.nextLine().charAt(0);
        lowercase =Character.toLowerCase(palpite);

        return lowercase;
    }   
    public int verificarLetra(String palavraSecreta, char letra){
        int cont = -1;
        cont = palavraSecreta.indexOf(letra);
        return cont;
    }
    public void verificarCertoErrado(int cont, char letra){
        if(cont == -1){
            this.tabuleiro.mostrarPalavraErrada(letra);
            this.jogador.vida -=1;
        }
        else{
            this.tabuleiro.definarPalavraCerta(letra);
        }
    }
}
