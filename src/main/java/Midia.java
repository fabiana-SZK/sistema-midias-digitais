public abstract class Midia {
    
    private int id;
    private String titulo;
    private int duracao;
    private Arquivo arquivo;

    public Midia(){
        id = 0;
        titulo = "";
        duracao = 0;
        arquivo = new Arquivo();
    }

    // Sobrecarga
    public Midia(int id, String titulo, int duracao, Arquivo arquivo){
        this.id = id;
        this.titulo = titulo;
        this.duracao = duracao;
        this.arquivo = arquivo;
    }
    
    public int getId(){
        return id;
    }

    public String getTitulo(){
        return titulo;
    }

    public int getDuracao(){
        return duracao;
    }

    public Arquivo getArquivo(){
        return arquivo;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) throws DuracaoInvalidaException{
        if(duracao > 0) {
            this.duracao = duracao;
        } else {
            throw new DuracaoInvalidaException();
        }
    }

    public void setArquivo(Arquivo arquivo){
        this.arquivo = arquivo;
    }

}
