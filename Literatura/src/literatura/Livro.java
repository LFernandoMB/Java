package literatura;

public final class Livro implements Publicacao{
    // Atributos
    private String titulo, autor;
    private Pessoa leitor;
    private int totalPaginas, paginaAtual;
    private boolean aberto;
    
    // Métodos
    public String detalhes() {
        System.out.println("");
        return "\ntítulo: " + titulo + "\nautor: " 
                + autor + "\ntotal de páginas: " 
                + totalPaginas + "\npágina atual: " + paginaAtual + "\naberto: " 
                + aberto + "\nleitor: " + leitor.getNome() + "\nidade: " + leitor.getIdade() + "\nsexo: " + leitor.getSexo();
    }
    
    // Métodos Especiais
    public Livro(String titulo, String autor, Pessoa leitor, int totalPaginas) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTotalPaginas(totalPaginas);
        this.setPaginaAtual(0);
        this.setAberto(false);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
        this.setPaginaAtual(0);
    }

    @Override
    public void folhear(int pagina) {
        if(pagina > this.getTotalPaginas()){
            this.setPaginaAtual(0);
            this.setAberto(false);
        }else{
            this.setPaginaAtual(pagina);
            this.setAberto(true);
        }
    }

    @Override
    public void avancarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() + 1);
    }

    @Override
    public void voltarPagina() {
        this.setPaginaAtual(this.getPaginaAtual() - 1);
    }
    
}
