package projetoheranca;

public class ProjetoHeranca {

    public static void main(String[] args) {
        //Criando Objetos
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        // Dando nomes
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Eduardo");
        p4.setNome("Iheda");
        
        p1.setSexo("M");
        p2.setSexo("F");
        p3.setSexo("M");
        p4.setSexo("F");
        
        p1.setIdade(30);
        p2.setIdade(84);
        p3.setIdade(12);
        p4.setIdade(24);
        
        p2.setCurso("Java");
        p3.setSalario(2500.75f);
        p4.setSetor("Desenvolvedor");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
  }
}