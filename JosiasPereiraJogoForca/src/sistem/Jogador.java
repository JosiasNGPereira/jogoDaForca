package sistem;

public class Jogador {
    private String nome;
    public int vida =5;
    public boolean ganhou = false;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public int getVida() {
        return vida;
    }
    public boolean getGanhou() {
        return ganhou;
    }
}