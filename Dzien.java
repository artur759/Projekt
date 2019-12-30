public class Dzien {
    private String nazwa;
    private Porcja sniad = new Porcja();
    private Porcja drugieSniad = new Porcja();
    private Porcja obiadek = new Porcja();
    private Porcja przek= new Porcja();
    private Porcja kol = new Porcja();
    private String data;
    private  double kcalDzien;
    private  double bialkoDzien;
    private  double tluszczeDzien;
    private  double weglowodanyDzien;


    public Porcja getSniad() { return sniad; }
    public Porcja getDrugieSniad() { return drugieSniad; }
    public Porcja getObiadek() { return obiadek; }
    public Porcja getPrzek() { return przek; }
    public Porcja getKol() { return kol; }
    public String getNazwa() { return nazwa; }
    public String getData() { return data; }
    public double getKcalDzien() { return Math.round(kcalDzien); }
    public double getBialkoDzien() { return Math.round(bialkoDzien); }
    public double getTluszczeDzien() { return Math.round(tluszczeDzien); }
    public double getWeglowodanyDzien() { return Math.round(weglowodanyDzien); }

    public Posilek zjedz(String a, double b, double c, double d,double e,double f)
    {
        Posilek pos = new Posilek(a,b,c,d,e,f);
        kcalDzien+= ((pos.getKaloriena100gram()*pos.getWaga())/100);
        bialkoDzien+=pos.getBialko();
        weglowodanyDzien+=pos.getWeglowodany();
        tluszczeDzien+=pos.getTluszcze();
        return pos;

    }


    public Dzien(String nazwa, String data) {
        this.nazwa = nazwa;
        this.data = data;
    }

}