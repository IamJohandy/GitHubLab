public class TestKort {
	public static void main(String[] args) {
		
		Ansatt k1 = new Ansatt("Ole", "Olsen", 1234);
		
		k1.settFulltNavn("Arne Jakob Petter Sørensen");
		System.out.println("Fornavn: " + k1.firstName + " Etternavn: " + k1.lastName + "\n" + k1.hentFulltNavn());
        
        
		
		//Bare en liten testklasse som ikke har noen mening
		
		//Kort card1 = new Kort("Johan", "Dyrhaug", 12345);
		
		//System.out.println(card1);
		
	}
}