public class Anakart {
    private String model;
    private String uretici;
    private int yuvaSayisi;
    private String OS;

    public Anakart(String model, String uretici, int yuvaSayisi, String OS) {
        this.model = model;
        this.uretici = uretici;
        this.yuvaSayisi = yuvaSayisi;
        this.OS = OS;
    }

    public void yukleOS(String OS){
        this.OS = OS;
        System.out.println("İşletim sistemi yüklendi: " + OS);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUretici() {
        return uretici;
    }

    public void setUretici(String uretici) {
        this.uretici = uretici;
    }

    public int getYuvaSayisi() {
        return yuvaSayisi;
    }

    public void setYuvaSayisi(int yuvaSayisi) {
        this.yuvaSayisi = yuvaSayisi;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }
}
