package projetobanco;

public class ProjetoBanco {

    public static void main(String[] args) {
        // Criando Conta Corrente
        Banco cc1 = new Banco();
        Banco cc2 = new Banco();
        
        // Criando Conta Poupança
        Banco cp1 = new Banco();
        Banco cp2 = new Banco();
        
        // Ativando Conta Corrente
        cc1.abrirConta("Decova", "cc", 1);
        cc2.abrirConta("Chavanai", "cc", 2);
        
        // Ativando Conta Poupança
        cp1.abrirConta("Decova", "cp", 1);
        cp2.abrirConta("Chavanai", "cp", 2);
        
        // Mostrando Saldo Contas Corrente e Poupança
        /*cc1.mostrarSaldo();
        cc2.mostrarSaldo();
        cp1.mostrarSaldo();
        cp2.mostrarSaldo();*/
        
        // Depositando em Conta Corrente
        cc1.depositar(25);
        cc2.depositar(75);
        
        // Depositando em Conta Poupança
        cp1.depositar(100);
        cp2.depositar(15);
        
        // Mostrando Saldo Contas Corrente e Poupança
        /*cc1.mostrarSaldo();
        cc2.mostrarSaldo();
        cp1.mostrarSaldo();
        cp2.mostrarSaldo();*/
        
        // Saque em Conta Corrente
        cc1.sacar(70);
        cc2.sacar(85);
        
        // Saque em Conta Poupança
        cp1.sacar(150);
        cp2.sacar(170);
        
        // Mostrando Saldo Contas Corrente e Poupança
        /*cc1.mostrarSaldo();
        cc2.mostrarSaldo();
        cp1.mostrarSaldo();
        cp2.mostrarSaldo();*/
        
        // Zerando Conta Corrente
        cc1.sacar(5);
        cc2.sacar(39.95f);
        
        // Zerando Conta Poupança
        cp1.sacar(100);
        cp2.sacar(165);
        
        // Mostrando Saldo Contas Corrente e Poupança
        /*cc1.mostrarSaldo();
        cc2.mostrarSaldo();
        cp1.mostrarSaldo();
        cp2.mostrarSaldo();*/
        
         // Fechando Conta Corrente
        cc1.fecharConta();
        cc2.fecharConta();
        
        // Fechando Conta Poupança
        cp1.fecharConta();
        cp2.fecharConta();   
        
        //Zerando e Fechando conta CC2
        cc2.sacar(0.049999237f);
        cc2.fecharConta();
        
        // Mostrando Saldo Contas Corrente e Poupança
        cc1.mostrarSaldo();
        cc2.mostrarSaldo();
        cp1.mostrarSaldo();
        cp2.mostrarSaldo();
        
    }
    
}
