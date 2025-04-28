import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;

import java.util.ArrayList;
import java.util.Scanner;

public class ZamestnaneckySystemApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


    ArrayList<Manager> manageri = new ArrayList<>();
    ArrayList<Tester> testeri = new ArrayList<>();
    ArrayList<Vyvojar> vyvojari = new ArrayList<>();

    for (boolean behZapisu = true; behZapisu == true; ) {

        System.out.println("Jakého zaměstnance chceš přidat?");
        System.out.println("1 - MANAGER");
        System.out.println("2 - TESTER");
        System.out.println("3 - VÝVOJÁŘ");

        int vyberZamestnance = sc.nextInt();
        sc.nextLine();

            switch (vyberZamestnance) {
                case 1:
                    //MANAGER----------------------------------
                    System.out.println("");
                    System.out.println("Jméno Managera:");
                    String jmenoM = sc.nextLine();

                    System.out.println("Příjmení Managera:");
                    String prijmeniM = sc.nextLine();

                    System.out.println("Pozice Managera:");
                    String poziceM = sc.nextLine();

                    System.out.println("Plat Managera:");
                    int platM = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Počet řízených zaměstanců Managerem:");
                    int pocetRizenychZamestnancuM = sc.nextInt();
                    sc.nextLine();

                    manageri.add(new Manager(jmenoM, prijmeniM, poziceM, platM, pocetRizenychZamestnancuM));
                    break;


                case 2:
                    //TESTER----------------------------------
                    System.out.println("");
                    System.out.println("Jméno Testera:");
                    String jmenoT = sc.nextLine();

                    System.out.println("Příjmení Testera:");
                    String prijmeniT = sc.nextLine();

                    System.out.println("Pozice Testera:");
                    String poziceT = sc.nextLine();

                    System.out.println("Plat Testera:");
                    int platT = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Počet nalezených chyb Testerem (ideálně zadej 0):");
                    int pocetNalezenychChybT = sc.nextInt();
                    sc.nextLine();

                    testeri.add(new Tester(jmenoT, prijmeniT, poziceT, platT, pocetNalezenychChybT));

                    /*
                    for(int ixxx=0; ixxx==20;ixxx++){
                        tester.naselJsemNovouChybu();
                    }
                     */
                    break;

                case 3:
                    //VYVOJAR----------------------------------
                    System.out.println("");
                    System.out.println("Jméno Vývojáře:");
                    String jmenoV = sc.nextLine();

                    System.out.println("Příjmení Vývojáře:");
                    String prijmeniV = sc.nextLine();

                    System.out.println("Pozice Vývojáře:");
                    String poziceV = sc.nextLine();

                    System.out.println("Plat Vývojáře:");
                    int platV = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Známé programovací jazyky:");
                    System.out.println("Kolik jazyků zná?:");
                    int pocetJazyky = sc.nextInt();
                    sc.nextLine();
                    String jazyky[] = new String[pocetJazyky];
                    System.out.println("Jaké jazyky zná?:");
                    for(int ixxxx=0;ixxxx<pocetJazyky;ixxxx++){
                        jazyky[ixxxx] = sc.nextLine();
                    }

                    vyvojari.add(new Vyvojar(jmenoV, prijmeniV, poziceV, platV, jazyky));
                    break;
            }

        System.out.println("Chceš zapsat dalšího zaměstnance?");
        System.out.println("ano");
        System.out.println("ne");
        String pokracovat = sc.nextLine();
        pokracovat = pokracovat.toLowerCase();
        if (pokracovat.equals("ano")) {

        }else if(pokracovat.equals("ne")){
            behZapisu = false;
        }else{
            System.err.println("ŠPATNĚ - ZA TREST MUSÍŠ ZAPSAT DALŠÍHO ZAMĚSTNANCE");
        }
    }


//VÝPIS POČTU MANAGERŮ
    int pocetManageri = manageri.size();
    System.out.println("Počet managerů je: " + pocetManageri);

//VÝPIS POČTU ZAMĚSTNANCŮ
        int pocetZamestnanci = manageri.size() + testeri.size() + vyvojari.size();
        System.out.println("Počet zaměstnanců je: " + pocetZamestnanci);

//VÝPIS TESTERA, KTERÝ NALEZL NEJVÍCE CHYB

        Tester nejviceChyb = null;
        for (Tester tester : testeri) {
            if (nejviceChyb == null || tester.getPocetNalezenychChyb() > nejviceChyb.getPocetNalezenychChyb()) {
                nejviceChyb = tester;
            }
        }

        if (nejviceChyb != null) {
            System.out.println("Tester s největším počtem nalezených chyb: " +nejviceChyb.getJmeno()+ " " +nejviceChyb.getPrijmeni());
        }else{
            System.out.println("Žádný tester ve společnosti není");
        }





//VÝPIS VÝVOJÁŘE OVLÁDAJÍCÍ NEJVĚTŠÍ POČET JAZYKŮ


//VÝPIS ZAMĚSTNANCE S NENIŽŠÍM PLATEM










































    }
}