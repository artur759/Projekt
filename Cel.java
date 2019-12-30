public class Cel {
    private String cel;
    private double czasRealizacji;
    private  double tempo;
    Parametry p;

    public double czas(Parametry p, double nowaWaga,double tempo)
    {
        Double a = nowaWaga - p.getWaga();
        return Math.round(Math.abs(a)/(tempo/10));
    }

    public double zmienMase(Parametry p , double tempo,Double cel) {
        if(cel<p.getWaga())
            return Math.round(p.getCałkowiiteZapotrzebowanie()-tempo*100);
        if(cel>p.getWaga())
            return Math.round(p.getCałkowiiteZapotrzebowanie()+tempo*100);
        return -1;
    }


}
