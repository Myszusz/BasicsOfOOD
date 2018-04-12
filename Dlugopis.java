
public class Dlugopis {
    
    private Wklad wklad;
    private Kulka kulka;
    
   public void setWklad (Wklad w )
    {
        this.wklad = w;
    }
 
    
    public Wklad getWklad()
    {
        return this.wklad;
    }
    
    public void setKulka(Kulka k){
    	this.kulka = k;
    }
    
    public Kulka getKulka(){
    	return this.kulka;
    }
    
   Dlugopis ()
    {
        
    }
    Dlugopis(Wklad w)
    {
        this.wklad=w;
    }
    
    
    public void pisz(int procent)
    {
        wklad.ZmianaPoziomu(procent);
    }
    
    public int Dgetpoziom ()
    {
       int poziom = wklad.getPoziom();
        System.out.println(poziom);
        return poziom;
    }
}