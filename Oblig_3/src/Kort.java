import java.util.*;

public abstract class Kort {
	
	private String lastName;
	private String firstName;
	
	private int pinCode;
	
	private int kortNummer;
	private static int antallKort;
	
	private boolean cardClosed = false; //aksesskode???
	
	private Calendar dateCreated;
	
	public Kort() {
		
	}
	
	public Kort(String firstname, String lastname, int pin) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.pinCode = pin;
		this.kortNummer = ++antallKort;
		
		this.dateCreated = new GregorianCalendar();
		
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
	
	public abstract boolean checkPIN(int pin);
	
	protected int getPin() {
		return pinCode;
	}
	
	public Calendar getDate() {
		return this.dateCreated;
	}
	
	public boolean checkDate() {
		return false;
	}
	
	public boolean officeTime() {
		return false;
	}
}