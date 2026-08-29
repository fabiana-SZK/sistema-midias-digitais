public class Video extends Midia implements CalcMegapixel{
    private String qualidade;
    private String codec;
    private int fps;

    public Video(){
        qualidade = "";
        codec = "";
        fps = 0;
    }

    // Sobrecarga
    public Video(String qualidade, String codec, int fps){
        this.qualidade = qualidade;
        this.codec = codec;
        this.fps = fps;
    }

    // Sobrescrita
    public float calcularMegapixel(){
        if(qualidade.equals("SD")){
            return (720 * 480)  / 1000000f;

        } else if(qualidade.equals("HD")){
            return (1280 * 720) / 1000000f;

        } else if(qualidade.equals("FULL HD")){
            return (1920 * 1080) / 1000000f;

        } else if(qualidade.equals("4K")){
            return (3840 * 2160) / 1000000f;

        }
        return 0;
    }

    public String getQualidade(){
        return qualidade;
    }

    public String getCodec(){
        return codec;
    }

    public int getFps(){
        return fps;
    }

    public void setQualidade(String qualidade){
        this.qualidade = qualidade;
    }

    public void setCodec(String codec){
        this.codec = codec;
    }

    public void setFps(int fps){
        this.fps = fps;
    }
}
