package firmapozice;

public class Tester extends Zamestnanec{

    private int pocetNalezenychChyb;

    public Tester(String jmeno, String prijmeni, String pozice, int plat, int pocetNalezenychChyb) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetNalezenychChyb = 0;
    }

    public int naselJsemNovouChybu() {
        pocetNalezenychChyb++;
        return pocetNalezenychChyb;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat + "kč");
        System.out.println("Počet nalezených chyb: " + pocetNalezenychChyb);
    }

}
