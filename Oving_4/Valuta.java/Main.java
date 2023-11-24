import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Valuta[] mineValutaer = new Valuta[] {
                new Valuta("SEK", 1.04),
                new Valuta("$", 9.4),
                new Valuta("EURO", 10),
        };

        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        while (true) {

            String valg = "Hvilken valuta? ";

            for (int i = 0; i <= mineValutaer.length; i += 1) {
                if (i == mineValutaer.length) {
                    valg += " AVSLUTT = " + (i + 1);
                    break;
                }

                var valuta = mineValutaer[i];

                valg += " " + valuta.navn + " = " + (i + 1) + ",";
            }

            System.out.println(valg);

            int valutaValg = scanner.nextInt();

            valutaValg -= 1;

            if (valutaValg == mineValutaer.length) {
                System.out.println("AVSLUTT");
                scanner.close();
                System.exit(0);
            }

            var valuta = mineValutaer[valutaValg];

            System.out.println("Ønsket valuta er: " + valuta.navn);

            /* spør om bruker vil regne fra x-valuta til NOK eller fra NOK til x-valuta */
            System.out.println("Vil du regne ut fra (1)" + valuta.navn + " eller til (2)" + valuta.navn);

            var valg2 = scanner.nextInt();

            if (valg2 == 1) {

                System.out.println("Hvor mange " + valuta.navn + " vil du regne til NOK?");
                var antallVerdi = scanner.nextInt();
                var resultat = valuta.OmregningTilNOK(antallVerdi);
                System.out.println("Det blir " + resultat + "!");
            } else {
                System.out.println("Hvor mange NOK vil du regne til " + valuta.navn + "?");
                var antallVerdi = scanner.nextInt();
                var resultat = valuta.OmregningFraNOK(antallVerdi);
                System.out.println("Det blir " + resultat + "!");
            }

        }
    }
}
