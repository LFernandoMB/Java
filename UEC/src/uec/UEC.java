package uec;

public class UEC {

    public static void main(String[] args) {
        // Parâmetros necessários (nome, nacionalidade, idade, peso, vitorias, derrotas, empates)
        Lutador l[] = new Lutador[6];
        Luta UEC01 = new Luta();
        
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);
        l[2] = new Lutador("Dead Code", "Austrália", 28, 1.93f, 81.6f, 13, 0, 2);
        l[3] = new Lutador("Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5, 4, 3);
        l[4] = new Lutador("Nerdaard", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        l[5] = new Lutador("Snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        /*
        l[0].apresentar();
        l[1].apresentar();
        l[2].apresentar();
        l[3].apresentar();
        l[4].apresentar();
        l[5].apresentar();
        */
        
        // LUTA PESO LEVE
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();
        
        // LUTA PESO MÉDIO
        UEC01.marcarLuta(l[2], l[5]);
        UEC01.lutar();
        l[2].status();
        l[5].status();
        
        // LUTA PESO PESADO
        UEC01.marcarLuta(l[3], l[4]);
        UEC01.lutar();
        l[3].status();
        l[4].status();
        
    }
    
}
