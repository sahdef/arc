import java.util.Scanner;
import java.util.ArrayList;

public class AküListesi{
  private ArrayList<Akü> aküler= new ArrayList<Akü>();
  public AküListesi(Scanner scanner){
    double voltaj;
    String sağlık;
    while(true){
      System.out.println("Aküler için değerleri giriniz, Voltaj: (Eğer başka akü yoksa 0 giriniz)");
      voltaj=Double.valueOf(scanner.nextLine());
      if (voltaj==0){
        break;
      }
      System.out.println("Sağlık:");
      sağlık=scanner.nextLine();
      aküler.add(new Akü(voltaj,sağlık));
    }
  }
  public ArrayList<Akü> getAküler(){
    return aküler;
  }
}