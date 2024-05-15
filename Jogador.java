package jogador;

import itens.Itens;

public class Jogador extends Itens {
    private String nome;
    public Jogador(String arco, String flecha, String pocao, String escudo, String capacete, String espada) {
        super(arco, flecha, pocao, escudo, capacete, espada);
    }

    public Jogador(String nome, String arco, String flecha, String pocao, String escudo, String capacete, String espada) {
        super(arco, flecha, pocao, escudo, capacete, espada);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}

