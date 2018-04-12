public class Serwis {

	Magazyn magazyn = new Magazyn();
    
	//metoda poœrednia wrzucaj¹ca star¹ kulke do magazynu
	public String zmienKulke (String StaraKulka, String NowaKulka, int grubosc){
		
		if(StaraKulka != null){
			System.out.println("Stara kulka jest przekazana do magazynu");
			magazyn.StareKulki.add(StaraKulka);
			System.out.println("Zamontowano now¹ kulke o gruboœci " + grubosc);
		}
		else{
			System.out.println("Zamontowano now¹ kulke o gruboœci " + grubosc);
		}
		return NowaKulka;
	}
}
