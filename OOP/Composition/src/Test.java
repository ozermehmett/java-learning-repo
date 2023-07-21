public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920, 1080);

        Monitor monitor = new Monitor("1234", "Lenovo", "18.5", resolution);

        Kasa kasa = new Kasa("Eheğ", "Lenovo", "Tempersiz cam");

        Anakart anakart = new Anakart("MemoMeen", "Lenovo", 10, "Tuzlu-Baklava OS");

        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);

        pc.getKasa().bilgisayariAc();

        pc.getMonitor().monitoruKapat();
        pc.getAnakart().yukleOS("Tuzsuz baklava");
    }


}
