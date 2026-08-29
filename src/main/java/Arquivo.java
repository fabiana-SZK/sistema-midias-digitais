public class Arquivo {
    private String extensao;
    private String dataCriacao;
    private float tamanhoArquivo;

    public Arquivo(){
        extensao = "";
        dataCriacao = "";
        tamanhoArquivo = 0;
    }

    // Sobrecarga
    public Arquivo(String extensao, String dataCriacao, float tamanhoArquivo){
        this.extensao = extensao;
        this.dataCriacao = dataCriacao;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public String getExtensao(){
        return extensao;
    }

    public String getDataCriacao(){
        return dataCriacao;
    }

    public float getTamanhoArquivo(){
        return tamanhoArquivo;
    }

    public void setExtensao(String extensao){
        this.extensao = extensao;
    }

    public void setDataCriacao(String dataCriacao){
        this.dataCriacao = dataCriacao;
    }

    public void setTamanhoArquivo(float tamanhoArquivo) throws TamanhoInvalidoException{
        if(tamanhoArquivo > 0) {
            this.tamanhoArquivo = tamanhoArquivo;
        } else {
            throw new TamanhoInvalidoException();
        }
    }

}
