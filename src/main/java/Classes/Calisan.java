package Classes;

public class Calisan {
     String ad;
     String soyad;
     String pozisyon;

    public Calisan(String ad, String soyad , String pozisyon) {
        this.ad = ad;
        this.soyad = soyad;
        this.pozisyon = pozisyon;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getPozisyon() {
        return pozisyon;
    }

    public String toString() {
        return "Çalışan Adı: " + ad + ", Çalışan SoyAdı: " + soyad + ", Çalışan Pozisyonu: " + pozisyon ;
    }
}