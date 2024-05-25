import java.util.ArrayList;
import java.util.Scanner;

public class AküKontrol{
  private Akü max;
  public AküKontrol(ArrayList<Akü> aküListesi){
    max= aküListesi.get(0);
    for (int i=0; i<aküListesi.size(); i++){
      if (aküListesi.get(i).getVoltaj()>max.getVoltaj()){
        max= aküListesi.get(i);
      }
      else if (aküListesi.get(i).getVoltaj()==max.getVoltaj() && aküListesi.get(i).getSağlık().equals("iyi")){
        max= aküListesi.get(i);
      }
    }
  }
  public Akü getMax(){
    return max;
  }
}