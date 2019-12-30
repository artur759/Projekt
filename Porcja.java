public class Porcja {
    private double kcalPorc;
    private double bialkoPorcja;
    private double tluszczePorcja;
    private double weglowodanyPorcja;
    private String menu = "";

    public double getBialkoPorcja() { return Math.round(bialkoPorcja); }
    public double getTluszczePorcja() { return Math.round(tluszczePorcja); }
    public double getWeglowodanyPorcja() { return Math.round(weglowodanyPorcja); }
    public String getMenu() { return menu; }
    public double getKcalPorc() { return Math.round(kcalPorc); }

    public String dodajMenu(Posilek p)
    {
        menu += p.getNazwa() +"(K:"+(p.getWaga()*p.getKaloriena100gram())/100+",B:"+p.getBialko()+",W:"+p.getWeglowodany()+",T:"+p.getTluszcze() +"); ";
        return menu;
    }

    public double podliczBialko(Posilek p)
    {
        bialkoPorcja+=p.getBialko();
        return Math.round(bialkoPorcja);
    }
    public double podliczKcal(Posilek p)
    {
        kcalPorc+=((p.getWaga()*p.getKaloriena100gram())/100);
        return Math.round(kcalPorc);
    }
    public double podliczTluszcze(Posilek p)
    {
        tluszczePorcja+=p.getTluszcze();
        return Math.round(tluszczePorcja);
    }
    public double podliczWegle(Posilek p)
    {
        weglowodanyPorcja+=p.getWeglowodany();
        return Math.round(weglowodanyPorcja);
    }
}