package LantDeMagazine;

import java.util.ArrayList;

public class LantDeMagazine {
   private ArrayList<Magazin> locatie = new ArrayList<>();

    public void addlocation (Magazin mag,Person g){
        mag.setAdmin(g);

        locatie.add(mag);
        
    }





    void seeLocation (){
        int loc;
        for (loc=0;loc< locatie.size();loc++) {
            System.out.println(locatie.get(loc));
        }
    }
   // public void getMagazin(Magazin mag){


     public Magazin getMagazin(String mag) {
         int loc;
         for (loc = 0; loc < locatie.size(); loc++) {
             if (mag.equals(locatie.get(loc).getName())) {
                return locatie.get(loc);
             }
             else {
                 System.out.println("nu este");
             }
         }
         return null;
     }






}
