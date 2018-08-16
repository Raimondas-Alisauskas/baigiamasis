import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class Task1AndriusV {

	/**
    *
    *
    * @param mokiniai
    *            - isrikiuoti pagal vardus
    * @return turetu grazinti isrikiuotus pagal pazymiu vidurki reziais [0..1)
    *         [1..2)...
    */
   private List<Mokinys> mokiniuListas (Map<String, List<Mokinys>> mokiniai) {
       Collection<List<Mokinys>> list = mokiniai.values();
       List<Mokinys> tarpiniai = new ArrayList<>();
       int ilgis= mokiniai.size();

       for (List<Mokinys> elemntList: list){


           for (Mokinys mokinys: elemntList){

               tarpiniai.add(mokinys);
           }

       }
       return tarpiniai;
   }

   public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {
       // TODO

       List<Mokinys> mokinukai = mokiniuListas(mokiniai);

       List<List<Mokinys>> finalinis = new ArrayList<>();
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());
       finalinis.add(new ArrayList<>());


       for (int q=1; q<mokinukai.size() ; q++){
           if (mokinukai.get(q).getVidurkis()==10){
               finalinis.get(9).add(mokinukai.get(q));
           }

           for (int w=0; w<mokinukai.size() ; w++) {

               if (mokinukai.get(q).getVidurkis() >= w && mokinukai.get(q).getVidurkis() < w+1) {
                   finalinis.get(w-1).add(mokinukai.get(q));
               }
           }

       }





       return finalinis;
   }

	
}
