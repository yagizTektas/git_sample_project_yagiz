package Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Calisanlar {

    public List<Calisan> getCalisanlar() {
        List<Calisan> calisanListesi = new ArrayList<>();

        calisanListesi.add(new Calisan("Yagiz", "Tekdas", "ITEngineer"));
        calisanListesi.add(new Calisan("Deniz", "İncir", "TPM"));
        calisanListesi.add(new Calisan("Toprak", "Yılmaz","PO"));
        calisanListesi.add(new Calisan("Serap", "Güleken","Director"));
        calisanListesi.add(new Calisan("Ayça", "Gül","Manager"));

        Collections.sort(calisanListesi, Comparator.comparing(Calisan::getAd));

        return calisanListesi;
    }
}