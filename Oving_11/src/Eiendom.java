public class Eiendom {
  private String kommuneNavn;
  private int kommuneNr;
  private int gårdsNr;
  private int bruksNr;
  private String bruksNavn;
  private double areal;
  private String eier;
  /*
  Konstruktør som tar inn parametere for eiendom
   */

  Eiendom(String kommuneNavn, int kommuneNr, int gårdsNr, int bruksNr, String bruksNavn, double areal, String eier){
    this.kommuneNavn = kommuneNavn;
    this.kommuneNr = kommuneNr;
    this.gårdsNr = gårdsNr;
    this.bruksNr = bruksNr;
    this.bruksNavn = bruksNavn;
    this.areal = areal;
    this.eier = eier;
  }

/*
get metoder for å hente parametere for eiendom
 */
  public String getKommuneNavn() {
    return kommuneNavn;
  }
  public int getKommuneNr() {
    return kommuneNr;
  }
  public int getGårdsNr() {
    return gårdsNr;
  }

  public int getBruksNr() {
    return bruksNr;
  }

  public String getBruksNavn() {
    return bruksNavn;
  }
  public double getAreal() {
    return areal;
  }

  public String getEier() {
    return eier;
  }
/*
mutator metoder for å endre på areal og eier. Jeg har valgt å implementere mutator-metode for areal i tilfelle
innbyggere bygger ut tomta/huset, samt mutator-metode for eiers navn dersom eiendommen bytter eier
 */
  public void setAreal(double areal) {
    this.areal = areal;
  }

  public void setEier(String eier) {
    this.eier = eier;
  }

  public String eiendomID(){
    return getKommuneNr() + "-" + getGårdsNr() + "/" + getBruksNr();
  }
  public String toString() {
    return "Eiendom: " + eiendomID() + "\nAreal: " + areal + "\nEier: " + eier + "\n";
  }
}
