class Hayvan{
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String konus(){
        return "Hayvan konuşuyor...";
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
}

class Kedi extends Hayvan{
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        //return super.konus();
        return this.getIsim() + " miyavlıyor...";
    }
}

class Kopek extends Hayvan{
    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";

    }
}
public class Main {
    public static void konusur(Hayvan hayvan){
        System.out.println(hayvan.konus());
    }


    public static void main(String[] args) {
        
        Hayvan hayvan = new Hayvan("Limon");

        System.out.println(hayvan.konus());


        Hayvan hayvan1 = new Kedi("Tekir"); //eğer override etmemiş olsaydık ana klas daki metodu kullanır

        System.out.println(hayvan1.konus());



        konusur(new Kedi("Şakir"));
        konusur(new Kopek("Toni"));


        //instanceof

        Kopek kopek = new Kopek("Minik");
        if (kopek instanceof Kopek){
            System.out.println("Bu nesne köpek sınıfından.");
        }
        if (kopek instanceof Hayvan){
            System.out.println("Bu nesne Hayvan sınıfından.");
        }
    }
}