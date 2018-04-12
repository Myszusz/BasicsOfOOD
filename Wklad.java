
public class Wklad {
    
    private String kolor;
    private int poziom;


    public void setKolor (String kolor){
        this.kolor = kolor;
    }
    
    public String getKolor (){
        return this.kolor;
    }
    
        
    Wklad (){
    	poziom = 100;
    }
        
    
    public int ZmianaPoziomu(int nowyPoziom){
    	
        if (this.poziom>=nowyPoziom)
        {
        	this.poziom -= nowyPoziom;
        }
        else {
        	this.poziom =0; 
            System.out.println("brak tuszu");
        }
        return poziom;
    }
    
    
    public int getPoziom (){
        return this.poziom;
    } 
       
}
