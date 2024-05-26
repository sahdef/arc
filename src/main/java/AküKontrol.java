import java.util.ArrayList;
import java.util.Scanner;

public class AküKontrol{
  private Akü max;
  private int maxP;
  public AküKontrol(ArrayList<Akü> aküListesi){
    max= aküListesi.get(0);
    for (int i=0; i<aküListesi.size(); i++){
      if (aküListesi.get(i).getVoltaj()>max.getVoltaj()){
        max= aküListesi.get(i);
        maxP=i+1;
      }
      else if (aküListesi.get(i).getVoltaj()==max.getVoltaj() && aküListesi.get(i).getSağlık().equals("iyi")){
        max= aküListesi.get(i);
        maxP=i+1;
      }
    }
  }
  public Akü getMax(){
    System.out.println("Uygun akü numara"+ maxP+ " ve voltajı "+ max.getVoltaj() + " sağlık durumu "+ max.getSağlık());
    return max;
  }
}