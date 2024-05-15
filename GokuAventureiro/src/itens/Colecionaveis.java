package itens;


public class Colecionaveis {

public static class Diamante {
        private int brilho;

        public Diamante(int brilho) {
            this.brilho = brilho;
        
        if (brilho >= 5) {
                this.brilho = brilho;
            } else {
                System.out.println("Vá em busca de mais diamantes para sua riqueza!");
            }
        }
   
        public int getBrilho() {
            return brilho;
        }

        public void setBrilho(int brilho) {
            this.brilho = brilho;
        }
    }

  
    public static class Ouro {
        private int peso;

        public Ouro(int peso) {
            this.peso = peso;
        if (peso >= 10) {
                this.peso = peso;
            } else {
                System.out.println("Precisamos de mais ouro!");
            }
        }
     
        public int getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }
    }

   
    public static class Ferro {
        private int resistencia;

        public Ferro(int resistencia) {
            this.resistencia = resistencia;
        if (resistencia >= 25) {
                this.resistencia = resistencia;
            } else {
                System.out.println("Suas batalhas serão mais exigentes que isso!");
            }
        }
    

        
        public int getResistencia() {
            return resistencia;
        }

        public void setResistencia(int resistencia) {
            this.resistencia = resistencia;
        }
    }
}

