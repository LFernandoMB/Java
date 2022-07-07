package literatura;

public class Literatura {
    
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("João", "M", 50);
        p[1] = new Pessoa("Maria", "F", 48);
        
        l[0] = new Livro("Os Amigos", "Carlos Drummond", p[0] , 220);
        l[1] = new Livro("Los Hermanos", "Roberto Bolanos", p[1] , 145);
        l[2] = new Livro("Sem Título", "Sem Autor", p[0] , 100);
        
        /*
        // APRESENTAÇÃO INICIAL DE TODOS OS DETALHES
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
        System.out.println(l[2].detalhes());
        */
        
        // TESTES DE FUNÇÕES - LIVRO 1
        l[0].abrir();
        l[0].folhear(188);
        System.out.println(l[0].detalhes());
        l[0].avancarPagina();
        System.out.println(l[0].detalhes());
        
        // TESTES DE FUNÇÕES- LIVRO 2
        l[1].abrir();
        l[1].folhear(101);
        System.out.println(l[1].detalhes());
        l[1].voltarPagina();
        System.out.println(l[1].detalhes());
        
        // TESTES DE FUNÇÕES- LIVRO 3
        l[2].abrir();
        l[2].folhear(150);
        System.out.println(l[2].detalhes());
        l[2].folhear(77);
        System.out.println(l[2].detalhes());
        l[2].avancarPagina();
        l[2].avancarPagina();
        l[2].avancarPagina();
        System.out.println(l[2].detalhes());
        l[2].voltarPagina();
        l[2].voltarPagina();
        l[2].voltarPagina();
        l[2].voltarPagina();
        l[2].voltarPagina();
        System.out.println(l[2].detalhes());
        l[2].fechar();
        System.out.println(l[2].detalhes());
    }
}
