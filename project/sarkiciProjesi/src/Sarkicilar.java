import java.util.ArrayList;

public class Sarkicilar {
    private ArrayList<String> sarkicilarListesi = new ArrayList<>();
    public void showSarkici(){
        System.out.println("Şarkıcı listesinde " + sarkicilarListesi.size() + " kadar şarkıcı var.");

        for (int i = 0; i < sarkicilarListesi.size(); i++){
            System.out.println((i+1) + ". şarkıcı: " + sarkicilarListesi.get(i));
        }
    }

    public void sarkiciEkle(String isim){
        sarkicilarListesi.add(isim);
        System.out.println("Şarkıcı listesi güncellendi..");
    }

    public void sarkiciGuncelle(String isim, int index){
        sarkicilarListesi.set(index, isim);
        System.out.println("Şarkıcılar listesi güncellendi..");
    }

    public void sarkiciSil(int index){
        String isim = sarkicilarListesi.get(index);
        sarkicilarListesi.remove(index);
        System.out.println(isim + " isimli şarkıcı listeden silindi..");
    }

    public void sarkiciAra(String isim){
        int index = sarkicilarListesi.indexOf(isim);

        if (index > 0){
            System.out.println("Şarkıcı bulundu..");
            System.out.println(isim + " isimli şarkıcı " + (index+1) + ". pozisyonda");
        }else {
            System.out.println("Şarkıcı bulunamadı..");
        }
    }
}
