import java.util.Scanner;

public class BrukerInteraksjon {

  public EiendomsRegister eiendomsRegister = new EiendomsRegister();

  private int visMeny() {
    int menyValg = 0;
    System.out.println("\n***** Eiendom registrering *****\n ");
    System.out.println("1. Legg til eiendom" +
            "\n2. Skriv ut alle eiendommene i registeret" +
            "\n3. Søk etter eiendom" +
            "\n4. Kalkuler gjennomsnittlig areal" +
            "\n5. Slett eiendom" +
            "\n6. Finn antall eiendommer" +
            "\n7. Finn eiendommer med oppgit gårdsnummer" +
            "\n8. Avslutt");
    System.out.println("Vennligst oppgi et tall mellom 1 og 8\n ");
    Scanner input = new Scanner(System.in);
    if (input.hasNextInt()){
      menyValg = input.nextInt();
    }
    else {
      System.out.println("Oppgi et tall, ikke tekst");
    }
    return menyValg;
  }

  public  void start() {
    Scanner input = new Scanner(System.in);
    boolean ferdig = false;

    while (!ferdig ) {
      int menyValg = this.visMeny();
      switch (menyValg) {

        case 1:
          System.out.println("Oppgi eiendommen som skal legges til i registeret " +
                  "\n oppgi kommunenummer");
          int kommuneNr = input.nextInt();
          input.nextLine();

          System.out.println("Oppgi kommunenavn");
          String kommuneNavn = input.nextLine();

          System.out.println("Oppgi gårdsnummer");
          int gårdsNr = input.nextInt();
          input.nextLine();

          System.out.println("Oppgi bruksnummer");
          int bruksNr = input.nextInt();
          input.nextLine();

          System.out.println("Oppgi bruksnavn");
          String bruksNavn = input.nextLine();

          System.out.println("Oppgi areal");
          double areal = input.nextDouble();
          input.nextLine();

          System.out.println("Oppgi eier");
          String eier = input.nextLine();

          Eiendom nyEiendom = new Eiendom(kommuneNavn, kommuneNr,gårdsNr, bruksNr, bruksNavn, areal, eier);
          eiendomsRegister.leggTilEiendom(nyEiendom);
          System.out.println(nyEiendom.toString());
          break;

        case 2:
          System.out.println("----------- Eiendoms register -------------");
          for (Eiendom eiendom : eiendomsRegister.eiendomsRegister){
            System.out.println(eiendom.toString());
          }

          break;

        case 3:
          System.out.println("For å finne ønsket eiendom, oppgi først kommunenummer");
          int kNr = input.nextInt();

          System.out.println("Oppgi gårdsnummer");
          int gnr = input.nextInt();

          System.out.println("Oppgi bruksnummer");
          int bnr = input.nextInt();



          eiendomsRegister.finnEiendom(kNr, gnr,bnr);
          break;
        case 4:
          eiendomsRegister.gjennomsnittsAreal();
          break;
        case 5:
          System.out.println("Oppgi eiendommen som skal fjernes fra reigsteret \n oppgi kommunenummeret");
          int kommuneNummerr = input.nextInt();
          input.nextLine();

          System.out.println("Oppgi gårdsnummer");
          int gårdsNummer = input.nextInt();
          input.nextLine();

          System.out.println("Oppgi bruksnummer");
          int bruksNummer = input.nextInt();
          input.nextLine();

          System.out.println("Oppgi areal");
          double arealet = input.nextDouble();
          input.nextLine();

          System.out.println("Oppgi eier");
          String eieren = input.nextLine();

          for (Eiendom eiendommer : eiendomsRegister.eiendomsRegister){
            if (kommuneNummerr == eiendommer.getKommuneNr()
            && gårdsNummer == eiendommer.getGårdsNr()
            && bruksNummer == eiendommer.getBruksNr()
            && arealet == eiendommer.getAreal()
            && eieren.equalsIgnoreCase(eiendommer.getEier())){
              eiendomsRegister.slettEiendom(eiendommer);
              System.out.println("Eiendommen er fjernet fra registeret");
              break;
            }
          }
          break;
        case 6:
          eiendomsRegister.antallEiendommer();
          break;
        case 7:
          System.out.println("Oppgi gatenummer");
          int gateNummer = input.nextInt();
          input.nextLine();

          eiendomsRegister.eiendomMedGittGnr(gateNummer);
          break;
        case 8:
          ferdig = true;
          System.out.println("Avslutter programmet ........");
          break;
        default:
          System.out.println("Ugyldig meny");
          break;
      }
    }
  }

}
