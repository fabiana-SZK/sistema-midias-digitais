public class Musica extends Midia{
    private String artista;
    private String album;
    private String genero;

    public Musica(){
        artista = "";
        album = "";
        genero = "";
    }

    // Sobrecarga
    public Musica(String artista, String album, String genero){
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getArtista(){
        return artista;
    }

    public String getAlbum(){
        return album;
    }

    public String getGenero(){
        return genero;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

}
