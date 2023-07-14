// Refactor --> Encapsulate

public class Araba {
    private String renk;
    private int kapilar;
    private int tekerlekler;
    private String motor;
    private String model;


    public void setModel(String model) {
        this.model = model;

    }
    public String  getModel() {
        return this.model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        this.kapilar = kapilar;
    }

    public int getTekerlekler() {
        return tekerlekler;
    }

    public void setTekerlekler(int tekerlekler) {
        this.tekerlekler = tekerlekler;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}