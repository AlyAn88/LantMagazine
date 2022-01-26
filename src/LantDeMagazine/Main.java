package LantDeMagazine;

import java.util.ArrayList;
import java.util.PropertyPermission;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LantDeMagazine alex = new LantDeMagazine();
        Magazin iasi = new Magazin();
        iasi.setName("Iasi");
        Magazin bacau = new Magazin();
        bacau.setName("Bacau");
        Person vasea = new Person("Perdevara", "Vasile", 123);
        Person cristi = new Person("Olariu", "Cristian", 133);
        Product a = new Product(123, "ciocolata", 3.99, "dulciuuri", 122022);
        Product b = new Product(125, "lapte", 2.54, "Lactate", 032022);
        Product c = new Product(135, "laptic", 2.66, "Lactate", 042022);
        alex.addlocation(iasi, vasea);
        alex.addlocation(bacau, cristi);
        iasi.addProduct(b);
        iasi.addProduct(b);
        iasi.addProduct(c);
        bacau.addProduct(a);
        bacau.addProduct(a);


        alex.seeLocation();
        iasi.seeProduct();
        bacau.seeProduct();

        System.out.println("Meniu");
        System.out.println("Introdu tip utilizator (AD/UT)");

        Scanner key = new Scanner(System.in);
        while (true) {
            String next = key.nextLine();
            //final String next = readUserAndPassword();
            if (next.equals("AD")) {
                System.out.println("Meniu administrator");

                System.out.println("1 - afisare magazine");
                System.out.println("2 - selectare magazin");
                next = key.nextLine();
                int selectieMeniu = Integer.valueOf(next);
                if (selectieMeniu==1){
                    alex.seeLocation();
                    System.out.println("Doriti sa ectati un magazin?YES/No");
                    next = key.nextLine();
                    String selectie= String.valueOf(next);

                    if (selectie.equals("NO")){
                        break;
                    }
                    else {
                        selectieMeniu=2;

                    }

                }


                Magazin magazinSelectat;
                if (selectieMeniu==2){
                  while (true) {
                      System.out.println("Selectat magazinul");
                      next = key.nextLine();
                      String selectieMagazin = String.valueOf(next);
                      magazinSelectat = alex.getMagazin(selectieMagazin);
                      if (magazinSelectat!= null){
                          while (true) {
                              System.out.println("1 - Adaugare produs");
                              System.out.println("2 - Modificare produs");
                              System.out.println("3 - Remove produs");
                              System.out.println("4 - Afisare produse");
                              System.out.println("5 - Exit");//TODO break
                              next = key.nextLine();
                              int selectieProces = Integer.valueOf(next);
                              if (selectieProces == 1) {
                                  System.out.println("Introduceti Bar Cod");
                                  next = key.nextLine();
                                  int barCod = Integer.valueOf(next);
                                  System.out.println("Introduceti Numele Produsului");
                                  next = key.nextLine();
                                  String numeProdus = String.valueOf(next);
                                  System.out.println("Introduceti pretul");
                                  next = key.nextLine();
                                  Double pret = Double.valueOf(next);
                                  System.out.println("Introduceti Categoria Produsului");
                                  next = key.nextLine();
                                  String categorieProdus = String.valueOf(next);
                                  System.out.println("Introduceti Data Expirarii");
                                  next = key.nextLine();
                                  int expDate = Integer.valueOf(next);
                                  Product nou = new Product(barCod, numeProdus, pret, categorieProdus, expDate);
                                  magazinSelectat.addProduct(nou);
                                  continue;
                              }
                              if (selectieProces == 2) {
                                  System.out.println("Selectati Codul de Bare a produsului");
                                  next = key.nextLine();
                                  int barCod = Integer.valueOf(next);
                                  Product gasit = magazinSelectat.findProduct(barCod);
                                  System.out.println("Modificati pretul produsului");
                                  next = key.nextLine();
                                  Double pret = Double.valueOf(next);
                                  gasit.setPrice(pret);
                                  continue;

                              }
                              if (selectieProces == 3) {
                                  System.out.println("Selectati Codul de Bare a produsului pentru a fi sters");
                                  next = key.nextLine();
                                  int barCod = Integer.valueOf(next);
                                  Product gasit = magazinSelectat.findProduct(barCod);
                                  magazinSelectat.
                                  continue;

                              }
                              if (selectieProces == 4){
                                  magazinSelectat.seeProduct();
                                  continue;
                              }
                              if(selectieProces>=5){
                                  break;
                              }
                          }
                      }



                  }
                }





                //if - user a selectat magazin existent
               /* if (selectieMeniu ==2) {
                    System.out.println("1 - Adaugare produs");
                    // citire de la user informatii despre produs
                    // le adauga intr-un array list de produse -- al magazinului selectat
                    System.out.println("2 - Modificare produs");
                    // citire de la user COD_DE_BARE
                    //if ( cod_de_bare exista)
                    {
                        //modificare produsul -- pretul
                    }
                    System.out.println("3 - Remove produs");
                    // citire de la user informatii despre produs
                    //if ( cod_de_bare exista)
                    {
                        // remove produs din "magazin selectat"
                    }
                    //
                    System.out.println("4 - Afisare produse");
                    //afisarea tuturor produselor din magazin selectat
                    System.out.println("5 - Exit");
                    // serializarea modificarilor --
                }*/
            } else if (next.equals("UT")) {
                //afisarea tutror magazinelor disponibile
                System.out.println("0 - selectare magazin");
                // citim numele magazinului
                //if(magazinul exista)
                {
                    System.out.println("1 - Afisare produse");
                    // afisam prod magazinului selectat
                    System.out.println("2 - Cumpara produs");
                    // scadem numarul de produse din stoc
                    System.out.println("3 - Exit");
                    // serializare
                }
            } else {
                break;
            }


        }
    }


}
