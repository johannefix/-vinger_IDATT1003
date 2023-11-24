import java.util.ArrayList;

public class EiendomsRegister {

  ArrayList<Eiendom> eiendomsRegister = new ArrayList<>();


  public void leggTilEiendom(Eiendom eiendom){
    eiendomsRegister.add(eiendom);
  }
  public void slettEiendom(Eiendom eiendom){
    eiendomsRegister.remove(eiendom);
  }
  public int antallEiendommer(){
    System.out.println("Antall registrerte eiendommer er " + eiendomsRegister.size());
    return eiendomsRegister.size();
  }
  public Eiendom finnEiendom(int kommuneNr, int gnr, int bnr){
    for (Eiendom eksisterendeEiendom: eiendomsRegister){
      if (eksisterendeEiendom.getKommuneNr() == kommuneNr
              && eksisterendeEiendom.getGårdsNr() == gnr
              && eksisterendeEiendom.getBruksNr() == bnr) {
        System.out.println(eksisterendeEiendom.toString());
        return eksisterendeEiendom;
      }
    }
    System.out.println("Ingen eiendom med kommune nummer " + kommuneNr
            + ", gårdsnummer " + gnr + " og bruksnummer " + bnr + " ble funnet");
    return null;
  }
  public double gjennomsnittsAreal(){
    double arealSum = 0;
    int antallEiendommer = eiendomsRegister.size();
    for (Eiendom eiendom : eiendomsRegister) {
      arealSum += eiendom.getAreal();
    }
    double gjennomsnittAreal = arealSum / antallEiendommer;
    System.out.println("Gjennomsnittsarealet for " + antallEiendommer + " eiendommer er: " + gjennomsnittAreal);
    return gjennomsnittAreal;
  }
  public Eiendom eiendomMedGittGnr(int gnr){
    for (Eiendom eksisterendeEiendom: eiendomsRegister){
      if (eksisterendeEiendom.getGårdsNr() == gnr) {
        System.out.println(eksisterendeEiendom.toString());
        return eksisterendeEiendom;
      }

    }
    System.out.println("Ingen eiendom med gårdsnr: " + gnr + " ble funnet");
    return null;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();

    for (Eiendom eiendommer : eiendomsRegister){
      result.append("Eiendom: "). append(eiendommer.eiendomID()).append(" ")
              .append("\nAreal: ").append(eiendommer.getAreal()).append(" ").
              append("\nEier: ").append((eiendommer.getEier())).append("\n\n");
    }
    return result.toString();
  }
}
