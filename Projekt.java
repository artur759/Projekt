import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Projekt {
    private JTextField nazwaDnia;
    private JTextField dataDzien;
    private JButton dodajNowyDzieńButton;
    private JComboBox dzienComboBox;
    private JTextField dodajDzienData;
    private JPanel ListaPosiłków;
    private JTextField dodajPosilekKcal;
    private JTextField dodajPosielPorcja;
    private JTextField dodajPosilekBialko;
    private JTextField dodajPosilekWeglowodany;
    private JTextField dodajPosilekTluszcze;
    private JTextField dodajPosilekNazwa;
    private JTextField kcalSniadanie;
    private JTextField bialkoSniadanie;
    private JTextField weglowodanySniadanie;
    private JTextField tluszczeSniadanie;
    private JTextField menuSniadanie;
    private JTextField kaloriePosumowanie;
    private JTextField bialkoPodsumowanie;
    private JTextField weglowodanyPodsumowanie;
    private JTextField tluszcePodsumowanie;
    private JComboBox plecParametryComboBox;
    private JTextField wagaParametry;
    private JTextField obwodTaliParametry;
    private JTextField obwodBioderParametry;
    private JComboBox aktywnoscParametryComboBox;
    private JTextField wiekParametry;
    private JButton policzZapotrzebowanieKcal;
    private JTextField zapotrzebowanieKcalWyniki;
    private JButton policzBMI;
    private JTextField bmiWyniki;
    private JTextField bmiKomentarz;
    private JButton policzWHR;
    private JTextField whrWyniki;
    private JTextField whrKomentarz;
    private JButton policzBMR;
    private JTextField bmrWyniki;
    private JTextField celCel;
    private JComboBox celWartosc;
    private JTextField noweKcalCel;
    private JTextField czasRealizacjiCel;
    private JButton policzCel;
    private JTextField menuDrugie;
    private JTextField tluszczeDrugie;
    private JTextField weglowodanyDrugie;
    private JTextField bialkoDrugie;
    private JTextField kcalDrugie;
    private JTextField kcalObiad;
    private JTextField bialkoObiad;
    private JTextField weglowodanyObiad;
    private JTextField tluszceObiad;
    private JTextField menuObiad;
    private JTextField kcalPrzekaska;
    private JTextField bialkoPrzekaska;
    private JTextField weglowodanyPrzekaska;
    private JTextField tluszczePrzekaska;
    private JTextField menuPrzekaska;
    private JTextField menuKolacja;
    private JTextField tluszceKolacja;
    private JTextField weglowodanyKolacja;
    private JTextField bialkoKolacja;
    private JTextField kcalKolacja;
    private JPanel Główny;
    private JButton dodajSniadanie;
    private JButton dodajDrugie;
    private JButton dodajObiad;
    private JButton dodajPrzekaska;
    private JButton dodajKolacja;
    private JTextField wzrostParametry;
    private JTextField nazwaDodaj;
    private static int licznik = 1;
    private static Dzien w;
    Dzien y [] = new Dzien[989];
    private  Porcja sniad;
    private Porcja drugieSniad;
    private Porcja obiadek;
    private Porcja przek;
    private Porcja kol;
    Cel c = new Cel();
    Parametry parametr = new Parametry();

    public void dodajDzien(String a, String b)
    {
        y[licznik] = new Dzien(a,b);
    }
    public void sprawdz()
    {

        for(int i =0; i<licznik;i++) {
            if (dzienComboBox.getSelectedItem().equals(y[i].getNazwa()))
                w = y[i];
        }
        sniad = w.getSniad();
        drugieSniad=w.getDrugieSniad();
        obiadek=w.getObiadek();
        kol = w.getKol();
        przek= w.getPrzek();

    }
    public void ustaw()
    {
        nazwaDnia.setText(w.getNazwa());
        dataDzien.setText(w.getData());
    }
    public void odswiez()
    {
        kaloriePosumowanie.setText(Double.toString(w.getKcalDzien()));
        bialkoPodsumowanie.setText(Double.toString(w.getBialkoDzien()));
        tluszcePodsumowanie.setText(Double.toString(w.getTluszczeDzien()));
        weglowodanyPodsumowanie.setText(Double.toString(w.getWeglowodanyDzien()));
    }
    public Projekt() {
        y[0] = new Dzien("poniedzialek","31.11.2001");
        sprawdz();
        timer.start();
        dodajNowyDzieńButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dodajDzien(nazwaDodaj.getText(),dodajDzienData.getText());
                dzienComboBox.addItem(y[licznik].getNazwa());
                licznik+=1;
            }
        });
        dodajSniadanie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Posilek pos = w.zjedz(dodajPosilekNazwa.getText(),Double.parseDouble(dodajPosilekKcal.getText()),Double.parseDouble(dodajPosielPorcja.getText()),Double.parseDouble(dodajPosilekBialko.getText()),Double.parseDouble(dodajPosilekWeglowodany.getText()),Double.parseDouble(dodajPosilekTluszcze.getText()));
                bialkoSniadanie.setText(Double.toString(sniad.podliczBialko(pos)));
                kcalSniadanie.setText(Double.toString(sniad.podliczKcal(pos)));
                tluszczeSniadanie.setText(Double.toString(sniad.podliczTluszcze(pos)));
                weglowodanySniadanie.setText(Double.toString(sniad.podliczWegle(pos)));
                menuSniadanie.setText(sniad.dodajMenu(pos));
                odswiez();
            }
        });
        dodajDrugie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Posilek pos = w.zjedz(dodajPosilekNazwa.getText(),Double.parseDouble(dodajPosilekKcal.getText()),Double.parseDouble(dodajPosielPorcja.getText()),Double.parseDouble(dodajPosilekBialko.getText()),Double.parseDouble(dodajPosilekWeglowodany.getText()),Double.parseDouble(dodajPosilekTluszcze.getText()));
                bialkoDrugie.setText(Double.toString(drugieSniad.podliczBialko(pos)));
                kcalDrugie.setText(Double.toString(drugieSniad.podliczKcal(pos)));
                tluszczeDrugie.setText(Double.toString(drugieSniad.podliczTluszcze(pos)));
                weglowodanyDrugie.setText(Double.toString(drugieSniad.podliczWegle(pos)));
                menuDrugie.setText(drugieSniad.dodajMenu(pos));
                odswiez();
            }
        });
        dodajObiad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Posilek pos = w.zjedz(dodajPosilekNazwa.getText(),Double.parseDouble(dodajPosilekKcal.getText()),Double.parseDouble(dodajPosielPorcja.getText()),Double.parseDouble(dodajPosilekBialko.getText()),Double.parseDouble(dodajPosilekWeglowodany.getText()),Double.parseDouble(dodajPosilekTluszcze.getText()));
                bialkoObiad.setText(Double.toString(obiadek.podliczBialko(pos)));
                kcalObiad.setText(Double.toString(obiadek.podliczKcal(pos)));
                tluszceObiad.setText(Double.toString(obiadek.podliczTluszcze(pos)));
                weglowodanyObiad.setText(Double.toString(obiadek.podliczWegle(pos)));
                menuObiad.setText(obiadek.dodajMenu(pos));
                odswiez();
            }
        });
        dodajPrzekaska.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Posilek pos = w.zjedz(dodajPosilekNazwa.getText(),Double.parseDouble(dodajPosilekKcal.getText()),Double.parseDouble(dodajPosielPorcja.getText()),Double.parseDouble(dodajPosilekBialko.getText()),Double.parseDouble(dodajPosilekWeglowodany.getText()),Double.parseDouble(dodajPosilekTluszcze.getText()));
                bialkoPrzekaska.setText(Double.toString(przek.podliczBialko(pos)));
                kcalPrzekaska.setText(Double.toString(przek.podliczKcal(pos)));
                tluszczePrzekaska.setText(Double.toString(przek.podliczTluszcze(pos)));
                weglowodanyPrzekaska.setText(Double.toString(przek.podliczWegle(pos)));
                menuPrzekaska.setText(przek.dodajMenu(pos));
                odswiez();
            }
        });
        dodajKolacja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Posilek pos = w.zjedz(dodajPosilekNazwa.getText(),Double.parseDouble(dodajPosilekKcal.getText()),Double.parseDouble(dodajPosielPorcja.getText()),Double.parseDouble(dodajPosilekBialko.getText()),Double.parseDouble(dodajPosilekWeglowodany.getText()),Double.parseDouble(dodajPosilekTluszcze.getText()));
                bialkoKolacja.setText(Double.toString(kol.podliczBialko(pos)));
                kcalKolacja.setText(Double.toString(kol.podliczKcal(pos)));
                tluszceKolacja.setText(Double.toString(kol.podliczTluszcze(pos)));
                weglowodanyKolacja.setText(Double.toString(kol.podliczWegle(pos)));
                menuKolacja.setText(kol.dodajMenu(pos));
                odswiez();
            }
        });
        policzZapotrzebowanieKcal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
               Double a = parametr.bmr(plecParametryComboBox.getSelectedItem().toString(),Double.parseDouble(wiekParametry.getText()),Double.parseDouble(wzrostParametry.getText()),Double.parseDouble(wagaParametry.getText()));
                zapotrzebowanieKcalWyniki.setText(Double.toString(parametr.całkowiteZapotrzebowanieKcal((aktywnoscParametryComboBox.getItemAt(aktywnoscParametryComboBox.getSelectedIndex()).toString()),a)));
            }
        });
        policzBMI.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bmiWyniki.setText( Double.toString(parametr.bmi(Double.parseDouble(wagaParametry.getText()),Double.parseDouble(wzrostParametry.getText()))));
                bmiKomentarz.setText(parametr.komentarzBMI(parametr.bmi(Double.parseDouble(wagaParametry.getText()),Double.parseDouble(wzrostParametry.getText()))));
            }
        });
        policzWHR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Double a = parametr.whr(Double.parseDouble(obwodTaliParametry.getText()),Double.parseDouble(obwodBioderParametry.getText()));
                whrWyniki.setText(Double.toString(a));
                whrKomentarz.setText(parametr.komentarzWHR(plecParametryComboBox.getSelectedItem().toString(),a));

            }
        });
        policzBMR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                bmrWyniki.setText(Double.toString(parametr.bmr(plecParametryComboBox.getSelectedItem().toString(),Double.parseDouble(wiekParametry.getText()),Double.parseDouble(wzrostParametry.getText()),Double.parseDouble(wagaParametry.getText()))));
            }
        });
        policzCel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                parametr.setWaga(Double.parseDouble(wagaParametry.getText()));
                noweKcalCel.setText(Double.toString(c.zmienMase(parametr,celWartosc.getSelectedIndex(),Double.parseDouble(celCel.getText()))));
                czasRealizacjiCel.setText(Double.toString(c.czas(parametr,Double.parseDouble(celCel.getText()),celWartosc.getSelectedIndex())));
            }
        });

        dzienComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sprawdz();
                kcalSniadanie.setText(Double.toString(sniad.getKcalPorc()));
                bialkoSniadanie.setText(Double.toString(sniad.getBialkoPorcja()));;
                tluszczeSniadanie.setText(Double.toString(sniad.getTluszczePorcja()));
                weglowodanySniadanie.setText(Double.toString(sniad.getWeglowodanyPorcja()));
                menuSniadanie.setText(sniad.getMenu());
                kcalDrugie.setText(Double.toString(drugieSniad.getKcalPorc()));
                bialkoDrugie.setText(Double.toString(drugieSniad.getBialkoPorcja()));;
                tluszczeDrugie.setText(Double.toString(drugieSniad.getTluszczePorcja()));
                weglowodanyDrugie.setText(Double.toString(drugieSniad.getWeglowodanyPorcja()));
                menuDrugie.setText(drugieSniad.getMenu());
                kcalObiad.setText(Double.toString(obiadek.getKcalPorc()));
                bialkoObiad.setText(Double.toString(obiadek.getBialkoPorcja()));;
                tluszceObiad.setText(Double.toString(obiadek.getTluszczePorcja()));
                weglowodanyObiad.setText(Double.toString(obiadek.getWeglowodanyPorcja()));
                menuObiad.setText(obiadek.getMenu());
                kcalPrzekaska.setText(Double.toString(przek.getKcalPorc()));
                bialkoPrzekaska.setText(Double.toString(przek.getBialkoPorcja()));;
                tluszczePrzekaska.setText(Double.toString(przek.getTluszczePorcja()));
                weglowodanyPrzekaska.setText(Double.toString(przek.getWeglowodanyPorcja()));
                menuPrzekaska.setText(przek.getMenu());
                kcalKolacja.setText(Double.toString(kol.getKcalPorc()));
                bialkoKolacja.setText(Double.toString(kol.getBialkoPorcja()));;
                tluszceKolacja.setText(Double.toString(kol.getTluszczePorcja()));
                weglowodanyKolacja.setText(Double.toString(kol.getWeglowodanyPorcja()));
                menuKolacja.setText(kol.getMenu());
                odswiez();
            }
        });
    }
    Timer timer = new Timer (100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evt) {
            ustaw();
        }

    });
    public static void main(String[] args) {
        JFrame frame = new JFrame("Projekt");
        frame.setContentPane(new Projekt().Główny);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
