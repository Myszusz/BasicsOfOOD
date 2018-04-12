
public class Kulka {

	private String material;
	private Integer grubosc;
	
	Serwis serwis = new Serwis();
	
	public String getMaterial(){
		return this.material;
	}
	
	//podstawiony setter z funkcj¹ metody z serwisu
	public void setKulka(String material, int grubosc){                     //Przy zmianie kulki stara kulka idzie do magazynu
		zmienKulke(serwis.zmienKulke(this.material, material, grubosc), grubosc);
	}
	
	//setter kulki, u¿ywany w setMaterial
	public void zmienKulke(String material, int grubosc){
		this.material = material;
		this.grubosc = grubosc;
	}
	
	public int getGrubosc(){
		return this.grubosc;
	}
}
