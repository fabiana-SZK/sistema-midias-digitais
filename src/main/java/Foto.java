public class Foto extends Midia implements CalcMegapixel{
    private int alturaPixel;
    private int larguraPixel;
    private String modeloCamera;

    public Foto(){
        alturaPixel = 0;
        larguraPixel = 0;
        modeloCamera = "";
    }

    // Sobrecarga
    public Foto(int alturaPixel, int larguraPixel, String modeloCamera){
        this.alturaPixel = alturaPixel;
        this.larguraPixel = larguraPixel;
        this.modeloCamera = modeloCamera;
    }

    // Sobrescrita
    public float calcularMegapixel(){
        float mpFoto = (alturaPixel * larguraPixel) / 1000000f;
        return mpFoto;
    }

    public int getAlturaPixel(){
        return alturaPixel;
    }

    public int getLarguraPixel(){
        return larguraPixel;
    }

    public String getModeloCamera(){
        return modeloCamera;
    }

    public void setAlturaPixel(int alturaPixel){
        this.alturaPixel = alturaPixel;
    }

    public void setLarguraPixel(int larguraPixel){
        this.larguraPixel = larguraPixel;
    }

    public void setModeloCamera(String modeloCamera){
        this.modeloCamera = modeloCamera;
    }
}
