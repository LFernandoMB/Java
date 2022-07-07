package uec;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado, desafiante;
    private int rounds;
    private boolean aprovada;
    
    // Métodos Públicos
    public void marcarLuta(Lutador l1, Lutador l2){
        if((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);  
            System.out.println("Luta Marcada!");
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("Critérios impeditivos - Essa luta não ocorrerá!");
        }
    }
    
    public void lutar(){
        if(this.isAprovada()){
            System.out.println("*** DESAFIADO ***");
            this.desafiado.apresentar();
            System.out.println("*** DESAFIANTE ***");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            System.out.println("=== RESULTADO ===");
            
            switch(vencedor){
                case 0: // EMPATE
                    System.out.println("EMPATE");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    System.out.println("");
                    break;
                case 1: // VITÓRIA DO DESAFIADO
                    System.out.println("DESAFIADO VENCEU!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("");
                    break;
                case 2: // VITÓRIA DO DESAFIANTE
                    System.out.println("DESAFIANTE VENCEU!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("");
                    break;
            }
            
        }else{
            System.out.println("Luta não pode acontecer!");
        }
    }
    
    // Métodos Especiais

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
