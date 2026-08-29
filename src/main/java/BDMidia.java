import java.util.List;
import java.util.ArrayList;

public class BDMidia {
    private Foto foto = new Foto();
    private Musica musica = new Musica();
    private Video video = new Video();
    
    private List<Foto> bdFoto = new ArrayList<Foto>();
    private List<Musica> bdMusica = new ArrayList<Musica>();
    private List<Video> bdVideo = new ArrayList<Video>();
    
    private static BDMidia bdMidiaUnic;
    
    private BDMidia(){ 
        foto = new Foto();
        musica = new Musica();
        video = new Video();
        bdFoto = new ArrayList<Foto>();
        bdMusica = new ArrayList<Musica>();
        bdVideo = new ArrayList<Video>();
    }
    
    // METODO SINGLETON
    public static BDMidia geraBDMidia(){
        if(bdMidiaUnic == null){
            bdMidiaUnic = new BDMidia();
        }
        
        return bdMidiaUnic;
    }
    
    public List<Foto> getBdFoto(){
        return bdFoto;
    }
    
    public List<Musica> getBdMusica(){
        return bdMusica;
    }
    
    public List<Video> getBdVideo(){
        return bdVideo;
    }
    
    // SOBRECARGA consMidiaId
    public Foto consMidiaId(Foto f){
        for(int i = 0; i < bdFoto.size(); i++){
            if(f.getId() == bdFoto.get(i).getId()){
                    return bdFoto.get(i);
            }
        }
        return null;
    }	
    
    // SOBRECARGA consMidiaId
    public Musica consMidiaId(Musica m){
        for(int i = 0; i < bdMusica.size(); i++){
            if(m.getId() == bdMusica.get(i).getId()){
                    return bdMusica.get(i);
            }
        }
        return null;
    }
    
    // SOBRECARGA consMidiaId
    public Video consMidiaId(Video v){
        for(int i = 0; i < bdVideo.size(); i++){
            if(v.getId() == bdVideo.get(i).getId()){
                    return bdVideo.get(i);
            }
        }
        return null;
    }
    
    // SOBRECARGA insMidia
    public Foto insMidia(Foto f){
        if(consMidiaId(f)== null){
            bdFoto.add(f);
            return f;
        }
        else{
            return null;
        }
    }
    
    // SOBRECARGA insMidia
    public Musica insMidia(Musica m){
        if(consMidiaId(m)== null){
            bdMusica.add(m);
            return m;
        }
        else{
            return null;
        }
    }
    
    // SOBRECARGA insMidia
    public Video insMidia(Video v){
        if(consMidiaId(v)== null){
            bdVideo.add(v);
            return v;
        }
        else{
            return null;
        }
    }
    
    // SOBRECARGA atualizaMidia
     public Foto atualizaMidia(Foto f){
        for(int i = 0; i < bdFoto.size(); i++){
            if(f.getId() == bdFoto.get(i).getId()){
                bdFoto.set(i, f);
                return f;
            }
        }
        return null;
    }
    
    // SOBRECARGA atualizaMidia
    public Musica atualizaMidia(Musica m){
        for(int i = 0; i < bdMusica.size(); i++){
            if(m.getId() == bdMusica.get(i).getId()){
                bdMusica.set(i, m);
                return m;
            }
        }
        return null;
    }
    
    // SOBRECARGA atualizaMidia
    public Video atualizaMidia(Video v){
        for(int i = 0; i < bdVideo.size(); i++){
            if(v.getId() == bdVideo.get(i).getId()){
                bdVideo.set(i, v);
                return v;
            }
        }
        return null;
    }
    
    // SOBRECARGA removeMidiaId
    public Foto removeMidiaId(Foto f){
        Foto f1 = consMidiaId(f);
        if(f1 != null){
            bdFoto.remove(f1);
            return f1;
        } else{
            return null;
        }
    }
    
    // SOBRECARGA removeMidiaId
    public Musica removeMidiaId(Musica m){
        Musica m1 = consMidiaId(m);
        if(m1 != null){
            bdMusica.remove(m1);
            return m1;
        } else{
            return null;
        }
    }
    
    // SOBRECARGA removeMidiaId
    public Video removeMidiaId(Video v){
        Video v1 = consMidiaId(v);
        if(v1 != null){
            bdVideo.remove(v1);
            return v1;
        } else{
            return null;
        }
    }
    
}
