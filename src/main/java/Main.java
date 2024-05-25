// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) {
        Scanner scanner= new Scanner(System.in);
        ListeOlusturma liste= new ListeOlusturma(scanner);
        ArrayList<String> kontrolListesi= liste.getKontrolListesi();
        KontrolEtmek kListesi= new KontrolEtmek(liste,scanner);
        ArrayList<Boolean> kontrolEdilenler = kListesi.getKontrolEdilenler();
        AküListesi aküler= new AküListesi(scanner);
        ArrayList<Akü> aküL= aküler.getAküler();
        AküKontrol aküKontrol= new AküKontrol(aküL);
        Akü max= aküKontrol.getMax();
        ListeÜstündenGeçmek sonListe= new ListeÜstündenGeçmek(kontrolListesi, kontrolEdilenler, scanner);
        scanner.close();
        System.out.println("Maça Hazır!");
    }
    
}