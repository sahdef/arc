import java.util.ArrayList;
import java.util.Scanner;

public class ListeOlusturma {
    public ArrayList<String> kontrolListesi= new ArrayList<String>();
    public ListeOlusturma(Scanner scanner){
        String input="";
        System.out.println("Eklemek istediğiniz maddeyi giriniz (Eğer yok ise x girmeniz yeterli)");
        while (true){
            input=scanner.nextLine();
            if (input.equals("x")){
                break;
            }
            kontrolListesi.add(input);
            System.out.println("Eklemek istediğiniz maddeyi giriniz (Eğer yok ise x girmeniz yeterli):");

        }
    }  

    public ArrayList<String> getKontrolListesi(){
        return kontrolListesi;
    }
}
