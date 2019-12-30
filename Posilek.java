public class Posilek {

    private String nazwa;
    private double bialko;
    private double weglowodany;
    private double tluszcze;
    private double waga;
    private double kaloriena100gram;


    public String getNazwa() {
        return nazwa;
    }
    public double getBialko() {
        return bialko;
    }
    public double getWeglowodany() {
        return weglowodany;
    }
    public double getTluszcze() {
        return tluszcze;
    }
    public double getWaga() {
        return waga;
    }
    public double getKaloriena100gram() {
        return kaloriena100gram;
    }


    public Posilek(String nazwa, double waga, double kaloriena100gram,double bialko, double weglowodany,double tluszcze) {
        this.nazwa = nazwa;
        this.bialko = bialko;
        this.weglowodany = weglowodany;
        this.tluszcze = tluszcze;
        this.waga = waga;
        this.kaloriena100gram = kaloriena100gram;
    }

}