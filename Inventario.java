package gokuaventureiro;

import java.util.Scanner;
import jogador.Jogador;

/**
 *
 * @author Airam
 */
public class Inventario {

    public static void main(String[] args) {
       
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Player1:  ");
        String nomeJogador = scanner.nextLine();
        
        scanner.close();
      
        Jogador jogador = new Jogador(nomeJogador, "Arco de Bambu", "Flechas de Ferro", "Poção de Vida Extra", "Escudo de Ferro", "Capacete de Ferro", "Espada Diamante");

        System.out.println("Player 1: " + jogador.getNome());
        System.out.println("INVENTÁRIO -  GOKU AVENTUREIRO videogame");
        System.out.println("Arco: " + jogador.getArco());
        System.out.println("Flecha: " + jogador.getFlecha());
        System.out.println("Poção: " + jogador.getPocao());
        System.out.println("Escudo: " + jogador.getEscudo());
        System.out.println("Capacete: " + jogador.getCapacete());
        System.out.println("Espada: " + jogador.getEspada());
    }
}

    
    

