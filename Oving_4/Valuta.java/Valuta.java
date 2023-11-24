public class Valuta {
    /* skriver konstruktør for Valuta */

    String navn;
    double verdi;

    public Valuta(String typeValuta, double verdiValuta) {
        this.navn = typeValuta;
        this.verdi = verdiValuta;
    }

    public String getNavn() {
        return navn;
    }

    public double getVerdi() {
        return verdi;
    }

    /*
     * metode multiplisere verdiValuta til et objekt med verdiValutaen til et annet
     * objekt
     */
    public double OmregningTilNOK(double verdi) {
        return verdi * this.verdi;
        /*
         * verdi = inni parameteret, gitt av bruker, mens this.verdi= gitt forhold
         * mellom valuta og NOK
         */
    }

    public double OmregningFraNOK(double nok) {
        return nok / verdi;
    }
}