package firmapozice;

public class Manager extends Zamestnanec{

    private int pocetRizenychZamestnancu;

    public Manager(String jmeno, String prijmeni, String pozice, int plat, int pocetRizenychZamestnancu) {
        super(jmeno, prijmeni, pozice, plat);
        this.pocetRizenychZamestnancu = this.pocetRizenychZamestnancu;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat + "kč");
        System.out.println("Počet řízených zaměstnanců: " + pocetRizenychZamestnancu);
    }




















}
