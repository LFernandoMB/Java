package encapsulamentocontrole;

public class EncapsulamentoControle {

    public static void main(String[] args) {
        // Criando Objeto Controle Remoto
        ControleRemoto c = new ControleRemoto();
        
        // Apresentando status atual
        c.abrirMenu();
        
        // Ligando TV
        c.ligar();
        
        // Apresentando status atual
        c.abrirMenu();
        
        // Aumentando volume 5x
        for(int i =0; i < 5; i++){
            c.maisVolume();
        }
        
        // Apresentando status atual
        c.abrirMenu();
        
        // Abaixando volume 3x
        for(int i=0; i < 3; i++){
            c.menosVolume();
        }
        
        // Apresentando status atual
        c.abrirMenu();
        
        // Play na Aplicação
        c.play();
        
        // Apresentando status atual
        c.abrirMenu();
        
        // Pausando Aplicação
        c.pause();
        
        // Apresentando status atual
        c.abrirMenu();
        
        // Desligando TV
        c.desligar();
        
        // Apresentando status atual
        c.abrirMenu();
    }   
}
