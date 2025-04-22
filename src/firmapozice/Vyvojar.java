package firmapozice;

public class Vyvojar extends Zamestnanec{

    private String jazyky[];

    public Vyvojar(String jmeno, String prijmeni, String pozice, int plat, String jazyky[]) {
        super(jmeno, prijmeni, pozice, plat);
        this.jazyky = jazyky;
    }

    public void vypisInfo(){
        System.out.println("Jméno: " + jmeno);
        System.out.println("Příjmení: " + prijmeni);
        System.out.println("Pozice: " + pozice);
        System.out.println("Plat: " + plat + "kč");
        System.out.println("Známe programovací jazyky: " );
        for (String jazyk : jazyky) {
            System.out.print(jazyk + "  ");
        }
    }






}
