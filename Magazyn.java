import java.util.ArrayList;

public class Magazyn {
	
	public ArrayList<String> StareKulki = new ArrayList<String>();
	
	public ArrayList<String> getStareKulki(ArrayList<String> StareKulki){
		return StareKulki;
	}
	
	public void setStareKulki(ArrayList<String> StareKulki){
		this.StareKulki = StareKulki;
	}
	
	//listowanie kulek w magazynie
	public void listStareKulki(ArrayList<String> StareKulki){
		System.out.println("Lista kulek w magazynie: ");
		for(String s : StareKulki){
			System.out.println(" - " + s);
		}
	}
	
	//transport do listy w maine
	public void transportuj(ArrayList<String> StareKulki){
		for(String s : this.StareKulki){
			StareKulki.add(s);
		}
	}
}
