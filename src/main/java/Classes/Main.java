package Classes;

import java.util.List;

    public class Main{
        public static void main(String[] args) {
            Calisanlar calisanlar = new Calisanlar();
            List<Calisan> calisanListesi = calisanlar.getCalisanlar();

            for (Calisan calisan : calisanListesi) {
                System.out.println(calisan);
            }
        }
    }
