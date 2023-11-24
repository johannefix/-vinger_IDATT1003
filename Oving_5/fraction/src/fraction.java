public class fraction {
    // mine objektvariabler:
    private int teller;
    private int nevner;


    //konstruktør nr.1
    public fraction(int teller, int nevner){
        if (nevner == 0){
            throw new IllegalArgumentException(" nevneren kan ikke være 0!");
        }
        this.teller = teller;
        this.nevner = nevner;
    }

    // konstruktør nr.2
    public fraction(int teller) {
        this.teller = teller;
        this.nevner = 1;
    }


    //metoder: henter fram variablene teller & nevner som ellers er priv
    public int getTeller(){ return this.teller;}
    public int getNevner(){ return this.nevner;}


    //metoder: addisjon for brøk
    public int addisjon(int nyTeller, int nyNevner) {
        if (this.nevner == nyNevner){
            nevner = this.nevner;
            teller = this.teller + nyTeller;
        //hvordan skal den lagre verdier, skal jeg skrive nevner= eller referere med til
            //fractionClass?

        }
        else {
            nevner = this.nevner * nyNevner;
            teller = this.teller * nyNevner + nyTeller * this.nevner;
        }
        //skal jeg ha med noe return/this her for å hente igjen verdiene?
        System.out.println("Brøkene; " + this.teller + "/" + this.nevner + " og "
                + nyTeller + "/" + nyNevner + "summert gir svaret: "
                + nevner + "/" + teller);
    }

    public int substraksjon(int nyTeller, int nyNevner){
        if (this.nevner == nyNevner){
            nevner = this.nevner;
            teller = this.teller + nyTeller;
        }
        else {
            nevner = this.nevner * nyNevner;
            teller = this.teller * nyNevner - nyTeller * this.nevner;
        }
        System.out.println("Brøkene; " + this.teller + "/" + this.nevner + " og "
                + nyTeller + "/" + nyNevner + "subtrahert gir svaret: "
                + nevner + "/" + teller);
    }

    public int multiplikasjon(fraction brok){
        teller = this.teller * brok.getTeller();
        nevner = this.nevner * nyNevner;
        System.out.println("Produktet av brøkene; " + this.teller + "/" + this.nevner + " og "
                + nyTeller + "/" + nyNevner + "er: "
                + nevner + "/" + teller);
    }

    public int divisjon(int nyTeller, int nyNevner){
        teller = this.teller * nyNevner;
        nevner = this.nevner * nyTeller;
        System.out.println("Brøkene; " + this.teller + "/" + this.nevner + " og "
                + nyTeller + "/" + nyNevner + "divisert gir svaret: "
                + nevner + "/" + teller);
    }

}
