import firmapozice.Manager;
import firmapozice.Tester;
import firmapozice.Vyvojar;

import java.util.Scanner;

public class ZamestnaneckySystemApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    //MANAGER----------------------------------
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

    Manager = new Manager(jmenoM, prijmeniM, poziceM, platM, pocetRizenychZamestnancuM)


    //TESTER----------------------------------
        System.out.println("Jméno Testera:");
        String jmenoT = sc.nextLine();

        System.out.println("Příjmení Testera:");
        String prijmeniT = sc.nextLine();

        System.out.println("Pozice Testera:");
        String poziceT = sc.nextLine();

        System.out.println("Plat Testera:");
        int platT = sc.nextInt();
        sc.nextLine();

        System.out.println("Počet nalezených chyb Testerem:");
        int pocetNalezenychChybT = sc.nextInt();
        sc.nextLine();



























    }
}