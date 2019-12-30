public class Parametry {
    private String plec;
    private double wiek;
    private double waga;
    private String aktywnosc;
    private double wzrost;
    private double całkowiiteZapotrzebowanie;

    public void setWaga(double waga) { this.waga = waga; }
    public double getWaga() {
        return waga;
    }
    public double getCałkowiiteZapotrzebowanie() { return całkowiiteZapotrzebowanie; }

    public double bmr (String plec, double wiek, double wzrost, double waga)
    {
        Double zapotrzebowanie = 0.0;
        if (plec.equals( "mezczyzna"))
            zapotrzebowanie = 66+(13.7*waga)+(5*wzrost)-(6.76*wiek);
        if (plec.equals("kobieta"))
            zapotrzebowanie = 655+(9.6*waga)+(1.8*wzrost)-(4.7*wiek);
        return Math.round(zapotrzebowanie);
    };
    public double bmi(double waga,double wzrost)
    {

        return Math.round(waga/((wzrost/100)*(wzrost/100)));
    };
    public String komentarzBMI(double bmi)
    {
        String a="";
        if (bmi<=16)
            a="wyglodzenie";
        if(bmi<17 & bmi>16)
            a="wychudzenie";
        if(bmi>=17 & bmi <18.5)
            a="niedowaga";
        if(bmi>=18.5 & bmi<25)
            a = "wartość prawidłowa";
        if(bmi>=25&bmi<30)
            a= "nadwaga";
        if(bmi>=30 & bmi<35)
            a= "I stopień otyłości";
        if(bmi>=35&bmi<40)
            a="II stopień otylosci";
        if(bmi>=40)
            a="III stopień otylosci";

        return a;
    }
    public double całkowiteZapotrzebowanieKcal (String aktywnosc, double bmr)
    {
        if (aktywnosc.equals("bardzo mała"))
            całkowiiteZapotrzebowanie = 1.2*bmr;
        if (aktywnosc.equals("mała"))
            całkowiiteZapotrzebowanie = 1.4*bmr;
        if (aktywnosc.equals("umiarkowana"))
            całkowiiteZapotrzebowanie = 1.6*bmr;
        if (aktywnosc.equals("wysoka"))
            całkowiiteZapotrzebowanie = 1.75*bmr;
        if (aktywnosc.equals("bardzo wysoka"))
            całkowiiteZapotrzebowanie = 2.0*bmr;
        if (aktywnosc.equals("wyczynowa"))
            całkowiiteZapotrzebowanie = 2.4*bmr;
        return Math.round(całkowiiteZapotrzebowanie);

    };
    public double whr(double talia,double biodra)
    {
        return talia/biodra;
    }
    public String komentarzWHR(String plec,double whr)
    {
        if(plec.equals("kobieta")) {
            if (whr == 0.7)
                return "Idealna sylwetka";
            if (whr >= 0.8)
                return "Otyłość brzuszna";
            if (whr <= 0.8 & whr != 0.7)
                return "Otyłośc pośladkowo-udowa";
        }
        if(plec.equals("mezczyzna")) {
            if (whr == 0.7)
                return "Idealna sylwetka";
            if (whr >= 1.0)
                return "Otyłość brzuszna";
            if (whr <= 1.0 & whr != 0.7)
                return "Otyłośc pośladkowo-udowa";
        }
        return "0";
    }
}
