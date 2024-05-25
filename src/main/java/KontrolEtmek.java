import java.util.ArrayList;
import java.util.Scanner;


public class KontrolEtmek {
    public ArrayList<Boolean> kontrolEdilenler= new ArrayList<Boolean>();
    public KontrolEtmek(ListeOlusturma liste, Scanner value){
        for (String s: liste.getKontrolListesi()){
            System.out.println(s);
            String input = value.nextLine();
            if (input.equals("evet")){
                kontrolEdilenler.add(true);
            }
            else{
                kontrolEdilenler.add(false);
            }
        }
    }
    public ArrayList<Boolean> getKontrolEdilenler(){
        return kontrolEdilenler;
    }
     
}
