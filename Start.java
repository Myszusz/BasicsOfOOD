import java.util.ArrayList;

public class Start {
    public static void main(String[] args) {

    //g³ówny magazyn
    Magazyn magazyn = new Magazyn();
     
    System.out.println("dlugopis 1");

    Dlugopis nowyDlugopis = new Dlugopis ();
    Wklad nowyWklad = new Wklad();
    Kulka nowaKulka = new Kulka();
    
    // zmiana kolorów i sprawdzenie koñca tuszu
    nowyDlugopis.setWklad(nowyWklad);
    nowyDlugopis.getWklad().setKolor("Fioletowy");
    System.out.println(nowyDlugopis.getWklad().getKolor());
    nowyDlugopis.getWklad().setKolor("Perkalikowy w kratke");
    System.out.println(nowyDlugopis.getWklad().getKolor());
    nowyDlugopis.pisz(25);
    nowyDlugopis.Dgetpoziom();
    nowyDlugopis.pisz(28);
    nowyDlugopis.Dgetpoziom();
    nowyDlugopis.pisz(76);
    System.out.println("");
    
    //Zmiana kulek, stara kulka przeniesiona do magazynu
    nowyDlugopis.setKulka(nowaKulka);
    nowyDlugopis.getKulka().setKulka("Zelazna Kulka", 2);
    System.out.println(nowyDlugopis.getKulka().getMaterial());
    System.out.println("");
    
    nowyDlugopis.setKulka(nowaKulka);
    nowyDlugopis.getKulka().setKulka("Plastikowa Kulka", 3);
    System.out.println(nowyDlugopis.getKulka().getMaterial());
    System.out.println("");
    
    nowyDlugopis.setKulka(nowaKulka);
    nowyDlugopis.getKulka().setKulka("Stalowa Kulka", 5);
    System.out.println(nowyDlugopis.getKulka().getMaterial());
    
    System.out.println("\n");
    
    //transport i wylistowanie kulek w magazynie
    nowaKulka.serwis.magazyn.transportuj(magazyn.StareKulki);
    nowaKulka.serwis.magazyn.listStareKulki(magazyn.StareKulki);  
    
    System.out.println("\n");
    
    // drugi dlugopis.
    System.out.println("dlugopis 2");
    Dlugopis nowyDlugopis2 = new Dlugopis ();
    Wklad nowyWklad2 = new Wklad();
    Kulka nowaKulka2 = new Kulka();
    
    //kolor i tusz
    nowyDlugopis2.setWklad(nowyWklad2);
    nowyDlugopis2.getWklad().setKolor("niebieski");
    System.out.println(nowyDlugopis2.getWklad().getKolor());
    
    nowyDlugopis2.pisz(25);
    nowyDlugopis2.Dgetpoziom();
   
    //Zmiana kulek, stara kulka przeniesiona do magazynu
    nowyDlugopis2.setKulka(nowaKulka2);
    nowyDlugopis2.getKulka().setKulka("Stalowa Kulka", 6);
    System.out.println(nowyDlugopis2.getKulka().getMaterial());
    System.out.println("");
    
    nowyDlugopis2.setKulka(nowaKulka2);
    nowyDlugopis2.getKulka().setKulka("Plastikowa Kulka", 3);
    System.out.println(nowyDlugopis2.getKulka().getMaterial());
    System.out.println("");
    
    nowyDlugopis2.setKulka(nowaKulka2);
    nowyDlugopis2.getKulka().setKulka("Zelazna kulka", 1);
    System.out.println(nowyDlugopis2.getKulka().getMaterial());
    
    
    System.out.println("\n");
    
    //transport i wylistowanie kulek w magazynie
    nowaKulka2.serwis.magazyn.transportuj(magazyn.StareKulki);
    nowaKulka2.serwis.magazyn.listStareKulki(magazyn.StareKulki);  
    
    }
    
}
