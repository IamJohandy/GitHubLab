
public abstract class Kort {
	
	private String lastName;
	private String firstName;
	
	private int pinCode;
	
	private int kortNummer;
	private static int antallKort;
	
	private boolean cardClosed = false; //aksesskode???
	
	public Kort(String firstname, String lastname, int pin) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.pinCode = pin;
		this.kortNummer = ++antallKort;
		
	}
	
	public boolean isSperret() {
		return cardClosed;
	}
	
	public String getName() {
		return lastName + ", " + firstName;
	}
	
	public String toString() {
		return "Kortholders navn: " + getName() + "\nKortnummer: " + kortNummer 
				+ "\nPIN kode: " + pinCode + "\nSperret: " + isSperret();
	}
	
	public abstract boolean sjekkPIN(int pin);
	
}