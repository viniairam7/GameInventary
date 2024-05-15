/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itens;
public class Itens {
    private String arco;
    private String flecha;
    private String pocao;
    private String escudo;
    private String capacete;
    private String espada;

    public Itens(String arco, String flecha, String pocao, String escudo, String capacete, String espada) {
        this.arco = arco;
        this.flecha = flecha;
        this.pocao = pocao;
        this.escudo = escudo;
        this.capacete = capacete;
        this.espada = espada;
    }

    public String getArco() {
        return arco;
    }

    public void setArco(String arco) {
        this.arco = arco;
    }

    public String getFlecha() {
        return flecha;
    }

    public void setFlecha(String flecha) {
        this.flecha = flecha;
    }

    public String getPocao() {
        return pocao;
    }

    public void setPocao(String pocao) {
        this.pocao = pocao;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public String getCapacete() {
        return capacete;
    }

    public void setCapacete(String capacete) {
        this.capacete = capacete;
    }

    public String getEspada() {
        return espada;
    }

    public void setEspada(String espada) {
        this.espada = espada;
    }
    
    public static class Arco {
        private String bambu;
       

        public Arco(String bambu) {
            this.bambu = bambu;
          
        }

        public String getBambu() {
            return bambu;
        }

        public void setBambu(String bambu) {
            this.bambu = bambu;
        }

        
    }

    public static class Flecha {
        private String pontaDeFerro;
        private int quantidade;

        public Flecha(String pontaDeFerro, int quantidade) {
            this.pontaDeFerro = pontaDeFerro;
            this.quantidade = quantidade;
        }

        public String getPontaDeFerro() {
            return pontaDeFerro;
        }

        public void setPontaDeFerro(String pontaDeFerro) {
            this.pontaDeFerro = pontaDeFerro;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        
    }

    public static class Pocao {
        private String vidaExtra;

        public Pocao(String vidaExtra) {
            this.vidaExtra = vidaExtra;
        }

        public String getVidaExtra() {
            return vidaExtra;
        }

        public void setVidaExtra(String vidaExtra) {
            this.vidaExtra = vidaExtra;
        }
       
    }

    public static class Escudo {
        private String ferroRedondo;
        private int resistencia;

        public Escudo(String ferroRedondo, int resistencia) {
            this.ferroRedondo = ferroRedondo;
            this.resistencia = resistencia;
        }

        public String getFerroRedondo() {
            return ferroRedondo;
        }

        public void setFerroRedondo(String ferroRedondo) {
            this.ferroRedondo = ferroRedondo;
        }

        public int getResistencia() {
            return resistencia;
        }

        public void setResistencia(int resistencia) {
            this.resistencia = resistencia;
        }
    }

    public static class Capacete {
        private String material;
        private int defende;

        public Capacete(String material, int defende) {
            this.material = material;
            this.defende = defende;
        }

    
        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public int getDefende() {
            return defende;
        }

        public void setDefende(int defende) {
            this.defende = defende;
        }
    }

    public static class Espada {
        private String ferro;
        private int ataca;

        public Espada(String ferro, int dano) {
            this.ferro = ferro;
            this.ataca = ataca;
        }

        public String getFerro() {
            return ferro;
        }

        public void setFerro(String ferro) {
            this.ferro = ferro;
        }

        public int getAtaca() {
            return ataca;
        }

        public void setAtaca(int ataca) {
            this.ataca = ataca;
        }
    }
}
    
    



