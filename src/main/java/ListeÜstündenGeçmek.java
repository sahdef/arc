import java.util.ArrayList;
import java.util.Scanner;

public class ListeÜstündenGeçmek{
  public ListeÜstündenGeçmek(ArrayList<String> soru, ArrayList<Boolean> cevap, Scanner scanner){
    int numberTrue=0;
    while(true){
      for (int i=0; i<cevap.size(); i++){
          if (!cevap.get(i)){
            System.out.println(soru.get(i));
            String input=scanner.nextLine();
            if (input.equals("evet")){
              cevap.set(i,true);
              numberTrue++;
            }
          }
          else{
            numberTrue++;
          }
      }
      if (numberTrue==cevap.size()){
        break;
      }
      numberTrue=0;
    }
  }
    
}