public class Serwis {

	Magazyn magazyn = new Magazyn();
    
	//metoda po�rednia wrzucaj�ca star� kulke do magazynu
	public String zmienKulke (String StaraKulka, String NowaKulka, int grubosc){
		
		if(StaraKulka != null){
			System.out.println("Stara kulka jest przekazana do magazynu");
			magazyn.StareKulki.add(StaraKulka);
			System.out.println("Zamontowano now� kulke o grubo�ci " + grubosc);
		}
		else{
			System.out.println("Zamontowano now� kulke o grubo�ci " + grubosc);
		}
		return NowaKulka;
	}
}
