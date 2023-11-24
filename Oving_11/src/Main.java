// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) {
    BrukerInteraksjon brukerInteraksjon = new BrukerInteraksjon();

      brukerInteraksjon.eiendomsRegister.leggTilEiendom(new Eiendom("Gloppen",1445,77,631,null,1017.6,"Jens Olsen"));
      brukerInteraksjon.eiendomsRegister.leggTilEiendom(new Eiendom("Gloppen",1445,77,131,"Syningom",661.3,"Nicolay Madsen"));
      brukerInteraksjon.eiendomsRegister.leggTilEiendom(new Eiendom("Gloppen",1445,75,19,"Fugletun",650.6,"Evelyn Jensen"));
      brukerInteraksjon.eiendomsRegister.leggTilEiendom(new Eiendom("Gloppen",1445,74,188,null,1457.2,"Karl Ove Bråten"));
      brukerInteraksjon.eiendomsRegister.leggTilEiendom(new Eiendom("Gloppen",1445,79,47,"Høyberg",1339.4,"Elsa Indregård"));

    brukerInteraksjon.start();

  }
}